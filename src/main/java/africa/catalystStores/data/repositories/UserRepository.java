package africa.catalystStores.data.repositories;

import africa.catalystStores.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface UserRepository extends MongoRepository <User, String> {
    List<User> findUserByEmailAddress(String emailAddress);
    List<User> deleteUserByEmailAddress(String emailAddress);
    User findUserByFirstName(String firstName);
    boolean existsByFirstName(String firstName);
}
