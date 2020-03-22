import java.util.Scanner;
public class Fibonacci{  
    
public static void main(String args[])  
{    
 int a=0,b=1,count=0;    
 
 Scanner in = new Scanner(System.in);
 if(in.hasNextInt()){
     count = in.nextInt();
 }
 System.out.print(a+" "+b);//printing 0 and 1    
    
 for(int i=2;i<count;++i)   
 {
  int c=a+b;    
  System.out.print(" "+c);    
  a=b;    
  b=c;    
 }    
  
}}  
