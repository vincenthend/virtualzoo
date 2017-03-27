package cell.facility.resto;

import cell.facility.Facility;

/**
 * @author Vincent Hendryanto Halim / 13515089
 *         Class Resto, melakukan pembuatan Resto pada x y terkait
 */

public class Resto extends Facility {
  private final char default_code = 'R';
  /**
   * Melakukan konstruksi Resto dengan x dan y default
   */
  public Resto() {
    loc_x = 0;
    loc_y = 0;
    cell_id = 22;
    code = default_code;
  }
  /**
   * Melakukan konstruksi Resto dengan x dan y terdefinisi
   *
   * @param x nilai koordinat x
   * @param y nilai koordinat y
   */
  public Resto(int x, int y) {
    loc_x = x;
    loc_y = y;
    cell_id = 22;
    code = default_code;
  }
}
