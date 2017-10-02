/*
 * Interface containing the methods available to wizards who participate in the tournament
 */

package harrypotter.model.character;

import java.io.IOException;

import harrypotter.exceptions.InCooldownException;
import harrypotter.exceptions.InvalidTargetCellException;
import harrypotter.exceptions.OutOfBordersException;

public interface Champion {
	
	/*
	 * Methods
	 */
	public void useTrait() throws IOException, InCooldownException, InvalidTargetCellException, OutOfBordersException;

}
