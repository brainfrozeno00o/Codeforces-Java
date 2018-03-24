import java.util.*;
public class Taxi{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), minimum = 0, ones = 0, twos = 0, threes = 0, fours = 0;
        int[] taxis = new int[n];
        for(int a = 0; a < n; a++){
            int b = sc.nextInt();
            taxis[a] = b; 
        }
        for(int c = 0; c < n; c++){
            if(taxis[c] == 1) ones = ones + 1;
            else if(taxis[c] == 2) twos = twos + 1;
            else if(taxis[c] == 3) threes = threes + 1;
            else if(taxis[c] == 4) fours = fours + 1;
        }
        minimum = minimum + fours;
        minimum = minimum + threes;
        minimum = minimum + twos/2;
        ones = ones - threes;
        boolean oddRemainingTwos = (twos % 2 == 1);
        if(oddRemainingTwos) minimum = minimum + 1;
        if(ones > 0) if(oddRemainingTwos) ones = ones - 2;
        if(ones > 0) minimum = minimum + (ones + 3)/4;
        System.out.println(minimum);
	}
}