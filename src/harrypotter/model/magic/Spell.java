/*
 * A class representing a spell that a champion can cast during the tournament. 
 * No objects of type Spell can be instantiated.
 */

package harrypotter.model.magic;

public abstract class Spell {

	/*
	 * Attributes
	 */
	private String name; 			//READ ONLY
	private int cost; 				//READ ONLY
	private int coolDown; 			//READ ONLY
	private int defaultCooldown; 	//READ & WRITE

	/*
	 * Constructor
	 */
	public Spell(String name, int cost, int defaultCoolDown) {

		this.name = name;
		this.cost = cost;
		this.defaultCooldown = defaultCoolDown;
		coolDown = 0;

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public String getName() {

		return name;

	}

	public int getCost() {

		return cost;

	}

	public int getCoolDown() {

		return coolDown;

	}

	public int getDefaultCooldown() {

		return defaultCooldown;

	}

	public void setCoolDown(int coolDown) {

		this.coolDown = coolDown;

	}
	//#####################################################################//

}
