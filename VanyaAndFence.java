import java.util.*;
public class VanyaAndFence{
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt(), h = sc.nextInt();
        int roadWidth = 0;
        for(int i = 0; i < n; i++){
            int height = sc.nextInt();
            if (height <= h) roadWidth += 1;
            else if(height > h) roadWidth += 2;
        }
        System.out.println(roadWidth);
    }
}