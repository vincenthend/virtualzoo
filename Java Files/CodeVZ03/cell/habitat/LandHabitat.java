package cell.habitat;

/**
 * Class LandHabitat, melakukan pembuatan LandHabitat untuk menampung binatang.
 * @author Vincent Hendryanto Halim / 13515089
 */
public class LandHabitat extends Habitat {

  private final char defaultCode = 'L';

  /**
   * Konstruktor class LandHabitat.
   */
  public LandHabitat() {
    locX = 0;
    locY = 0;
    cellId = 11;
    code = defaultCode;
  }

  /**
   * Konstruktor class LandHabitat dengan X dan Y terkait.
   *
   * @param x Posisi absis habitat
   * @param y Posisi ordinat habitat
   */
  public LandHabitat(int x, int y) {
    locX = x;
    locY = y;
    cellId = 11;
    code = defaultCode;
  }
}
