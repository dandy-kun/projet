package com.projet.model.entity.enumeration;

public enum Etat {
	AVEC("Avec"), SANS("Sans");

	private String name = "";

	// Constructeur
	Etat(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
