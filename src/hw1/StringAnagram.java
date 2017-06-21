package hw1;

import java.util.Arrays;

public class StringAnagram {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "save";
		String s2 = "vase";
		checkAnagram(s1,s2);
		
		if(checkAnagram(s1,s2) == false){
			System.out.println("Strings are not anagrams");
		} else {
			System.out.println("Strings are anagrams");
		}
	}

static boolean checkAnagram(String s1, String s2){
	
	char[] sArray  = s1.toCharArray();
	char[] secondArray = s2.toCharArray();
	
	 Arrays.sort(sArray);
     Arrays.sort(secondArray);

	boolean result = Arrays.equals(sArray, secondArray);
	
	if(result != true){
		return false;
	}
	else{
		return true;
	}
	
}	

}
	
