package Principal;


import Conversores.ConversorTemperatura;
import Conversores.ConversorSuperficie;
import Conversores.ConversorMonedas;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Conversor {

    public static void main(String[] args) {

        String[] opcionesConversion = {
            "Conversor de moneda",
            "Conversor de superficies",
            "Conversor de temperatura"
        };

        try {
            String opc = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcionesConversion, opcionesConversion)).toString();

            while (true) {
                switch (opc) {
                    case "Conversor de moneda":
                        ConversorMonedas.conversorMonedas();
                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Continuar");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            System.exit(0);
                        }
                        break;

                    case "Conversor de temperatura":
                        ConversorTemperatura.conversorTemperatura();
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Continuar");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            System.exit(0);
                        }
                        break;

                    case "Conversor de superficies":
                        ConversorSuperficie.conversorSuperficie();
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("Continuar");
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            System.exit(0);
                        }
                        break;
                }
            }
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Programa terminado");
            System.exit(0);
        }

    }
}
