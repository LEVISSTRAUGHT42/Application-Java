package com.upb.model;
// Generated 13 mai 2023, 08:35:43 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Aritre generated by hbm2java
 */
@Entity
@Table(name = "aritre", catalog = "appg7")
public class Aritre implements java.io.Serializable {

	private Integer idArbitre;
	private String nomArbitre;
	private String prenomArbitre;
	private String adresse;

	public Aritre() {
	}

	public Aritre(String nomArbitre, String prenomArbitre, String adresse) {
		this.nomArbitre = nomArbitre;
		this.prenomArbitre = prenomArbitre;
		this.adresse = adresse;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id_Arbitre", unique = true, nullable = false)
	public Integer getIdArbitre() {
		return this.idArbitre;
	}

	public void setIdArbitre(Integer idArbitre) {
		this.idArbitre = idArbitre;
	}

	@Column(name = "Nom_Arbitre", nullable = false, length = 50)
	public String getNomArbitre() {
		return this.nomArbitre;
	}

	public void setNomArbitre(String nomArbitre) {
		this.nomArbitre = nomArbitre;
	}

	@Column(name = "Prenom_Arbitre", nullable = false, length = 120)
	public String getPrenomArbitre() {
		return this.prenomArbitre;
	}

	public void setPrenomArbitre(String prenomArbitre) {
		this.prenomArbitre = prenomArbitre;
	}

	@Column(name = "Adresse", nullable = false, length = 65535)
	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
