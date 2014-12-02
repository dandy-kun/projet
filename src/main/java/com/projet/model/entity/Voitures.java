package com.projet.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.projet.model.entity.enumeration.Statut;

@Entity
public class Voitures implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", nullable = false)
	private int id;
	@Column(name = "MARQUE", nullable = false)
	private String marque;
	@Column(name = "MODELE", nullable = false)
	private String modele;
	@Column(name = "COULEUR", nullable = false)
	private String couleur;
	@Column(name = "ANNEE", nullable = false)
	private int annee;
	@Column(name = "KILOMETRE", nullable = false)
	private int kilometre;
	@Column(name = "STATUT", nullable = false)
	private Statut statut;
	@Column(name = "CAUTION", nullable = false)
	private float caution;
	@Column(name = "TARIF", nullable = false)
	private float tarif;

	public Voitures() {
		super();
	}

	public Voitures(final int id, final String marque, final String modele,
			final String couleur, final int annee, final int kilometre,
			final Statut statut, final float caution, final float tarif) {
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

	public void setId(final int id) {
		this.id = id;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(final String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(final String modele) {
		this.modele = modele;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(final String couleur) {
		this.couleur = couleur;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(final int annee) {
		this.annee = annee;
	}

	public int getKilometre() {
		return kilometre;
	}

	public void setKilometre(final int kilometre) {
		this.kilometre = kilometre;
	}

	public Statut getStatut() {
		return statut;
	}

	public void setStatut(final Statut statut) {
		this.statut = statut;
	}

	public float getCaution() {
		return caution;
	}

	public void setCaution(final float caution) {
		this.caution = caution;
	}

	public float getTarif() {
		return tarif;
	}

	public void setTarif(final float tarif) {
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
