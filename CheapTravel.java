import java.util.*;
public class CheapTravel{
    static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
        int n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt(), sum = 0, sum2 = 0, sum3 = a*n, comp1 = n, comp2 = n;
        while(true){
        	if(comp1 < 0) break;
        	else{
        		comp1 -= m;
        		sum += b;
        	}
        }
        while(comp2 != 0){
        	if(comp2 < m){
        		comp2 -= 1;
        		sum2 += a;
        	}else{
        		comp2 -= m;
        		sum2 += b;
        	}
        }
        if(sum <= sum2 && sum <= sum3) System.out.println(sum);
        else if(sum2 <= sum && sum2 <= sum3) System.out.println(sum2);
        else if(sum3 <= sum && sum3 <= sum2) System.out.println(sum3);
	}
}