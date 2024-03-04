import javax.swing.*;


import static javax.swing.JOptionPane.YES_NO_CANCEL_OPTION;
import static javax.swing.JOptionPane.showOptionDialog;

public class Calculadora {
    public static void main(String[] args) {
        CalculadoraMenu calculadora = new CalculadoraMenu();
        boolean flag = false;
        do {

            String menuOparecao = JOptionPane.showInputDialog("Escolha uma operação." +
                    "\nDigite 1 - somar." +
                    "\nDigite 2 - Subtração." +
                    "\nDigite 3 - Multiplicação." +
                    "\nDigite 4 - Divisão.");

            if (menuOparecao == null) {
                JOptionPane.showMessageDialog(null, "programa foi cancelado. ");
                return;
            }
            if (menuOparecao.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Escolheu errado, pow, tem que escolher uma opção acima");
            } else {
                int escolhaOpcao = Integer.parseInt(menuOparecao);


                String num1s = JOptionPane.showInputDialog("Digite o primeiro numero: ");
                String num2s = JOptionPane.showInputDialog("Digite o segundo numero: ");

                double num1a = Double.parseDouble(num1s);
                double num2a = Double.parseDouble(num2s);

                String resultado = String.valueOf(calculadora.calcular(escolhaOpcao, num1a, num2a));

                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

                int n = JOptionPane.showOptionDialog(new JFrame(), "Desejar continuar ?",
                        "Title", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);

                if (n == JOptionPane.NO_OPTION) {
                    flag = true;
                    JOptionPane.showMessageDialog(null, "programa encerrado.");
                }
                
            }
        } while (!flag);

        System.exit(0);
    }
}
