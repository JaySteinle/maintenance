package com.example.maintenance.data;

import com.example.maintenance.models.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}