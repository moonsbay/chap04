
public class ContinueStatementExample {

	public static void main(String[] args) {
		int sum1 = 0;   //3의 배수의 합
		int sum2 = 0;   // 그 외 합
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				break;         //for문을 끝내버리내
//				sum1 += i;
//				continue;     // if문의 조건이 맞을 때 continue를 만나서 밑으로 안가고 바로 위의 for문으로 다시 감
			}
			sum2 += i;
		}
		System.out.println("sum1 ="+ sum1);
		System.out.println("sum2 ="+ sum2);
	}

}
