/*
 * A spell that damages merpersons, 
 * physical obstacles and other players by the given damage amount.
 */

package harrypotter.model.magic;

public class DamagingSpell extends Spell {

	/*
	 * Attributes
	 */
	/* The damageAmount represents the value
	 *  that this spell will remove from the target’s hp.
	 */
	private int damageAmount;	//READ ONLY

	/*
	 * Constructor
	 */
	public DamagingSpell(String name, int cost, int defaultCoolDown,
			int damageAmount) {

		super(name, cost, defaultCoolDown);
		this.damageAmount = damageAmount;

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public int getDamageAmount() {

		return damageAmount;

	}
	//#####################################################################//

}
