package cell.facility;

/**
 * Class Resto, melakukan pembuatan Resto pada x y
 * terkait.
 *
 * @author Vincent Hendryanto Halim / 13515089
 */
public class Resto extends Facility {

  private final char defaultCode = 'R';

  /**
   * Melakukan konstruksi Resto dengan x dan y default.
   */
  public Resto() {
    locX = 0;
    locY = 0;
    cellId = 23;
    code = defaultCode;
  }

  /**
   * Melakukan konstruksi Resto dengan x dan y terdefinisi.
   *
   * @param x nilai koordinat x
   * @param y nilai koordinat y
   */
  public Resto(int x, int y) {
    locX = x;
    locY = y;
    cellId = 23;
    code = defaultCode;
  }
}
