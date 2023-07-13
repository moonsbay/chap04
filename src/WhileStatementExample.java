
public class WhileStatementExample {
	public static void main(String[] args) {
		int dice1 = 0;
		int dice2 = 0;
		
		// do while문을 쓰지않고 while문으로만으로도 가능하나 코드가 중복된다
		dice1 = (int)(Math.random()*6+1);
		dice2 = (int)(Math.random()*6+1);
		System.out.printf("[%d, %d]\n", dice1, dice2);
		while(dice1 + dice2 != 5) {   // for(;dice1+dice2 != 5;) for문으로도 가능
			dice1 = (int)(Math.random()*6+1);
			dice2 = (int)(Math.random()*6+1);
			System.out.printf("[%d, %d]\n", dice1, dice2);
			
		}
		System.out.println("End");
	}
	
	
	public static void main3(String[] args) {
		int dice1 = 0;
		int dice2 = 0;
		
		do {
			dice1 = (int)(Math.random()*6+1);
			dice2 = (int)(Math.random()*6+1);
			System.out.printf("[%d, %d]\n", dice1, dice2);
		} while(dice1 + dice2 != 5);
		System.out.println("End");
	}
	public static void main2(String[] args) {
		int dice = 0;
		while(dice != 5) {     //주사위가 5가 나올 때까지 진행
			dice = (int)(Math.random()*6+1);
			System.out.println("dice ="+ dice);
		}
		System.out.println("End");
	}

}
