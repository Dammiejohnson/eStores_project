package africa.catalystStores.dto.requests;

import lombok.Data;

@Data
public class DeleteUserRequest {
    private String emailAddress;
    private String password;
}
