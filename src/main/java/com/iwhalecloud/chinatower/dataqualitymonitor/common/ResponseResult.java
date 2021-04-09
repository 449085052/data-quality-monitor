package com.iwhalecloud.chinatower.dataqualitymonitor.common;

import java.io.Serializable;

public class ResponseResult<T> implements Serializable {
    private int code; // 响应编码
    private String msg; // 响应消息
    private boolean success;
    private int count; // 数据总量
    private T data; // 数据
    
    /**
     * 构造方法私有化，不允许外部new ResponseResultNew
     */
    private ResponseResult() {
    }
    
    public static <T> ResponseResult<T> success(String msg, int count, T data) {
        ResponseResult result = new ResponseResult();
        
        result.code = 0;
        result.msg = msg;
        result.count = count;
        result.data = data;
        result.success = true;
        
        return result;
    }
    
    public static <T> ResponseResult<T> success(String msg, long count, T data) {
        ResponseResult result = new ResponseResult();
        
        result.code = 0;
        result.msg = msg;
        result.count = (int) count;
        result.data = data;
        result.success = true;
        
        return result;
    }
    
    public static <T> ResponseResult<T> success(String msg) {
        ResponseResult result = new ResponseResult();
        
        result.code = 0;
        result.count = 0;
        result.msg = msg;
        result.data = null;
        result.success = true;
        
        return result;
    }
    
    public static <T> ResponseResult<T> success(T data) {
        ResponseResult result = new ResponseResult();
        result.code = 0;
        result.count = 0;
        result.msg = null;
        result.data = data;
        result.success = true;
        
        return result;
    }
    
    public static <T> ResponseResult<T> success() {
        ResponseResult result = new ResponseResult();
        result.code = 0;
        result.count = 0;
        result.msg = null;
        result.data = null;
        result.success = true;
        
        return result;
    }
    
    public static <T> ResponseResult<T> failure(String errorMessage) {
        ResponseResult result = new ResponseResult();
        
        result.code = 1;
        result.count = 0;
        result.msg = errorMessage;
        result.data = null;
        result.success = false;
        
        return result;
    }
    
    public static <T> ResponseResult<T> failure() {
        ResponseResult result = new ResponseResult();
        
        result.code = 1;
        result.count = 0;
        result.msg = null;
        result.data = null;
        result.success = false;
        
        return result;
    }
    
    public int getCode() {
        return this.code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    
    public String getMsg() {
        return this.msg;
    }
    
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public void setCount(int count) {
        this.count = count;
    }
    
    public T getData() {
        return this.data;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public boolean isSuccess() {
        return this.success;
    }
    
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(500);
        
        stringBuilder.append("code=").append(code).append(";msg=").append(msg).append(";count=").append(count)
                .append(";data=").append(data);
        
        return stringBuilder.toString();
    }
}
