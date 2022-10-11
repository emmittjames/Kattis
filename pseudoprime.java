import java.util.*;
import java.math.*;

public class pseudoprime {

    private static void algo(String[] line){
        BigInteger p = new BigInteger(line[0]);
        BigInteger a = new BigInteger(line[1]);

        if(!p.isProbablePrime(10) && a.modPow(p,p).equals(a))
            System.out.println("yes");
        else
            System.out.println("no");
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String[]> lineStrs = new ArrayList<>();
        while(sc.hasNextLine()){
            String[] s = sc.nextLine().split(" ");
            if(s[0].equals("0") && s[1].equals("0"))
                break;
            lineStrs.add(s);
        }
        for(String[] str:lineStrs){
            algo(str);
        }
        sc.close();
    }
}