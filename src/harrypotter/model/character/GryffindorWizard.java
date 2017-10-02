package harrypotter.model.character;

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
	public void useTrait() {
		if (getListener() != null)
			getListener().onGryffindorTrait();

	}
}
