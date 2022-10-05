package com.idat.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.edu.modelo.MallaCurricular;
import com.idat.edu.repository.MallaRepository;

@Service
public class MallaServiceImpl implements MallaService{
	@Autowired
	private MallaRepository repositorio;
	
	@Override
	public void guardar(MallaCurricular mallaCurricular) {
		// TODO Auto-generated method stub
		repositorio.save(mallaCurricular);
	}

	@Override
	public void actualizar(MallaCurricular mallaCurricular) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(mallaCurricular);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<MallaCurricular> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public MallaCurricular obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}
}
