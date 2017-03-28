package cell;
/**
 * @author Vincent Hendryanto Halim / 13515089
 *         Class cell, melakukan pembuatan cell berdasarkan ID cell
 */
public class Cell {
  private int cellId;
  private int locX;
  private int locY;
  private int cageId;
  private char code;
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
   * Membuat cell dengan locX = x, locY = y, cellId ID dan cageId -1
   * 11 = LandHabitat; 12 = WaterHabitat; 13 = AirHabitat;
   * 21 = Road; 210 = Entrance; 211 = Exit; 22 = Resto; 23 = Park;
   *
   * @param x  lokasi x
   * @param y  lokasi y
   * @param ID nilai cellId (tetap)
   */
  public Cell(int x, int y, int ID) {
    cellId = ID;
    locX = x;
    locY = y;

    if (cellId == 11) {
      code = 'L'; //Code Land Habitat
    }
    else if (cellId == 12) {
      code = 'A'; //Code Air Habitat
    }
    else if (cellId == 13) {
      code = 'W'; //Code Water Habitat
    }
    else if (cellId == 21 || cellId == 210 || cellId == 211) {
      code = ' '; //Code Road
    }
    else if (cellId == 22) {
      code = 'R'; //Code Resto
    }
    else if (cellId == 23) {
      code = 'P'; //Code Park
    }
    cageId = -1;
  }
  /**
   * Melakukan render (mencetak Code)
   */
  public void render() {
    System.out.print(code);
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
  /**
   * Mengembalikan apakah cell adalah habitat atau bukan
   *
   * @return true jika habitat, false jika bukan
   */
  public boolean isHabitat() {
    return (cellId >= 11 && cellId <= 13);
  }
}