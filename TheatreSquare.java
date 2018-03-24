import java.util.Scanner;
public class TheatreSquare{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt(), m = sc.nextInt(), a = sc.nextInt();
        System.out.println((long)(Math.ceil(n/a) * Math.ceil(m/a)));
    }
}