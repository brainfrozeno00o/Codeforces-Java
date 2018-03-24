import java.util.*;
public class Presents{
	final static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		int n = sc.nextInt();
		int[] friends = new int[n+1], presents = new int[n+1];
		for(int i = 1; i <= n; i++) friends[i] = sc.nextInt();
		for(int j = 1; j <= n; j++) presents[friends[j]] = j;
		for(int k = 1; k <= n; k++) System.out.print(presents[k] + " ");
	}
}