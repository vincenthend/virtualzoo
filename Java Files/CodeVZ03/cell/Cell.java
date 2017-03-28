package cell;
import renderable.Renderable;

/**
 * @author Vincent Hendryanto Halim / 13515089
 *         Class cell, melakukan pembuatan cell berdasarkan ID cell
 */
public abstract class Cell implements Renderable {
  protected int cellId;
  protected int locX;
  protected int locY;
  protected char code;
  private int cageId;
  /**
   * Membuat cell dengan locX 0, locY 0, cellId 0 dan cageId -1
   */
  public Cell() {
    cellId = 0;
    locX = 0;
    locY = 0;
    code = 0;
    cageId = -1;
  }
  /**
   * Melakukan render (mencetak Code)
   * I. S.: Sembarang
   * F. S.: code tercetak di layar
   */
  public void render() {
    System.out.print(code);
  }
  /**
   * Mengatur code yang akan digunakan untuk render
   * I. S.: Sembarang
   * F. S.: Code diubah menjadi karakter yang disimpan di c
   *
   * @param c Code yang diinginkan
   */
  public void setCode(char c) {
    code = c;
  }
  /**
   * Mengembalikan nilai cageId
   *
   * @return Nilai cageId
   */
  public int getCageId() {
    return cageId;
  }
  /**
   * Mengatur nilai cageId
   * I. S.: Sembarang
   * F. S.: cageId berubah menjadi n
   *
   * @param n Nilai cageId yang diinginkan
   */
  public void setCageId(int n) {
    cageId = n;
  }
  /**
   * Mengembalikan nilai cellId
   *
   * @return Nilai cellId
   */
  public int getCellId() {
    return cellId;
  }
  /**
   * Mengembalikan posisi absis hewan.
   *
   * @return Posisi absis cell.
   */
  public int getLocationX() {
    return locX;
  }
  /**
   * Mengembalikan posisi ordinat hewan.
   *
   * @return Posisi ordinat cell.
   */
  public int getLocationY() {
    return locY;
  }
}