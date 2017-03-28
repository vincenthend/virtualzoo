/**
 * @author Vincent Hendryanto Halim / 13515089
 * Class WaterHabitat, melakukan pembuatan WaterHabitat berdasarkan X dan Y
 */
package cell.habitat;
public class WaterHabitat extends Habitat {
  private final char defaultCode = 'W';
  /**
   * Konstruktor class WaterHabitat
   */
  public WaterHabitat() {
    locX = 0;
    locY = 0;
    cellId = 13;
    code = defaultCode;
  }
  /**
   * Konstruktor class WaterHabitat dengan X dan Y terkait
   */
  public WaterHabitat(int x, int y) {
    locX = x;
    locY = y;
    cellId = 13;
    code = defaultCode;
  }
}
