package Recursion;

import java.util.Scanner;

public class OneToN
{
    public static void printOneton(int num)
    {
        for(int i=1;i<=num;i++)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) 
    {
        int num;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of num");
        num=sc.nextInt();

        printOneton(num);
            
    }    
}
