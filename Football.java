import java.util.*;
public class Football{
	public static void main(String args[]){
    	Scanner sc = new Scanner(System.in);
    	String position = sc.next();
    	int danger = 1;
    	for(int i = 0; i < position.length(); i++){
    		if(i == 0) continue;
    		else{
    			if(position.charAt(i) == position.charAt(i-1)) danger = danger + 1;
    			else danger = 1;
    			if(danger == 7){
    				System.out.println("YES");
    				break;
    			}
    		}
    	}
    	if(danger < 7) System.out.println("NO");
	}
}