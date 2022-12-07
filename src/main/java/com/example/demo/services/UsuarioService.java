package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Usuario;
import com.example.demo.model.UsuarioModel;

public interface UsuarioService {

	public abstract Usuario transform(UsuarioModel usuarioModel);

	public abstract UsuarioModel transform(Usuario user);

	// Alumno

	public abstract List<UsuarioModel> listAllAlumnos();

	public abstract Usuario addAlumno(UsuarioModel usuarioModel);

	public abstract int removeAlumno(int id);

	public abstract Usuario updateAlumno(UsuarioModel usuarioModel);

	// Profesor

	public abstract List<UsuarioModel> listAllProfesores();

	public abstract Usuario addProfesor(UsuarioModel usuarioModel);

	public abstract int removeProfesor(int id);

	public abstract Usuario updateProfesor(UsuarioModel usuarioModel);

	// Administrador

	public abstract List<UsuarioModel> listAllAdministradores();

	public abstract Usuario addAdministrador(UsuarioModel usuarioModel);

	public abstract int removeAdministrador(int id);

	public abstract Usuario updateAdministrador(UsuarioModel usuarioModel);

}