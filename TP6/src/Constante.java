
public class Constante extends ExpAbstraite {

	private double valeur;
	
	public Constante(double valeur) {
		this.valeur = valeur;
	}
	
	@Override
	public String toStringInfixe() {
		return Double.toString(this.valeur);
	}

}
