
public abstract class ExpAbstraite {

	
	public abstract String toStringInfixe();
	
	public String toString() {
		return "Mon expression prefixée est "+this.toStringInfixe();
	}
}
