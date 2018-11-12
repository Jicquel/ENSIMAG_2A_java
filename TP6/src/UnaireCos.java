
public class UnaireCos extends ExpUnaire {

	public UnaireCos(ExpAbstraite operande) {
		super(operande);
	}

	@Override
	public String toStringInfixe() {
			return "cos("+operande.toStringInfixe()+")";
	}

}
