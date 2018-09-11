package a337;

import java.util.Random;
import java.util.Scanner;

public class MathExam337 {
	//n = scanner.nextInt();
	
	if(str='一年级乘除法')
	{int i=0;
	Scanner in = new Scanner(System.in); 
	int n = Scanner.nextInt();
	//int a = (int)(Math.random() * 10);
	//int b = (int)(Math.random() * 10);
	//int c = (int)(Math.random() * 2);
	//int d;
	//String[] str={"+","-"};
	//String[] str={"+","-"};
	//int index = (int) Math.random() * str.length;
	//System.out.println(str[index]);
	for(int i=0;i<n;i++) {
		String[] s1=new String[Integer.valueOf(str)];
		String[] s2=new String[Integer.valueOf(str)];
	    int a = (int)(Math.random() * 10);
		int b = (int)(Math.random() * 10);
		int x = (int)(Math.random() * 2);
		if(x==0) {
			s1[i]="("+(i+1)+")"+" "+a+"+"+b+"=";
			s2[i]="("+(i+1)+")"+" "+a+"+"+b+"="+(a+b);
		}
		if(x==1) {
			
			s1[i]="("+(i+1)+")"+" "+a-"%"+b+"=";
			s2[i]="("+(i+1)+")"+" "+a-"%"+b+"="+(a-b);
			
		}
		}	
	

	}
	else {
		String[] s3=new String[Integer.valueOf(str)];
		String[] s4=new String[Integer.valueOf(str)];
		
		Scanner in = new Scanner(System.in); 
		int n = Scanner.nextInt();
	    for(int i=0;i<n;i++) {
	    
	    int a = (int)(Math.random() * 10);
		int b = (int)(Math.random() * 10);
		int x = (int)(Math.random() * 2);
		if(x==0) {
			s3[i]="("+(i+1)+")"+" "+a+"*"+b+"=";
			s4[i]="("+(i+1)+")"+" "+a+"*"+b+"="+(a*b);
		}
		if(x==1) {
			if(a2%a3==0) {
			s3[i]="("+(i+1)+")"+" "+a+"%"+b+"=";
			s4[i]="("+(i+1)+")"+" "+a+"%"+b+"="+(a%b);
			}
			else
				break;
				
			}
		}
		}	
	}
File file = new File("e:/output.txt");
FileReader reader = new FileReader(file);
int fileLen = (int)file.length();
char[] chars = new char[fileLen];
reader.read(chars);
String txt = String.valueOf(chars);
System.setOut(out);
System.out.println(txt);
System.out.println("e:/output.txt已生成");
	
}