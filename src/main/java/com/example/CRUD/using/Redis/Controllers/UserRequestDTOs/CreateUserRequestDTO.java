package com.example.CRUD.using.Redis.Controllers.UserRequestDTOs;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateUserRequestDTO {

    private int id;
    private String name;
    private int age;
}
