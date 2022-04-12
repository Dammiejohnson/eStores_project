package africa.catalystStores.services;

import africa.catalystStores.data.models.User;
import africa.catalystStores.data.repositories.UserRepository;
import africa.catalystStores.dto.requests.AddUserRequest;
import africa.catalystStores.dto.requests.DeleteUserRequest;
import africa.catalystStores.dto.responses.AddUserResponse;
import africa.catalystStores.dto.responses.DeleteUserResponse;
import africa.catalystStores.dto.responses.FindUserResponse;

import java.util.List;

public interface UserService {
    AddUserResponse register(AddUserRequest userRequest);
    List<FindUserResponse> findUserByEmail (String emailAddress);
    FindUserResponse findUserbyFirstName(String firstName);
    List<User> findAllUsers ();
    DeleteUserResponse deleteUser(DeleteUserRequest deleteUserRequest);
    UserRepository getRepository();
}
