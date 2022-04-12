package africa.catalystStores.dto.responses;

import africa.catalystStores.data.models.User;
import lombok.Data;

@Data
public class FindUserResponse {
    private String fullName;
    private String emailAddress;

    public FindUserResponse (User user){
        fullName = user.getFirstName().concat(user.getLastName());
        emailAddress = user.getEmailAddress();
    }

    public FindUserResponse(){

    }
}
