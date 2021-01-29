package com.utilities;

public class Tools {
	
	public static String generateUniqueNumber(int n){
		// chose a Character random from this String 
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789"
                                    + "abcdefghijklmnopqrstuvxyz"; 
  
        // create StringBuffer size of AlphaNumericString 
        StringBuilder sb = new StringBuilder(n); 
  
        for (int i = 0; i < n; i++) { 
  
            // generate a random number between 
            // 0 to AlphaNumericString variable length 
            int index 
                = (int)(abc.length() 
                        * Math.random()); 
  
            // add Character one by one in end of sb 
            sb.append(abc.charAt(index)); 
        } 
  
        return sb.toString();
	}

}
