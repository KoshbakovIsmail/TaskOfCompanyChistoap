package com.TaskOfCompany.Chistoap.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String operationType;
    private LocalDateTime operationDateTime;
    @ManyToOne
    private Reader reader;
    @ManyToOne
    private Book book;
}
