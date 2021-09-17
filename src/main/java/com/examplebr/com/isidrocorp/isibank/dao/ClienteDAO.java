package com.examplebr.com.isidrocorp.isibank.dao;

import org.springframework.data.repository.CrudRepository;

import com.examplebr.com.isidrocorp.isibank.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {

}
