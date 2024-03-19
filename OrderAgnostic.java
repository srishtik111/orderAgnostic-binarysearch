import java.util.Scanner;

class OrderAgnostic{
    int target ,result;
    int search(int[] arr , int target)
    {
        int start=0;
        int end=arr.length-1;
    boolean isAsc=arr[start]<arr[end];
    while(start<=end)
    {
    int  mid=start+(end-start)/2;
    if(arr[mid]==target)
         {
        return mid;
         }
        if(isAsc)
         {
        if(target>arr[mid])
        start=mid+1;
         else 
            end=mid-1;
         }
    else{
        if(target>arr[mid])
        end=mid-1;
        else {
            start=mid+1;
        }
        
    }
   
}
return -1;
}

public static void main(String args[])
{
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter an elements of sorted array ");
    int arr[] =new int[5];
  
    for (int i=0;i<arr.length;i++)
    {
        System.out.print("Enter element at index " + i + ": ");
        arr[i] = scan.nextInt();
    }
    System.out.println("Enter an element you want to search  ");
    int target =scan.nextInt();
    OrderAgnostic o1=new OrderAgnostic();
   int result = o1.search(arr,target);
    //result = b1.Binary(arr, target);
    for (int i=0;i<arr.length;i++)
    {
        System.out.print( arr[i]);
       
    }
if(result==-1)
 System.out.println(" element not found  ");
else
 System.out.println("element found at " +result );
    scan.close();
}
}