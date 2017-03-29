package cell.facility;

import cell.Cell;

/**
 * Class Facility, merupakan base class dari road resto dan
 * park.
 *
 * @author Vincent Hendryanto H / 13515089
 */
public abstract class Facility extends Cell {

  /**
   * Melakukan konstruksi Facility dengan x dan y default.
   */
  public Facility() {
    locX = 0;
    locY = 0;
    cellId = 2;
  }
}
