import java.util.*;

public class exoplanetlighthouse {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        for(int i=0;i<runs;i++){
            double R = sc.nextDouble();
            double a = sc.nextDouble()/1000;
            double b = sc.nextDouble()/1000;
            a += R;
            b += R;
            double theta1 = Math.acos(R/a);
            double theta2 = Math.acos(R/b);
            double theta = theta1 + theta2;
            double ans = theta*R;
            System.out.println(ans);
        }
        sc.close();
    }
}
