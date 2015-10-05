package Project;

import java.util.Scanner;

public class Switch {
    
    public static void main(String args[]){
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Calcul Área:\n1: Cuadrat \n2: Rectangle \n3: Triangle \n4: Cercle");
        System.out.print("figura => ");
        int figura = entrada.nextInt();
        
        switch(figura){
        
            case 1:
                System.out.println("Introduce lado: ");
                int lado = entrada.nextInt();
                System.out.print("El área del cuadrade es " + Math.pow(lado, 2));
                break;
                
            case 2:
                System.out.print("Introduce base: ");
                int base = entrada.nextInt();
                System.out.print("Introduce altura: ");
                int altura = entrada.nextInt();
                System.out.println("El área del rectangulo es " + (base*altura));
                break;
            
            case 3:
                System.out.print("Introduce base: ");
                base = entrada.nextInt();
                System.out.print("Introduce altura: ");
                altura = entrada.nextInt();
                System.out.println("El área del triangulo es " + (base*altura)/2);
                break;
                
            case 4:
                System.out.print("Introduce radio: ");
                int r = entrada.nextInt();
                System.out.print("El área del circulo es ");
                System.out.printf("%1.2f", Math.PI*r);
                break;
            
            default:
                System.out.println("Opcion no correcta\n");
                break;
        }
    
    }
    
}
