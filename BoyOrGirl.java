import java.util.*;
public class BoyOrGirl{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String stringChecker = sc.next(), toCheck = "";
        int distinct = 0;
        boolean isSame = false;
        for(int i = 0; i < stringChecker.length(); i++){
            if(i == 0) {
                toCheck = Character.toString(stringChecker.charAt(0));
                distinct = distinct + 1;
            }else{
                toCheck = Character.toString(stringChecker.charAt(i));
                for(int j = i - 1; j >= 0; j--){
                    String toCheckToo = Character.toString(stringChecker.charAt(j));
                    if(!toCheckToo.equals(toCheck)) isSame = false;
                    else{
                        isSame = true;
                        break;
                    }
                }
                if(!isSame) distinct = distinct + 1; else isSame = false;
            }
        }
        if(distinct % 2 == 0) System.out.println("CHAT WITH HER!"); else System.out.println("IGNORE HIM!");
	}
}