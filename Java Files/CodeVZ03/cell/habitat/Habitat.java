package cell.habitat;
import cell.Cell;

/**
 * @author Vincent Hendryanto Halim / 13515089
 *         Class Habitat, baseclass dari Air, Land, dan Water Habitat
 */
public abstract class Habitat extends Cell {
  /**
   * Konstruktor class Habitat dengan X dan Y terkait
   */
  public Habitat() {
    locX = 0;
    locY = 0;
    cellId = 1;
  }
}
