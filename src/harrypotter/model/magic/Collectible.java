/*
 * A class representing an item that can be collected by the champions.
 * No objects of type Collectible can be instantiated.
 */

package harrypotter.model.magic;

public abstract class Collectible {
	
	/*
	 * Attributes
	 */
	private String name; //READ ONLY

	/*
	 * Constructors
	 */
	public Collectible(String name) {

		this.name = name;

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public String getName() {

		return name;

	}
	//#####################################################################//

}
