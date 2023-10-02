package Conversiones;


import Condiciones.RestriccionSoloNumeros;
import javax.swing.JOptionPane;

public class ConversionesMoneda {

    public static void conversionPesoDolar() {
        String pesos = JOptionPane.showInputDialog(null, "Ingresa la cantidad de pesos MXN que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(pesos)) {
            double conversion = Math.round((Double.parseDouble(pesos) * 0.05856756) * 1000.0) / 1000.0;
            JOptionPane.showMessageDialog(null, pesos + " Pesos MXN equivale a: " + conversion + " Dolares USD");
        }else{
            mensajeError();
        }
    }

    public static void conversionDolarPeso() {
        String dolares = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dolares que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(dolares)) {
            double conversion = Math.round((Double.parseDouble(dolares) * 17.078449) * 1000.0) / 1000.0;
            JOptionPane.showMessageDialog(null, dolares + " Dolares USD equivale a: " + conversion + " Pesos MXN");
        }else{
            mensajeError();
        }
    }

    public static void conversionPesoEuro() {
        String pesos = JOptionPane.showInputDialog(null, "Ingresa la cantidad de pesos MXN que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(pesos)) {
            double conversion = Math.round((Double.parseDouble(pesos) * 0.053098899) * 1000.0) / 1000.0;
            JOptionPane.showMessageDialog(null, pesos + " Pesos MXN equivale a: " + conversion + " Euros");
        }else{
            mensajeError();
        }
    }

    public static void conversionEuroPeso() {
        String euro = JOptionPane.showInputDialog(null, "Ingresa la cantidad de euros que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(euro)) {
            double conversion = Math.round((Double.parseDouble(euro) * 18.832782) * 1000.0) / 1000.0;
            JOptionPane.showMessageDialog(null, euro + " Euros equivale a: " + conversion + " Pesos MXN");
        }else{
            mensajeError();
        }
    }

    public static void conversionPesoLibra() {
        String pesos = JOptionPane.showInputDialog(null, "Ingresa la cantidad de MXN que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(pesos)) {
            double conversion = Math.round((Double.parseDouble(pesos) * 0.045931386) * 1000.0) / 1000.0;
            JOptionPane.showMessageDialog(null, pesos + " Pesos MXN equivale a: " + conversion + " Libras");
        }else{
            mensajeError();
        }
    }

    public static void conversionLibraPeso() {
        String libra = JOptionPane.showInputDialog(null, "Ingresa la cantidad de libras que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(libra)) {
            double conversion = Math.round((Double.parseDouble(libra) * 21.771605) * 1000.0) / 1000.0;
            JOptionPane.showMessageDialog(null, libra + " Libras equivale a: " + conversion + " Pesos MXN");
        }else{
            mensajeError();
        }
    }

    public static void conversionPesoYuan() {
        String pesos = JOptionPane.showInputDialog(null, "Ingresa la cantidad de pesos MXN que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(pesos)) {
            double conversion = Math.round((Double.parseDouble(pesos) * 0.41992145) * 1000.0) / 1000.0;
            JOptionPane.showMessageDialog(null, pesos + " Pesos MXN equivale a: " + conversion + " Yuanes");
        }else{
            mensajeError();
        }
    }

    public static void conversionYuanPeso() {
        String yuan = JOptionPane.showInputDialog(null, "Ingresa la cantidad de yuanes que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(yuan)) {
            double conversion = Math.round((Double.parseDouble(yuan) * 2.3813978) * 1000.0) / 1000.0;
            JOptionPane.showMessageDialog(null, yuan + " Yuanes a: " + conversion + " Pesos MXN");
        }else{
            mensajeError();
        }
    }

    public static void conversionPesoWon() {
        String pesos = JOptionPane.showInputDialog(null, "Ingresa la cantidad de pesos MXN que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(pesos)) {
            double conversion = Math.round((Double.parseDouble(pesos) * 76.359711) * 1000.0) / 1000.0;
            JOptionPane.showMessageDialog(null, pesos + " Pesos MXN equivale a: " + conversion + " Wones");
        }else{
            mensajeError();
        }
    }

    public static void conversionWonPeso() {
        String won = JOptionPane.showInputDialog(null, "Ingresa la cantidad de wones que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(won)) {
            double conversion = Math.round((Double.parseDouble(won) * 0.013095911) * 1000.0) / 1000.0;
            JOptionPane.showMessageDialog(null, won + " Wones equivale a: " + conversion + " Pesos MXN");
        }else{
            mensajeError();
        }
    }

    public static void mensajeError() {
        JOptionPane.showMessageDialog(null, "Error, solo digite numeros, por favor.");
    }

}
