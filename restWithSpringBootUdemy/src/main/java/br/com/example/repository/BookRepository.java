package br.com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.example.data.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}