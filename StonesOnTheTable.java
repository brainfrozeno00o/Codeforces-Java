import java.util.*;
public class StonesOnTheTable{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), counter = 0;
        String stones = sc.next();
        for(int i = 1; i < stones.length(); i++){
            String stoneOne = Character.toString(stones.charAt(i-1));
            String stoneTwo = Character.toString(stones.charAt(i));
            if(stoneOne.equalsIgnoreCase(stoneTwo)) counter = counter + 1;
        }
        System.out.println(counter);
	}
}