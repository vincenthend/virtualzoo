/**
 * @author Vincent Hendryanto Halim / 13515089
 * Class LandHabitat, melakukan pembuatan LandHabitat untuk menampung binatang
 */

package cell.habitat.landhabitat;
import cell.habitat.Habitat;

public class LandHabitat extends Habitat {
  private final char default_code = 'L';
  /**
   * Konstruktor class LandHabitat dengan X dan Y terkait
   */
  public LandHabitat() {
    loc_x = 0;
    loc_y = 0;
    cell_id = 12;
    code = default_code;
  }
  /**
   * Konstruktor class LandHabitat dengan X dan Y terkait
   */
  public LandHabitat(int x, int y) {
    loc_x = x;
    loc_y = y;
    cell_id = 12;
    code = default_code;
  }
}
