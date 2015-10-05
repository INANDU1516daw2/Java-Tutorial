package Project;
import java.util.*;

public class Random {
    
    public static int iteracionesMaquina(double numAleatorio, int intentos, int numero){
        System.out.println("\nIteraciones Maquina\n---------------------");
        while( (int)(numAleatorio*100) != numero){
            numAleatorio = Math.random();
            intentos++;
            System.out.println((int)(numAleatorio*100)+" - "+intentos+" iteraciones");
        }
        System.out.print("OK\n"+intentos+" iteraciones\n");
        return intentos;
    }
    
    public static int iteracionesHumano(int intentos, int numero){
        Scanner entrada = new Scanner(System.in);
        int adivina;
        System.out.println("\nIteraciones Humano\n---------------------");
        do{
            System.out.print("=> ");
            adivina = entrada.nextInt();
            intentos++;
            if(adivina > numero){
                System.out.println(adivina + " > num\n");
            }else if(adivina < numero){
                System.out.println(adivina + " < num\n");
            }
        }while( adivina != numero );
        System.out.print("OK\n"+intentos+" iteraciones\n");
        return intentos;
    }
    
    public static void comparaIteraciones(int itMakina, int itHuman){
        
        System.out.println("\nitMakina: "+itMakina+" - itHuman:"+itHuman);
        
        if( itMakina < itHuman ){
            System.out.println("\nMakina wins: itMakina: "+itMakina+" < itHuman: "+itHuman);
        }else if( itMakina > itHuman ){
            System.out.println("\nHuman wins: itMakina: "+itMakina+" > itHuman: "+itHuman);
        }else{
            System.out.println("\nEmpate: itMakina: "+itMakina+" = itHuman: "+itHuman);
        }
    }
    
    public static void main(String[] args){
        
        double aleatorio = Math.random();
        int numero = 42;
        int iteraciones = 0;
        int iteracionesMakina;
        int iteracionesHumano;
        
        System.out.println(aleatorio);
        System.out.println(aleatorio*100);
        System.out.println( (int)(aleatorio*100) + "\n");
        
        iteracionesMakina = iteracionesMaquina(aleatorio,iteraciones,numero);
        iteraciones = 0;
        iteracionesHumano = iteracionesHumano(iteraciones,numero);
        comparaIteraciones(iteracionesMakina,iteracionesHumano);

    }
    
}
