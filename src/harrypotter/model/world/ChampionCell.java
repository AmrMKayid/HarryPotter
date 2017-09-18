/*
 * Champion Cells are ones that currently have a champion positioned in them.
 */

package harrypotter.model.world;

import harrypotter.model.character.Champion;

public class ChampionCell extends Cell {

	/*
	 * Attributes
	 */
	private Champion champ;	//READ ONLY

	/*
	 * Constructors
	 */
	public ChampionCell(Champion champ) {

		this.champ = champ;

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public Champion getChamp() {

		return champ;

	}
	//#####################################################################//

}
