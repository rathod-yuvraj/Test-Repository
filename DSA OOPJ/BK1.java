


class BK1{
	static void display(String str, String res){
	// REcursive method: to generate all possible combination
		//base condition
		if(str.length() == 0){
			System.out.println(res);
			return;
			
		}
		
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);//A | BC
			String ros = str.substring(0,i) + str.substring(i+1);
			display(ros, res+ch);
		}
	}
	
    public static void main(String[] args) {
		String s = "ABCDE";
		display(s,"");
		
		
    }
    
 
}
