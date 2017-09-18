/*
 * Collectible cells have collectible items of type Collectible in them.
 */

package harrypotter.model.world;

import harrypotter.model.magic.Collectible;

public class CollectibleCell extends Cell {

	/*
	 * Attributes
	 */
	private Collectible collectible;	//READ ONLY

	/*
	 * Constructors
	 */
	public CollectibleCell(Collectible c) {

		this.collectible = c;

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public Collectible getCollectible() {

		return collectible;

	}
	//#####################################################################//

}
