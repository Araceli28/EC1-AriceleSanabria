package com.idat.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.edu.modelo.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
