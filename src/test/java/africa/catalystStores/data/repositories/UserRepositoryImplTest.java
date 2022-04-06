package africa.catalystStores.data.repositories;

import africa.catalystStores.data.models.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
    private UserRepository userRepository;

    @BeforeEach
    public void setUp(){
        userRepository = new UserRepositoryImpl();
    }

    @Test
    void saveUser() {
       User user1 = new User();
       user1.setFirstName("Sanni");
       user1.setLastName("Chinonso");
       user1.setEmailAddress("Sanchi@gmail.com");
       user1.setPassword("23458");
       user1.setPhoneNumber("09056783421");
       user1.setHomeAddress("Bariga, Chemist Bustop");

       User user2 = new User();
       user2.setFirstName("Sanni");
       user2.setLastName("Chibuzo");
       user2.setEmailAddress("Sanchibob@gmail.com");
       user2.setPassword("687j7");
       user2.setPhoneNumber("09056700021");
       user2.setHomeAddress("Akoka, St.Finbers Bustop");

        userRepository.saveUser(user1);
        userRepository.saveUser(user2);

        assertEquals(2, userRepository.count());
        //assertNotNull(userRepository);
    }

    @Test
    void deleteUserByEmail() {
    }

    @Test
    void deleteUser() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void findUserByEmail() {
    }

    @Test
    void findAll() {
    }
}