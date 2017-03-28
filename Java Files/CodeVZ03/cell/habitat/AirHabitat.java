/**
 * @author Vincent Hendryanto Halim / 13515089
 * Class AirHabitat, melakukan pembuatan AirHabitat untuk menampung binatang
 */

package cell.habitat;
public class AirHabitat extends Habitat {
  private final char defaultCode = 'A';
  /**
   * Konstruktor class AirHabitat dengan X dan Y terkait
   */
  public AirHabitat() {
    locX = 0;
    locY = 0;
    cellId = 12;
    code = defaultCode;
  }
  /**
   * Konstruktor class AirHabitat dengan X dan Y terkait
   */
  public AirHabitat(int x, int y) {
    locX = x;
    locY = y;
    cellId = 12;
    code = defaultCode;
  }
}
