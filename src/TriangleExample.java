
public class TriangleExample {

	public static void main(String[] args) {
		
		System.out.println("1번");
		for (int i=0; i<5; i++) {
		   for(int j=0; j<i+1; j++) 
				System.out.print("*");
		    System.out.println();
		    }
		System.out.println("2번");
		for (int i=0; i<5; i++) {
			for(int k=0; k<i+1; k++)       
				System.out.print(" ");
			for(int j=1; j<6-i; j++) 
				System.out.print("*");
			System.out.println();
			}
	}	
	   
//			
// *****************3번****************************
//			for(int j=0; j<5-i; j++) {
//				System.out.print("*");
//			}
//******************4번****************************
//		System.out.println("4번");
//		for (int i=0; i<5; i++) {
//		      for(int k=0; k<5-i; k++) {
//				 System.out.print(" ");
//			    }
//			   for(int j=0; j<i+1; j++) {
//				 System.out.print("*");
//			}
		
//***************************************************		
	
	public static void main1(String[] args) {
             
		       char ch = '*';
		       for(int i=0; i<=5; i++) {
            	 for(int j=5; j>=i; j--) {
            		 System.out.printf("*");
            		 
//            		 System.out.println();
            		    	 }
            	 System.out.println();
             }
	}

}
