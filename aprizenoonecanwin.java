import java.util.*;

public class aprizenoonecanwin{

    private static Scanner sc = new Scanner(System.in);
    
    public  static int[] getInput(int numOfItems){
        int[] arr = new int[numOfItems];
        for(int i=0;i<numOfItems;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        return arr;
    }
    
    public static void algorithm(int[] arr,int minCost){
        int counter = 1;
        for(int i=1;i<arr.length;i++){
            if((arr[i]+arr[i-1])<=minCost){
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[]args){
        int numOfItems = sc.nextInt();
        int minCost = sc.nextInt();
        int[] arr = getInput(numOfItems);
        algorithm(arr,minCost);
    }
}