package com.example.dio.controller;

import com.example.dio.model.Usuario;
import com.example.dio.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
  @Autowired
  UsuarioRepository repository;

  @GetMapping("/users")
  public List<Usuario> getUsers() {
    return repository.listAll();
  }
}
