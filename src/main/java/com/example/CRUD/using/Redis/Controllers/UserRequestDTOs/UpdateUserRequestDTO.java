package com.example.CRUD.using.Redis.Controllers.UserRequestDTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UpdateUserRequestDTO {
    private String name;
    private int age;
}
