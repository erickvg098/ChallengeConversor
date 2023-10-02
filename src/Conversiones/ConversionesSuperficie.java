package Conversiones;


import Condiciones.RestriccionSoloNumeros;
import javax.swing.JOptionPane;

public class ConversionesSuperficie {

    public static void conversionMetrosCuadradosHectarea() {
        String metros = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Metros cuadrados que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(metros)) {
            double conversion = (Double.parseDouble(metros) / 10000);
            JOptionPane.showMessageDialog(null, metros + " Metros cuadrados equivale a: " + conversion + " Hectareas");
        } else {
            mensajeError();
        }
    }

    public static void conversionMetrosCuadradosYardaCuadrada() {
        String metros = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Metros cuadrados que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(metros)) {
            double conversion = (Double.parseDouble(metros) * 1.196);
            JOptionPane.showMessageDialog(null, metros + " Metros cuadrados equivale a: " + conversion + " Yardas cuadradas");
        } else {
            mensajeError();
        }
    }

    public static void conversionMetrosCuadradosAcre() {
        String metros = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Metros cuadrados que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(metros)) {
            double conversion = (Double.parseDouble(metros) * 0.00024711);
            JOptionPane.showMessageDialog(null, metros + " Metros cuadrados equivale a: " + conversion + " Acres");
        } else {
            mensajeError();
        }
    }

    public static void conversionHectareaMetrosCuadrados() {
        String hectarea = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Hectareas que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(hectarea)) {
            double conversion = (Double.parseDouble(hectarea) * 10000);
            JOptionPane.showMessageDialog(null, hectarea + " Hectareas equivale a: " + conversion + " Metros cuadrados");
        } else {
            mensajeError();
        }
    }

    public static void conversionHectareaYardaCuadrada() {
        String hectarea = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Hectareas que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(hectarea)) {
            double conversion = (Double.parseDouble(hectarea) * 11959.9);
            JOptionPane.showMessageDialog(null, hectarea + " Hectareas equivale a: " + conversion + " Yardas cuadradas");
        } else {
            mensajeError();
        }
    }

    public static void conversionHectareaAcre() {
        String hectarea = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Hectareas que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(hectarea)) {
            double conversion = (Double.parseDouble(hectarea) * 2.4711);
            JOptionPane.showMessageDialog(null, hectarea + " Hectareas equivale a: " + conversion + " Acres");
        } else {
            mensajeError();
        }
    }

    public static void conversionYardaCuadradaMetrosCuadrados() {
        String yarda = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Yardas cuadradas que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(yarda)) {
            double conversion = (Double.parseDouble(yarda) * 0.836127);
            JOptionPane.showMessageDialog(null, yarda + " Yardas cuadradas equivale a: " + conversion + " Metros cuadrados");
        } else {
            mensajeError();
        }
    }

    public static void conversionYardaCuadradaHectarea() {
        String yarda = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Yardas cuadradas que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(yarda)) {
            double conversion = (Double.parseDouble(yarda) * 0.0000836127);
            JOptionPane.showMessageDialog(null, yarda + " Yardas cuadradas equivale a: " + conversion + " Hectareas");
        } else {
            mensajeError();
        }
    }

    public static void conversionYardaCuadradaAcre() {
        String yarda = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Yardas cuadradas que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(yarda)) {
            double conversion = (Double.parseDouble(yarda) / 4840);
            JOptionPane.showMessageDialog(null, yarda + " Yardas cuadradas equivale a: " + conversion + " Acres");
        } else {
            mensajeError();
        }
    }

    public static void conversionAcreMetrosCuadrados() {
        String acre = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Acres que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(acre)) {
            double conversion = (Double.parseDouble(acre) * 4046.85);
            JOptionPane.showMessageDialog(null, acre + " Acres equivale a: " + conversion + " Metros cuadrados");
        } else {
            mensajeError();
        }
    }

    public static void conversionAcreHectarea() {
        String acre = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Acres que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(acre)) {
            double conversion = (Double.parseDouble(acre) * 0.404685);
            JOptionPane.showMessageDialog(null, acre + " Acres equivale a: " + conversion + " Hectareas");
        } else {
            mensajeError();
        }
    }

    public static void conversionAcreYardaCuadrada() {
        String acre = JOptionPane.showInputDialog(null, "Ingresa la cantidad de Acres que deseas convertir");
        if (RestriccionSoloNumeros.soloNumeros(acre)) {
            double conversion = (Double.parseDouble(acre) * 4840);
            JOptionPane.showMessageDialog(null, acre + " Acres equivale a: " + conversion + " Yardas cuadradas");
        } else {
            mensajeError();
        }
    }

    public static void mensajeError() {
        JOptionPane.showMessageDialog(null, "Error, solo digite numeros, por favor.");
    }

}
