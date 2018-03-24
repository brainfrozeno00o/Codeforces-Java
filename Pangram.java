import java.util.*;
public class Pangram{
    static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
        boolean[] allLettersUsed = new boolean[26];
        int n = sc.nextInt();
        String line = sc.next();
        for(int i = 0; i < n; i++){
            int toCheck = (int) line.charAt(i);
            if(toCheck == 65 || toCheck == 97) allLettersUsed[0] = true;
            else if(toCheck == 66 || toCheck == 98) allLettersUsed[1] = true;
            else if(toCheck == 67 || toCheck == 99) allLettersUsed[2] = true;
            else if(toCheck == 68 || toCheck == 100) allLettersUsed[3] = true;
            else if(toCheck == 69 || toCheck == 101) allLettersUsed[4] = true;
            else if(toCheck == 70 || toCheck == 102) allLettersUsed[5] = true;
            else if(toCheck == 71 || toCheck == 103) allLettersUsed[6] = true;
            else if(toCheck == 72 || toCheck == 104) allLettersUsed[7] = true;
            else if(toCheck == 73 || toCheck == 105) allLettersUsed[8] = true;
            else if(toCheck == 74 || toCheck == 106) allLettersUsed[9] = true;
            else if(toCheck == 75 || toCheck == 107) allLettersUsed[10] = true;
            else if(toCheck == 76 || toCheck == 108) allLettersUsed[11] = true;
            else if(toCheck == 77 || toCheck == 109) allLettersUsed[12] = true;
            else if(toCheck == 78 || toCheck == 110) allLettersUsed[13] = true;
            else if(toCheck == 79 || toCheck == 111) allLettersUsed[14] = true;
            else if(toCheck == 80 || toCheck == 112) allLettersUsed[15] = true;
            else if(toCheck == 81 || toCheck == 113) allLettersUsed[16] = true;
            else if(toCheck == 82 || toCheck == 114) allLettersUsed[17] = true;
            else if(toCheck == 83 || toCheck == 115) allLettersUsed[18] = true;
            else if(toCheck == 84 || toCheck == 116) allLettersUsed[19] = true;
            else if(toCheck == 85 || toCheck == 117) allLettersUsed[20] = true;
            else if(toCheck == 86 || toCheck == 118) allLettersUsed[21] = true;
            else if(toCheck == 87 || toCheck == 119) allLettersUsed[22] = true;
            else if(toCheck == 88 || toCheck == 120) allLettersUsed[23] = true;
            else if(toCheck == 89 || toCheck == 121) allLettersUsed[24] = true;
            else if(toCheck == 90 || toCheck == 122) allLettersUsed[25] = true;
        }
        boolean ifUsedAll = true;
        for(int j = 0; j < 26; j++) if(allLettersUsed[j] == false) {ifUsedAll = false; break;}
        if(ifUsedAll) System.out.println("YES"); else System.out.println("NO");
	}
}