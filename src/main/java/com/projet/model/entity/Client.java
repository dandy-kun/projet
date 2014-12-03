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
public class Client implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private int Id;
	@Column(name = "NOM", nullable = false)
	private String nom;
	@Column(name = "PRENOM", nullable = false)
	private String prenom;
	@Column(name = "ADRESSE", nullable = false)
	private String adresse;

	@OneToMany(mappedBy = "client", cascade = { CascadeType.PERSIST,
			CascadeType.REMOVE })
	private List<Location> listLocation = new ArrayList<Location>();

	public Client() {
		super();
	}

	public Client(final int id, final String nom, final String prenom,
			final String adresse) {
		super();
		this.nom = nom;
		Id = id;
		this.prenom = prenom;
		this.adresse = adresse;
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
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse
	 *            the adresse to set
	 */
	public void setAdresse(final String adresse) {
		this.adresse = adresse;
	}

	public List<Location> getListLocation() {
		return listLocation;
	}

	public void setListLocation(final List<Location> listLocation) {
		this.listLocation = listLocation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Clients [nom=" + nom + ", Id=" + Id + ", prenom=" + prenom
				+ ", adresse=" + adresse + "]";
	}
}
