
public class GuGuDanExample {

	public static void main(String[] args) {
		int count = 0;
		int a = 0;
		
		for(int x=1; x<=100; x++)
//			a++ ;
			for(int y=1; y<=100; y++)
//				b++;
				for(int z=1; z<=100; z++)
					if(x*x + y*y == z*z) {
			    		count++;
		                System.out.printf("[%3d, %3d, %3d]\n", x, y, z);
					}
		System.out.println(count);
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
	}
	
	public static void main4(String[] args) {
		for(int dan=1; dan<=9; dan++) {
			System.out.println(dan + "단");
			for(int i=1; i<=9; i++) {
				if(dan*i%2==0)
			      System.out.printf("%d x %d = %2d\n", dan, i, dan*i);
			}
		}
	}
	
	
	public static void main3(String[] args) {
		int count = 0;
		for(int dan=1; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main2(String[] args) {
		int gu = 0;
		System.out.println("1단");
//		for(int i=1; i<=9; i++)
		for(int i=1; i<=9; i++) {
				System.out.printf("1 x %d = %2d\n", i, i*1);
			}
		System.out.println("2단");
		for(int i=1; i<=9; i++) {
			System.out.printf("2 x %d = %2d\n", i, i*2);
		}
	}

}
