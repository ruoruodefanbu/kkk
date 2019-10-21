package com.kkk.util;

import java.io.Serializable;

public class OperateResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private String msg;

    private T data;

    private Boolean hasError;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getHasError() {
        return hasError;
    }

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }

    public OperateResult success(T data){
        this.data = data;
        this.hasError=false;
        return this;
    }

    public OperateResult error(String msg){
        this.msg = msg;
        this.hasError=true;
        return this;
    }
}
