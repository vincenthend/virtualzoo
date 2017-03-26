/**
 * @author Vincent Hendryanto Halim / 13515089
 * Class AirHabitat, melakukan pembuatan AirHabitat untuk menampung binatang
 */

package cell.habitat.airhabitat;
import cell.habitat.Habitat;

public class AirHabitat extends Habitat {
  private final char default_code = 'A';
  /**
   * Konstruktor class AirHabitat dengan X dan Y terkait
   */
  public AirHabitat() {
    loc_x = 0;
    loc_y = 0;
    cell_id = 12;
    code = default_code;
  }
  /**
   * Konstruktor class AirHabitat dengan X dan Y terkait
   */
  public AirHabitat(int x, int y) {
    loc_x = x;
    loc_y = y;
    cell_id = 12;
    code = default_code;
  }
}
