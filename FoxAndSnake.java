import java.util.*;
public class FoxAndSnake{
    static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
        int n = sc.nextInt(), m = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1) for(int j = 1; j <= m; j++) System.out.print("#");
            else if(i % 2 == 0){
                if((i/2) % 2 == 1){ 
                    for(int k = 1; k <= m; k++) 
                        if(k == m) System.out.print("#"); else System.out.print(".");
                }
                else if((i/2) % 2 == 0){ 
                    for(int l = 1; l <= m; l++) 
                        if(l == 1) System.out.print("#"); else System.out.print(".");   
                }        
            }
            System.out.println();
        }
	}
}