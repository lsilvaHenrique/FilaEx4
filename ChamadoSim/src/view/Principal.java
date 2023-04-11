package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.lipe.FilaInt.Fila;
import controller.FilaController;

public class Principal {

	public static void main(String[] args) {
		Fila fila = new Fila();
		Fila filaPrioritarios = new Fila();
		int senha = 0, op = 0, qtdePrioritarios = 0;
		FilaController filaContr = new FilaController();
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("=========== MENU ===========\n"
											+ "Escolha a operação:\n"
											+ "1 - Inserir uma nova senha\n"
											+ "2 - Inserir uma nova senha na lista de prioritários\n"
											+ "3 - Chamar paciente\n"
											+ "0 - Sair do sistema"));
			switch(op) {
				case 0:
					JOptionPane.showMessageDialog(null, "Saindo...");
					break;
				case 1:
					senha++;
					filaContr.inserirSenha(fila, senha);
					break;
				case 2:
					senha++;
					filaContr.inserirSenha(filaPrioritarios, senha);
					break;
				case 3:
					qtdePrioritarios++;
					filaContr.chamarPessoa(filaPrioritarios, fila, qtdePrioritarios);
					if (qtdePrioritarios == 4) qtdePrioritarios = 0;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!");
			}
		} while(op > 0);
	}

}
