
public class UnaireSin extends ExpUnaire {

	public UnaireSin(ExpAbstraite operande) {
		super(operande);
	}

	@Override
	public String toStringInfixe() {
		return "sin("+operande.toStringInfixe()+")";
	}

}
