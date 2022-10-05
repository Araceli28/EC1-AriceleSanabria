package com.idat.edu.service;

import java.util.List;

import com.idat.edu.modelo.Curso;

public interface CursoService {
	void guardar(Curso curso);
	void actualizar(Curso curso);
	void eliminar(Integer id);
	List<Curso> listar();
	Curso obtener(Integer id);
}
