package harrypotter.model.character;

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
	public void useTrait() {
		if (getListener() != null)
			getListener().onRavenclawTrait();
	}

}
