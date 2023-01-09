package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;
@Entity
@Data
public class Organization extends BaseModel {
    @Column
    private String organizationName;
    @Column
    private String normalizedOrganizationName;
    @Column
    private Integer registryNumber;
    @Column
    private String contactEmail;
    @Column
    private String yearFounded;
    @Column
    private String phone;
    @Column
    private Integer companySize;
    @Column
    @ManyToMany(targetEntity = User.class)
    private List<User> users;


}

