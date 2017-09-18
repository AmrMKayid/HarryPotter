/*
 * A spell that relocates another player or obstacle within a given range.
 */

package harrypotter.model.magic;

public class RelocatingSpell extends Spell {

	/*
	 * Attributes
	 */
	/*
	 * The range represents the maximum number of cells 
	 * that this spell can move objects to relative to their initial location.
	 */
	private int range;	//READ ONLY

	/*
	 * Constructor
	 */
	public RelocatingSpell(String name, int cost, int defaultCoolDown, int range) {

		super(name, cost, defaultCoolDown);
		this.range = range;

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public int getRange() {

		return range;

	}
	//#####################################################################//

}
