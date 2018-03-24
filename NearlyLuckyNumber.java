import java.util.*;
public class NearlyLuckyNumber{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
		int luckyCounter = 0;
        String lucky = "";
        long n = sc.nextLong();
        String checker = new Long(n).toString();
        for(int i = 0; i < checker.length(); i++){
            char checkIt = checker.charAt(i);
            if(checkIt == '4' || checkIt == '7') ++luckyCounter;
			else continue;
        }
		if((luckyCounter == 4 || luckyCounter == 7) && luckyCounter != 0) lucky = "YES";
		else lucky = "NO";
        System.out.println(lucky);
    }
}