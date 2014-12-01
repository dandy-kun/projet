package com.projet.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private int id;
	@Column(name = "DATELOCATION", nullable = false)
	private Date dateLocation;
	@Column(name = "DATERETOUR", nullable = false)
	private Date dateRetour;
	@Column(name = "STATUT", nullable = false)
	private Chauffeur statut;
	@Column(name = "PRIX", nullable = false)
	private float prix;
	@Column(name = "VOITURE", nullable = false)
	private Voitures voiture_id;
	@Column(name = "VOITURE_ID", nullable = false)
	private Clients client_id;
	@Column(name = "CHAUFFEUR_ID", nullable = false)
	private Chauffeur chauffeur_id;

	public Location() {
		super();
	}

	public Location(int id, Date dateLocation, Date dateRetour,
			Chauffeur statut, float prix, Voitures voiture_id,
			Clients client_id, Chauffeur chauffeur_id) {
		super();
		this.id = id;
		this.dateLocation = dateLocation;
		this.dateRetour = dateRetour;
		this.statut = statut;
		this.prix = prix;
		this.voiture_id = voiture_id;
		this.client_id = client_id;
		this.chauffeur_id = chauffeur_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateLocation() {
		return dateLocation;
	}

	public void setDateLocation(Date dateLocation) {
		this.dateLocation = dateLocation;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public Chauffeur getStatut() {
		return statut;
	}

	public void setStatut(Chauffeur statut) {
		this.statut = statut;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Voitures getVoiture_id() {
		return voiture_id;
	}

	public void setVoiture_id(Voitures voiture_id) {
		this.voiture_id = voiture_id;
	}

	public Clients getClient_id() {
		return client_id;
	}

	public void setClient_id(Clients client_id) {
		this.client_id = client_id;
	}

	public Chauffeur getChauffeur_id() {
		return chauffeur_id;
	}

	public void setChauffeur_id(Chauffeur chauffeur_id) {
		this.chauffeur_id = chauffeur_id;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", dateLocation=" + dateLocation
				+ ", dateRetour=" + dateRetour + ", statut=" + statut
				+ ", prix=" + prix + ", voiture_id=" + voiture_id
				+ ", client_id=" + client_id + ", chauffeur_id=" + chauffeur_id
				+ "]";
	}

}
