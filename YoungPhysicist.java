import java.util.*;
public class YoungPhysicist{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), xSum = 0, ySum = 0, zSum = 0;
		int[] xVectors = new int[n];
		int[] yVectors = new int[n];
		int[] zVectors = new int[n];
		for(int i = 0; i < n; i++){
			int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
			xVectors[i] = x; yVectors[i] = y; zVectors[i] = z;
		}
		for(int j = 0; j < n; j++){
			xSum += xVectors[j]; ySum += yVectors[j]; zSum += zVectors[j];
		}
		if(xSum == 0 && ySum == 0 && zSum == 0) System.out.println("YES"); else System.out.println("NO");
	}
}