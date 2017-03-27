package cell.facility;
import cell.Cell;

/**
 * @author Vincent Hendryanto H/13515089
 *         Class Facility, merupakan base class dari road resto dan park
 */
public abstract class Facility extends Cell {
  /**
   * Melakukan konstruksi Facility dengan x dan y default
   */
  public Facility() {
    loc_x = 0;
    loc_y = 0;
    cell_id = 2;
  }
}
