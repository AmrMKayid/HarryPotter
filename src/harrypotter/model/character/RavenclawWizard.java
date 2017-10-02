package harrypotter.model.character;

import harrypotter.exceptions.InCooldownException;

public class RavenclawWizard extends Wizard implements Champion {

	/*
	 * Constructors
	 */
	public RavenclawWizard(String name) {
		
		super(name, 750, 700);

	}

	/*
	 * Methods
	 */
	public void useTrait() throws InCooldownException {
		if (getListener() != null)
			getListener().onRavenclawTrait();
	}

}
