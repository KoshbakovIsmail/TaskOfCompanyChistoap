package com.TaskOfCompany.Chistoap.repository;

import com.TaskOfCompany.Chistoap.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
