package cell;

import renderable.Renderable;

/**
 * Class cell, melakukan pembuatan cell berdasarkan ID cell.
 * @author Vincent Hendryanto Halim / 13515089
 */
public abstract class Cell implements Renderable {

  protected int cellId;
  protected int locX;
  protected int locY;
  protected char code;
  private int cageId;

  /**
   * Membuat cell dengan locX 0, locY 0, cellId 0 dan cageId -1.
   */
  public Cell() {
    cellId = 0;
    locX = 0;
    locY = 0;
    code = 0;
    cageId = -1;
  }

  /**
   * Melakukan render (mencetak Code).
   * I. S.: Sembarang
   * F. S.: code tercetak di layar
   */
  public void render() {
    System.out.print(code);
  }

  /**
   * Mengembalikan nilai cageId.
   *
   * @return Nilai cageId
   */
  public int getCageId() {
    return cageId;
  }

  /**
   * Mengatur nilai cageId.
   * I. S.: Sembarang
   * F. S.: cageId berubah menjadi n
   *
   * @param n Nilai cageId yang diinginkan
   */
  public void setCageId(int n) {
    cageId = n;
  }

  /**
   * Mengembalikan nilai cellId.
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

  /**
   * Mengembalikan apakah cell adalah habitat atau bukan.
   *
   * @return true jika habitat, false jika bukan
   */
  public boolean isHabitat() {
    return (cellId >= 11 && cellId <= 13);
  }
}