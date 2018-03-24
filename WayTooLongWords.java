import java.util.*;
public class WayTooLongWords{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strings = new String[n];
        for(int i = 0; i < n; i++) strings[i] = sc.next();
        for(int j = 0; j < strings.length; j++){
			if(strings[j].length() > 10){
				String start = Character.toString(strings[j].charAt(0));
				int excess = strings[j].length() - 2;
				String last = Character.toString(strings[j].charAt(strings[j].length()-1));
				System.out.println(start + excess + last);
			}
			else System.out.println(strings[j]);
        }
	}
}