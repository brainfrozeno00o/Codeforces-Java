import java.util.*;
public class InsomniaCure{
    final static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		int k = sc.nextInt(), l = sc.nextInt(), m = sc.nextInt(),
		n = sc.nextInt(), d = sc.nextInt(), damagedDragons = 0;
		int[] dragons = new int[d];
		for(int i = 0; i < d; i++) dragons[i] = i+1;
		for(int j = 0; j < d; j++){
			if(dragons[j] % k == 0){
				dragons[j] = 0;
				damagedDragons += 1;
			}
		}
		for(int a = 0; a < d; a++){
			if(dragons[a] != 0){
				if(dragons[a] % l == 0){
					dragons[a] = 0;
					damagedDragons += 1;
				}
			}else if(dragons[a] == 0) continue;
		}
		for(int b = 0; b < d; b++){
			if(dragons[b] != 0){
				if(dragons[b] % m == 0){
					dragons[b] = 0;
					damagedDragons += 1;
				}
			}else if(dragons[b] == 0) continue;
		}
		for(int c = 0; c < d; c++){
			if(dragons[c] != 0){
				if(dragons[c] % n == 0){
					dragons[c] = 0;
					damagedDragons += 1;
				}
			}else if(dragons[c] == 0) continue;
		}
		System.out.println(damagedDragons);
	}
}