package com.projet.controller;

public class Chauffeur {
	private int Id;
	private String nom;
	private String prenom;
	private float tarif;

	public Chauffeur() {
		super();
	}

	public Chauffeur(final int id, final String nom, final String prenom,
			final float tarif) {
		super();
		Id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.tarif = tarif;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(final int id) {
		Id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(final String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the tarif
	 */
	public float getTarif() {
		return tarif;
	}

	/**
	 * @param tarif
	 *            the tarif to set
	 */
	public void setTarif(final float tarif) {
		this.tarif = tarif;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Chauffeur [Id=" + Id + ", nom=" + nom + ", prenom=" + prenom
				+ ", tarif=" + tarif + "]";
	}

}
