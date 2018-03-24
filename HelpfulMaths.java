import java.util.*;
public class HelpfulMaths{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String summer = sc.next();
        int size = summer.length() / 2 + 1;
        int[] fix = new int[size];
        int put = 0;
        for(int i = 0; i < summer.length(); i++){
            if(i % 2 == 0){
                int toPut = Character.getNumericValue(summer.charAt(i));
                fix[put] = toPut;
                put++;
            }
        }
        int temp;
        for(int j = 1; j < fix.length; j++){
            for(int k = j; k > 0; k--){
                if(fix[k] < fix[k-1]){
                    temp = fix[k];
                    fix[k] = fix[k-1];
                    fix[k-1] = temp;
                }
            }
        }
        for(int l = 0; l < fix.length; l++){
            if(l == 0) System.out.print(fix[l]);
            else System.out.print("+" + fix[l]);
        }
	}
}