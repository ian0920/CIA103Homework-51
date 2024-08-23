import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

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
		
		
		if (number[0] + number[1] <= number[2] | number[1] + number[2] <= number[0]| number[0] + number[2] <= number[1]) {
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
        
        

		
//      阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//      厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//      的號碼與總數,如圖:
//
//      (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
		
		
		//用Array的方式寫
		System.out.println();
		
		
		System.out.println("(用Array的方式) 阿文....請輸入你討厭的數字");
        int hate = scanner.nextInt();
        int [] arrays = new int[50];

        for (int i = 0 ; i < arrays.length; i++){
            arrays[i] = 0;
        }

        for (int num = 1; num <= 49; num++) {

            if (num % 10 == hate || num / 10 == hate) {
                continue;
            }
            arrays[num-1] = num;

        }

        int count = 0;
        String pick = "";
        while (count < 7){

            int randomNumber = random.nextInt(0,49);
            if (arrays[randomNumber] != 0 ){
                pick = pick + arrays[randomNumber] + " ";
                arrays[randomNumber] = 0;
                count++;
            }
         }

        System.out.println();
        System.out.println("隨機6個號碼為 :" + pick);
        System.out.println("====================");
        
//      阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//      厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//      的號碼與總數,如圖:
//
//      (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
        
        //用Set的方式寫
        
        System.out.println("(用Set的方式) 阿文....請輸入你討厭的數字");
        int hate1 = scanner.nextInt();
        int [] filtered = new int [49];
        for (int num = 1; num < 50; num++) {

            if (num % 10 == hate1 || num / 10 == hate1) {
                continue;
            }
            filtered[num -1 ] = num;

        }

        Integer[] filteredInteger = new Integer[filtered.length];

        for (int i = 0; i < filteredInteger.length; i++){
            filteredInteger[i] = filtered [i];
        }

        Set<Integer> noDuplicate = new HashSet<>();

        while (noDuplicate.size() < 7){

            int num1 = random.nextInt(0, filteredInteger.length - 1);
            if (filteredInteger[num1] != 0)
                noDuplicate.add(filteredInteger[num1]);

        }

        System.out.println();
        System.out.println("隨機6個號碼為 :" + noDuplicate);
        System.out.println("====================");

//      阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//      厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//      的號碼與總數,如圖:
//
//      (進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
      
      System.out.println("(用Collections.suffle的方式) 阿文....請輸入你討厭的數字");
      int hate2 = scanner.nextInt();
		String total = "";
		
		for (int num = 1; num <= 49; num++) {

			if (num % 10 == hate2 || num / 10 == hate2) {
				continue;
			}
						
			total += " " +num;

		}
		
		String[] totalArray = total.trim().split(" ");
		List <String> list = Arrays.asList(totalArray);
		Collections.shuffle(list);

		System.out.println();
		System.out.print("隨機6個號碼為 : " +  list.subList(0, 6));
		
		
	}
	
}
