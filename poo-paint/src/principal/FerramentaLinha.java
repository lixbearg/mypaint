package principal;

import figuras.Figura;
import figuras.Linha;

public class FerramentaLinha extends Ferramenta {

	public FerramentaLinha(BarraDeFerramentas barra) {
		super(barra);
	}

	@Override
	public Figura criaFigura(int x, int y) {
		return new Linha(x, y, x + 10, y + 10);
	}

	@Override
	public String getNome() {
		return "Linha";
	}

	
}
