package com.example.demo.services;

import com.example.demo.model.Organization;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface UserService  {
    List<Organization>getAllOrganizations(UUID id);

}
