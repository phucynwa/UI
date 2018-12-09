package com.constore.model.bean;

import com.constore.model.db.Bean;

import java.util.Date;

public final class Product extends Bean<Product> {
    static {
        beanInitialize(Product.class);
    }

    private static final long serialVersionUID = 1L;

    @BeanField private String name;
    @BeanField private String details;
    @BeanField private Float rating;
    @BeanField private String quantity;
    @BeanField private Long price;
    @BeanField private String shopId;
    @BeanField private Date createdDate;
    @BeanField private Date modifiedDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}