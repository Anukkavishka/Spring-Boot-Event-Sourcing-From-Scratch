package com.example.evtsrcnstock.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ProductLog{

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer productId;
	private String productName;
	private boolean productIsService;
	private Double productBuyingPrice;
	private Double productSellingPrice;
	private int categoryid;
	private Date createdDate;
	private String createdUser;
	private Date modifiedDate;
	private String modifiedUser;
	private Double version;
	private int tenancyId;

	public ProductLog(int productId, String productName, boolean productIsService, Double productBuyingPrice,
				   Double productSellingPrice, int categoryid, Date createdDate,
				   String createdUser, Date modifiedDate, String modifiedUser, Double version,int tenancyId) {
		this.productId = productId;
		this.productName = productName;
		this.productIsService = productIsService;
		this.productBuyingPrice = productBuyingPrice;
		this.productSellingPrice = productSellingPrice;
		this.categoryid = categoryid;
		this.createdDate = createdDate;
		this.createdUser = createdUser;
		this.modifiedDate = modifiedDate;
		this.modifiedUser = modifiedUser;
		this.version = version;
		this.tenancyId=tenancyId;
	}


	public ProductLog() {
	}

	public int getTenancyId() {

		return tenancyId;
	}

	public void setTenancyId(int tenancyId) {
		this.tenancyId = tenancyId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public boolean isProductIsService() {
		return productIsService;
	}

	public void setProductIsService(boolean productIsService) {
		this.productIsService = productIsService;
	}

	public Double getProductBuyingPrice() {
		return productBuyingPrice;
	}

	public void setProductBuyingPrice(Double productBuyingPrice) {
		this.productBuyingPrice = productBuyingPrice;
	}

	public Double getProductSellingPrice() {
		return productSellingPrice;
	}

	public void setProductSellingPrice(Double productSellingPrice) {
		this.productSellingPrice = productSellingPrice;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
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