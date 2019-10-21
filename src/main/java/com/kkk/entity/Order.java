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

public class Order{
    public static final String NAME = "Order";
    private static final long serialVersionUID = 1L;

    private String id;

    private String activityId;

    private String userName;

    private String userPhone;

    private BigDecimal proAmount;

    private Timestamp orderTime;

    private Integer isDeleted;

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
        }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        }
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
        }
    public BigDecimal getProAmount() {
        return proAmount;
    }

    public void setProAmount(BigDecimal proAmount) {
        this.proAmount = proAmount;
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

    public Timestamp getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Timestamp orderTime) {
        this.orderTime = orderTime;
    }
}
