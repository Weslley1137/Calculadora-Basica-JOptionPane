import javax.swing.*;

public class CalculadoraMenu {
    public double calcular(int escolha, double num1, double num2) {
        switch (escolha) {
            case 1:
                return somar(num1, num2);
            case 2:
                return subtrair(num1, num2);
            case 3:
                return multiplicar(num1, num2);
            case 4:
                return dividir(num1, num2);

            default:
                JOptionPane.showMessageDialog(null, "Opção invalida!");


        }
        return 0;
    }

    private double somar(double num1, double num2) {
        return num1 + num2;
    }

    private double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    private double multiplicar(double num1, double num2) {
        return num1 * num2;

    }

    private double dividir(double num1, double num2) {
        return num1 / num2;
    }


}