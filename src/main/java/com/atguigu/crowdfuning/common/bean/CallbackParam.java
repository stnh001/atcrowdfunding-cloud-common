package com.atguigu.crowdfuning.common.bean;

import java.io.Serializable;

public class CallbackParam implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String callback;
    private String scriptWrapping;
	public String getCallback() {
		return callback;
	}
	public void setCallback(String callback) {
		this.callback = callback;
	}
	public String getScriptWrapping() {
		return scriptWrapping;
	}
	public void setScriptWrapping(String scriptWrapping) {
		this.scriptWrapping = scriptWrapping;
	}
	
    
    
}
