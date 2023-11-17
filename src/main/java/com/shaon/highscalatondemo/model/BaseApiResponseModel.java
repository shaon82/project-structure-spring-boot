package com.shaon.highscalatondemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class BaseApiResponseModel <T>{
    private boolean success;
    private String message;

    private T data;

    public BaseApiResponseModel() {
    }

    public BaseApiResponseModel(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public static <T> BaseApiResponseModel<T> success(String message, T data) {
        return new BaseApiResponseModel<>(true, message, data);
    }

    public static <T> BaseApiResponseModel<T> error(String message) {
        return new BaseApiResponseModel<>(false, message, null);
    }
}
