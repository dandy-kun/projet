package com.projet.model.entity;


import java.util.HashMap;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Chauffeur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private int Id;
	@Column(name = "NOM", nullable = false)
	private String nom;
	@Column(name = "PRENOM", nullable = false)
	private String prenom;
	@Column(name = "TARIF", nullable = false)
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

	public HashMap<String, Object> getPremon() {
		// TODO Auto-generated method stub
		return null;
	}
}
