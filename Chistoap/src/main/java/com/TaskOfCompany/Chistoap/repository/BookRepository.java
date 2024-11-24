package com.TaskOfCompany.Chistoap.repository;

import com.TaskOfCompany.Chistoap.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
