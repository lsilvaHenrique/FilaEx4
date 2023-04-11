package controller;

import javax.swing.JOptionPane;

import br.edu.fateczl.lipe.FilaInt.Fila;

public class FilaController {

	public FilaController() { }
	
	public void inserirSenha(Fila f, int senha) {
		f.insert(senha);
	}
	
	private void removerPessoaFila(Fila f) {
		try {
			JOptionPane.showMessageDialog(null, "Chamando a senha: " + f.remove());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Não há ninguém na fila");
		}
	}
	
	public void chamarPessoa(Fila fp, Fila f, int prioritarios) {
		if (fp.isEmpty() || (prioritarios > 3 && !f.isEmpty())) removerPessoaFila(f);
		else removerPessoaFila(fp);
	}
	
}
