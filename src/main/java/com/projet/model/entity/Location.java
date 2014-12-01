package com.projet.model.entity;

import java.util.Date;

public class Location {
	private int id;
	private int num_location;
	private Date dateLocation;
	private Date dateRetour;
	private Chauffeur statut;
	private float prix;
	private Voitures voiture_id;
	private Clients client_id;
	private Chauffeur chauffeur_id;

	public Location() {
		super();
	}

	public Location(int num_location, Date dateLocation, Date dateRetour,
			Chauffeur statut, float prix, Voitures voiture_id,
			Clients client_id, Chauffeur chauffeur_id) {
		super();
		this.num_location = num_location;
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

	public int getNum_location() {
		return num_location;
	}

	public void setNum_location(int num_location) {
		this.num_location = num_location;
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
		return "Location [num_location=" + num_location + ", dateLocation="
				+ dateLocation + ", dateRetour=" + dateRetour + ", statut="
				+ statut + ", prix=" + prix + ", voiture_id=" + voiture_id
				+ ", client_id=" + client_id + ", chauffeur_id=" + chauffeur_id
				+ "]";
	}

}
