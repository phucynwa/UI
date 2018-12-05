package com.constore.model.bean;

import com.constore.model.db.Bean;

public final class Role extends Bean<Role> {
    static {
        beanInitialize(Role.class);
    }

    private static final long serialVersionUID = 1L;

    @BeanField private String name;
    @BeanField private String details;
    @BeanField private Integer level;

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

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
