package Project;

import java.util.Scanner;

public class CompruebaEmail {

    public static String AskEmail(){
        String m;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Enter mail: ");
        return m = entrada.nextLine();
    }
    
    public static boolean CheckChar(String s ,char c){
        boolean b = false;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if( s.charAt(i) == c ){
                b = true;
                count++;
            }
            if(count > 1){
                b = false;
                break;
            }
        }
        return b;
    }
    
    public static void Result(boolean a, boolean b){
        if(a && b){
            System.out.println("Email OK");
        }else{
            System.out.println("Incorrect Email");
        }
    }
    
    public static void main(String[] args){
    
        String mail = AskEmail();
        Result(CheckChar(mail, '@'), CheckChar(mail, '.'));
        
    }
}
