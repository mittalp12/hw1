package hw1;

import java.util.Arrays;

public class RemoveDuplicate {

	static void removeDuplicate(int[] arrayname){
		for(int i=0; i<arrayname.length; i++){
			System.out.print(arrayname[i]+"\t");
		}
		
		int numofuniqelements = arrayname.length;
		
		for(int i=0; i<numofuniqelements; i++){
			for(int j=i+1; j<numofuniqelements; j++){
				if(arrayname[i] == arrayname[j]){
					arrayname[j] = arrayname[numofuniqelements-1];
					numofuniqelements--;
					j--;
				}
			}
		}
		System.out.print("\n");

		int[] newarray = Arrays.copyOf(arrayname, numofuniqelements);
		for (int i = 0; i < newarray.length; i++)
        {
            System.out.print(newarray[i]+"\t");
        }
         
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDuplicate(new int[] {4, 3, 2, 4, 9, 2});
		

	}

}
