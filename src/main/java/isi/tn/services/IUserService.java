package isi.tn.services;

import isi.tn.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    List<User> findAllUsers();

    Optional<User> getUserById(long id);


    void deleteUser(User user);

    User deleteUserById (long id );
}
