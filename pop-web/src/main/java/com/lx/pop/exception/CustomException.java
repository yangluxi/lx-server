package com.lx.pop.exception;

/**
 * Description
 * ProjectName pop
 * Created by lucy on 2017/12/25 10:17.
 * Version 1.0
 */
public class CustomException extends Exception {


    //异常信息
    private String message;

    public CustomException(String message){
        super(message);
        this.message = message;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
