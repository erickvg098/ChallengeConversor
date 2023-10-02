package Conversores;


import Conversiones.ConversionesSuperficie;
import javax.swing.JOptionPane;

public class ConversorSuperficie {

    public static void conversorSuperficie() {

        String[] opcionesSuperficie = {
            "Metros cuadrados a Hectareas",
            "Metros cuadrados a Yardas cuadradas",
            "Metros cuadrados a Acres",
            "Hectareas a Metros cuadrados",
            "Hectareas a Yardas cuadradas",
            "Hectareas a Acres",
            "Yardas cuadradas a Metros cuadrados",
            "Yardas cuadradas a Hectareas",
            "Yardas cuadradas a Acres",
            "Acres a Metros cuadrados",
            "Acres a Hectareas",
            "Acres a Yardas cuadradas",
        };

        String opcMoneda = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcionesSuperficie, opcionesSuperficie)).toString();
        switch (opcMoneda) {
            case "Metros cuadrados a Hectareas":
                ConversionesSuperficie.conversionMetrosCuadradosHectarea();
                break;
            case "Metros cuadrados a Yardas cuadradas":
                ConversionesSuperficie.conversionMetrosCuadradosYardaCuadrada();
                break;
            case "Metros cuadrados a Acres":
                ConversionesSuperficie.conversionMetrosCuadradosAcre();
                break;
            case "Hectareas a Metros cuadrados":
                ConversionesSuperficie.conversionHectareaMetrosCuadrados();
                break;
            case "Hectareas a Yardas cuadradas":
                ConversionesSuperficie.conversionHectareaYardaCuadrada();
                break;
            case "Hectareas a Acres":
                ConversionesSuperficie.conversionHectareaAcre();
                break;
            case "Yardas cuadradas a Metros cuadrados":
                ConversionesSuperficie.conversionYardaCuadradaMetrosCuadrados();
                break;
            case "Yardas cuadradas a Hectareas":
                ConversionesSuperficie.conversionYardaCuadradaHectarea();
                break;
            case "Yardas cuadradas a Acres":
                ConversionesSuperficie.conversionYardaCuadradaAcre();
                break;
            case "Acres a Metros cuadrados":
                ConversionesSuperficie.conversionAcreMetrosCuadrados();
                break;
            case "Acres a Hectareas":
                ConversionesSuperficie.conversionAcreHectarea();
                break;
            case "Acres a Yardas cuadradas":
                ConversionesSuperficie.conversionAcreYardaCuadrada();
                break;
        }
    }

}
