/*
 * A spell that the champion casts to recover his hp by a specific amount.
 */

package harrypotter.model.magic;

public class HealingSpell extends Spell {

	/*
	 * Attributes
	 */
	/* The healingAmount represents the amount 
	 * that this spell will restore to the champion’s hp.
	 */
	private int healingAmount;	//READ ONLY

	/*
	 * Constructor
	 */
	public HealingSpell(String name, int cost, int defaultCoolDown,
			int healingAmount) {

		super(name, cost, defaultCoolDown);
		this.healingAmount = healingAmount;

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public int getHealingAmount() {

		return healingAmount;

	}
	//#####################################################################//

}
