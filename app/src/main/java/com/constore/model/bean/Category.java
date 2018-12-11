package com.constore.model.bean;

import com.constore.model.db.Bean;

public final class Category extends Bean<Category> {
    static {
        beanInitialize(Category.class);
    }

    public Category(String name, String details, int icon) {
        this.name = name;
        this.details = details;
        this.icon = icon;
    }

    private static final long serialVersionUID = 1L;

    @BeanField private String name;
    @BeanField private String details;
    private int icon;

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

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
