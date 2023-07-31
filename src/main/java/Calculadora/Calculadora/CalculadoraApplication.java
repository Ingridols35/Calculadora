package Calculadora.Calculadora;

import calculator.Calculadora;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
		var soma = n1 + n2;
		JOptionPane.showConfirmDialog(jframe, "Resultado: "+ soma)        ;
	}

}
