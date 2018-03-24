import java.util.*;
public class UltraFastMathematician{
    static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
        String a = sc.next(), b = sc.next(), toPrint = "";
        for(int i = 0; i < a.length(); i++){
            if((a.charAt(i) == '1' && b.charAt(i) == '1') || (a.charAt(i) == '0' && b.charAt(i) == '0')) toPrint += "0";
            else if((a.charAt(i) == '1' && b.charAt(i) == '0') || (a.charAt(i) == '0'&& b.charAt(i) == '1')) toPrint += "1";
        }System.out.println(toPrint);
	}
}