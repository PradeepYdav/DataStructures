package com.pradeep.stack.linkedstack;

import java.util.LinkedList;

public class StackChaallengeForPalindrome {
   
   public static void main(String[] args) {
  
	   
	   System.out.println(checkPalindrome("hello"));
	   System.out.println(checkPalindrome("Racecar"));
	   System.out.println(checkPalindrome("dal,da"));
	   
	
}
   
   
   public static boolean checkPalindrome(String str) {
	   
	   LinkedList<Character> stack= new LinkedList<Character>();
	   StringBuilder noPunctuation= new StringBuilder(str.length());
	   String lowerCase=str.toLowerCase();
	   
	   for (int i=0;i<str.length();i++) {
		  char c=lowerCase.charAt(i);
		  if(c>='a' && c<='z') {
			  noPunctuation.append(c);
			  stack.push(c);
		  }
		   
	   }
	   
	   StringBuilder reverse= new StringBuilder(stack.size());
	   
	   while(!stack.isEmpty()) {
		   reverse.append(stack.pop());
	   }
	   
	   return reverse.toString().equals(noPunctuation.toString());
   }

}
