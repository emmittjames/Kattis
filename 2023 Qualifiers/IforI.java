import java.util.*;

public class IforI {

    private static Scanner sc = new Scanner(System.in);

    private static void readInput(){
        String line = sc.nextLine();
        String ans = "";
        for(int i=0;i<line.length();i++){
            String twoLetter = null, threeLetter = null, fourLetter = null;
            boolean upperCase = false;
            if(line.length()-i>=4){
                fourLetter = line.substring(i,i+4);
                if(fourLetter.charAt(0)<90 && fourLetter.charAt(0)>65){
                    upperCase=true;
                    fourLetter=fourLetter.toLowerCase();
                }
            }
            if(line.length()-i>=3){
                threeLetter = line.substring(i,i+3);
                if(threeLetter.charAt(0)<90){
                    upperCase=true;
                    threeLetter=threeLetter.toLowerCase();
                }
            }
            if(line.length()-i>=2){
                twoLetter = line.substring(i,i+2);
                if(twoLetter.charAt(0)<90){
                    upperCase=true;
                    twoLetter=twoLetter.toLowerCase();
                }
            }
            String currentWord = checkWords(twoLetter,threeLetter,fourLetter);
            if(currentWord==null){
                ans+=line.charAt(i);
            }
            else{
                if(upperCase){
                    if(currentWord.charAt(1)>=97 && currentWord.charAt(1)<=122){
                        ans+=(currentWord.charAt(1)+"").toUpperCase();
                    }
                    else{
                        ans+=currentWord.charAt(1);
                    }
                }
                else{
                    ans+=currentWord.charAt(1);
                }
                i+=(Integer.parseInt(currentWord.charAt(0)+"")-1);
            }
        }
        System.out.println(ans);
    }

    private static String checkWords(String twoLetter, String threeLetter, String fourLetter){
        twoLetter = checkTwoLetter(twoLetter);
        threeLetter = checkThreeLetter(threeLetter);
        fourLetter = checkFourLetter(fourLetter);
        if(fourLetter!=null){
            return "4" + fourLetter;
        }
        if(threeLetter!=null){
            return "3" + threeLetter;
        }
        if(twoLetter!=null){
            return "2" + twoLetter;
        }
        return null;
    }

    private static String checkTwoLetter(String word){
        if(word==null){
            return null;
        }
        if(word.equals("at")){
            return "@";
        }
        if(word.equals("to")){
            return "2";
        }
        if(word.equals("be")){
            return "b";
        }
        if(word.equals("oh")){
            return "o";
        }
        return null;
    }

    private static String checkThreeLetter(String word){
        if(word==null){
            return null;
        }
        if(word.equals("and")){
            return "&";
        }
        if(word.equals("one") || word.equals("won")){
            return "1";
        }
        if(word.equals("too") || word.equals("two")){
            return "2";
        }
        if(word.equals("for")){
            return "4";
        }
        if(word.equals("bea") || word.equals("bee")){
            return "b";
        }
        if(word.equals("sea") || word.equals("see")){
            return "c";
        }
        if(word.equals("eye")){
            return "i";
        }
        if(word.equals("owe")){
            return "o";
        }
        if(word.equals("are")){
            return "r";
        }
        if(word.equals("you")){
            return "u";
        }
        if(word.equals("why")){
            return "y";
        }
        return null;
    }

    private static String checkFourLetter(String word){
        if(word==null){
            return null;
        }
        if(word.equals("four")){
            return "4";
        }
        return null;
    }
    
    public static void main(String[]args){
        int phraseCount = Integer.parseInt(sc.nextLine());
        for(int i=0;i<phraseCount;i++){
            readInput();
        }
    }
}