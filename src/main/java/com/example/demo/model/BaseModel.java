package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
@MappedSuperclass
public class BaseModel {
    @Id
    @SequenceGenerator(name = "users_sequence", sequenceName = "users_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sequence")

    private UUID id;
    @Column
    private Date created;
    @Column
    private Date updated;
    @Column
    private UUID createdBy;
    @Column
    private  UUID updatedBy;
}
