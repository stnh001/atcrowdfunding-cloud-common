package com.atguigu.crowdfuning.common.bean;

import java.io.Serializable;

public class ApiResult<T> implements Serializable {

    private static final long serialVersionUID = -6629012691534400264L;
    private Boolean success;
    private T data;
    private String msg;
    
    
    
    public ApiResult(Boolean success, T data, String msg) {
		super();
		this.success = success;
		this.data = data;
		this.msg = msg;
	}

	public static <T> ApiResult getSuccess(T data) {
        return new ApiResult(true, data, null);

    }

    public static ApiResult getFailed(String msg) {
        return new ApiResult(false, null, msg);
    }
}