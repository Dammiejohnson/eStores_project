package africa.catalystStores.dto.responses;

import lombok.Data;

@Data
public class AddUserResponse {
    private String fullname;
    private String emailAddress;
    private String mobile;
    private String feedBackResponse;
}
