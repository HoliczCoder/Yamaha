package com.yamaha.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ResponseDTO {
    private int code;
    private String message;
    private Object data;

    public ResponseDTO(Object data, String message) {
        this.data = data;
        this.message = message;
    }

    public ResponseDTO(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static Object of(Object data, String message) {
        if (data == null || data instanceof String) {
            return new ResponseDTO(data, message + " failed!");
        } else {
            return new ResponseDTO(data, message + " successfully!");
        }
    }


}
