import java.util.*;
public class CalculatingFunction{
    static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
        long n = sc.nextLong();
        n = (n % 2 == 0) ? n / 2 : -(n+1)/2;
        System.out.println(n);
	}
}