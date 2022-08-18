package com.ds4u.api;

import org.apache.commons.codec.binary.Base64;
import org.json.JSONObject;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class CallingRestApi {

	
	/**
	 * method for calling API with client and webresources
	 * @param url
	 * @param input
	 * @return
	 */
	public static String callSSLRestAPI(String url, String input) {

        String strResponse = "";
        try {
            String name = "hadoop";
            String password = "pass@123";
            String authString = name + ":" + password;
            Base64 base64 = new Base64();
            String authStringEnc = new String(base64.encode(authString.getBytes()));
            System.out.println("Base64 encoded auth string: " + authStringEnc);
        	Client client = Client.create();
        	JSONObject jsonObject= new JSONObject();
        	jsonObject.put("method", input);
        	String input1 = jsonObject.toString();
        	System.out.println("Json String ==== "+input1);
            WebResource webResource = client.resource(url);
            ClientResponse response = webResource.type("application/json").header("Authorization", "Basic " + authStringEnc).post(ClientResponse.class, input1);
            System.out.println(":::::BLOCK CHAIN status::::" + response.getStatus());
            strResponse = response.getEntity(String.class);
            System.out.println(":::::BLOCK CHAIN Response is :::: " + strResponse);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strResponse;
	}	
}
