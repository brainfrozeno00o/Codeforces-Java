import java.util.*;
public class ArrivalOfTheGeneral{
    static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
        int n = sc.nextInt(), seconds = 0, maxIndex = 0, minIndex = 0;
        int[] heights = new int[n];
        for(int i = 0; i < n; i++) heights[i] = sc.nextInt();
        int max = heights[0], min = heights[0];
        for(int j = 1; j < n; j++){
            if(heights[j] > max) {
                max = heights[j];
                maxIndex = j;
            }
            else if(heights[j] <= min) {
                min = heights[j];
                minIndex = j;
            }
        }
        int temp1, temp2;
        for(int k = maxIndex; k >= 1; k--){
            if(heights[maxIndex] > heights[k-1]){
                if((k-1) == minIndex) minIndex = minIndex + 1;
                temp1 = heights[k-1];
                heights[k-1] = heights[maxIndex];
                heights[maxIndex] = temp1;
                maxIndex = k - 1;
                seconds += 1;
            }
        }
        for(int l = minIndex; l <= n-2; l++){
            if(heights[minIndex] < heights[l+1]){
                temp2 = heights[l+1];
                heights[l+1] = heights[minIndex];
                heights[minIndex] = temp2;
                minIndex = l + 1;
                seconds += 1;
            }
        }
        System.out.println(seconds);
	}
}