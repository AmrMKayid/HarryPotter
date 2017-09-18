package harrypotter.model.tournament;

import harrypotter.model.character.Champion;
import harrypotter.model.world.Cell;
import harrypotter.model.world.EmptyCell;
import harrypotter.model.world.Merperson;
import harrypotter.model.world.ObstacleCell;
import harrypotter.model.world.TreasureCell;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SecondTask extends Task {

	/*
	 * Constructors
	 */
	public SecondTask(ArrayList<Champion> champions) throws IOException {

		super(champions);
		Collections.shuffle(champions);
		generateMap();

	}

	/*
	 * Methods
	 */
	public void generateMap() {

		Cell[][] map = getMap();

		initializeAllEmpty();

		allocateChampions();

		int count = 0;
		while (count < 40) {

			int randomX = (int) (Math.random() * 10);
			int randomY = (int) (Math.random() * 10);

			if (map[randomX][randomY] instanceof EmptyCell) {

				int hp = (int) ((Math.random() * 101) + 200);
				int dmg = (int) ((Math.random() * 201) + 100);
				map[randomX][randomY] = new ObstacleCell(new Merperson(hp, dmg));
				count++;

			}

		}

		count = 0;
		while (count < getChampions().size()) {

			int randomX = (int) (Math.random() * 10);
			int randomY = (int) (Math.random() * 10);
			if (map[randomX][randomY] instanceof EmptyCell) {

				map[randomX][randomY] = new TreasureCell(getChampions().get(
						count));
				count++;

			}

		}

		allocatePotions();

	}

}
