import java.util.*;
public class BeautifulYear{
	final static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		int n = sc.nextInt(), check = n + 1;
		while(check > n){
			int counter = 0;
			String year = String.valueOf(check);
			for(int i = 0; i < year.length()-1; i++){
				int inCounter = 0;
				int j = Character.digit(year.charAt(i),10);
				for(int m = i + 1; m <= year.length()-1; m++){
					int k = Character.digit(year.charAt(m),10);
					if(j != k) inCounter++; else break;
				}
				if(inCounter == (year.length()-1)-i) counter+=1; else break; 
			}
			if(counter < 3) {check += 1; counter = 0;} else break;
		}
		System.out.println(check);
	}
}