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
			 //System.out.println("inventry:");
			 
			 for(int i=0;i<1/*inventry.size()*/;i++){
				 JSONObject jsonObject1= (JSONObject) inventry.get(i);
				 JSONArray Rice= (JSONArray) jsonObject1.get("Rice");
				 //JSONArray Pulses= (JSONArray) jsonObject1.get("Pulses");
				// System.out.println(i+" "+jsonObject1);
				 for(int j=0;j<Rice.size();j++){
					 
					
					 JSONObject jsonObject2= (JSONObject) Rice.get(j);					  
					 System.out.println(jsonObject2.get("Name"));
					 System.out.println(jsonObject2.get("Weight"));
					 System.out.println(jsonObject2.get("Price"));
					
						 
						 
					 }
					 
					 
					 
				 }
				
				 
				 
				 
			 
			
			 
			
			 
		 }  catch(Exception e)
	        {
	            e.printStackTrace();
	        }
			 
		 

	}

}
