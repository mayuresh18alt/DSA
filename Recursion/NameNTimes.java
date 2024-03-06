package Recursion;
import java.util.Scanner;

public class NameNTimes
{
    public static void printNtimes(String name)
    {
        for(int i=0;i<=9;i++)
        {
            
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        String name;

        System.out.println("enter the name");
        name=sc.nextLine();

        printNtimes(name);

    }    
}
