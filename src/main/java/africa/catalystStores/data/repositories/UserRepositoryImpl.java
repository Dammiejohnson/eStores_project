package africa.catalystStores.data.repositories;

import africa.catalystStores.data.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl  implements UserRepository{
    private final List<User> userDatabase = new ArrayList<>();

    @Override
    public User saveUser(User user) {
        userDatabase.add(user);
        return user;
    }

    @Override
    public void deleteUserByEmail(String emailAddress) {

    }

    @Override
    public User deleteUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }

    @Override
    public User findUserByEmail(String emailAddress) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public int count() {
        return userDatabase.size();
    }
}
