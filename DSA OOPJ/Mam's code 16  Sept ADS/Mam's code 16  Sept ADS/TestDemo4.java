//Traversing an ArrayList using various methods

import java.util.*;

public class TestDemo4 {
    public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList("Apple","Banana","Chickoo"));
		System.out.println("Display original List="+list);
		
		//Method 1: For loop with index
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+ " " );
		}
		
		System.out.println();
		System.out.println("-----------------------");
		//Method 2:  for-each
		for(String s : list){
			System.out.print(s+" ");
		}
		
		System.out.println();
		System.out.println("-----------------------");
		//Method 3: Iterator : Forward direction print karta hai
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		System.out.println("-----------------------");
		//Method 4: ListIterator : Forward direction print karta hai
		ListIterator<String> lit = list.listIterator();
		while(lit.hasNext()){
			System.out.print(lit.next()+" ");
		}
		System.out.println();
		System.out.println("-----------------------");
		//Method 5: ListIterator : Backward direction print karta hai
		while(lit.hasPrevious()){
			System.out.print(lit.previous()+" ");
		}
		
		
		System.out.println();
		System.out.println("-----------------------");
		//Method 6:
	   list.forEach(x -> System.out.print(x + " "));
	   
    }
 }
