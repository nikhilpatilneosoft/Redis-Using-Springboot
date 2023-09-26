package com.example.CRUD.using.Redis.Controllers.UserResponseDTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GetUserResponseDTO {
    private String name;
    private int age;
}
