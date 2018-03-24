import java.util.*;
public class Magnets{
    static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
        int n = sc.nextInt(), groups = 1;
        String[] checker = new String[n];
        for(int i = 0; i < n; i++) checker[i] = sc.next();
        for(int j = 1; j <= n - 1; j++){
            if(checker[j].equals(checker[j-1])) continue;
            else if(!checker[j].equals(checker[j-1])) groups += 1;
        }System.out.println(groups);
	}
}