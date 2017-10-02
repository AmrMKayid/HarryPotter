package harrypotter.model.character;

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
	public void useTrait() {
		if (getListener() != null)
			getListener().onHufflepuffTrait();
	}

}
