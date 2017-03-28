package cell;

import renderable.Renderable;

/**
 * @author Vincent Hendryanto Halim / 13515089
 * Class cell, melakukan pembuatan cell berdasarkan ID cell
 */
public abstract class Cell implements Renderable {
  private int cageId;
  protected int cellId;
  protected int locX;
  protected int locY;
  protected char code;
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
   * @param c Code yang diinginkan
   * Mengatur code yang akan digunakan untuk render
   * I. S.: Sembarang
   * F. S.: Code diubah menjadi karakter yang disimpan di c
   */
  public void setCode(char c) {
    code = c;
  }
  /**
   * @param n Nilai cageId yang diinginkan
   * Mengatur nilai cageId
   * I. S.: Sembarang
   * F. S.: cageId berubah menjadi n
   */
  public void setCageId(int n) {
    cageId = n;
  }
  /**
   * @return Nilai cageId
   * Mengembalikan nilai cageId
   */
  public int getCageId() {
    return cageId;
  }
  /**
   * @return Nilai cellId
   * Mengembalikan nilai cellId
   */
  public int getCellId() {
    return cellId;
  }
  /**
   * @return Posisi absis cell.
   * Mengembalikan posisi absis hewan.
   */
  public int getLocationX() {
    return locX;
  }
  /**
   * @return Posisi ordinat cell.
   * Mengembalikan posisi ordinat hewan.
   */
  public int getLocationY() {
    return locY;
  }
}