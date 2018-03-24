import java.util.*;
public class VasyaAndSocks{
    static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
        int socksToWear = sc.nextInt(), m = sc.nextInt(), daysToWear = 0;
        while(socksToWear != 0){
            socksToWear -= 1;
            daysToWear += 1;
            if(daysToWear % m == 0) socksToWear += 1;
            if(socksToWear == 0) break;
        }System.out.println(daysToWear);
	}
}