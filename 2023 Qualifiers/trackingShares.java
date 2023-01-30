import java.util.*;

public class trackingShares{

    private static Scanner sc = new Scanner(System.in);
    private static int totalMaxDay = 0;
    private static int totalShares = 0;
    private static HashMap<Integer,Integer> totalMap = new HashMap<>();

    private static void getInput(){
        int companies = Integer.parseInt(sc.nextLine());
        for(int i=0;i<companies;i++){
            getRecords();
        }
    }

    private static void getRecords(){
        int records = Integer.parseInt(sc.nextLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxDay = 0;
        for(int i=0;i<records;i++){
            String[] strArr = sc.nextLine().split(" ");
            int shares = Integer.parseInt(strArr[0]);
            int day = Integer.parseInt(strArr[1]);
            if(day>maxDay){
                maxDay = day;
                if(day>totalMaxDay){
                    totalMaxDay=maxDay;
                }
            }
            map.put(day,shares);
        }
        calculate(maxDay, map);
    }

    private static void calculate(int maxDay, HashMap<Integer,Integer> map){
        int companyShares = 0;
        for(int i=0;i<maxDay+1;i++){
            if(map.containsKey(i)){
                int currentShares = 0;
                int totalMapShares = 0;
                if(totalMap.containsKey(i)){
                    totalMapShares = totalMap.get(i);
                }
                currentShares+=(map.get(i)-companyShares);
                companyShares+=currentShares;
                currentShares+=totalMapShares;
                totalMap.put(i,currentShares);
            }
        }
    }

    private static void getAnswer(){
        int[] ans = new int[totalMap.size()];
        int ansPointer = 0;
        for(int i=0;i<totalMaxDay+1;i++){
            if(totalMap.containsKey(i)){
                ans[ansPointer] = totalMap.get(i);
                ansPointer++;
            }
        }
        for(int i=0;i<ans.length;i++){
            totalShares+=ans[i];
            System.out.println(totalShares);
        }
    }

    public static void main(String[]args){
        getInput();
        getAnswer();
    }
}