/*
 * Represents a merperson that blocks the champion’s path 
 * and inflicts damage on him upon being in an adjacent cell.
 */

package harrypotter.model.world;

public class Merperson extends Obstacle {

	/*
	 * Attributes
	 */
	/* 
	 * It representing the damage amount
	 * that can be inflicted by the Merperson on the champions
	 */
	private int damage;	//READ ONLY

	/*
	 * Constructors
	 */
	public Merperson(int hp, int damage) {

		super(hp);
		this.damage = damage;

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public int getDamage() {

		return damage;

	}
	//#####################################################################//
}
