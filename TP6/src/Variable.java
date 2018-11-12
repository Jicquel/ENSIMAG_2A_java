
public class Variable extends ExpAbstraite {

	private String nom;
	
	public Variable(String nom) {
		this.nom= nom;
	}
	
	@Override
	public String toStringInfixe() {
		return this.nom;
	}
	

}
