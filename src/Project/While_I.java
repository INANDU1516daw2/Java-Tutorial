package Project;
import java.util.Scanner;

public class While_I {

    public static void main(String[] args){
    
        String clave = "nolose";
        String pass = "";
        int intento = 0;
        
        while(clave.equals(pass)==false){
            Scanner entrada = new Scanner(System.in);
            System.out.print("password: ");
            pass = entrada.nextLine();
            
            if( (clave.equals(pass)==false) && (intento < 10) ){
                System.out.println("Incorrect, "+(10-intento)+" intentos restantes\n");
                intento++;
            }else if((clave.equals(pass)==false) && (intento == 10)){
                System.out.println("!!!Bloqueado!!!");
                break;
            }else{
                System.out.println("OK");
                break;
            }
        }
        
    }
    
}
