import java.util.*;
public class NextRound{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] scores = new int[n];
        System.out.println();
        for(int i = 0; i < n; i++){
            scores[i] = sc.nextInt();
        }
        int scoreToCheck = scores[k-1];
        int counter = 0;
        for(int i = 0; i < n; i++){
            if(scores[i] == 0) continue;
            if(scores[i] >= scoreToCheck) counter = counter + 1;
        }
        System.out.println(counter);
    }
}