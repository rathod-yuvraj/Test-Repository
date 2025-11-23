//To remove duplicates from ArrayList

import java.util.*;

public class TestDemo2 {
    public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,1,4,4,5));
		
		//PReserve insertion order
		ArrayList<Integer> unique = new ArrayList<>(new LinkedHashSet<>(list));
		
       //Dispaly
	   System.out.println("Display original List="+list);
	   System.out.println("Display Without duplicates List="+unique);
    }
 }
