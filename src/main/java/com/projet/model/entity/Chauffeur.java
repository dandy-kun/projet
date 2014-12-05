package com.projet.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Chauffeur implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = true)
	private Integer Id;
	@Column(name = "NOM", nullable = false)
	private String nom;
	@Column(name = "PRENOM", nullable = false)
	private String prenom;
	@Column(name = "TARIF", nullable = false)
	private Float tarif;

	@OneToMany(mappedBy = "chauffeur", cascade = { CascadeType.PERSIST,
			CascadeType.REMOVE })
	private List<Location> listLocation = new ArrayList<Location>();

	public Chauffeur() {
		super();
	}

	public Chauffeur(final int id, final String nom, final String prenom,
			final Float tarif) {
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
	public Float getTarif() {
		return tarif;
	}

	public List<Location> getListLocation() {
		return listLocation;
	}

	public void setListLocation(final List<Location> listLocation) {
		this.listLocation = listLocation;
	}

	public void setId(final Integer id) {
		Id = id;
	}

	public void setTarif(final Float tarif) {
		this.tarif = tarif;
	}

	@Override
	public String toString() {
		return "Chauffeur [Id=" + Id + ", nom=" + nom + ", prenom=" + prenom
				+ ", tarif=" + tarif + "]";
	}

}
