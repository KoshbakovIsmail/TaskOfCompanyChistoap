package com.TaskOfCompany.Chistoap.dto;

import lombok.Data;

import java.util.List;

@Data
public class AuthorDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private List<Long> bookIds;
}
