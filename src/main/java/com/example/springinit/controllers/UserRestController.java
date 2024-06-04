package com.example.springinit.controllers;

import com.example.springinit.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping(path = "/details")
    public User details()
    {
        User user = new User("Jovanka","Ramos","jovanka.ramos@hotmail.com");
        return user;

    }

    @GetMapping(path="/list")
    public List<User> list()
    {
                User user1 = new User("Dayana","Carvajal");
                User user2 = new User("Victoria", "Escudero","victoria.escudero@mundofeliz.cl");
                User user3 = new User("Joaquin","Gallardo","joaquin.gallardo@soyfeliz.cl");
                User user4 = new User("Hwan Su","Oh","hwansu.oh@soydelsur.cl");
                User user5 = new User("Camila","Cerda","camila.cerda@hola.com");
                    List<User> users = Arrays.asList(user1,user2,user3,user4,user5);

                return users;

    }
}
