package com.convit.backend.apirest.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.convit.backend.apirest.models.entity.Cliente;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.convit.backend.apirest.models.entity.Region;

public interface IClienteDao extends JpaRepository<Cliente, Long>{
	@Query("from Region")
	public List<Region> findAllRegiones();
}
