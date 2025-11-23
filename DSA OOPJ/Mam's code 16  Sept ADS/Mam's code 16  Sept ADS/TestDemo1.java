//ArrayList : CRUD: Add, Update, Remove and display

import java.util.*;

public class TestDemo1 {
    public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		//Add : add()
		list.add("Apple");
		list.add("Banana");
		list.add("Chickoo");
		System.out.println("Add List="+list);
		
		//Update : set()
		list.set(1,"Cherry");
		System.out.println("Update List="+list);
		
		//Remove by index: remove()
		list.remove(0);
		System.out.println("URemove by index List="+list);
		
		//Remove by value:remove()
		list.remove("Cherry");
		System.out.println("URemove by value List="+list);
		
       //Dispaly
	   System.out.println("Display List="+list);
    }
 }
