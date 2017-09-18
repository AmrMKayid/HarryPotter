package harrypotter.model.tournament;

import harrypotter.model.character.Champion;
import harrypotter.model.magic.Potion;
import harrypotter.model.world.Cell;
import harrypotter.model.world.CollectibleCell;
import harrypotter.model.world.EmptyCell;
import harrypotter.model.world.PhysicalObstacle;
import harrypotter.model.world.ObstacleCell;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FirstTask extends Task {

	/*
	 * Constructors
	 */
	public FirstTask(ArrayList<Champion> champions) throws IOException {

		super(champions);
		Collections.shuffle(champions);
		generateMap();
		setCurrentChamp(getChampions().get(0));

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

			if (map[randomX][randomY] instanceof EmptyCell
					&& !(randomX == 4 && randomY == 4)) {

				int hp = (int) ((Math.random() * 101) + 200);
				map[randomX][randomY] = new ObstacleCell(new PhysicalObstacle(hp));
				count++;

			}

		}

		allocatePotions();

	}

	public void allocatePotions() {

		Cell[][] map = getMap();

		ArrayList<Potion> potions = getPotions();

		int i = 0;
		while (i < 10) {

			int randomX = (int) (Math.random() * 10);
			int randomY = (int) (Math.random() * 10);

			if (map[randomX][randomY] instanceof EmptyCell
					&& !(randomX == 4 && randomY == 4)) {

				int r = (int) (Math.random() * potions.size());
				map[randomX][randomY] = new CollectibleCell(potions.get(r));
				i++;

			}

		}
	}

}
