package com.constore.model.bean;

import com.constore.model.db.Bean;

import java.io.Serializable;

public class PaymentAddress extends Bean<PaymentAddress> implements Serializable {
    static {
        beanInitialize(PaymentAddress.class);
    }

    private static final long serialVersionUID = 1L;

    @BeanField private String name;
    @BeanField private String phone;
    @BeanField private String detailAddress;
    @BeanField private String city;
    @BeanField private String district;
    @BeanField private String ward;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }
}
