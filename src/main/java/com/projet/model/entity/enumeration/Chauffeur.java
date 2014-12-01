package com.projet.model.entity.enumeration;

public enum Chauffeur {
	AVEC("Avec"), SANS("Sans");

	private String name = "";

	// Constructeur
	Chauffeur(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
