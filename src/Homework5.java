import java.util.Random;

public class Homework5 {
	
	public static void main (String[] args) {
		
		starSquare(3,8);
		randAvg();
		
		
		int[][] intArray = {{1, 6, 3}, {9, 5, 2}};
		double[][] doubleArray = {	{1.2, 3.5, 2.2}, 	{7.4, 2.1, 8.2} };
		
		System.out.println(MaxElement(intArray));
		System.out.println(MaxElement(doubleArray));
		
		getAuthCode();
		getAuthCode_A();		
	}
	
	public static void starSquare(int width, int height) {
		
		for (int i = 1; i <= height; i++) {
			for(int j = 1; j <= width; j ++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void randAvg() {

		Random random = new Random();
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int pick = random.nextInt(0, 101);
			System.out.print(pick + " ");
			sum += pick;
		}
		System.out.println("平均為: " + (sum/10));
		
		
		
		
	}

	public static int MaxElement(int[][] array) {
		int max = 0;		
		for(int i = 0; i < array.length; i++) 
			for (int j = 0; j < array[i].length; j++) 
				if(array[i][j] > max) { 
					max = array[i][j];
				}
		
		return max;
	}
	
	public static double  MaxElement(double[][] array) {
		double max = 0;		
		for(int i = 0; i < array.length; i++) 
			for (int j = 0; j < array[i].length; j++) 
				if(array[i][j] > max) { 
					max = array[i][j];
				}
		return max;
	}
	
	public static void getAuthCode(){

		
		int counter = 0;
		String authCode = "";
		
		while(counter < 8) {
			
			Random random = new Random();
			char upperCase = (char)random.nextInt(65, 91);
			char lowerCase = (char)random.nextInt(97, 123);
			char number = (char)random.nextInt(48, 58);
			int range = random.nextInt(1,4);
			
			switch (range) {
				case 1: 
					authCode += upperCase;
					counter++;
					break;
				case 2:
					authCode += lowerCase;
					counter++;
					break;
				case 3:
					authCode += number;
					counter++;
					break;
				default:
					System.out.print("switch case got some error");
			}

		}
		
		System.out.println("你的隨機碼：" + authCode);
        
    }
	
	public static void getAuthCode_A() {

		
		Random random = new Random();
		int[] array = {58, 59, 60, 61, 62, 63, 64,91, 92, 93, 94, 95, 96};
		String auth = "";
		int count = 0;		
		
		while(count < 8) {
			int pick = random.nextInt(48, 123);
			boolean equal = false;
			for (int i = 0 ; i < array.length; i++) {
				if (array[i] == pick)
					equal = true;
			}
			
			if (!equal) {
				auth += (char) pick;
				count++;
			} else {
				equal = false;
			}
			
		}		
		System.out.print("你的隨機碼：" + auth);
		
	}
	

}



