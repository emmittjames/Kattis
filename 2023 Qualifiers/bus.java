import java.util.*;

public class bus {

    private static Scanner sc = new Scanner(System.in);

    private static void readInput(){
        String[]firstLine = sc.nextLine().split(" ");
        int singleTicketPrice = Integer.parseInt(firstLine[0]);
        int periodTicketPrice = Integer.parseInt(firstLine[1]);
        int periodTicketDuration = Integer.parseInt(firstLine[2]);
        int trips = Integer.parseInt(firstLine[3]);
        String[]secondLine = sc.nextLine().split(" ");
        int[]allTrips = convertStringArray(secondLine);
        for(int i=0;i<trips;i++){
            getPeriodTicketRatio(periodTicketPrice, periodTicketDuration,allTrips,i);
        }
    }

    private static int getPeriodTicketRatio(int periodTicketPrice, int periodTicketDuration, int[] allTrips, int i){
        
    }

    private static int[] convertStringArray(String[]array){
        int[] ans = new int[array.length];
        for(int i=0;i<array.length;i++){
            ans[i]=Integer.parseInt(array[i]);
        }
        return ans;
    }
    
    public static void main(String[]args){
        readInput();
    }
}
