package africa.catalystStores;

import africa.catalystStores.data.models.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        User user = new User();
        SpringApplication.run(Main.class, args);
    }
}
