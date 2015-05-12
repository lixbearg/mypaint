package principal;

import java.awt.BorderLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

import figuras.Circulo;
import figuras.Figura;
import figuras.Retangulo;

public class Paint extends JFrame {

	public static void main(String[] args) {
		Paint aplicacao = new Paint();
	}

	public Paint() {
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new BorderLayout());
		
		JToolBar barraDeFerramentas = new JToolBar("Barra de Ferramentas");
		painelPrincipal.add(barraDeFerramentas, BorderLayout.PAGE_START);
		
		ButtonGroup btnGroup = new ButtonGroup();
		JToggleButton botaoRet = new JToggleButton("Retângulo");
		//botaoRet.addActionListener(/* Aqui vem um ActionListener */);
		botaoRet.getModel().setPressed(true);
		btnGroup.add(botaoRet);
		barraDeFerramentas.add(botaoRet);
		barraDeFerramentas.setFloatable(false);
		
		Retangulo ret1 = new Retangulo(5, 5, 100, 80);
		Retangulo ret2 = new Retangulo(400, 150, 30, 30);
		Circulo c = new Circulo(200, 200, 56);
		Figura[] figuras = new Figura[]{ret1, ret2, c};
		
		AreaDeDesenho areaDeDesenho = new AreaDeDesenho(figuras);
		painelPrincipal.add(areaDeDesenho, BorderLayout.CENTER);
		
		this.setContentPane(painelPrincipal);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
}
