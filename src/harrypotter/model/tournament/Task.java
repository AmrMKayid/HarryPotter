/*
 * Class representing a tournament task. 
 * No objects of type Task can be instantiated.
 */

package harrypotter.model.tournament;

import harrypotter.model.character.Champion;
import harrypotter.model.character.Wizard;
import harrypotter.model.magic.Potion;
import harrypotter.model.world.Cell;
import harrypotter.model.world.ChampionCell;
import harrypotter.model.world.CollectibleCell;
import harrypotter.model.world.EmptyCell;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Task {

	/*
	 * Attributes
	 */
	private ArrayList<Champion> champions;	//READ ONLY
	private Cell[][] map;					//READ ONLY
	private Champion currentChamp;			//READ & WRITE
	private int allowedMoves;				//READ & WRITE
	private boolean traitActivated;			//READ & WRITE
	private ArrayList<Potion> potions;		//READ ONLY

	/*
	 * Constructors
	 */
	public Task(ArrayList<Champion> champions) throws IOException {

		this.champions = champions;
		map = new Cell[10][10];
		potions = new ArrayList<Potion>();
		loadPotions("resources/Potions.csv");
		allowedMoves = 1;

	}

	/*
	 * Methods
	 */
	public abstract void generateMap() throws IOException;
	
	private void loadPotions(String filePath) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line = br.readLine();

		while (line != null) {

			String[] content = line.split(",");
			potions.add(new Potion(content[0], Integer.parseInt(content[1])));
			line = br.readLine();

		}

		br.close();

	}

	public void initializeAllEmpty() {

		for (int i = 0; i < map.length; i++) {

			for (int j = 0; j < map[i].length; j++) {

				map[i][j] = new EmptyCell();

			}

		}

	}

	public void allocateChampions() {

		for (int i = 0; i < champions.size(); i++) {

			Champion champ = champions.get(i);

			if (i == 0) {

				map[9][0] = new ChampionCell(champ);
				((Wizard) champ).setLocation(new Point(9, 0));

			}

			else if (i == 1) {

				map[9][9] = new ChampionCell(champ);
				((Wizard) champ).setLocation(new Point(9, 9));

			} else if (i == 2) {

				map[0][9] = new ChampionCell(champ);
				((Wizard) champ).setLocation(new Point(0, 9));

			} else {

				map[0][0] = new ChampionCell(champ);
				((Wizard) champ).setLocation(new Point(0, 0));

			}

		}

	}

	public void allocatePotions() {

		int i = 0;
		while (i < 10) {

			int randomX = (int) (Math.random() * 10);
			int randomY = (int) (Math.random() * 10);

			if (map[randomX][randomY] instanceof EmptyCell) {

				int r = (int) (Math.random() * potions.size());
				map[randomX][randomY] = new CollectibleCell(potions.get(r));
				i++;

			}

		}

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public ArrayList<Champion> getChampions() {

		return champions;

	}

	public Cell[][] getMap() {

		return map;

	}

	public Champion getCurrentChamp() {

		return currentChamp;

	}

	public ArrayList<Potion> getPotions() {

		return potions;

	}

	public int getAllowedMoves() {

		return allowedMoves;

	}

	public boolean isTraitActivated() {

		return traitActivated;

	}

	public void setCurrentChamp(Champion currentChamp) {

		this.currentChamp = currentChamp;

	}

	public void setAllowedMoves(int allowedMoves) {

		this.allowedMoves = allowedMoves;

	}

	public void setTraitActivated(boolean traitActivated) {

		this.traitActivated = traitActivated;

	}
	//#####################################################################//

}
