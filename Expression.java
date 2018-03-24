import java.util.*;
public class Expression{
    static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), max = 0;
        for(int i = 0; i < 8; i++){
            int toCheck = 0;
            if(i == 0){
                toCheck = a+b*c;
                max = toCheck;
            }else if(i == 1){
                toCheck = a*(b+c);
                if(toCheck > max) max = toCheck;
            }else if(i == 2){
                toCheck = a*b*c;
                if(toCheck > max) max = toCheck;
            }else if(i == 3){
                toCheck = (a+b)*c;
                if(toCheck > max) max = toCheck;
            }else if(i == 4){
                toCheck = a+b+c;
                if(toCheck > max) max = toCheck;
            }else if(i == 5){
                toCheck = a*b+c;
                if(toCheck > max) max = toCheck;
            }else if(i == 6){
                toCheck = (a*b)+c;
                if(toCheck > max) max = toCheck;
            }else if(i == 7){
                toCheck = a+(b*c);
                if(toCheck > max) max = toCheck;
            }
        }System.out.println(max);
	}
}