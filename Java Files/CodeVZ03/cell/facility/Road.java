package cell.facility;

/**
 * Class Road, mengatur konstruksi Road.
 *
 * @author Vincent Hendryanto H/13515089
 */
public class Road extends Facility {

  private final char defaultCode = ' ';

  /**
   * Melakukan konstruksi road dengan x dan y default.
   */
  public Road() {
    locX = 0;
    locY = 0;
    cellId = 21;
    code = defaultCode;
  }

  /**
   * Melakukan konstruksi road dengan x dan y terdefinisi.
   *
   * @param x nilai koordinat x
   * @param y nilai koordinat y
   */
  public Road(int x, int y) {
    locX = x;
    locY = y;
    cellId = 21;
    code = defaultCode;
  }

  /**
   * Melakukan konstruksi road dengan x dan y terdefinisi.
   *
   * @param x nilai koordinat x
   * @param y nilai koordinat y
   * @param isEntrance true jika jalan adalah entrance, false jika adalah exit
   */
  public Road(int x, int y, boolean isEntrance) {
    locX = x;
    locY = y;
    if (isEntrance) {
      cellId = 210;
    } else {
      cellId = 211;
    }
    code = defaultCode;
  }
}
