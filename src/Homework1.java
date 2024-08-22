
public class Homework1 {
	
	public static void main(String[] args) {
				
		//• 請設計一隻Java程式,計算12,6這兩個數值的和與積
		
		System.out.println("12,6 的和 = " + (12 + 6));
		System.out.println();
		System.out.println("12,6 的積 = " + (12 *+ 6));
		System.out.println();
		
		//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		System.out.println("200顆蛋是 " + 200/12 + "打 " + 200%12 +"顆");
		System.out.println();
		
		//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		
		int total = 256559;
		int days = total / (60*60*24);
		int hours = (total % (60*60*24)) / (60*60);
		int minutes = ((total % (60*60*24)) % (60*60)) / 60;
		int seconds = ((total % (60*60*24)) % (60*60)) % 60;
		
		System.out.printf("256559秒為 %d天, %d小時, %d分, %d秒%n", days, hours, minutes, seconds);
		System.out.println();
		
//		• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		
		final double PI = 3.1415;
		
		double area = 5 * 5 * PI;
		double circle = 2 * 5 * PI;
		
		System.out.printf("圓面積為 = %.2f, 圓周長為 = %.2f%n", area, circle);
		System.out.println();

//		• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
		//複利公式 ： 本利和 ＝ 期初資金 ×（1 ＋ 利率）n 次方, n=期數
		
		int first = 1500000;
		double after10Years = first * Math.pow((1+0.02), 10);
		
		System.out.printf("10 年後本金加利息共 %.2f 元%n", after10Years);
		System.out.println();
		
		
		/* 
		 • 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
			 	5 + 5
				5 + ‘5’
				5 + “5”
			並請用註解各別說明答案的產生原因
		 */
		
		System.out.println(5 + 5); // 答案為10，此時為兩個數字透過加法運算得出結果為10
		System.out.println(5 + '5'); // 答案為58，此時'5'的資料型態為char，而ASCII編碼中5的數值為53，因此相加結果則為58
		System.out.println(5 + "5"); // 答案為55,此時數字5和字串5相加，為字串的連接，因此結果為55
			
	}

}
