package Conversores;


import Conversiones.ConversionesMoneda;
import javax.swing.JOptionPane;

public class ConversorMonedas {

    public static void conversorMonedas() {

        String[] opcionesMoneda = {
            "Pesos MXN a Dolar USD",
            "Pesos MXN a Euro",
            "Pesos MXN a Libra Esterlina",
            "Pesos MXN a Yen Japonés",
            "Pesos MXN a Won Surcoreano",
            "Dolar USD a Pesos MXN",
            "Euro a Pesos MXN",
            "Libra Esterlina a Pesos MXN",
            "Yen Japonés a Pesos MXN",
            "Won Surcoreano a Pesos MXN"
        };

        String opcMoneda = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcionesMoneda, opcionesMoneda)).toString();
        switch (opcMoneda) {
            case "Pesos MXN a Dolar USD":
                ConversionesMoneda.conversionPesoDolar();
                break;
            case "Dolar USD a Pesos MXN":
                ConversionesMoneda.conversionDolarPeso();
                break;
            case "Pesos MXN a Euro":
                ConversionesMoneda.conversionPesoEuro();
                break;
            case "Euro a Pesos MXN":
                ConversionesMoneda.conversionEuroPeso();
                break;
            case "Pesos MXN a Libra Esterlina":
                ConversionesMoneda.conversionPesoLibra();
                break;
            case "Libra Esterlina a Pesos MXN":
                ConversionesMoneda.conversionLibraPeso();
                break;
            case "Pesos MXN a Yen Japonés":
                ConversionesMoneda.conversionPesoYuan();
                break;
            case "Yen Japonés a Pesos MXN":
                ConversionesMoneda.conversionYuanPeso();
                break;
            case "Pesos MXN a Won Surcoreano":
                ConversionesMoneda.conversionPesoWon();
                break;
            case "Won Surcoreano a Pesos MXN":
                ConversionesMoneda.conversionWonPeso();
                break;
        }
    }

}
