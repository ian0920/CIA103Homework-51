package homework7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class homework7 {
	
	public static void main (String[] args) {

		try {
			question1();
			question2();
			copyFile(new File(".\\src\\homework7\\read.txt"),new File(".\\src\\homework7\\write.txt"));
			question4();
			question5();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

		
	}
	
	public static void question1 () throws IOException {
		
		File file = new File(".\\src\\homework7\\Sample.txt");
		
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			
			int numOfChar = 0;
			int lines = 0;
			
			while(br.read() != -1)
				numOfChar++;
			
			FileReader fr2 = new FileReader(file);
			BufferedReader br2= new BufferedReader(fr2);	
			
			while(br2.readLine() != null ) 
				lines++;								
			
			System.out.printf("Sample.txt檔案共有%d個位元組，%d個字元，%d列資料", file.length(), numOfChar, lines );
			br.close();
			fr.close();
			
			br2.close();
			fr2.close();
		
		
	}

	
	public static void question2() throws IOException{

		
		File file = new File(".\\src\\homework7\\Data.txt");
		FileWriter fw = new FileWriter(file, true);
		BufferedWriter bw = new BufferedWriter(fw);
		int count = 0;
		while(count < 10) {
			int random =(int) (Math.random() *1000) + 1;
			String pick = "" + random+" " ;
			bw.write(pick);
			count++;
			
		}
		
		System.out.print("檔案建立完成");
		
		bw.close();
		fw.close();
		
	}
	
	public static void copyFile(File fileRead, File fileWrite) throws IOException {
		
		FileReader fr = new FileReader(fileRead);
		FileWriter fw = new FileWriter(fileWrite);
		int i;
		while ((i = fr.read()) != -1) {
			fw.write(i);
		}
		
		System.out.println("檔案複製成功！");
		
		fw.close();
		fr.close();
		
	}
	
	public static void question4() throws IOException{
		
		Dog dog = new Dog("Shiba");
		Dog dog2 = new Dog("Samoyed");
		Cat cat = new Cat("Maine Cat");
		Cat cat2 = new Cat("Munchkin Cat");
		
		File dir = new File("C:\\data");
		if(!dir.exists())
			dir.mkdir();
		
		File file = new File("C:\\data\\Object.ser");
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(dog);
		oos.writeObject(dog2);
		oos.writeObject(cat);
		oos.writeObject(cat2);
		
		oos.close();
		fos.close();
		
		System.out.println("檔案輸出完成");
		
	}
	
	public static void question5() throws IOException, ClassNotFoundException {
		
		File file = new File("C:\\data\\Object.ser");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			while (true) {
				((Speakable) ois.readObject()).speak();
			} 
			
		}catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		
		ois.close();
		fis.close();
		
	}
}
