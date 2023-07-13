
public class EpochTimeExample {

	public static void main(String[] args) {
		long epoch = System.currentTimeMillis()/1000 + 3600*9;//한국기준으로 9시간 더해줌, 단위는 초
		//epoch time(unix time) : 1970/01/01 00:00:00 ~ 경과시간  pc시간기준
		System.out.println(epoch);
		int year = 1970;
		for(;;) {
			boolean isLeap = (year%4 == 0 && year%100!=0) || (year%400 == 0); //윤년인지 확인
			int daysOFYear = isLeap ? 366 : 365;
			if (epoch-daysOFYear*24*3600 >= 0) {
				epoch = epoch - daysOFYear*24*3600;
				year++;
			}else
				break;
			
		}
		System.out.println(year);
		System.out.println(epoch);
		
		long days = epoch/(3600*24);
		int m = 0;
		System.out.println(days);
		for(int month=1; month<=12; month++) {
			if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			   days = days - (month*31);
			   if(days<0) {
				   month--;
			      System.out.println(month);
				   break;
			   }
			}
			else if(month==4||month==6||month==9||month==11) {
			   days = days - (month*30);
			   if(days<0) {
				   month--;
				   System.out.println(month);
				   break;
			   }
			}
			else if(month==2 && ((year%4 == 0 && year%100!=0) || (year%400 == 0))) {
				days = days - (month*29);
				if(days<0) {
					month--;
					System.out.println(month);
					break;
				}
			}
			else {
				days = days - (month*28);
				if(days<0) {
					month--;
					System.out.println(month);
					break;
				}
			}
			
		}
			
		System.out.println(days);	
			
	}

}
