import java.util.*;
public class KefaAndFirstSteps{
    static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
        int n = sc.nextInt(), maxCount = 1, currentMax = 1;
        int[] array = new int[n];
        for(int i = 0; i < n; i++) array[i] = sc.nextInt();
        for(int j = 0; j < n - 1; j++){
            if(array[j] <= array[j+1]){
                currentMax += 1;
                if(currentMax > maxCount) maxCount = currentMax;
            }else if(array[j] > array[j+1]) currentMax = 1;
        }System.out.println(maxCount);
	}
}