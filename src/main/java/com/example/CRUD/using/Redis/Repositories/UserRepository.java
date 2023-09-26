package com.example.CRUD.using.Redis.Repositories;

import com.example.CRUD.using.Redis.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
}
