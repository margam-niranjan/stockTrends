package com.stocks.ApiResponse;

public class GenericApiResponse<T> {

    private boolean success;
    private String message;
    private T data;

    // Constructor
    public GenericApiResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    // Success response
    public static <T> GenericApiResponse<T> success(T data) {
        return new GenericApiResponse<>(true, "Request successful", data);
    }

    // Error response
    public static <T> GenericApiResponse<T> error(String message) {
        return new GenericApiResponse<>(false, message, null);
    }

    // Getters and Setters
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
}
