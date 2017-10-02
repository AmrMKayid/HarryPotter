/*
 *  Class representing the whole game play i.e. the Triwizard Tournament.
 */

package harrypotter.model.tournament;

import harrypotter.model.character.Champion;
import harrypotter.model.magic.DamagingSpell;
import harrypotter.model.magic.HealingSpell;
import harrypotter.model.magic.RelocatingSpell;
import harrypotter.model.magic.Spell;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Tournament implements TaskListener {

	/*
	 * Attributes
	 */
	private ArrayList<Champion> champions;	//READ ONYL
	private ArrayList<Spell> spells;		//READ ONYL
	private FirstTask firstTask;			//READ ONYL
	private SecondTask secondTask;			//READ ONYL
	private ThirdTask thirdTask;			//READ ONYL

	/*
	 * Constructor
	 */
	public Tournament() throws IOException {

		champions = new ArrayList<Champion>();
		spells = new ArrayList<Spell>();
		loadSpells("resources/Spells.csv");

	}

	/* 
	 * Methods
	 */
	private void loadSpells(String filePath) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line = br.readLine();

		while (line != null) {

			String[] content = line.split(",");

			int cost = Integer.parseInt(content[2]);
			int defaultCoolDown = Integer.parseInt(content[4]);
			int amount = Integer.parseInt(content[3]);

			switch (content[0]) {

			case "DMG":

				spells.add(new DamagingSpell(content[1], cost, defaultCoolDown,
						amount));
				break;

			case "HEL":

				spells.add(new HealingSpell(content[1], cost, defaultCoolDown,
						amount));
				break;

			case "REL":

				spells.add(new RelocatingSpell(content[1], cost,
						defaultCoolDown, amount));
				break;

			}

			line = br.readLine();

		}

		br.close();

	}
	
	public void addChampion(Champion c) {
		champions.add(c);
	}
	
	public void beginTournament() throws IOException {

		firstTask = new FirstTask(champions);
		firstTask.setListener(this);

	}

	public void onFinishingFirstTask(ArrayList<Champion> winners)
			throws IOException {

		if (!winners.isEmpty()) {
			secondTask = new SecondTask(winners);
			secondTask.setListener(this);
		}

	}

	public void onFinishingSecondTask(ArrayList<Champion> winners)
			throws IOException {

		if (!winners.isEmpty()) {
			thirdTask = new ThirdTask(winners);
			thirdTask.setListener(this);
		}

	}

	public void onFinishingThirdTask(Champion winner) {

		// TODO: M4

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public ArrayList<Champion> getChampions() {

		return champions;

	}

	public ArrayList<Spell> getSpells() {

		return spells;

	}

	public FirstTask getFirstTask() {

		return firstTask;

	}

	public SecondTask getSecondTask() {

		return secondTask;

	}

	public ThirdTask getThirdTask() {

		return thirdTask;

	}
	//---------------------- Getter && Setter Methods ----------------------//
}
