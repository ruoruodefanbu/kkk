package com.kkk.entity;

/**
* <p>
* 
* </p>
* @author liup
* @since 2019-10-21
*/
public class OrderUser  {

    public static final String NAME = "OrderUser";
    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String phone;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
