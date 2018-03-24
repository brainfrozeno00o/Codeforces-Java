import java.util.*;
public class IQTest{
	final static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		int a = sc.nextInt(), index = 1;
		int[] numbers = new int[a];
		for(int i = 0; i < a; i++) numbers[i] = sc.nextInt();
		if(numbers[0] % 2 == 0 && numbers[1] % 2 == 0){
			for(int i = 2; i < a; i++){
				if(numbers[i] % 2 == 1) index += i; 
			}
		}else if(numbers[0] % 2 == 1 && numbers[1] % 2 == 1){
			for(int i = 2; i < a; i++){
				if(numbers[i] % 2 == 0) index += i; 
			}
		}else if(numbers[0] % 2 == 1 && numbers[1] % 2 == 0){
			if(numbers[2] % 2 == 1) index = 2;
			else{
				for(int i = 3; i < a; i++){
					if(numbers[i] % 2 == 1) index += i;
				}
			}
		}else if(numbers[0] % 2 == 0 && numbers[1] % 2 == 1){
			if(numbers[2] % 2 == 0) index = 2;
			else{
				for(int i = 3; i < a; i++){
					if(numbers[i] % 2 == 0) index += i; 
				}
			}
		}
		System.out.println(index);
	}
}