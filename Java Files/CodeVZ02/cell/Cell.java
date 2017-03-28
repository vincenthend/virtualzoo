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
   * @param x  lokasi x
   * @param y  lokasi y
   * @param ID nilai cellId (tetap)
   *           Membuat cell dengan locX = x, locY = y, cellId ID dan cageId -1
   *           11 = LandHabitat; 12 = WaterHabitat; 13 = AirHabitat;
   *           21 = Road; 210 = Entrance; 211 = Exit; 22 = Resto; 23 = Park;
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
   * @param c Code yang diinginkan
   *          Mengatur code yang akan digunakan untuk render
   */
  public void setCode(char c) {
    code = c;
  }
  /**
   * @param n Nilai cageId yang diinginkan
   *          Mengatur nilai cageId
   */
  public void setCageId(int n) {
    cageId = n;
  }
  /**
   * Mengembalikan nilai cageId
   */
  public int getCageId() {
    return cageId;
  }
  /**
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