package cell.habitat;

import cell.Cell;

/**
 * @author Vincent Hendryanto Halim / 13515089
 *         Class Habitat, baseclass dari Air, Land, dan Water Habitat
 */

public abstract class Habitat extends Cell {
  public Habitat() {
    loc_x = 0;
    loc_y = 0;
    cell_id = 1;
  }
}
