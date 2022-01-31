package projekcik.pl.backend.User;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void printUser(User user) {
        System.out.println(user);
    }

    public void changeUserName(User user, String userName) {
        if(user.getUserName().equals(userName)) {
            throw new IllegalArgumentException("You can not change on the same name");
        } else {
            user.setUserName(userName);
        }
    }

    public void changeUserPassword(User user, String password) {
        if(user.getUserPassword().equals(password)) {
            throw new IllegalArgumentException("You can not change on the same password");
        } else {
            user.setUserPassword(password);
        }
    }

    public void changeUserEmail(User user, String email) {
        if(user.getUserName().equals(email)) {
            throw new IllegalArgumentException("You can not change on the same email");
        } else {
          user.setUserEmail(email);
        }
    }
    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User findById(Long id) {
        Optional<User> byId = userRepository.findById(id);
        if(byId.isPresent()) {return byId.get();}
        else {throw new IllegalArgumentException("User with id: " +id+ " does not exist");}
    }

    public List<User> getAllUsers() {return userRepository.findAll();}
    public boolean isUserExist(Long id) {return userRepository.existsById(id);};
    public Long countUsers() {
        return userRepository.count();
    }
    public void deleteUser(Long id) {
        boolean isExist = userRepository.existsById(id);
        if(!isExist) {throw new IllegalStateException("User with id: " + id + " does not exists");}
        else {userRepository.deleteById(id);}
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        userRepository.save(new User( "zenkoSkowyr", "123456", "skowyr.zenek@gmail.com"));
        userRepository.save(new User( "Lubiehajsik", "odJedendoPiec", "hajsownicy@gmail.com"));
        userRepository.save(new User( "jemDrozdze", "qwerty", "jem.drozdze@gmail.com"));
    }
}
