
class RecursionDemo1 {
	static int i=0;
	
	static void show(){
		++i;
		if(i<=5){
		System.out.println("Hello everyone!!!!");
		show();
		}
	}
	
    public static void main(String[] args) {
		
		
		System.out.println("Recusion");
		show();
		
		
	   
    }
 }
