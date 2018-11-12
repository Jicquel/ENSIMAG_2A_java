
public abstract class ExpUnaire extends ExpAbstraite {

	protected ExpAbstraite operande;
	
	public ExpUnaire(ExpAbstraite operande) {
		this.operande = operande;
	}
}
