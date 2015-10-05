package Project;

public class Calculos {
    
    public static void main(String args[]){
        
        double raiz = Math.sqrt(10);
        double raiz_2 = Math.round(raiz);
        int raiz_3 = (int)raiz;
        System.out.println(raiz + "\n" + raiz_2 + "\n" + raiz_3);
        
        int base, exponente;
        double resultado;
        base = 5;
        exponente = 3;
        resultado = Math.pow(base, exponente);
        System.out.println( base + "^" + exponente + " = " + (int)resultado);
    }
    
}
