
public class Exercise4_9 {

	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
			sum = sum + ch;
		}
		System.out.println("sum="+ sum);
	}

}
