package africa.catalystStores.services;

import africa.catalystStores.data.models.User;
import africa.catalystStores.dto.requests.AddUserRequest;
import africa.catalystStores.dto.responses.AddUserResponse;
import africa.catalystStores.dto.responses.FindUserResponse;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public AddUserResponse save(AddUserRequest userRequest) {
        return null;
    }

    @Override
    public List<FindUserResponse> findUserByEmail(String emailAddress) {
        return null;
    }

    @Override
    public FindUserResponse findUserbyFirstName(String firstName) {
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(AddUserRequest userRequest) {

    }
}
