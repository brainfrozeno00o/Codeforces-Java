//code for Is your horseshoe on the other hoof?
import java.util.*;
public class Horseshoe{
	final static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		int counter = 0;
		int[] horse = new int[4];
		for(int i = 0; i < 4; i++) horse[i] = sc.nextInt();
		if((horse[0] == horse[1]) && (horse[1] == horse[2]) && (horse[2] == horse[3])) counter = 3;
		else if((horse[0] == horse[1] && horse[1] == horse[2]) || (horse[1] == horse[2] && horse[2] == horse[3])
			|| (horse[0] == horse[1] && horse[1] == horse[3]) || (horse[0] == horse[2] && horse[2] == horse[3]) ||
			(horse[0] == horse[3] && horse[1] == horse[2]) || (horse[1] == horse[3] && horse[0] == horse[2]) ||
			(horse[0] == horse[1] && horse[2] == horse[3])) counter = 2;
		else if((horse[0] == horse[2]) || (horse[0] == horse[1]) || (horse[0] == horse[3])
			|| (horse[1] == horse[3]) || (horse[1] == horse[2]) || (horse[2] == horse[3])) counter = 1;
		System.out.println(counter);
	}
}