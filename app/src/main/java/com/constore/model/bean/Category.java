package com.constore.model.bean;

import com.constore.model.db.Bean;

public final class Category extends Bean<Category> {
    static {
        beanInitialize(Category.class);
    }

    private static final long serialVersionUID = 1L;

    @BeanField private String name;
    @BeanField private String details;

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
}