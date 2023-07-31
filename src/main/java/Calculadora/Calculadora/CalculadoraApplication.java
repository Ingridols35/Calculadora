package Calculadora.Calculadora;

import calculator.Calculadora;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();

		String operador = JOptionPane.showInputDialog("+    -   *   /")         ;
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor"));
	


		
		if(operador.equals("+")){
			     	var soma = n1 + n2;
			             		JOptionPane.showConfirmDialog(jframe, "Resultado: "+ soma)     ;
		}


						 if(operador.equals("-")){
		           	     	var subtracao = n1 - n2;
		           	             		JOptionPane.showConfirmDialog(jframe, "Resultado: "+ subtracao)     ;
		           }


		         if(operador.equals("*")){
				 	     	var multiplicacao = n1 * n2;
				 	             		JOptionPane.showConfirmDialog(jframe, "Resultado: "+ multiplicacao) ;    ;

				 }


  if(operador.equals("/")){
		var divisao = n1 / n2;
			JOptionPane.showConfirmDialog(jframe, "Resultado: "+ divisao)     ;
				                   }



	}

}
