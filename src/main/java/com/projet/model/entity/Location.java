package com.projet.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.projet.model.entity.enumeration.Etat;

@Entity
public class Location implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private int id;
	@Column(name = "DATELOCATION", nullable = false)
	private Date dateLocation;
	@Column(name = "DATERETOUR", nullable = false)
	private Date dateRetour;
	@Column(name = "STATUT", nullable = false)
	private Etat etat;
	@Column(name = "PRIX", nullable = false)
	private float prix;
	@ManyToOne
	private Voiture voiture;
	@ManyToOne
	private Client client;
	@ManyToOne
	private Chauffeur chauffeur;

	public Location() {
		super();
	}

	public Location(final int id, final Date dateLocation,
			final Date dateRetour, final Etat etat, final float prix,
			final Voiture voiture_id, final Client client_id,
			final Chauffeur chauffeur_id) {
		super();
		this.id = id;
		this.dateLocation = dateLocation;
		this.dateRetour = dateRetour;
		this.etat = etat;
		this.prix = prix;
		voiture = voiture_id;
		client = client_id;
		chauffeur = chauffeur_id;
	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public Date getDateLocation() {
		return dateLocation;
	}

	public void setDateLocation(final Date dateLocation) {
		this.dateLocation = dateLocation;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(final Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public Etat getEtat() {
		return etat;
	}

	public void setEtat(final Etat etat) {
		this.etat = etat;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(final float prix) {
		this.prix = prix;
	}

	public Voiture getVoiture_id() {
		return voiture;
	}

	public void setVoiture_id(final Voiture voiture_id) {
		voiture = voiture_id;
	}

	public Client getClient_id() {
		return client;
	}

	public void setClient_id(final Client client_id) {
		client = client_id;
	}

	public Chauffeur getChauffeur_id() {
		return chauffeur;
	}

	public void setChauffeur_id(final Chauffeur chauffeur_id) {
		chauffeur = chauffeur_id;
	}

	public Object getLignesLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public String toString() { return "Location [id=" + id +
	 * ", dateLocation=" + dateLocation + ", dateRetour=" + dateRetour +
	 * ", etat=" + etat + ", prix=" + prix + ", voiture_id=" + voiture_id +
	 * ", client_id=" + client_id + ", chauffeur_id=" + chauffeur_id + "]"; }
	 */

}
