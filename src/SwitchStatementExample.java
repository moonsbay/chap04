
public class SwitchStatementExample {
    
	public static void main(String[] args) {
		char ch = (char)(Math.random()*26 + 'A');  
	    // Break생략 사용 예	
		System.out.println(ch);
		switch(ch) {
		case 'A':
		case 'I':
		case 'E':
		case 'O':
		case 'U':
			System.out.println("모음");
			break;
		default:
		    System.out.println("자음");
			
		}
	}
	
	public static void main2(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random()*5); // 0~4
		char ch = '모';
/*		if(num == 0)
			ch = '도';
		else if(num == 1)
			ch = '개';
		else if(num == 2)
			ch = '걸';
		else if(num == 3)
			ch = '윷';
		else 
			ch = '모';
*/		
		
		switch (num) {          // switch문에서 num은 정수만 가능 
		case 0:
			ch = '도';
//			break;        //  break가 없을 경우 계속 수행..num이 0이라도.. 걸이 나옴
		case 1:
			ch = '개';
//			break;
		case 2:
			ch = '걸';
			break;
		case 3:
			ch = '윷';
			break;
		default:
			ch = '모';
			break;
		}
		
		System.out.printf("[%d, %C]\n", num, ch);
	}

}
