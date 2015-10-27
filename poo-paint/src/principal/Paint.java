package principal;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Paint extends JFrame {

	public static void main(String[] args) {
		Paint aplicacao = new Paint();
	}

	public Paint() {
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new BorderLayout());
		
		BarraDeFerramentas barraDeFerramentas = new BarraDeFerramentas(); 
		painelPrincipal.add(barraDeFerramentas, BorderLayout.PAGE_START);
		
		AreaDeDesenho areaDeDesenho = new AreaDeDesenho();
		painelPrincipal.add(areaDeDesenho, BorderLayout.CENTER);
		
		GerenciadorDeEventos gerenciador = new GerenciadorDeEventos(areaDeDesenho, barraDeFerramentas);
		areaDeDesenho.addMouseListener(gerenciador);
		areaDeDesenho.addMouseMotionListener(gerenciador);
		
		this.setContentPane(painelPrincipal);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
}
