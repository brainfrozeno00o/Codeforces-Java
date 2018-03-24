import java.util.*;
    public class Capslock{
    	public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            String caps = sc.next(), newString = "";;
            int capCounter = 0;
            if(Character.isUpperCase(caps.charAt(0)) == true){
                capCounter = 1;
                for(int i = 1; i < caps.length(); i++){
                    if(Character.isUpperCase(caps.charAt(i)) == true) capCounter = capCounter + 1;
                    else capCounter = capCounter - 1;
                }
            } else{
                for(int i = 1; i < caps.length(); i++){
                    if(Character.isUpperCase(caps.charAt(i)) == true) capCounter = capCounter + 1;
                }
            }
            if(capCounter == caps.length() - 1){
                if(Character.isLowerCase(caps.charAt(0)) == true){
                    newString += Character.toUpperCase(caps.charAt(0));
                }
                for(int i = 1; i < caps.length(); i++) newString += Character.toLowerCase(caps.charAt(i));
                System.out.println(newString);
            } else if(capCounter == caps.length()){
                for(int i = 0; i < caps.length(); i++) newString += Character.toLowerCase(caps.charAt(i));
                System.out.println(newString);
            } 
            else System.out.println(caps);
    	}
    }