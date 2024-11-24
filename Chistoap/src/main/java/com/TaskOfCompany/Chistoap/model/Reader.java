package com.TaskOfCompany.Chistoap.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Reader {
    @Id
    private Long id;
    private String phoneNumber;
    private String firstName;
    private String LastName;
    private String gender;
    private String birthDate;

}
