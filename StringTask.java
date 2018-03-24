import java.util.*;
public class StringTask{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String ez = sc.next();
        ArrayList<String> finalOne = new ArrayList<String>();
        for(int i = 0; i < ez.length(); i++){
        	String checker = Character.toString(ez.charAt(i));
        	checker = checker.toLowerCase();
        	if(checker.equalsIgnoreCase("A") || checker.equalsIgnoreCase("E") ||
        	checker.equalsIgnoreCase("I") || checker.equalsIgnoreCase("O") ||
        	checker.equalsIgnoreCase("U") || checker.equalsIgnoreCase("Y")) continue;
        	else finalOne.add(checker);
        }
        for(int j = 0; j < finalOne.size(); j++) System.out.print("." + finalOne.get(j));
	}
}