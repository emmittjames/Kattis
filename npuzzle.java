import java.util.*;

public class npuzzle {

    private static int calculateScatter(char c, int actualI, int actualJ){
        int wantedI = calculatei(c);
        int wantedJ = calculatej(c);
        int total = 0;
        total+=Math.abs(wantedI-actualI);
        total+=Math.abs(wantedJ-actualJ);
        return total;
    }

    private static int calculatei(char c){
        int val = c-65;
        return val/4;
    }

    private static int calculatej(char c){
        int val = c-65;
        return val%4;
    }

    private static void input(){
        Scanner sc = new Scanner(System.in);
        char[][] grid = new char[4][4];
        int total = 0;
        for(int i=0;i<4;i++){
            String line = sc.nextLine().toUpperCase();
            for(int j=0;j<4;j++){
                if(line.charAt(j)!='.'){
                    total+=calculateScatter(line.charAt(j), i, j);
                }
            }
        }
        System.out.println(total);
    }
    
    public static void main(String[]args){
        input();
    }
}