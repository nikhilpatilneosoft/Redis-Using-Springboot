package com.example.CRUD.using.Redis.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@RedisHash("User")
public class User {

    @Id
    private int id;
    private String name;
    private int age;
}
