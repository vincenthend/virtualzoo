package cell.facility;
/**
 * @author Vincent Hendryanto H/13515089
 * Class Road, mengatur konstruksi Road
 */
public class Road extends Facility {
  private final char default_code = ' ';
  /**
   * Melakukan konstruksi road dengan x dan y default
   */
  public Road() {
    locX = 0;
    locY = 0;
    cellId = 21;
    code = default_code;
  }
  /**
   * Melakukan konstruksi road dengan x dan y terdefinisi
   *
   * @param x nilai koordinat x
   * @param y nilai koordinat y
   */
  public Road(int x, int y) {
    locX = x;
    locY = y;
    cellId = 21;
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
    locX = x;
    locY = y;
    if (IsEntrance) {
      cellId = 210;
    }
    else {
      cellId = 211;
    }
    code = default_code;
  }
}
