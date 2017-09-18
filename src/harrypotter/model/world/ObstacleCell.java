/*
 * Obstacle cells are the ones containing the obstacles 
 * that the champions may en- counter during any task. 
 * Namely, the physical obstacles in the first 
 * and third task and merpersons in the second task.
 */

package harrypotter.model.world;

public class ObstacleCell extends Cell {

	/*
	 * Attributes
	 */
	private Obstacle obstacle;	//READ ONLY

	/*
	 * Constructors
	 */
	public ObstacleCell(Obstacle obstacle) {

		this.obstacle = obstacle;

	}

	//---------------------- Getter && Setter Methods ----------------------//
	public Obstacle getObstacle() {

		return obstacle;

	}
	//#####################################################################//
}
