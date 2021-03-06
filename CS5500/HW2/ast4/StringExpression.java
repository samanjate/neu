package ast4;

/**
 * 
 * This class implements the Expression interface and can be used to produce
 * an element in another expression.
 * 
 * @author Samanjate Sood
 *
 */
public class StringExpression implements Expression {

	private String val;

	public StringExpression(String val) {
		this.val = val;
	}
	
	/**
	 * @return The textual representation of an string in the program.
	 */
	@Override
	public String textRepresentation() {
		return "\"" + this.val + "\"";
	}

}
