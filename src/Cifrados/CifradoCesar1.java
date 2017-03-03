package Cifrados;

/**
 * esta clase contiene la estructura del proyecto
 * @author Juan Ricardo Rodriguez
 * @version 1.0.0
 * @since CifradoCesar 1.0.0
 */
import java.util.Scanner;
public class CifradoCesar1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Frase = new Scanner(System.in);
        MetodosCifrado cesar = new MetodosCifrado();
        /*
        se declaran las variables necesarias para el proyecto
        */
        String frase, fraseC;
        byte clave;
        /*
            Se solicitan la frase y la clave para el cifrado
        */
            System.out.println("..Hola, este programa codifica mensajes con el"
                    + "Cifrado de Cesar....");
            System.out.println("Introduce la frase a Codificar");
            frase = Frase.nextLine();
        
            System.out.println("Introduce la clave de cifrado");
            clave = Frase.nextByte();
        /*
            se hace el llamado a los metodos en la clase MetodoCifrado
        */        
            cesar.Cifrado(frase, clave);
            System.out.println("--------------------");
            System.out.println(" Mensaje Cifrado : ");
            System.out.println("--------------------");
            System.out.println(cesar.Cifrado(frase, clave));
        
            fraseC=cesar.Cifrado(frase, clave);
            cesar.Decifrado(fraseC, clave);
            System.out.println("--------------------");
            System.out.println("Mensaje Descifrado : ");
            System.out.println("--------------------");
            System.out.println(cesar.Decifrado(fraseC, clave));
                
        }
        
        
        
        //fin del programa
    }

