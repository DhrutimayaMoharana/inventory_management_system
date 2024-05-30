package com.inventory.model;

import java.util.Date;

import com.inventory.enums.PrdouctType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private String productName;

  private Double costPrice;

  private Double sellingPrice;

  private int minQuantity;

  private int quantity;

  private PrdouctType prdouctType;


 private boolean isActive;

 private String createBy;

 private Date createdAt;


 private String updatedBy;


 private Date updateAt;


public String getProductName() {
    return productName;
}


public void setProductName(String productName) {
    this.productName = productName;
}


public Double getCostPrice() {
    return costPrice;
}


public void setCostPrice(Double costPrice) {
    this.costPrice = costPrice;
}


public Double getSellingPrice() {
    return sellingPrice;
}


public void setSellingPrice(Double sellingPrice) {
    this.sellingPrice = sellingPrice;
}


public int getMinQuantity() {
    return minQuantity;
}


public void setMinQuantity(int minQuantity) {
    this.minQuantity = minQuantity;
}


public int getQuantity() {
    return quantity;
}


public void setQuantity(int quantity) {
    this.quantity = quantity;
}


public PrdouctType getPrdouctType() {
    return prdouctType;
}


public void setPrdouctType(PrdouctType prdouctType) {
    this.prdouctType = prdouctType;
}


public boolean isActive() {
    return isActive;
}


public void setActive(boolean isActive) {
    this.isActive = isActive;
}


public String getCreateBy() {
    return createBy;
}


public void setCreateBy(String createBy) {
    this.createBy = createBy;
}


public Date getCreatedAt() {
    return createdAt;
}


public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
}


public String getUpdatedBy() {
    return updatedBy;
}


public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
}


public Date getUpdateAt() {
    return updateAt;
}


public void setUpdateAt(Date updateAt) {
    this.updateAt = updateAt;
}


public ProductInventory(String productName, Double costPrice, Double sellingPrice, int minQuantity, int quantity,
        PrdouctType prdouctType, boolean isActive, String createBy, Date createdAt, String updatedBy, Date updateAt) {
    this.productName = productName;
    this.costPrice = costPrice;
    this.sellingPrice = sellingPrice;
    this.minQuantity = minQuantity;
    this.quantity = quantity;
    this.prdouctType = prdouctType;
    this.isActive = isActive;
    this.createBy = createBy;
    this.createdAt = createdAt;
    this.updatedBy = updatedBy;
    this.updateAt = updateAt;
}


public ProductInventory() {
}







}
