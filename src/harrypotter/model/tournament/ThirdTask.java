package harrypotter.model.tournament;

import harrypotter.model.character.Champion;
import harrypotter.model.world.Cell;
import harrypotter.model.world.ChampionCell;
import harrypotter.model.world.CupCell;
import harrypotter.model.world.EmptyCell;
import harrypotter.model.world.PhysicalObstacle;
import harrypotter.model.world.ObstacleCell;
import harrypotter.model.world.WallCell;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ThirdTask extends Task {

	/*
	 * Constructors
	 */
	public ThirdTask(ArrayList<Champion> champions) throws IOException {

		super(champions);
		generateMap();

	}

	/*
	 * Methods
	 */
	public void generateMap() throws IOException {

		initializeAllEmpty();
		readMap("resources/task3map.csv");
		allocatePotions();

	}

	private void readMap(String filePath) throws IOException {

		Cell[][] map = getMap();
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line = br.readLine();

		int i = 0;
		while (line != null) {

			String[] content = line.split(",");

			for (int j = 0; j < content.length; j++) {

				char cellType = content[j].charAt(0);

				switch (cellType) {
				case '0':

					map[i][j] = new EmptyCell();
					break;

				case '5':

					map[i][j] = new WallCell();
					break;

				case '6':

					int hp = (int) ((Math.random() * 101) + 200);
					map[i][j] = new ObstacleCell(new PhysicalObstacle(hp));
					break;

				case '7':

					map[i][j] = new CupCell();
					break;

				case '1':
				case '2':
				case '3':
				case '4':

					int c = Character.getNumericValue(cellType);
					if (c <= getChampions().size()) {

						map[i][j] = new ChampionCell(getChampions().get(c - 1));

					}

					break;

				default:
					
					break;
					
				}

			}

			i++;
			line = br.readLine();

		}

		br.close();

	}
}
