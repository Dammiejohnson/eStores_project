package africa.catalystStores.data.repositories;

import africa.catalystStores.data.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.ComponentScan;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
@ComponentScan
@EnableAutoConfiguration
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveUserTest(){
    User user = new User("sanjay2@ymail.com", "456677");
    user.setFirstName("Sanni");
    user.setLastName("Boye");
    user.setPhoneNumber("09123456578");
    user.setHomeAddress("Bariga, lagos");

    User savedUser = userRepository.save(user);

    assertEquals(1, userRepository.count());
    }

}