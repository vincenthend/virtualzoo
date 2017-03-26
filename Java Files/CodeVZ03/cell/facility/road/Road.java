/**
 * @author Vincent Hendryanto H/13515089
 * Class Road, mengatur konstruksi Road
 */

package cell.facility.road;
import cell.facility.Facility;

public class Road extends Facility {
  private final char default_code = ' ';
  /**
   * Melakukan konstruksi road dengan x dan y default
   */
  public Road() {
    loc_x = 0;
    loc_y = 0;
    cell_id = 21;
    code = default_code;
  }
  /**
   * Melakukan konstruksi road dengan x dan y terdefinisi
   *
   * @param x nilai koordinat x
   * @param y nilai koordinat y
   */
  public Road(int x, int y) {
    loc_x = x;
    loc_y = y;
    cell_id = 21;
    code = default_code;
  }
  /**
   * Melakukan konstruksi road dengan x dan y terdefinisi
   *
   * @param x          nilai koordinat x
   * @param y          nilai koordinat y
   * @param IsEntrance true jika jalan adalah entrance, false jika adalah exit
   */
  public Road(int x, int y, boolean IsEntrance) {
    loc_x = x;
    loc_y = y;
    if (IsEntrance) {
      cell_id = 210;
    }
    else {
      cell_id = 211;
    }
    code = default_code;
  }
}
