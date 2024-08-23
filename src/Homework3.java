import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
	
	public static void main (String[] args) {
		
//		• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形
//
//		(進階功能:加入直角三角形的判斷)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入三個整數 (以空白間隔)：");		
		String [] stringNumber = scanner.nextLine().split(" ");
		int [] number =new int [stringNumber.length];
		for (int i = 0; i < number.length; i++) {
			
			number[i] = Integer.parseInt(stringNumber[i]);	
		}
		
		
		if (number[0] + number[1] < number[2] | number[1] + number[2] < number[0]| number[0] + number[2] < number[1]) {
			System.out.println("不是三角形");		
		} else if (number[0] == number[1] | number[0] == number[2]| number[1] == number[2]) {
			System.out.println("等腰三角形");			
		} else if (number[0] == number[1] && number[1] == number[2]) {
			System.out.println("正三角形");	
		} else if ((Math.pow(number[0], 2) + Math.pow(number[1], 2)) == Math.pow(number[2], 2) |
						(Math.pow(number[1], 2) + Math.pow(number[2], 2)) == Math.pow(number[0], 2)|
						(Math.pow(number[1], 2) + Math.pow(number[0], 2)) == Math.pow(number[2], 2)) {
			System.out.println("直角三角形");	
		} else {
			System.out.println("其他三角形");	
		}
		
		
		
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
//
//		(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
	
		Random random = new Random();
        int bomb = random.nextInt(0,101);

        System.out.println("開始猜數字吧！請輸入一個數字");
        int enter = scanner.nextInt();
        while(enter != bomb) {
            if (enter > bomb) {
                System.out.println("猜錯囉！數字要小一點");
                enter = scanner.nextInt();
            } else if (enter < bomb) {
                System.out.println("猜錯囉！數字要大一點");
                enter = scanner.nextInt();
            }

        }
        System.out.println("答對囉！答案就是 " + bomb);
        
        
//        阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//        厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//        的號碼與總數,如圖:
//
//        (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
        
        System.out.println("阿文....請輸入你討厭的數字");
        int hate = scanner.nextInt();
		String total = "";
		
		for (int num = 1; num <= 49; num++) {

			if (num % 10 == hate || num / 10 == hate) {
				continue;
			}
						
			System.out.print(num + " ");
			total += " " +num;

		}
		
		String[] totalArray = total.trim().split(" ");
		List <String> list = Arrays.asList(totalArray);
		Collections.shuffle(list);
		
		System.out.println();
		System.out.print("隨機6個號碼為 : " +  totalArray[0] +" " + totalArray[1] + " " + totalArray[2] + " " + totalArray[3] + " " + totalArray[4] + " " + totalArray[5]);
		
	}
	


}
