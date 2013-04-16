package com.sw_engineering_candies.oauth2.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.sw_engineering_candies.oauth2.shared.LoginInfo;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {

	void greetServer(String input, AsyncCallback<String> callback) throws IllegalArgumentException;

	// TODO #10: create login helper methods in service asynchronous interface	
	void getUserEmail(String token, AsyncCallback<String> callback);

	void login(String requestUri, AsyncCallback<LoginInfo> asyncCallback);

	void loginDetails(String token, AsyncCallback<LoginInfo> asyncCallback);
	// TODO #10:> end	

}
