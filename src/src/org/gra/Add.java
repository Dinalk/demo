package org.gra;

public class Add {
	 public void cost() {
	 		System.out.println("100");
	 	}
	 	public void speed() {
	         System.out.println("120");
	 		
	 	}

	public static void main(String[] args) {
	
		
		String a="welcome to java";
				
				int i = a.length();
		      System.out.println(i);
		      
		      for (int j = 0; j <a.length(); j++) {
				 char c = a.charAt(j);
				 System.out.println(c);
		      }
	
	
		     String[] s= a.split("to");
		     for (int n = 0; n <s.length; n++) {
		    	 System.out.println(s[n]);
				
			}
		    
		 Add g=new Add();
		 g.speed();
		 g.cost();
		 
	
	}
	

}
