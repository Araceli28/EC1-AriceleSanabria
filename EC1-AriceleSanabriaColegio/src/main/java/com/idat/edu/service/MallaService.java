package com.idat.edu.service;

import java.util.List;

import com.idat.edu.modelo.MallaCurricular;

public interface MallaService {
	void guardar(MallaCurricular mallaCurricular);
	void actualizar(MallaCurricular mallaCurricular);
	void eliminar(Integer id);
	List<MallaCurricular> listar();
	MallaCurricular obtener(Integer id);
}
