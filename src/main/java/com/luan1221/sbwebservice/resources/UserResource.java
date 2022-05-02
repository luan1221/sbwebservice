package com.luan1221.sbwebservice.resources;

import com.luan1221.sbwebservice.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@gmail.com", "1234", "9873");
        return ResponseEntity.ok().body(u);
    }

}
