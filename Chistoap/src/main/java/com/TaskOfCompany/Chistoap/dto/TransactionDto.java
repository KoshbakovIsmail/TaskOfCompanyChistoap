package com.TaskOfCompany.Chistoap.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransactionDto {
    private Long id;
    private String operationType;
    private LocalDateTime operationDateTime;
    private String readerPhoneNumber;
    private Long bookId;

}
