package harrypotter.model.character;

import java.io.IOException;

import harrypotter.exceptions.InCooldownException;
import harrypotter.exceptions.InvalidTargetCellException;
import harrypotter.exceptions.OutOfBordersException;
import harrypotter.model.world.Direction;

public class SlytherinWizard extends Wizard implements Champion {

	/*
	 * Attributes
	 */
	/*
	 * It represents the direction of the move resulting from activating their trait.
	 */
	private Direction traitDirection;

	/*
	 * Constructors
	 */
	public SlytherinWizard(String name) {
		
		super(name, 850, 550);
		
	}

	/*
	 * Methods
	 */
	public void useTrait() throws IOException, InCooldownException, InvalidTargetCellException, OutOfBordersException {
		if (getListener() != null)
			getListener().onSlytherinTrait(traitDirection);
	}
	
	//---------------------- Getter && Setter Methods ----------------------//
	public Direction getTraitDirection() {
		
		return traitDirection;
		
	}

	public void setTraitDirection(Direction traitDirection) {
		
		this.traitDirection = traitDirection;
		
	}
	//#####################################################################//

}
