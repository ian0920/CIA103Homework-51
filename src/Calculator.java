import java.util.Scanner;

public class Calculator {
	
		
	
	public static void PowerXY (int x, int y) throws CalException {
				
		if ( x == 0 && y == 0) {
//			System.out.println("0的0次方沒有意義");
			throw new CalException("0的0次方沒有意義");			
		}
		
		if (y<0) {
//			System.out.println("次方為負值，回傳結果不為整數");
			throw new CalException(" 次方為負值，回傳結果不為整數");	
		}
		
		
		System.out.printf("%s的%s次方等於%s", x, y, (int)Math.pow(x, y));
		
	}

}


