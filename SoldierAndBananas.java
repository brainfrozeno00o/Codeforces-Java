import java.util.*;
public class SoldierAndBananas{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), n = sc.nextInt(), w = sc.nextInt(), totalSum = 0;
        for(int i = 1; i <= w; i++) totalSum += k*i;
        if(totalSum > n) System.out.println(totalSum - n); else System.out.println(0);
	}
}