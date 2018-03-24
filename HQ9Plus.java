import java.util.*;
public class HQ9Plus{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
                String tester = sc.next();
                boolean ifOutputs = false;
                for(int i = 0; i < tester.length(); i++){
                       char checkThis = tester.charAt(i);
                       int seeker = (int) checkThis;
                       if(seeker == 72 || seeker == 81 || seeker == 57){
                              ifOutputs = true;
                              break;
                      }
              }if(ifOutputs) System.out.println("YES"); else System.out.println("NO");

      }
}