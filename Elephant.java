import java.util.*;
public class Elephant{
	final static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		int x = sc.nextInt(), moves = 0;
		if(x >= 5){
			while(x >= 5){
				x -= 5;
				moves += 1;
				if(x < 5 || x == 0) break;
			}
		}
		if(x == 4){
			x -= 4;
			moves += 1;
		}else if(x == 3){
			x -= 3;
			moves += 1;
		}else if(x == 2){
			x -= 2;
			moves += 1;
		}else if(x == 1){
			x -= 1;
			moves += 1;
		}
		System.out.println(moves);
	}
}