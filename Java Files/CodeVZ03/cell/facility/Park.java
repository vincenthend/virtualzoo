package cell.facility;

/**
 * Class Resto, melakukan pembuatan Resto pada x y
 * terkait.
 *
 * @author Vincent Hendryanto Halim / 13515089
 */
public class Park extends Facility {

  private final char defaultCode = 'P';

  /**
   * Melakukan konstruksi Resto dengan x dan y default.
   */
  public Park() {
    locX = 0;
    locY = 0;
    cellId = 22;
    code = defaultCode;
  }

  /**
   * Melakukan konstruksi Resto dengan x dan y terdefinisi.
   *
   * @param x nilai koordinat x
   * @param y nilai koordinat y
   */
  public Park(int x, int y) {
    locX = x;
    locY = y;
    cellId = 22;
    code = defaultCode;
  }
}
