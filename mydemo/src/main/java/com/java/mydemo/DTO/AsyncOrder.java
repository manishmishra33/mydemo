package com.java.mydemo.DTO;

import jakarta.persistence.Entity;

import java.util.UUID;


public class AsyncOrder {

    private String orderId;
    private String OderName;
    private Long price;
    private String productId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOderName() {
        return OderName;
    }

    public void setOderName(String oderName) {
        OderName = oderName;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
