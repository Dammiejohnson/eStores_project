package africa.catalystStores.controllers;

import africa.catalystStores.dto.requests.AddUserRequest;
import africa.catalystStores.dto.requests.DeleteUserRequest;
import africa.catalystStores.dto.responses.AddUserResponse;
import africa.catalystStores.dto.responses.DeleteUserResponse;
import africa.catalystStores.dto.responses.FindUserResponse;
import africa.catalystStores.services.UserService;
import africa.catalystStores.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public AddUserResponse registerUser (@RequestBody AddUserRequest request){
        return userService.register(request);
    }
    @GetMapping("/{keyword}")
    public List<FindUserResponse> findUserByEmail (@PathVariable ("keyword") String emailAddress){
        return userService.findUserByEmail(emailAddress);
    }
    @DeleteMapping("/delete")
    public DeleteUserResponse deleteUser(@RequestBody DeleteUserRequest deleteUserRequest){
        return userService.deleteUser(deleteUserRequest);
    }

}
