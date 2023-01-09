package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Invitation extends BaseModel {
    @Column
    private Integer userId;
    @Column
    private String invitationMessage;
    @Column
    private  String status;


}
