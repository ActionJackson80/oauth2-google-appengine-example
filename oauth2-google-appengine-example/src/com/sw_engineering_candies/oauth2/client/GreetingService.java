package com.sw_engineering_candies.oauth2.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.sw_engineering_candies.oauth2.shared.LoginInfo;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	
	String greetServer(String name) throws IllegalArgumentException;
	
	// TODO #09: start create login helper methods in service interface	
	String getUserEmail(String token);	
	
	LoginInfo login(String requestUri);	
	
	LoginInfo loginDetails(String token);
	// TODO #09:> end	
}
