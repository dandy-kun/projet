package com.projet.model.entity.enumeration;

public enum Statut {
	LIBRE("Libre"), LOCATION("Location");

	private String name = "";

	// Constructeur
	Statut(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
