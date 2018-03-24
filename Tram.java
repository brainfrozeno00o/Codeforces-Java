import java.util.*;
public class Tram{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), currentMax = 0, totalCapacity = 0, i, a, b;
        for(i = 0; i < n; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            if(i == 0){
                currentMax = b - a;
                totalCapacity = currentMax;
            }else{
                currentMax = currentMax - a + b;
                if(currentMax > totalCapacity) totalCapacity = currentMax;
            }
        }
        System.out.println(totalCapacity);
	}
}