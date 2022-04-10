package africa.catalystStores.services;

import africa.catalystStores.data.models.User;
import africa.catalystStores.dto.requests.AddUserRequest;
import africa.catalystStores.dto.responses.AddUserResponse;
import africa.catalystStores.dto.responses.FindUserResponse;

import java.util.List;

public interface UserService {
    AddUserResponse save(AddUserRequest userRequest);
    List<FindUserResponse> findUserByEmail (String emailAddress);
    FindUserResponse findUserbyFirstName(String firstName);
    List<User> findAllUsers ();
    void deleteUser(AddUserRequest userRequest);
}
