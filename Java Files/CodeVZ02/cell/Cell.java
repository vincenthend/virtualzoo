/**
 * @author Vincent Hendryanto Halim / 13515089
 *         Class cell, melakukan pembuatan cell berdasarkan ID cell
 */
class Cell {
  private int cell_id;
  private int loc_x;
  private int loc_y;
  private int cage_id;
  private char code;
  /**
   * Membuat cell dengan loc_x 0, loc_y 0, cell_id 0 dan cage_id -1
   */
  public Cell() {
    cell_id = 0;
    loc_x = 0;
    loc_y = 0;
    code = 0;
    cage_id = -1;
  }
  /**
   * @param x  lokasi x
   * @param y  lokasi y
   * @param ID nilai cell_id (tetap)
   *           Membuat cell dengan loc_x = x, loc_y = y, cell_id ID dan cage_id -1
   *           11 = LandHabitat; 12 = WaterHabitat; 13 = AirHabitat;
   *           21 = Road; 210 = Entrance; 211 = Exit; 22 = Resto; 23 = Park;
   */
  public Cell(int x, int y, int ID) {
    cell_id = ID;
    loc_x = x;
    loc_y = y;

    if (cell_id == 11) {
      code = 'L'; //Code Land Habitat
    }
    else if (cell_id == 12) {
      code = 'A'; //Code Air Habitat
    }
    else if (cell_id == 13) {
      code = 'W'; //Code Water Habitat
    }
    else if (cell_id == 21 || cell_id == 210 || cell_id == 211) {
      code = ' '; //Code Road
    }
    else if (cell_id == 22) {
      code = 'R'; //Code Resto
    }
    else if (cell_id == 23) {
      code = 'P'; //Code Park
    }
    cage_id = -1;
  }
  /**
   * Melakukan Render (mencetak Code)
   */
  public void Render() {
    System.out.print(code);
  }
  /**
   * @param c Code yang diinginkan
   *          Mengatur code yang akan digunakan untuk render
   */
  public void SetCode(char c) {
    code = c;
  }
  /**
   * @param n Nilai cage_id yang diinginkan
   *          Mengatur nilai cage_id
   */
  public void SetCageID(int n) {
    cage_id = n;
  }
  /**
   * Mengembalikan nilai cage_id
   */
  public int GetCageID() {
    return cage_id;
  }
  /**
   * Mengembalikan nilai cell_id
   */
  public int GetCellID() {
    return cell_id;
  }
  /**
   * @return Posisi absis cell.
   * Mengembalikan posisi absis hewan.
   */
  public int GetLocationX() {
    return loc_x;
  }
  /**
   * @return Posisi ordinat cell.
   * Mengembalikan posisi ordinat hewan.
   */
  public int GetLocationY() {
    return loc_y;
  }
  /**
   * <TBD></TBD>
   */
  public boolean IsHabitat() {
    return (cell_id >= 11 && cell_id <= 13);
  }
}