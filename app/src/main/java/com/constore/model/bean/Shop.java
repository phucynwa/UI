package com.constore.model.bean;

import com.constore.model.db.Bean;

@SuppressWarnings("WeakerAccess")
public final class Shop extends Bean<Shop> {
    static {
        beanInitialize(Shop.class);
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
