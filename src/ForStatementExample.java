
public class ForStatementExample {
    public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
    	
    	for(int i=0; i<=100; i++) {
			if(i%2==0)
				evenSum += i;        // evenSum = evenSum + i
			else
				oddSum = oddSum + i;
		}
    	System.out.println(evenSum);
    	System.out.println(oddSum);
	}
    
	
	
	
	public static void main5(String[] args) {
		int sum = 0;
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//			sum = sum + i;
//		}
		for(int i=1; i<=100; i++) {
//			System.out.println(i);
			sum = sum + i;
		}
		System.out.println(sum);
		
	}
	
	public static void main4(String[] args) {
		for(;;) // 무한루프  실행창의 터미네이트 버튼을 누르면 강제종료된다
			System.out.println("...");
	}
	
	public static void main3(String[] args) {
		
		for (int i=1; i<=10; i++)
			System.out.println(i);
	}
	
	
	public static void main2(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
	}

}
