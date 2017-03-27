/**
 * @author Vincent Hendryanto Halim / 13515089
 * Class WaterHabitat, melakukan pembuatan WaterHabitat berdasarkan X dan Y
 */

package cell.habitat.waterhabitat;
import cell.habitat.Habitat;

public class WaterHabitat extends Habitat {
  private final char default_code = 'W';

  /**
   * Konstruktor class WaterHabitat
   */
  public WaterHabitat() {
    loc_x = 0;
    loc_y = 0;
    cell_id = 12;
    code = default_code;
  }
  /**
   * Konstruktor class WaterHabitat dengan X dan Y terkait
   */
  public WaterHabitat(int x, int y) {
    loc_x = x;
    loc_y = y;
    cell_id = 12;
    code = default_code;
  }
}
