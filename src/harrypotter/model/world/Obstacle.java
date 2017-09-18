/*
 * A Superclass representing an obstacle within the map 
 * that is preventing the contestants from passing through. 
 * No objects of type Obstacle can be instantiated.
 */

package harrypotter.model.world;

public abstract class Obstacle {

	/*
	 * Attributes
	 */
	/*
	 * It represents how much damage the obstacle can withstand.
	 */
	private int hp;	//READ & WRITE

	/*
	 * Constructors
	 */
	public Obstacle(int hp) {

		this.hp = hp;

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public int getHp() {

		return hp;

	}
	
//	public void setHp(int hp) {
//		this.hp = hp;
//	}
	//#####################################################################//
}
