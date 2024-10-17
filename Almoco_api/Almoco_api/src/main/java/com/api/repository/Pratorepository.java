package com.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.PratoModel;

@Repository
public interface Pratorepository extends JpaRepository<PratoModel, UUID>{

}
