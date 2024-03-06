public class SecondLargest
{
    public static void secondMax(int arr[],int n)
    {
        for(int i=0;i<n;i++) 
        {
            int max=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j] < arr[max])
                {
                    max=j;
                }
                int temp=arr[max];
                arr[max]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println("after sorting array");
            {
                for(int i=0;i<n;i++)
                {
                    System.out.print(arr[i]+"  ");
                }
                System.out.println();
            }

            int maxx=arr[n-1];
            int secondmaxx=arr[n-2];

            System.out.println("1 st max number is\t"+maxx);
            System.out.println("2 nd max number is\t"+secondmaxx);
    }
    public static void main(String[] args)
    {
        int arr[]={2,5,1,3,0};
        int n=arr.length;

        System.out.println("Before sorting array");
        for(int i=0 ;i<n;i++)
        {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();

        secondMax(arr, n);
    }   
}
