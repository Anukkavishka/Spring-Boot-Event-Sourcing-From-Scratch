package com.example.evtsrcnstock.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Entity

public class CategoryLog {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer categoryId;
	private String categoryName;
	private Date createdDate;
	private String createdUser;
	private Date modifiedDate;
	private String modifiedUser;
	private Double version;
	private int tenancyId;

	public CategoryLog() {
	}

	public CategoryLog(int categoryId, String categoryName, Date createdDate,
					   String createdUser, Date modifiedDate, String modifiedUser, Double version, int tenancyId) {
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.createdDate = createdDate;
		this.createdUser = createdUser;
		this.modifiedDate = modifiedDate;
		this.modifiedUser = modifiedUser;
		this.version = version;
		this.tenancyId=tenancyId;
	}

	public int getTenancyId() {
		return tenancyId;
	}

	public void setTenancyId(int tenancyId) {
		this.tenancyId = tenancyId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedUser() {
		return modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
	}
}