package Recursion;

import java.util.Scanner;

public class NToOne
{
    public static void printNtoone(int num)
    {
        for(int i=num;i>=0;i--)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        int num;
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of the num");
        num=sc.nextInt();

        printNtoone(num);
    }    
}
