import java.util.*;
public class Word{
    static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
        String check = sc.next(), newString = "";
        int upCase = 0, lowCase = 0;
        for(int i = 0; i < check.length(); i++){
        	if(Character.isLowerCase(check.charAt(i))) lowCase += 1;
        	else if(Character.isUpperCase(check.charAt(i))) upCase += 1;
        }
        if(lowCase >= upCase){
        	for(int j = 0; j < check.length(); j++){
                newString = (Character.isUpperCase(check.charAt(j))) ? newString + Character.toLowerCase(check.charAt(j)) : newString + check.charAt(j);
        	}
        }else if(upCase > lowCase){
        	for(int k = 0; k < check.length(); k++){
                newString = (Character.isLowerCase(check.charAt(k))) ? newString + Character.toUpperCase(check.charAt(k)) : newString + check.charAt(k);
        	}
        }System.out.println(newString);
	}
}