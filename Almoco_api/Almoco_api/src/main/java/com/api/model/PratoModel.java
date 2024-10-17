package com.api.model;

import java.util.UUID;

import com.api.controller.UsuarioDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "p")

public class PratoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID refeicao;
	private String gordura, proteina, fibra, carboidrato, bebida, sobremesa;

	public PratoModel(UsuarioDTO refeicao) {
		
		this.gordura = refeicao.Gordura();
		this.proteina = refeicao.Proteina();
		this.fibra = refeicao.Fibra();
		this.carboidrato = refeicao.Carboidrato();
		this.bebida = refeicao.Bebida();
		this.sobremesa = refeicao.Sobremesa();

	}

}
