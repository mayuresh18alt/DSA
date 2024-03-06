package Recursion;
public class Recursion
{
    public static void  recursion(int count)
    {
        if(count ==21 )
        return;
        { 
            System.out.println(count);
            count ++;
            
            recursion(count);
        }
    }
    public static void main(String[] args) 
    {
        int count =1;
        recursion(count);       
    }
}
