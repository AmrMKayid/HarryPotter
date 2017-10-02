package harrypotter.model.tournament;

import harrypotter.model.character.Champion;
import harrypotter.model.character.Wizard;
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
	 * Attributes
	 */
	private ArrayList<Champion> winners; //READ & WRITE
	/*
	 * Constructors
	 */
	public SecondTask(ArrayList<Champion> champions) throws IOException {

		super(champions);
		Collections.shuffle(champions);
		generateMap();
		
		winners = new ArrayList<Champion>();

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
	
	public void encounterMerPerson() {

		Wizard current = (Wizard) getCurrentChamp();

		int currentX = current.getLocation().x;
		int currentY = current.getLocation().y;

		int newHp = current.getHp();

		ObstacleCell cell = null;
		if (currentX + 1 <= 9
				&& getMap()[currentX + 1][currentY] instanceof ObstacleCell) {

			cell = (ObstacleCell) getMap()[currentX + 1][currentY];
			newHp = newHp - ((Merperson) (cell.getObstacle())).getDamage();

		}
		if (currentX - 1 >= 0
				&& getMap()[currentX - 1][currentY] instanceof ObstacleCell) {

			cell = (ObstacleCell) getMap()[currentX - 1][currentY];
			newHp = newHp - ((Merperson) ((cell).getObstacle())).getDamage();

		}
		if (currentY - 1 >= 0
				&& getMap()[currentX][currentY - 1] instanceof ObstacleCell) {

			cell = (ObstacleCell) getMap()[currentX][currentY - 1];
			newHp = newHp - ((Merperson) ((cell).getObstacle())).getDamage();

		}
		if (currentY + 1 <= 9
				&& getMap()[currentX][currentY + 1] instanceof ObstacleCell) {

			cell = (ObstacleCell) getMap()[currentX][currentY + 1];
			newHp = newHp - ((Merperson) ((cell).getObstacle())).getDamage();

		}

		if (newHp <= 0) {

			current.setHp(0);
			getChampions().remove(getCurrentChamp());
			getMap()[currentX][currentY] = new EmptyCell();

		} else {
			current.setHp(newHp);
		}

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public ArrayList<Champion> getWinners() {
		return winners;
	}

	public void setWinners(ArrayList<Champion> winners) {
		this.winners = winners;
	}
	//#####################################################################//

}
