package Project;

public class Manipula_Cadenas {
    public static void main(String args[]){
        String nom = "Ingemar";
        int longitud = nom.length();
        System.out.println("Nom: " + nom + "\nLongitud: "
            + longitud
            + "\n1ª lletra: " + nom.charAt(0)
            + "\núltima lletra: " + nom.charAt(longitud-1)
        );
        
    }
}
