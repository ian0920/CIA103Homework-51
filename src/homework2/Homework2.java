package homework2;

public class Homework2 {

	public static void main(String[] args) {

//		• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)

		int sum = 0;
		for (int i = 0; i <= 1000; i = i + 2) {

			sum = sum + i;
		}

		System.out.println("1~1000的偶數和為 = " + sum);
		System.out.println("=========================");
		System.out.println();

//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)

		int answer = 1;
		for (int i = 1; i <= 10; i++) {

			answer *= i;
		}

		System.out.println("(用for迴圈)1~10的連乘積為 = " + answer);
		System.out.println("=========================");
		System.out.println();

//		請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)

		int answer2 = 1;
		int i = 1;
		while (i <= 10) {
			answer2 *= i;
			i++;
		}

		System.out.println("(用while迴圈)1~10的連乘積為 = " + answer2);
		System.out.println("=========================");
		System.out.println();

//		• 請設計一隻Java程式,輸出結果為以下: 1 4 9 16 25 36 49 64 81 100

		for (int b = 1; b <= 10; b++) {

			System.out.print((int) Math.pow(b, 2) + " ");
		}

		System.out.println();
		System.out.println("=========================");
		System.out.println();

//		• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?

		int total = 0;
		for (int num = 1; num <= 49; num++) {

			if (num % 10 == 4 || num / 10 == 4) {
				continue;
			}
			
			System.out.print(num + " ");
			total++;
		}

		System.out.println("總共有 : " + total + "個");
		System.out.println("=========================");
		System.out.println();

		/*
		 * • 請設計一隻Java程式,輸出結果為以下: 
		 * 1 2 3 4 5 6 7 8 9 10
		 * 1 2 3 4 5 6 7 8 9
		 * 1 2 3 4 5 6 7 8
		 * 1 2 3 4 5 6 7
		 * 1 2 3 4 5 6
		 * 1 2 3 4 5
		 * 1 2 3 4
		 * 1 2 3
		 * 1 2
		 * 1
		 */

		for (int num2 = 1; num2 <= 10; num2++) {

			for (int num3 = 1; num3 <= (11 - num2); num3++) {

				System.out.print(num3 + " ");

			}

			System.out.println();

		}
		System.out.println();
		System.out.println("↑ ↑ ↑ ↑ ↑  寫法1  ↑ ↑ ↑ ↑ ↑");
		System.out.println();

		for (int x = 10; x >= 1; x--) {

			for (int y = 1; y <= x; y++) {

				System.out.print(y + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("↑ ↑ ↑ ↑ ↑  寫法2  ↑ ↑ ↑ ↑ ↑");
		System.out.println();
		/*
		 * • 請設計一隻Java程式,輸出結果為以下: 
		 * A
		 * BB
		 * CCC
		 * DDDD
		 * EEEEE
		 * FFFFFF
		 */

		for (int num4 = 65; num4 <= 70; num4++) {

			for (int num5 = 1; num5 <= (num4 - 64); num5++) {

				System.out.print((char) num4);

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("↑ ↑ ↑ ↑ ↑  寫法1  ↑ ↑ ↑ ↑ ↑");
		System.out.println();
		
		for (int r = 1; r <= 6; r++) {
			
			for (int s = 1; s <= r; s++) {
				
				System.out.print((char)(r + 64));
			}
			System.out.println();
			
		}

		System.out.println();
		System.out.println("↑ ↑ ↑ ↑ ↑  寫法2  ↑ ↑ ↑ ↑ ↑");
		System.out.println();
	}
}
