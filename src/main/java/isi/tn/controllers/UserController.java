package isi.tn.controllers;

import isi.tn.entities.User;
import isi.tn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService ;


    @GetMapping("/users")
    public List<User> getAllUsers() {
        List<User> allUsers = userService.findAllUsers();
        return allUsers;
    }

    @PostMapping("/addusert")
    public User createUser( @RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable(value = "id") Long Id) {
        return userService.getUserById(Id);
    }

    @DeleteMapping("/user/")
    public void deleteUser(@RequestBody User user) {
            userService.deleteUser(user);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable(value = "id") Long userId) {
        Optional<User> user = userService.getUserById(userId);
        userService.deleteUserById(userId);
        return ResponseEntity.ok().build();
    }
}
