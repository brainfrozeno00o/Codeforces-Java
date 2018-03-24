import java.util.*;
public class IWannaBeTheGuy{
    static final Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
        int n = sc.nextInt(), a = sc.nextInt();
        boolean[] visited = new boolean[n];
        boolean visitedAll = true;
        for(int i = 0; i < a; i++){
            int xLevel = sc.nextInt()-1;
            visited[xLevel] = true;
        }
        int b = sc.nextInt();
        for(int j = 0; j < b; j++){
            int yLevel = sc.nextInt()-1;
            visited[yLevel] = true;
        }
        for(int k = 0; k < n; k++){
            if(visited[k] == false){
                visitedAll = false;
                break;
            }
        } 
        if(visitedAll) System.out.println("I become the guy."); else System.out.println("Oh, my keyboard!");
	}
}