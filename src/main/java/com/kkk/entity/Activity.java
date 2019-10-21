package com.kkk.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
* <p>
* 
* </p>
* @author liup
* @since 2019-10-21
*/

public class Activity  {

    public static final String NAME = "Activity";
    private static final long serialVersionUID = 1L;

    private String id;

    private String code;

    private String proName;

    private String proDesc;

    private BigDecimal salePrice;

    private String saleUnit;

    private Timestamp orderStartTime;

    private Timestamp orderEndTime;

    private String saleAddress;

    private Integer isDeleted;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
        }
    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
        }
    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
        }
    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
        }
    public String getSaleUnit() {
        return saleUnit;
    }
    public String getSaleAddress() {
        return saleAddress;
    }

    public void setSaleAddress(String saleAddress) {
        this.saleAddress = saleAddress;
        }
    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSaleUnit(String saleUnit) {
        this.saleUnit = saleUnit;
    }

    public Timestamp getOrderStartTime() {
        return orderStartTime;
    }

    public void setOrderStartTime(Timestamp orderStartTime) {
        this.orderStartTime = orderStartTime;
    }

    public Timestamp getOrderEndTime() {
        return orderEndTime;
    }

    public void setOrderEndTime(Timestamp orderEndTime) {
        this.orderEndTime = orderEndTime;
    }
}
