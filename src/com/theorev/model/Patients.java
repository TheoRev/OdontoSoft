package com.theorev.model;
// Generated 10/12/2017 10:23:04 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Patients generated by hbm2java
 */
@Entity
@Table(name = "patients", schema = "public")
public class Patients implements java.io.Serializable {

	private int id;
	private Treatments treatments;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	private Date dateInit;
	private String nomApe;
	private int age;
	private String sex;
	private Date dateNac;
	private String address;
	private String ocupation;
	private String telCel;
	private String alergies;
	private String operations;
	private boolean diabettes;
	private boolean hipertension;
	private String others;
	private String treatMedics;
	private boolean state;

	public Patients() {
	}

	public Patients(int id, Date dateInit, String nomApe, int age, String sex, Date dateNac, String ocupation,
			boolean diabettes, boolean hipertension, boolean state) {
		this.id = id;
		this.dateInit = dateInit;
		this.nomApe = nomApe;
		this.age = age;
		this.sex = sex;
		this.dateNac = dateNac;
		this.ocupation = ocupation;
		this.diabettes = diabettes;
		this.hipertension = hipertension;
		this.state = state;
	}

	public Patients(int id, Treatments treatments, Date createdAt, Date updatedAt, Date deletedAt, Date dateInit,
			String nomApe, int age, String sex, Date dateNac, String address, String ocupation, String telCel,
			String alergies, String operations, boolean diabettes, boolean hipertension, String others,
			String treatMedics, boolean state) {
		this.id = id;
		this.treatments = treatments;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
		this.dateInit = dateInit;
		this.nomApe = nomApe;
		this.age = age;
		this.sex = sex;
		this.dateNac = dateNac;
		this.address = address;
		this.ocupation = ocupation;
		this.telCel = telCel;
		this.alergies = alergies;
		this.operations = operations;
		this.diabettes = diabettes;
		this.hipertension = hipertension;
		this.others = others;
		this.treatMedics = treatMedics;
		this.state = state;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "treatment_id")
	public Treatments getTreatments() {
		return this.treatments;
	}

	public void setTreatments(Treatments treatments) {
		this.treatments = treatments;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 35)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 35)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deleted_at", length = 35)
	public Date getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_init", nullable = false, length = 35)
	public Date getDateInit() {
		return this.dateInit;
	}

	public void setDateInit(Date dateInit) {
		this.dateInit = dateInit;
	}

	@Column(name = "nom_ape", nullable = false, length = 200)
	public String getNomApe() {
		return this.nomApe;
	}

	public void setNomApe(String nomApe) {
		this.nomApe = nomApe;
	}

	@Column(name = "age", nullable = false)
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Column(name = "sex", nullable = false, length = 1)
	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_nac", nullable = false, length = 35)
	public Date getDateNac() {
		return this.dateNac;
	}

	public void setDateNac(Date dateNac) {
		this.dateNac = dateNac;
	}

	@Column(name = "address", length = 200)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "ocupation", nullable = false, length = 100)
	public String getOcupation() {
		return this.ocupation;
	}

	public void setOcupation(String ocupation) {
		this.ocupation = ocupation;
	}

	@Column(name = "tel_cel", length = 12)
	public String getTelCel() {
		return this.telCel;
	}

	public void setTelCel(String telCel) {
		this.telCel = telCel;
	}

	@Column(name = "alergies", length = 150)
	public String getAlergies() {
		return this.alergies;
	}

	public void setAlergies(String alergies) {
		this.alergies = alergies;
	}

	@Column(name = "operations", length = 150)
	public String getOperations() {
		return this.operations;
	}

	public void setOperations(String operations) {
		this.operations = operations;
	}

	@Column(name = "diabettes", nullable = false)
	public boolean isDiabettes() {
		return this.diabettes;
	}

	public void setDiabettes(boolean diabettes) {
		this.diabettes = diabettes;
	}

	@Column(name = "hipertension", nullable = false)
	public boolean isHipertension() {
		return this.hipertension;
	}

	public void setHipertension(boolean hipertension) {
		this.hipertension = hipertension;
	}

	@Column(name = "others", length = 120)
	public String getOthers() {
		return this.others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	@Column(name = "treat_medics", length = 120)
	public String getTreatMedics() {
		return this.treatMedics;
	}

	public void setTreatMedics(String treatMedics) {
		this.treatMedics = treatMedics;
	}

	@Column(name = "state", nullable = false)
	public boolean isState() {
		return this.state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

}
