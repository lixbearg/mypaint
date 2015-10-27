package principal;

import figuras.Circulo;
import figuras.Figura;

public class FerramentaCirculo extends Ferramenta {

	public FerramentaCirculo(BarraDeFerramentas barra) {
		super(barra);
	}
	
	@Override
	public Figura criaFigura(int x, int y) {
		return new Circulo(x, y, 40);
	}

	@Override
	public String getNome() {
		return "Círculo";
	}
}
