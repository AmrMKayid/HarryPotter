package harrypotter.model.character;

import harrypotter.exceptions.InCooldownException;

public class HufflepuffWizard extends Wizard implements Champion {

	/*
	 * Constructors
	 */
	public HufflepuffWizard(String name) {
		
		super(name, 1000, 450);

	}
	
	/*
	 * Methods
	 */
	public void useTrait() throws InCooldownException {
		if (getListener() != null)
			getListener().onHufflepuffTrait();
	}

}
