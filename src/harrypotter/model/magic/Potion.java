/*
 * A subclass of Collectible representing a potion 
 * that can be used by wizards to recover their ip.
 */

package harrypotter.model.magic;

public class Potion extends Collectible {

	/*
	 * Attributes
	 */
	private int amount; //READ ONLY

	/*
	 * Constructors
	 */
	public Potion(String name, int amount) {

		super(name);
		this.amount = amount;

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public int getAmount() {

		return amount;

	}
	//#####################################################################//

}
