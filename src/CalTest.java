import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	
		try {
			System.out.println("請輸入X值");
			int x = scanner.nextInt();
			System.out.println("請輸入Y值");
			int y = scanner.nextInt(); 
			
			Calculator.PowerXY(x, y);
		} catch (CalException e1) {
			System.out.println(e1.getMessage());
		} catch (Exception e2) {
			if (e2 instanceof InputMismatchException) {
				System.out.println("輸入格式不正確");
			} else {
				e2.printStackTrace();
			}
				
		}
		
		
		
	}
}
