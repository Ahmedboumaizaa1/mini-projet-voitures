package com.ahmed.voitures.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class voiture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoiture;
	private String nomVoiture;
	private Double prixVoiture;
	private Date dateCreation;
	
	@ManyToOne
	private Type type;
	
	public voiture() {
		super();
	}
	
	public voiture(String nomVoiture, Double prixVoiture, Date dateCreation) {
		super();
		this.nomVoiture = nomVoiture;
		this.prixVoiture = prixVoiture;
		this.dateCreation = dateCreation;
	}
	


	public Long getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}
	public String getNomVoiture() {
		return nomVoiture;
	}
	public void setNomVoiture(String nomVoiture) {
		this.nomVoiture = nomVoiture;
	}
	public Double getPrixVoiture() {
		return prixVoiture;
	}
	public void setPrixVoiture(Double prixVoiture) {
		this.prixVoiture = prixVoiture;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	@Override
	public String toString() {
		return "voiture [idVoiture=" + idVoiture + ", nomVoiture=" + nomVoiture + ", prixVoiture=" + prixVoiture
				+ ", dateCreation=" + dateCreation + "]";
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	
}
