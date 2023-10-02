package Condiciones;


public class RestriccionSoloNumeros {
    
     public static boolean soloNumeros(String valor) {
        try {
            double x = Double.parseDouble(valor);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
    }

 

