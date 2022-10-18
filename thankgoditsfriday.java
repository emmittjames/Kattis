import java.util.*;

public class thankgoditsfriday {

    private static boolean pastFeb = false;

    private static int convertDay(String str){
        str = str.toLowerCase();
        if(str.equals("sat")){
            return 6;
        }
        if(str.equals("sun")){
            return 5;
        }
        if(str.equals("mon")){
            return 4;
        }
        if(str.equals("tue")){
            return 3;
        }
        if(str.equals("wed")){
            return 2;
        }
        if(str.equals("thu")){
            return 1;
        }
        return 0;
    }

    private static int convertMonth(int dayOfMonth, String month){
        month = month.toLowerCase();
        int total = 0;
        while(true){
            if(month.equals("jan")){    
                break;
            }
            total+=31;
            if(month.equals("feb")){    
                break;
            }
            pastFeb = true;
            total+=28;
            if(month.equals("mar")){    
                break;
            }
            total+=31;
            if(month.equals("apr")){    
                break;
            }
            total+=30;
            if(month.equals("may")){    
                break;
            }
            total+=31;
            if(month.equals("jun")){    
                break;
            }
            total+=30;
            if(month.equals("jul")){    
                break;
            }
            total+=31;
            if(month.equals("aug")){    
                break;
            }
            total+=31;
            if(month.equals("sep")){    
                break;
            }
            total+=30;
            if(month.equals("oct")){    
                break;
            }
            total+=31;
            if(month.equals("nov")){    
                break;
            }
            total+=30;
            break;
        }
        total+=dayOfMonth;
        total--;
        return total;
    }

    private static String algo(int daysToFirstFriday,int currentDayVal){
        int friday = currentDayVal-daysToFirstFriday;
        //System.out.println(daysToFirstFriday+ "   " + currentDayVal);
        //System.out.println(friday);
        if((friday%7)==0){
            if(pastFeb){
                return "not sure";
            }
            return "TGIF";
        }
        return ":(";
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String[] firstLine = sc.nextLine().split(" ");
        int dayOfMonth = Integer.parseInt(firstLine[0]);
        String month = firstLine[1];
        String dayStr = sc.nextLine();
        int daysToFirstFriday = convertDay(dayStr);
        int currentDayVal = convertMonth(dayOfMonth, month);
        String ans = algo(daysToFirstFriday,currentDayVal);
        if(pastFeb && ans.equals(":(")){
            currentDayVal++;
            ans = algo(daysToFirstFriday,currentDayVal);
        }
        System.out.println(ans);
        sc.close();
    }
}