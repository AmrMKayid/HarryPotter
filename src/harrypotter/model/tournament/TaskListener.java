/*
 * Interface containing the methods needed for the task listeners.
 * This interface listens for events related to the tasks
 */
package harrypotter.model.tournament;

import harrypotter.model.character.Champion;

import java.util.ArrayList;

public interface TaskListener {

	public void onFinishingFirstTask(ArrayList<Champion> winners);

	public void onFinishingSecondTask(ArrayList<Champion> winners);

	public void onFinishingThirdTask(Champion winner);

}
