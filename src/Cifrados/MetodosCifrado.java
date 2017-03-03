package Cifrados;
/**
 * esta clase contiene los metodos necesarios para el proyecto
 * @author Juan Ricardo Rodriguez
 * @version 1.0.0
 * @since CifradoCesar 1.0.0
 */
public class MetodosCifrado {
private String minus = "abcdefghijklmñnopqrstuvwxyzáéíóú@.,;:¿?!¡= 1234567890";
private String mayus = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚ@.,;:¿?!¡= 1234567890";
        
    public MetodosCifrado(){        
    }
    /**
     * este metodo cifra el mensaje,haciendo la comparacion con 
       las cadenas String minus y mayus.
     * @param tex cadena de caracteres como parametro para ser cifrado    
     * @param cla la clave con la que se realiza la operacion matematica
        del cifrado   
     * @return  retorna la frase cifrada 
     * @since CifradoCesar 1.0.0
    */    
    public String Cifrado(String tex, int cla){       
        String frase = tex;
        //guarda el resultado en la variable fraseC
        String fraseC = "";        
        for(int i=0; i< frase.length();i++){
            for(int j=0;j< minus.length();j++){
                if(frase.charAt(i)==minus.charAt(j)){
                    if(j + cla >= minus.length()){
                        fraseC= fraseC+minus.charAt((j+cla)%minus.length());
                    }
                    else{
                        fraseC= fraseC + minus.charAt(j+cla);
                    }
                }
                else if(frase.charAt(i)==mayus.charAt(j)){
                    if(j + cla >= mayus.length()){
                        fraseC= fraseC+mayus.charAt((j+cla)% mayus.length());
                    }
                    else{
                        fraseC= fraseC + mayus.charAt(j + cla);
                    }
                }
            }
        }        
        return fraseC;
    }
    /**
     * este metodo descifra el mensaje
     * @param tex  recibe el String ya cifrado para descifralo 
     * @param clav recibe la clave para poder realizar el procedimiento
        matematico y descifrar el mensaje   
     * @return frase retorna el mensaje descifrado, es decir el mensaje original.     
    */
    public String Decifrado(String tex, int clav){        
        String fraseC = tex;
        //guarda el resultado en la variable frase.
        String frase = "";        
        for(int i=0; i< fraseC.length();i++){
            for(int j=0;j< minus.length();j++){
                if(fraseC.charAt(i)==minus.charAt(j)){
                    if(j - clav >= minus.length()){
                        frase= frase+minus.charAt((j-clav)%minus.length());
                    }
                    else{
                        frase= frase + minus.charAt(j-clav);
                    }
                }
                else if(fraseC.charAt(i)==mayus.charAt(j)){
                    if(j - clav >= mayus.length()){
                        frase= frase+mayus.charAt((j-clav)% mayus.length());
                    }
                    else{
                        frase= frase + mayus.charAt(j - clav);
                    }
                }
            }
        }        
        return frase;
    }
    //Fin de la clase MetodoCifrado
}




