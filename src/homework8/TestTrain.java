package homework8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestTrain {
	
	public static void main(String[] args) {
		
		Train[] arrays = { new Train(202, "普悠瑪", "樹林", "花蓮", 400),
									new Train(1254, "區間", "屏東", "基隆", 700),
									new Train(118, "自強", "高雄", "台北", 500),
									new Train(1288, "區間", "新竹", "基隆", 400),
									new Train(122, "自強", "台中", "花蓮", 600),
									new Train(1222, "區間", "樹林", "七堵", 300),
									new Train(1254, "區間", "屏東", "基隆", 700) };
		
		question1(arrays);
//		question2(arrays);
//		question3(arrays);


		
	}
	
	public static void question1(Train[] array) {
		
		Set<Train> set = new HashSet<>(Arrays.asList(array));
		
		for (Train t : set)
			System.out.println(t);
		
		
	}
	
	public static void question2(Train[] array) {
		
		List<Train> list = Arrays.asList(array);
		
		Collections.sort(list);
		list.stream().forEach(System.out::println);

				
		
	}
	
	public static void question3(Train[] array) {
		
		
		Set<Train> set = new TreeSet<>(Arrays.asList(array));
		set.stream().forEach(System.out::println);
		
		
		
	}
	

}
