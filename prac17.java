import java.util.*;
import java.io.*;
class prac17{
	
	static void revstr(){
		Scanner s = new Scanner(System.in);
		String str = s.nextLine(); 
		String revstr = ""; 
		for(int i=0; i<str.length(); i++)
			revstr = str.charAt(i) + revstr; 
		System.out.println("Given: "+str+"\nReverse: "+revstr);
		if(str.equalsIgnoreCase(revstr))
			System.out.println("Pelin String");
		else
			System.out.println("Non-pelin String"); 
	}
	static void facto(){
		Scanner s = new Scanner(System.in); 
		int no = s.nextInt(); 
		int tmp = 1;
		for(int i=no; i>0; i--)
			tmp = i * tmp;
		System.out.println("factorial of "+ no + " = " + tmp);
	}
	static void prime(){
		Scanner s = new Scanner(System.in);
		int no = s.nextInt(); 
		for(int i=2; i<=no; i++)
			for(int j=2; j<=i; j++)
				if(i%j==0)
					if(i==j)
						System.out.print(i+","); 
					else
						break; 
	}
	static void fibonanci(){
		Scanner s = new Scanner(System.in); 
		int no = s.nextInt(); 
		int next = 0, prev = 1, tmp=0;
		for(int i=0; i<=no; i++){
			System.out.print(next+","); 
			tmp = next + prev; 
			next = prev; 
			prev = tmp; 
		}	
	}
	static void charCount(){
		String s1 = "ASASDF34234@#@$@#$1314";
		int cno=0, cch=0, csc=0;
		for(int i=0; i<s1.length(); i++){
			char ch = s1.charAt(i); 
			if(Character.isLetter(ch))
				cch++; 
			else if(Character.isDigit(ch))
				cno++; 
			else
				csc++; 
		}
		System.out.println("Given String: "+ s1+ " has:\n"+"Char: "+cch+"\nNumber = "+cno+"\nSC = "+csc); 
	}
	static void upperlower(){
		String s = "WiNDowS",s1="";
		for(int i=s.length()-1; i>=0; i--){
			char ch = s.charAt(i); 
			if(Character.isLowerCase(ch))
				s1 = Character.toUpperCase(ch)+s1; 
			else if (Character.isUpperCase(ch))
				s1 = Character.toLowerCase(ch)+s1; 
		}
		System.out.println("Before: "+s+"\nAfter: "+s1); 
	}
	static void startwith(){
		String s = "Hello, World!"; 
		System.out.println(s.startsWith("Hello")); 
		System.out.println(s.endsWith("World")); 
	}
	static void sortarray(){
		int a[] = {5,4,3,2,1}; 
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++)
				if(a[i]>a[j]){
					int tmp = a[i]; 
					a[i] = a[j]; 
					a[j] = tmp; 
				}
			System.out.print(a[i]+","); 
		}
	}
	static void dupary(){
		int a[] = {1,2,3,2,3,4,5,2};
		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++)
				if(a[i]==a[j])
					a[j]=0;
			if(a[i]!=0)
				System.out.print(a[i]+","); 
		}
	}
	static void swapnotext(){
		String s1="Hello", s2="World";
		int a=10, b=20, len=s1.length();
		//swap no
		System.out.println("Before a: "+a+", b: "+b); 
		a = a+b;
		b = a-b; 
		a = a-b; 
		System.out.println("After a: "+a+", b: "+b);
		// swap text
		System.out.println("Before s1: "+s1+", s2: "+s2);
		s1 = s1+s2; 
		s2 = s1.substring(0,len); 
		s1 = s1.substring(len); 
		System.out.println("After s1: "+s1+", s2: "+s2);
	}
	static void charfreq(){
		String s1 = "aabbccddde";
		char ch[] = s1.toCharArray(); 
		for(int i=0; i<ch.length; i++){
			int count=0;
			for(int j=i+1; j<ch.length; j++)
				if(ch[i]==ch[j]){
					count++;
					ch[j]='\0';
				}
			if(ch[i]!='\0')
				System.out.println(ch[i]+" = "+count); 
		}
	}
	static void fileops(){
		try{
			File file = new File("C:\\Users\\KN00832612\\Documents\\Test files\\test1.txt"); 
			if(file.createNewFile())
				System.out.println("File Created"); 
			else
				System.out.println("Already File Created"); 
			FileWriter writer = new FileWriter(file); 
			writer.write("Test Data123"); 
			writer.close();
			
			FileReader reader = new FileReader(file);
			int c=0; 
			while((c=reader.read())!=-1)
				System.out.print((char)c); 
			if(file.delete())
				System.out.println("\nFile Deleted");
			else
				System.out.println("\nAlready file deleted"); 
		}catch(Exception e){
			System.out.println("Exception: "+e.getMessage()); 
		}
	}
	public static void main(String[] args){
		revstr();	
		//facto(); 
		//prime();
		//fibonanci();
		//charCount();
		//upperlower();
		//startwith();
		//sortarray();		
		//dupary();
		//swapnotext();
		//charfreq();
		fileops();
	}
}
