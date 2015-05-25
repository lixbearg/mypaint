package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class BarraDeFerramentas extends JToolBar implements ActionListener {

	JToggleButton botaoRetangulo;
	JToggleButton botaoCirculo;
	
	public static final int RETANGULO = 1;
	public static final int CIRCULO = 2;
	
	private int ferramenta;
	
	public BarraDeFerramentas() {
		super("Barra de Ferramentas");
		ButtonGroup grupo = new ButtonGroup();
		
		botaoRetangulo = new JToggleButton("Retângulo");
		botaoRetangulo.addActionListener(this);
		grupo.add(botaoRetangulo);
		this.add(botaoRetangulo);
		
		botaoCirculo = new JToggleButton("Círculo");
		botaoCirculo.addActionListener(this);
		grupo.add(botaoCirculo);
		this.add(botaoCirculo);
		
		this.setFloatable(false);
		
		botaoRetangulo.getModel().setPressed(true);
		this.ferramenta = RETANGULO;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botaoRetangulo) {
			this.ferramenta = RETANGULO;
		}
		if (e.getSource() == botaoCirculo) {
			this.ferramenta = CIRCULO;
		}
	}
	
	public int leFerramentaSelecionada() {
		return this.ferramenta;
	}

}
