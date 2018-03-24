import java.util.*;
public class Translation{
	final static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		String normalWord = sc.next(), triedTranslation = sc.next(), correctTranslate = "";
		for(int i = normalWord.length() - 1; i > -1; i--) 
		    correctTranslate += Character.toString(normalWord.charAt(i));
		if(triedTranslation.equals(correctTranslate)) System.out.println("YES"); 
		else System.out.println("NO");
	}
}