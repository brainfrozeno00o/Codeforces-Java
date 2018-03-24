import java.util.*;
public class BitPlusPlus{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	int x = 0, n = sc.nextInt();
    	for(int i = 0; i < n; i++){
    		String checkThis = sc.next();
    		if(checkThis.equals("X++") || checkThis.equals("++X")) x = x + 1;
    		else if(checkThis.equals("X--") || checkThis.equals("--X")) x = x - 1;
    	}
    	System.out.println(x);
	}
}