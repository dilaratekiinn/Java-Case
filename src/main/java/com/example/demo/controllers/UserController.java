package com.example.demo.controllers;

import com.example.demo.model.Organization;
import com.example.demo.services.UserService;
import com.example.demo.services.UserServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserServiceImpl service;

   @GetMapping(value = "/{id}")
   public List<Organization> getAllOrganizations(@PathVariable("id") UUID id){
       return service.getAllOrganizations(id);
  }
}

