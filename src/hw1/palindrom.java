package hw1;

public class palindrom {
	public static void main(String args[]){
		int num = 121;
		int n = num; 
		int reverse=0,remainder;
		while(num > 0){
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		if(reverse == n)
			System.out.println(n+" is a Palindrome Number");
		else
			System.out.println(n+" is not a Palindrome Number");
	}

}
