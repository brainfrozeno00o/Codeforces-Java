import java.util.*;
public class Team{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int[] sums = new int[n];
    	for(int i = 0; i < n; i++){
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int c = sc.nextInt();
    		sums[i] = (a+b+c);
    	}
    	int counter = 0;
    	for(int j = 0; j < n; j++) if(sums[j] >= 2) counter = counter + 1;
    	System.out.println(counter);
	}
}