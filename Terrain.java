package com.upb.model;
// Generated 13 mai 2023, 08:35:43 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Terrain generated by hbm2java
 */
@Entity
@Table(name = "terrain", catalog = "appg7")
public class Terrain implements java.io.Serializable {

	private Integer idTerrain;
	private String nomTerrain;
	private String adresse;

	public Terrain() {
	}

	public Terrain(String nomTerrain, String adresse) {
		this.nomTerrain = nomTerrain;
		this.adresse = adresse;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id_Terrain", unique = true, nullable = false)
	public Integer getIdTerrain() {
		return this.idTerrain;
	}

	public void setIdTerrain(Integer idTerrain) {
		this.idTerrain = idTerrain;
	}

	@Column(name = "Nom_Terrain", nullable = false, length = 50)
	public String getNomTerrain() {
		return this.nomTerrain;
	}

	public void setNomTerrain(String nomTerrain) {
		this.nomTerrain = nomTerrain;
	}

	@Column(name = "Adresse", nullable = false, length = 65535)
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}