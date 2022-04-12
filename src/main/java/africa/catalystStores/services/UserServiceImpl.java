package africa.catalystStores.services;

import africa.catalystStores.data.models.User;
import africa.catalystStores.data.repositories.UserRepository;
import africa.catalystStores.dto.requests.AddUserRequest;
import africa.catalystStores.dto.requests.DeleteUserRequest;
import africa.catalystStores.dto.responses.AddUserResponse;
import africa.catalystStores.dto.responses.DeleteUserResponse;
import africa.catalystStores.dto.responses.FindUserResponse;
import africa.catalystStores.exceptions.UserNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public AddUserResponse register(AddUserRequest userRequest) {
        User user = new User();
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setEmailAddress(userRequest.getEmailAddress());
        user.setPhoneNumber(userRequest.getPhoneNumber());
        user.setPassword(userRequest.getPassword());
        user.setHomeAddress(userRequest.getHomeAddress());

        userRepository.save(user);
        AddUserResponse response = new AddUserResponse();
        response.setFullname(user.getFirstName().concat(" ").concat(user.getLastName()));
        response.setEmailAddress(user.getEmailAddress());
        response.setMobile(user.getPhoneNumber());
        response.setFeedBackResponse("Account created successfully");

        return response;
    }

    private List<User> findAllUserByEmailAddress(String emailAddress){
        List<User> users = new ArrayList<>(userRepository.findUserByEmailAddress(emailAddress.toLowerCase()));
        return users;
    }

    @Override
    public List<FindUserResponse> findUserByEmail(String emailAddress) {
        List<User> users = findAllUserByEmailAddress(emailAddress.toLowerCase());
        if (users.isEmpty()) throw new UserNotFoundException("User not found");

        List<FindUserResponse> responses = new ArrayList<>();
        users.forEach(user -> {
            FindUserResponse userResponse = new FindUserResponse();
            userResponse.setFullName(user.getFirstName().concat(" ").concat(user.getLastName()));
            userResponse.setEmailAddress(user.getEmailAddress());

            responses.add(userResponse);

        });

        return responses;
    }

    @Override
    public FindUserResponse findUserbyFirstName(String firstName) {
        User user = userRepository.findUserByFirstName(firstName.toLowerCase());
        if(user == null) throw new UserNotFoundException("User Not Found");
        FindUserResponse response = new FindUserResponse();
        response.setFullName(user.getFirstName() + " " + user.getLastName());
        response.setEmailAddress(user.getEmailAddress());
        return response;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public DeleteUserResponse deleteUser(DeleteUserRequest deleteUserRequest) {
        List<User> users = findAllUserByEmailAddress(deleteUserRequest.getEmailAddress().toLowerCase());
        if (users.isEmpty()) throw new UserNotFoundException("User not found");
        users.forEach(user -> {
            if(user.getPassword().equals(deleteUserRequest.getPassword())){
                userRepository.delete(user);
            }
           // else {throw new UserNotFoundException("Invalid Email Address or Password");}
        });
            DeleteUserResponse response = new DeleteUserResponse();
            response.setFeedBack("Account Deleted Successfully");
         return response;
    }

    @Override
    public UserRepository getRepository() {
        return userRepository;
    }
}
