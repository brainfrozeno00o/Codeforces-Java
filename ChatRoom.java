import java.util.*;
public class ChatRoom{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String toCheck = "hello";
        String check = sc.next();
        int checked = 0, i;
        for(i = 0; i < check.length(); i++) {
            if(check.charAt(i) == (toCheck.charAt(checked))) checked = checked + 1;
            if(checked == 5) break;
        }
        if(checked == 5) System.out.println("YES"); else System.out.println("NO");
	}
}