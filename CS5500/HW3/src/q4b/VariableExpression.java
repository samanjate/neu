package q4b;

/**
 * 
 * This class implements the Expression interface and can be used to produce
 * an element in another expression.
 * 
 * @author Samanjate Sood
 *
 */
public class VariableExpression extends Expression {

	private Variable val;

	public VariableExpression(Variable val) {
		this.val = val;
	}
	
	/**
	 * @return The textual representation of an variable in the program.
	 */
	@Override
	public String textRepresentation() {
		return this.val.getText();
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visit(this);
	}

}
