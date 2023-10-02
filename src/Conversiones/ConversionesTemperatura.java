package Conversiones;


import Condiciones.RestriccionSoloNumeros;
import javax.swing.JOptionPane;


public class ConversionesTemperatura {
    
    public static void conversionGradosFaC(){
        String gradosF = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Grados Fahrenheit que deseas convertir");
        if(RestriccionSoloNumeros.soloNumeros(gradosF)){
            double conversion = ((Double.parseDouble(gradosF)-32)/1.8);
            JOptionPane.showMessageDialog(null, gradosF + " Grados Fahrenheit equivale a: " + conversion + " Grados Celcius");   
        }else{
            mensajeError();
        }
           
    }
    
    public static void conversionGradosFaK(){
        String gradosF = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Grados Fahrenheit que deseas convertir");
        if(RestriccionSoloNumeros.soloNumeros(gradosF)){
        double conversion = (((5/9)*Double.parseDouble(gradosF))+273.15);
        JOptionPane.showMessageDialog(null, gradosF +  " Grados Fahrenheit equivale a: " + conversion + " Grados Kelvin");
        }else{
            mensajeError();
        }
    }
    
    public static void conversionGradosCaF(){
        String gradosC = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Grados Celsius que deseas convertir");
        if(RestriccionSoloNumeros.soloNumeros(gradosC)){
        double conversion = ((Double.parseDouble(gradosC)*1.8)+32);
        JOptionPane.showMessageDialog(null, gradosC + " Grados Celsius equivale a: " + conversion + " Grados Fahrenheit");
        }else{
            mensajeError();
        }
    }
    
    public static void conversionGradosCaK(){
        String gradosC = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Grados Celsius que deseas convertir");
        if(RestriccionSoloNumeros.soloNumeros(gradosC)){
        double conversion = (Double.parseDouble(gradosC) + 273.15);
        JOptionPane.showMessageDialog(null, gradosC + " Grados Celsius equivale a: " + conversion + " Grados Kelvin"); 
        }else{
            mensajeError();
        }
    }
    
    public static void conversionGradosKaC(){
        String gradosK = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Grados Kelvin que deseas convertir");
        if(RestriccionSoloNumeros.soloNumeros(gradosK)){
        double conversion = (Double.parseDouble(gradosK) - 273.15);
        JOptionPane.showMessageDialog(null, gradosK + " Grados Kelvin equivale a: " + conversion + " Grados Celsius");
        }else{
            mensajeError();
        }
    }
    
    public static void conversionGradosKaF(){
        String gradosK = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Grados Kelvin que deseas convertir");
        if(RestriccionSoloNumeros.soloNumeros(gradosK)){
        double conversion = (((1.8*(Double.parseDouble(gradosK) - 273.15)))+32);
        JOptionPane.showMessageDialog(null, gradosK + " Grados Kelvin equivale a: " + conversion + " Grados Fahrenheit"); 
        }else{
            mensajeError();
        }
    }
    
    public static void mensajeError(){
        JOptionPane.showMessageDialog(null, "Erros, solo digite numeros, por favor.");
    }
    
}


