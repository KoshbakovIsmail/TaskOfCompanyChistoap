package com.TaskOfCompany.Chistoap.dto;

import lombok.Data;

import java.util.List;
@Data
public class BookDto {
    private Long id;
    private String title;
    private int publicationYear;
    private List<Long> authorIds;
}
