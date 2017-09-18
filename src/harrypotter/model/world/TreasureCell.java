/*
 * Treasure Cells are the ones containing the treasure,
 * belonging to each champion in the second task.
 */

package harrypotter.model.world;

import harrypotter.model.character.Champion;

public class TreasureCell extends Cell {

	/*
	 * Attributes
	 */
	private Champion owner;	//READ ONLY

	/*
	 * Constructors
	 */
	public TreasureCell(Champion owner) {

		this.owner = owner;

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public Champion getOwner() {

		return owner;

	}
	//#####################################################################//

}
