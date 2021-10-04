package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface AutomovelRepository extends JpaRepository <AutomovelModel, Long> {

}
//CrudRepository