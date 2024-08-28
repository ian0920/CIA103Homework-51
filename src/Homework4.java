import java.util.Scanner;

public class Homework4 {
	
	public static void main (String[] args) {
	
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		
		
	}
	
	private static void question1() {
		

//		• 有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		
		int [] array1 = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		
		double average = 0;
		int sum = 0;
		for (int i = 0; i < array1.length; i++) {
			sum += array1[i];
			}
		
		average = sum / array1.length;

		System.out.print("平均值為: " + average + ", 大於平均值的元素為: ");
		for(int i = 0; i < array1.length; i++) {
			
			if (array1[i] > average)
				System.out.print(array1[i] + " ");
		}
		
		System.out.println();
		
	}
	
	public static void question2() {
		
//		• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入一段文字");
		String s = scanner.nextLine();
		String reverse = "";
		for (int i = s.length() -1; i >= 0; i--) {
			reverse += s.charAt(i);
		}
		System.out.println("這是你輸入的文字顛倒的結果 = "+ reverse);
		
	}
	
	public static void question3() {
//			有個字串陣列如下 (八大行星):
//			{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//			請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
			
			String [] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
			int counter = 0;
			
			for (int i = 0 ; i < planet.length; i++) 			
				for (int j = 0; j < planet[i].length(); j++) 				
					if (planet[i].charAt(j) == 'a' | planet[i].charAt(j) == 'e' | planet[i].charAt(j) == 'i' | planet[i].charAt(j) == 'o' | planet[i].charAt(j) == 'u' ) 
						counter++;
			
			System.out.printf("共有%d個母音\n",counter);
	}
	
	public static void question4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("要借多少錢?");
		int money = scanner.nextInt();
		
		int [][] table = new int [5][2];
		table [0][0] = 2500;
		table [1][0] = 800;
		table [2][0] = 500;
		table [3][0] = 1000;
		table [4][0] = 1200;
		table [0][1] = 25;
		table [1][1] = 32;
		table [2][1] = 8;
		table [3][1] = 19;
		table [4][1] = 27;
		
		int people = 0;
		System.out.print("員工編號: ");
		for ( int i = 0; i < table.length; i++) {
			if (table[i][0] >= money) {
				System.out.print(table[i][1] + " ");
				people++;
				}	else {
					System.out.println("沒有人有夠多的錢可借");
					break;
					}			
		}
		System.out.printf("共%d人\n", people);
		
	}
	
	public static void question5() {
		
//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		Scanner scanner = new Scanner(System.in);
		boolean leapYear = false; 
		System.out.println("請輸入西元年 (介於1 - 9999)");
		int year = scanner.nextInt();
		while (year<1 || year>9999) {
			System.out.println("您輸入的年份超過範圍，請重新輸入西元年(介於1 - 9999)");
			year = scanner.nextInt();
		}
		
        if ( year % 4 == 0 )
        	if (year % 100 != 0 || year % 400 == 0)
        		leapYear = true;
           
			
		System.out.println("請輸入月份");
		int month = scanner.nextInt();
		while (month<1 || month>12) {
			System.out.println("您輸入的月份超過範圍，請重新輸入月份(介於1 - 12)");
			month = scanner.nextInt();
		}
		
		System.out.println("請輸入日期");
		if (leapYear)
			System.out.println("今年是閏年，2月有29天!");
		int date = scanner.nextInt();
		int februaryMax = leapYear ? 29 : 28;

		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12:
				while (date<1 || date>31) {
					System.out.println("您輸入的日期超過範圍，請重新輸入日期(介於1 - 31)");
					date = scanner.nextInt();
				}
				break;
				
			case 4, 6, 9, 11 :
				while (date<1 || date>30) {
					System.out.println("您輸入的日期超過範圍，請重新輸入日期(介於1 - 30)");
					date = scanner.nextInt();
				}
				break;
				
			case 2 :
				while (date<1 || date>februaryMax) {
					System.out.println("您輸入的日期超過範圍，請重新輸入日期(介於1 - 28 or 29)");
					date = scanner.nextInt();
				}
				break;
			
			default :
				System.out.print("Switch case 有問題");
				
		}
		
		int[] daysOfMonth = {0, 31,(leapYear) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		
		int totalDays = 0;
			for(int i = 0; i < month; i++) 
				totalDays += daysOfMonth[i];
				
		System.out.println("輸入的日期為該年的第"+ (totalDays + date)+"天" );
		
	}
	
	public static void question6() {
		
		int [][] table = { {10, 35, 40, 100, 90, 85, 75, 70},
								 {37, 75, 77, 89, 64, 75, 70, 95},
								 {100, 70, 79, 90, 75, 70, 79, 90},
								 {77, 95, 70, 89, 60, 75, 85, 89},
								 {98, 70, 89, 90, 75, 90, 89, 90},
								 {90, 80, 100, 75, 50, 20, 99, 75}};
		int max = 0;
		int[] counter = new int [8];
		int index = 0;
		
		for (int i = 0; i < table.length; i++) {
			for (int j =0; j < table[i].length; j++) {
				if (table[i][j] > max) {
					max = table[i][j];
					index = j;
					}
			}
			
			counter[index]++;
			max = 0;
			index = 0;
		}
		
		System.out.printf("1號%d次, 2號%d次, 3號%d次, 4號%d次, 5號%d次, 6號%d次, 7號%d次, 8號%d次", 
										counter[0], counter[1], counter[2], counter[3], counter[4], counter[5], counter[6], counter[7]);


	}

}
