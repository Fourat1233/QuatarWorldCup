package isi.tn.services;

import isi.tn.entities.User;
import isi.tn.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository ;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteUser(User user) {

         userRepository.delete(user);

    }

    @Override
    public User deleteUserById(long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new NullPointerException() );
        userRepository.deleteById(id);
        return user;
    }
}
