package homework8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Object[] arrays = new Object[10];
		
		arrays[0] = Integer.valueOf(100);
		arrays[1] = Double.valueOf(3.14);
		arrays[2] = Long.valueOf(21L);
		arrays[3] = Short.valueOf((short)100);
		arrays[4] = Double.valueOf(5.1d);
		arrays[5] = new Kitty();
		arrays[6] = Integer.valueOf(100);
		arrays[7] = new Object();
		arrays[8] =new Snoopy();
		arrays[9] = new BigInteger("999");
		
		
//		List<Object> list = Arrays.asList(arrays);
		List<Object> list = new ArrayList<>(Arrays.asList(arrays));
		
		// 	Iterator
		System.out.println("Iterator");
		Iterator ir = list.iterator();
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		System.out.println("--------------------");
		
		//傳統for loop
		System.out.println("傳統for loop");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("--------------------");
		
		// for each
		System.out.println("for each");
		
		for(Object o : list)
			System.out.println(o);
		
		System.out.println("--------------------");
		
		System.out.println("刪除後：");

		Iterator ir2 = list.iterator();
		while(ir2.hasNext()) {
			Object element = ir2.next();
			if( element instanceof Number)
				ir2.remove();
		}
		System.out.println(list);
		
		System.out.println("--------------------");
		
		
		
	}
}
