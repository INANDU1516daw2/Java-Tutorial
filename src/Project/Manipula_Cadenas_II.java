package Project;

public class Manipula_Cadenas_II {

    public static void main(String[] args){
        
        String frase = ("Hoy es un estupendo día para aprender Java");
        String frase_resumen = frase.substring(0,19) + " day para ir d fiesta";
        System.out.println(frase_resumen);
        
        String nom1, nom2;
        nom1 = "inge";
        nom2 = "Inge";
        System.out.println( nom1+" === "+nom2+" ? "+(nom1.equals(nom2))); //case sensitive
        System.out.println( nom1+" == "+nom2+" ? "+(nom1.equalsIgnoreCase(nom2))); //case insensitive
        
    }
}
