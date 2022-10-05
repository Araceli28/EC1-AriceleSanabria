package com.idat.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.edu.modelo.MallaCurricular;

@Repository
public interface MallaRepository extends JpaRepository<MallaCurricular, Integer> {

}
