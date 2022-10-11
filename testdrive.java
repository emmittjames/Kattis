import java.util.*;

public class testdrive {  
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        if(((first-second)>0 && (second-third)<0) || ((first-second<0) && (second-third>0))){
            System.out.println("turned");
        }
        else if(Math.abs(third-second) > Math.abs(second-first)){
            System.out.println("accelerated");
        }
        else if(Math.abs(third-second) < Math.abs(second-first)){
            System.out.println("braked");
        }
        else{
            System.out.println("cruised");
        }
        sc.close();
    }
}