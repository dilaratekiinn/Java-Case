package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;


@Entity
@Data
@Table(name = "CaseUser")
public class User  extends  BaseModel{
    @Column
    private String fullName;
    @Column
    private String email;
    @Column
    private String normalizedName;
    @Column
    private String status;
    @Column
    @ManyToMany(targetEntity = Organization.class)
    private List<Organization> organizations;



}
