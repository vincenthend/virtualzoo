package cell.facility;
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
    locX = 0;
    locY = 0;
    cellId = 22;
    code = default_code;
  }
  /**
   * Melakukan konstruksi Resto dengan x dan y terdefinisi
   *
   * @param x nilai koordinat x
   * @param y nilai koordinat y
   */
  public Resto(int x, int y) {
    locX = x;
    locY = y;
    cellId = 22;
    code = default_code;
  }
}
