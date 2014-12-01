package com.projet.model.entity;

import com.projet.model.entity.enumeration.Statut;

public class Voitures {
	private int id;
	private String marque;
	private String modele;
	private String couleur;
	private int annee;
	private int kilometre;
	private Statut statut;
	private float caution;
	private float tarif;

	public Voitures() {
		super();
	}

	public Voitures(int id, String marque, String modele, String couleur,
			int annee, int kilometre, Statut statut, float caution, float tarif) {
		super();
		this.id = id;
		this.marque = marque;
		this.modele = modele;
		this.couleur = couleur;
		this.annee = annee;
		this.kilometre = kilometre;
		this.statut = statut;
		this.caution = caution;
		this.tarif = tarif;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getKilometre() {
		return kilometre;
	}

	public void setKilometre(int kilometre) {
		this.kilometre = kilometre;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public float getCaution() {
		return caution;
	}

	public void setCaution(float caution) {
		this.caution = caution;
	}

	public float getTarif() {
		return tarif;
	}

	public void setTarif(float tarif) {
		this.tarif = tarif;
	}

	@Override
	public String toString() {
		return "Voitures [id=" + id + ", marque=" + marque + ", modele="
				+ modele + ", couleur=" + couleur + ", annee=" + annee
				+ ", kilometre=" + kilometre + ", statut=" + statut
				+ ", caution=" + caution + ", tarif=" + tarif + "]";
	}

}
