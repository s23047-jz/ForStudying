package projekcik.pl.backend.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
@CrossOrigin
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public ResponseEntity<String> printItWorks() {return ResponseEntity.ok("It works :)");}


    @PostMapping("/createUser")
    @CrossOrigin
    public String createUser(@RequestBody User user) {
        userService.createUser(user);
        return "New user has been added to db";
    }


    @GetMapping("/getUser/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @GetMapping("/getAllUsers")
        public List<User> getAllUsers() {return userService.getAllUsers();}
}
