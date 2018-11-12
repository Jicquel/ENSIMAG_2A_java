
public abstract class ExpBinaire extends ExpAbstraite {

	protected ExpAbstraite opGauche;
	
	protected ExpAbstraite opDroit;
	
	protected String operateur;

	public ExpBinaire(ExpAbstraite opGauche, ExpAbstraite opDroit, String operateur) {
		this.opGauche = opGauche;
		this.opDroit = opDroit;
		this.operateur = operateur;
	}
	
	@Override
	public String toStringInfixe() {
		return this.opGauche.toStringInfixe() +" "+ this.operateur +" " + this.opDroit.toStringInfixe();
	}

	
}
