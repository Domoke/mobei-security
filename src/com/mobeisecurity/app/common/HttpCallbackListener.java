package com.mobeisecurity.app.common;

public interface HttpCallbackListener {

	void onFinish(String response);
	
	void onError(Exception e) ;
}
