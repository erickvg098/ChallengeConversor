package Conversores;


import Conversiones.ConversionesTemperatura;
import javax.swing.JOptionPane;

public class ConversorTemperatura {

    public static void conversorTemperatura() {

        String[] opcionesTemperatura = {
            "Grados Fahrenheit a Grados Celcius",
            "Grados Fahrenheit a Grados Kelvin",
            "Grados Celcius a Grados Fahrenheit",
            "Grados Celcius a Grados Kelvin",
            "Grados Kelvin a Grados Celcius",
            "Grados Kelvin a Grados Fahrenheit",};

        String opcTemperatura = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcionesTemperatura, opcionesTemperatura)).toString();
        switch (opcTemperatura) {
            case "Grados Fahrenheit a Grados Celcius":
                ConversionesTemperatura.conversionGradosFaC();
                break;
            case "Grados Fahrenheit a Grados Kelvin":
                ConversionesTemperatura.conversionGradosFaK();
                break;
            case "Grados Celcius a Grados Fahrenheit":
                ConversionesTemperatura.conversionGradosCaF();
                break;
            case "Grados Celcius a Grados Kelvin":
                ConversionesTemperatura.conversionGradosCaK();
                break;
            case "Grados Kelvin a Grados Celcius":
                ConversionesTemperatura.conversionGradosKaC();
                break;
            case "Grados Kelvin a Grados Fahrenheit":
                ConversionesTemperatura.conversionGradosKaF();
                break;
        }
    }

}
