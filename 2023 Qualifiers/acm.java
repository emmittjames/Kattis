import java.util.*;

public class acm {

    private static Scanner sc = new Scanner(System.in);
    private static HashMap<Integer,int[]> map = new HashMap<>();
    private static int ans = 0;

    private static void readInput(){
        int recipies = Integer.parseInt(sc.nextLine());
        for(int i=0;i<recipies;i++){
            boolean read = readRecipie();
            if(read){
                //System.out.println("aaa");
                ans++;
            }
            else{
                //System.out.println("zzz");
            }
        }
        System.out.println(ans);
    }

    private static boolean readRecipie(){
        HashMap<Integer,int[]> tempMap = new HashMap<>();
        String[] strArr = sc.nextLine().split(" ");
        for(int i=1;i<strArr.length;i++){
            int currentIngredient = Integer.parseInt(strArr[i]);
            int[] otherIngredients = getOtherIngredients(currentIngredient, strArr);
            if(!map.containsKey(currentIngredient)){
                tempMap.put(currentIngredient,otherIngredients);
            }
            else{
                if(!checkValidPotion(currentIngredient,otherIngredients)){
                    return false;
                }
                else{
                    tempMap.put(currentIngredient,otherIngredients);
                }
            }
        }
        mergeTempMapIntoMain(tempMap);
    
        return true;
    }

    private static void mergeTempMapIntoMain(HashMap<Integer,int[]> tempMap){
        for(int x:tempMap.keySet()){
            int[] value = tempMap.get(x);
            map.put(x,value);
        }
    }

    private static boolean checkValidPotion(int currentIngredient, int[]otherIngredients){
        int[] otherIngredientsMainMap = map.get(currentIngredient);
        for(int i=0;i<otherIngredientsMainMap.length;i++){
            boolean good = false;
            int currentOtherIngredient = otherIngredientsMainMap[i];
            for(int j=0;j<otherIngredients.length;j++){
                if(currentOtherIngredient==otherIngredients[j]){
                    good = true;
                }
            }
            if(!good){
                return false;
            }
        }
        return true;
    }

    private static int[] getOtherIngredients(int ogIngredient, String[] strArr){
        int[] ans = new int[strArr.length-2];
        int ansPointer = 0;
        for(int i=1;i<strArr.length;i++){
            int currentIngredient = Integer.parseInt(strArr[i]);
            if(ogIngredient!=currentIngredient){
                ans[ansPointer] = currentIngredient;
                ansPointer++;
            }
        }
        return ans;
    }
    
    public static void main(String[]args){
        readInput();
    }
}