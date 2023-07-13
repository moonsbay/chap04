
public class Exercise4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x = 15;
       if (x>10 && x<20)
    	   System.out.println("참입니다");
       
       char ch = 'c';
    	 if (ch!=' ' && ch != '\t')
    		System.out.println("ch참입니다");
//    	 if (ch == 'x' || ch == 'X')
//    		System.out.println("ch=x 참입니다");
    	 System.out.println("ch="+ch);
    	 if ((ch>='A' && ch<='Z')||(ch>='a'&& ch<='z'))
    	    System.out.println("ch=알파벳입니다");
    	 else
    		 System.out.println("ch=알파벳이 아닙니다");
    	 char st = '\t';
    	 char sa = ' ';
    	 System.out.print(ch);
    	 System.out.print(st);
    	 System.out.print(ch);
    	 System.out.print(sa);
    	 System.out.print(ch);
	}

}
