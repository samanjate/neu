package q4c;

/**
 * 
 * This class implements the Statement interface and can be used to produce
 * a statement in the output sequence.
 * 
 * @author Samanjate Sood
 *
 */
public class Assignment extends Statement {

	private Variable var;
	private Expression exp;
	
	public Assignment(Variable var, Expression exp) {
		this.var = var;
		this.exp = exp;
	}

	/**
	 * @return Returns the textual representation of the variable assignment 
	 * 			to an expression
	 */
	@Override
	public String textRepresentation() {
		return var.getText() + " = " + exp.textRepresentation();
	}

	@Override
	public void accept(ASTVisitor visitor) {
		visitor.visit(this);
	}
	
	public Variable getVariable() {
		return var;
	}
	
	public Expression getExpression() {
		return exp;
	}

}
