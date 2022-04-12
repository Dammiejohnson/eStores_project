package africa.catalystStores.dto.requests;

import lombok.Data;
import lombok.NonNull;

@Data
public class AddUserRequest {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private String password;
    private String homeAddress;

}
