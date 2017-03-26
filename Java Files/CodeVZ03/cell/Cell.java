/**
 * @author Vincent Hendryanto Halim / 13515089
 *         Class cell, melakukan pembuatan cell berdasarkan ID cell
 */

package cell;

public class Cell {
  protected int cell_id;
  protected int loc_x;
  protected int loc_y;
  protected int cage_id;
  protected char code;
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
   * Melakukan Render (mencetak Code)
   */
  public void Render(){
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
}