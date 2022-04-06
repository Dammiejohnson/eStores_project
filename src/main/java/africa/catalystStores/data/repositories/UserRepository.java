package africa.catalystStores.data.repositories;

import africa.catalystStores.data.models.User;

import java.util.List;

public interface UserRepository {
    User saveUser(User user);
    void deleteUserByEmail(String emailAddress);
    User deleteUser(User user);
    User updateUser(User user);
    User findUserByEmail(String emailAddress);
    List<User> findAll();

    int count();
}
