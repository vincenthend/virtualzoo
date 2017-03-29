package cell.habitat;

/**
 * Class AirHabitat, melakukan pembuatan AirHabitat
 * untuk menampung binatang.
 *
 * @author Vincent Hendryanto Halim / 13515089
 */
public class AirHabitat extends Habitat {

  private final char defaultCode = 'A';

  /**
   * Konstruktor class AirHabitat.
   */
  public AirHabitat() {
    locX = 0;
    locY = 0;
    cellId = 12;
    code = defaultCode;
  }

  /**
   * Konstruktor class AirHabitat dengan X dan Y terkait.
   *
   * @param x Posisi absis habitat
   * @param y Posisi ordinat habitat
   */
  public AirHabitat(int x, int y) {
    locX = x;
    locY = y;
    cellId = 12;
    code = defaultCode;
  }
}
