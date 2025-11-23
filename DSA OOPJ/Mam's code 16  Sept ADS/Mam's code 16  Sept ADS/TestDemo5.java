//Sort an arraylist in ascending and descending order

import java.util.*;

public class TestDemo5 {
    public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Papaya","Apple","Banana","Chickoo","Mango"));
		System.out.println("Display original List="+list);
		
		//Ascending
		Collections.sort(list);
		System.out.println("Display Sorted List="+list);
		
		//Descending
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Display Sorted List="+list);
		
		
	   
    }
 }
