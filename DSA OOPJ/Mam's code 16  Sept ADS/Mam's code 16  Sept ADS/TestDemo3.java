//Reverse an ArrayList

import java.util.*;

public class TestDemo3 {
    public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Chickoo"));
		System.out.println("Display original List="+list);
		
		Collections.reverse(list);
       //Dispaly
	   
	   System.out.println("Display Reverse List="+list);
    }
 }
