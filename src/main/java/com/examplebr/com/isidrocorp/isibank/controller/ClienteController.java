package com.examplebr.com.isidrocorp.isibank.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examplebr.com.isidrocorp.isibank.dao.ClienteDAO;
import com.examplebr.com.isidrocorp.isibank.model.Cliente;

@RestController
public class ClienteController {
	@Autowired
	private ClienteDAO dao;
	@GetMapping("/clientes")
	public ArrayList<Cliente> recuperarTodos() {
		return (ArrayList<Cliente>) dao.findAll();
	}
}
