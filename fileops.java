import java.util.*;
import java.io.*;

class fileops{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter file name: ");
		String filename = s.nextLine();
		try{
			File file = new File("C:\\Users\\KN00832612\\Documents\\Test files\\"+filename+".txt");
			if(file.createNewFile())
				System.out.println("File Created"); 
			else
				System.out.println("Already File Created"); 
			System.out.println("Write file content: "); 
			String content = s.nextLine(); 
			
			FileWriter writer = new FileWriter(file); 
			writer.write(content); 
			writer.close(); 
			
			FileReader reader = new FileReader(file); 
			int c=0; 
			System.out.println("Reading file: "); 
			while((c=reader.read())!=-1)
				System.out.print((char)c); 
		}catch(Exception e){
			System.out.println("Exception: "+e.getMessage()); 
		}
	}
}