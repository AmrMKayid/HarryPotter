package harrypotter.model.character;

import harrypotter.exceptions.InCooldownException;

public class GryffindorWizard extends Wizard implements Champion {

	/*
	 * Constructors
	 */
	public GryffindorWizard(String name) {
		
		super(name, 900, 500);
		
	}

	/*
	 * Methods
	 */
	public void useTrait() throws InCooldownException{
		if (getListener() != null)
			getListener().onGryffindorTrait();

	}
}
