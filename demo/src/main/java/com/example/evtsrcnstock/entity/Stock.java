package com.example.evtsrcnstock.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer stockId;
    
    private int quantity;

    private int productId;
    
    

    public Stock(int stockId, Date stockArrived, int quantity, int categoryId, int productId,
                 Date createdDate, String createdUser, Date modifiedDate, String modifiedUser, Double version,int tenancyId) {
        this.stockId = stockId;
        
        this.quantity = quantity;
        
        this.productId = productId;
        
        
    }

    public Stock() {
    }

  

    public int getStockId() {
        return stockId;
    }

    public void setStockId(int stockId) {
        this.stockId = stockId;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

   

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

   
}
