package com.constore.model.bean;

import com.constore.model.db.Bean;

import java.util.Date;

public final class Feedback extends Bean<Feedback> {
    static {
        beanInitialize(Feedback.class);
    }

    private static final long serialVersionUID = 1L;

    @BeanField private String content;
    @BeanField private Float rating;
    @BeanField private Date createdDate;
    @BeanField private Date modifiedDate;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
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
