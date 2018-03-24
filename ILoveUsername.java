import java.util.*;
public class ILoveUsername{
	static final Scanner sc = new Scanner(System.in);
	public static boolean checkAmazingLessThan(int[] a, int index, int score){
		for(int i = index - 1; i > -1; i--){
			if(a[i] < score) continue;
			else return false;
		}
		return true;
	}
	public static boolean checkAmazingGreaterThan(int[] b, int index, int score){
		for(int i = index - 1; i > -1; i--){
			if(b[i] > score) continue;
			else return false;
		}
		return true;
	}
	public static void main(String args[]){
		int counter = 0, n = sc.nextInt();
		int[] scores = new int[n];
		for(int i = 0; i < n; i++) scores[i] = sc.nextInt();
		for(int j = 1; j < n; j++){
			if(checkAmazingLessThan(scores,j,scores[j]) || checkAmazingGreaterThan(scores,j,scores[j])) counter++;
		}
		System.out.println(counter);
	}
}