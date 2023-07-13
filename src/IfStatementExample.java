
public class IfStatementExample {
	
	public static void main(String[] args) {
		int jnum = (int)(Math.random()*51+50); // 50~100까지 
		char grade = 'F';
		System.out.println("jnum =" + jnum ); // "+"기호는 세가지로 쓰임 1. 부호, 2. 산술 3. 문자열을 합칠 때 
		
		/*if(jnum < 60) 
			grade = 'F';
		else if(jnum >= 60 && jnum < 70)                   // else if로 조건을 계속 넣을 수 있다
			grade = 'D';
		else if(jnum >= 70 && jnum < 80)
			grade = 'C';
		else if(jnum >= 80 && jnum < 90)
			grade = 'B';
		else
			grade = 'A';
		*/
		if(jnum >= 90 )                   // 위 코드보다 조건문이 간단해졌음.. 
			grade = 'A';
		else if(jnum >= 80)                   // else if로 조건을 계속 넣을 수 있다
			grade = 'B';
		else if(jnum >= 70)
			grade = 'C';
		else if(jnum >= 60)
			grade = 'D';
		else
			grade = 'F';
		

		System.out.printf("[%d, %c]\n", jnum, grade);
	}
	
	public static void main1(String[] args) {
		int num = (int)(Math.random()*10 - 5); // -50~49까지 나옴
		System.out.println("num =" + num ); // "+"기호는 세가지로 쓰임 1. 부호, 2. 산술 3. 문자열을 합칠 때 
		if(num>0)
			System.out.println("양수");
		else if(num==0)                   // else if로 조건을 계속 넣을 수 있다
			System.out.println("0입니다");
		else 
			System.out.println("음수");
		
	}
	
	
	public static void main4(String[] args) {
		int num = 95;
		if(num%2 == 0) // {}이 없다 스테이트문이 한개이므로 생략가능, 두개 이상이면 절대필요 두개 이상에서 없으면 에러가 나올 수도 있고.. 한 줄로 인식할 경우 발생하지 않음
			System.out.println("num은 짝수입니다 num="+ num);
		else // else도 마찬가지{}이 없다 스테이트문이 한개이므로 생략가능, 두개 이상이면 절대필요 그러나 에러는 발생하지 않음 첫줄만 else소속으로 인식
			System.out.println("num은 홀수입니다 num="+ num); 
		
	}
	
	public static void main3(String[] args) {
		int num = 100;
		if(num%2 == 0) {
			System.out.println("num은 짝수입니다 num="+ num);
		}else {
			System.out.println("num은 홀수입니다 num="+ num);
		}
	}
	
	
	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int num = 100;
		if(num%3 == 0) {
			System.out.println("if문 수행됨");
		}
		if(10>100) {
			System.out.println("if문 수행됨");
		}
		
		System.out.println("Program End..");
	}

}
