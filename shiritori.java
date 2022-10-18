import java.util.*;

public class shiritori {
    
    private static int algo(){
        Scanner sc = new Scanner(System.in);
        int runs = Integer.parseInt(sc.nextLine());
        HashSet<String> set = new HashSet<>();
        String prevLine = sc.nextLine();
        set.add(prevLine);
        for(int i=1;i<runs;i++){
            String line = sc.nextLine();
            if(prevLine.charAt(prevLine.length()-1) != line.charAt(0)){
                if(i%2==0){
                    return 1;
                }
                else{
                    return 2;
                }
            }
            if(set.contains(line)){
                if(i%2==0){
                    return 1;
                }
                else{
                    return 2;
                }
            }
            prevLine = line;
            set.add(line);
        }
        return 0;
    }
    public static void main(String[]args){
        int result = algo();
        if(result==0){
            System.out.println("Fair Game");
        }
        else{
            System.out.println("Player " + result + " lost");
        }
    }
}
