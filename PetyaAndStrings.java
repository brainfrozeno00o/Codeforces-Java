import java.util.*;
public class PetyaAndStrings{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();
        if(a.compareToIgnoreCase(b) < 0) System.out.println(-1);
        else if(a.compareToIgnoreCase(b) > 0) System.out.println(1);
        else System.out.println(0);
	}
}