package com.example.CRUD.using.Redis.Controllers;

import com.example.CRUD.using.Redis.Controllers.UserRequestDTOs.CreateUserRequestDTO;
import com.example.CRUD.using.Redis.Controllers.UserRequestDTOs.UpdateUserRequestDTO;
import com.example.CRUD.using.Redis.Controllers.UserResponseDTOs.CreateUserResponseDTO;
import com.example.CRUD.using.Redis.Controllers.UserResponseDTOs.GetAllUsersResponseDTO;
import com.example.CRUD.using.Redis.Controllers.UserResponseDTOs.GetUserResponseDTO;
import com.example.CRUD.using.Redis.Controllers.UserResponseDTOs.UpdateUserResponseDTO;
import com.example.CRUD.using.Redis.Model.User;
import com.example.CRUD.using.Redis.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ModelMapper mapper;

    @PostMapping()
    public ResponseEntity<CreateUserResponseDTO> createUser(@RequestBody CreateUserRequestDTO createUserRequestDTO) {
        User savedUser = userService.createUser(mapper.map(createUserRequestDTO, User.class));
        return ResponseEntity.ok(mapper.map(savedUser, CreateUserResponseDTO.class));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GetUserResponseDTO> getUser(@PathVariable int id) {
        return ResponseEntity.ok(mapper.map(userService.getUser(id), GetUserResponseDTO.class));
    }

    @GetMapping()
    public ResponseEntity<List<GetAllUsersResponseDTO>> getAllUsers() {
        List <User> users = userService.getAllUsers();
        List<GetAllUsersResponseDTO> response = new ArrayList<>();

        if(users.size() == 0)
            return ResponseEntity.noContent().build();
        else
            users.stream().filter(x -> x != null).forEach(user -> response.add(mapper.map(user, GetAllUsersResponseDTO.class)));
        return ResponseEntity.ok(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UpdateUserResponseDTO> updateUser(@PathVariable int id, @RequestBody UpdateUserRequestDTO updateUserRequestDTO) {
        User user = mapper.map(updateUserRequestDTO, User.class);
        User updatedUser = userService.updateUser(user, id);
        return ResponseEntity.ok(mapper.map(updatedUser, UpdateUserResponseDTO.class));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id) {
        return ResponseEntity.ok(userService.deleteUser(id));
    }

}
