package com.example.evtsrcnstock.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;



@Entity
public class StockLog{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer stockId;
	private Date stockArrived;
	private int quantity;
	private int categoryId;
	private int productId;
	private Date createdDate;
	private String createdUser;
	private Date modifiedDate;
	private String modifiedUser;
	private Double version;
	private int tenancyId;

	public StockLog(int stockId, Date stockArrived, int quantity, int categoryId, int productId,
				 Date createdDate, String createdUser, Date modifiedDate, String modifiedUser, Double version,int tenancyId) {
		this.stockId = stockId;
		this.stockArrived = stockArrived;
		this.quantity = quantity;
		this.categoryId = categoryId;
		this.productId = productId;
		this.createdDate = createdDate;
		this.createdUser = createdUser;
		this.modifiedDate = modifiedDate;
		this.modifiedUser = modifiedUser;
		this.version = version;
		this.tenancyId=tenancyId;
	}

	public StockLog() {
	}

	public int getTenancyId() {

		return tenancyId;
	}

	public void setTenancyId(int tenancyId) {
		this.tenancyId = tenancyId;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public Date getStockArrived() {
		return stockArrived;
	}

	public void setStockArrived(Date stockArrived) {
		this.stockArrived = stockArrived;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
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