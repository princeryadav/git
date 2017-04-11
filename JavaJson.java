package com.bridgeit.javaprogarms;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JavaJson {

	public static void main(String[] args) {
		
		 JSONParser parser =new JSONParser();
		 
		 try{
			 Object object=parser.parse(new FileReader("/home/bridgeit/workspace/30Problem/src/file.json"));
			 
			 JSONObject jsonObject=(JSONObject) object;
			 
			
			JSONArray inventry= (JSONArray) jsonObject.get("Inventry");
			System.out.println("inventry:");
			for(Object inventry1 : inventry){
				System.out.println(inventry1);
			}
			 
		 }  catch(Exception e)
	        {
	            e.printStackTrace();
	        }
			 
		 

	}

}
