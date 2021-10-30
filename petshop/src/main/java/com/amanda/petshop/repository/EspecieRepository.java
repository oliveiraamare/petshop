package com.amanda.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amanda.petshop.domain.Especie;

@Repository
public interface EspecieRepository extends JpaRepository<Especie, Integer>{

}