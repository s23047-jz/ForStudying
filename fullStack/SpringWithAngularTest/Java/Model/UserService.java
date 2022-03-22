package pl.jacob.usersManager.Model;

import org.springframework.stereotype.Service;
import pl.jacob.usersManager.Exception.UserNotFoundException;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public User findUserById(Long id) {
        return userRepository.findUserById(id)
                .orElseThrow(() -> new UserNotFoundException("User with id: " + id + " does not exists"));
    }

    public void deleteUser(Long id) {
        Boolean isExists = userRepository.existsById(id);
        if(isExists) {
            userRepository.deleteUserById(id);
        }else {
            throw new IllegalArgumentException("User with id: " + id + " does not exists");
        }
    }
}
