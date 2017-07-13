 
 import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Count1
{
  
public static void main(String[] args)
    {
        int smallest=0;
        int large=0; 
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number1");
        int n=input.nextInt();
        System.out.println("enter the number2");
        int n1=input.nextInt();
        System.out.println("enter the number3");
        int n2=input.nextInt();
        for(int i=0;i<=3;i++)
        {
          num=input.nextInt();
          if(num>large)
          {
           large=num;
          }
          System.out.println("the largest is:"+large);
          }
          }
          }
