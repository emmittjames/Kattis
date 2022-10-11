import java.util.*;

public class candydivision {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i=1;i<=Math.sqrt(input);i++){
            if(input%i==0){
                stack.push(input/i);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()-1 + " ");
        }
        sc.close();
    }
}