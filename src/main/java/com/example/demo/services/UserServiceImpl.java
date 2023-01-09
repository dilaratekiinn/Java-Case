package com.example.demo.services;

import com.example.demo.model.Organization;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Organization> getAllOrganizations(UUID id) {

        return userRepository.getAllOrganizationByUser(id);
    }

}
