package zoo;
import cell.Cell;
import cage.Cage;

/**
 * @author Alif Ijlal W / 13515122
 *         Class Zoo, mengatur konstruksi zoo dan penambahan animal/cage
 */
public class Zoo {
  private int width;
  private int height;
  private int n_cage;
  private Cell c[][];
  private Cage cg[];
  /**
   * Membuat Zoo dengan width 21 dan height 21
   */
  Zoo() {
    n_cage = 0;
    width = 21;
    height = 21;
    c = new Cell[width][height];
    cg = new Cage[999];
  }
  /**
   * Membuat Zoo dengan width w dan height h
   *
   * @param w Lebar zoo
   * @param h Tinggi zoo
   */
  public Zoo(int w, int h) {
    n_cage = 0;
    width = w;
    height = h;
    c = new Cell[width][height];
    cg = new Cage[999];
  }
  /**
   * Melakukan penambahan cage,
   */
  public void AddCage() {
    cg[n_cage] = new Cage();
    cg[n_cage].SetCageID(n_cage);
    n_cage += 1;
  }
  /**
   * Melakukan penambahan cell dengan cell C yang sudah dictor di tempat lain
   *
   * @param x Lokasi x Cell
   * @param y Lokasi y Cell
   * @param C Cell yang akan ditambahkan
   */
  public void AddCell(int x, int y, Cell C) {
    c[x][y] = C;
  }
  /**
   * Mengembalikan nilai width pada zoo
   *
   * @return Nilai Width Zoo
   */
  public int GetWidth() {
    return width;
  }
  /**
   * Mengembalikan nilai height pada zoo
   *
   * @return Nilai Height Zoo
   */
  public int GetHeight() {
    return height;
  }
  /**
   * Getter untuk cell dengan posisi x dan y
   *
   * @param x Lokasi x Cell
   * @param y Lokasi y Cell
   * @return Alamat cell pada (x,y) dalam memory
   */
  public Cell GetCell(int x, int y) {
    return c[x][y];
  }
  /**
   * Getter untuk cage ke-n
   *
   * @param n Nomor cage yang akan diambil
   * @return Alamat cage ke-n dalam memory
   */
  public Cage GetCage(int n) {
    return cg[n];
  }
  /**
   * Getter untuk cage ke-n
   *
   * @return jumlah cage pada saat ini
   */
  public int GetNCage() {
    return n_cage;
  }
  /**
   * Menghitung total makanan herbivore dalam zoo
   *
   * @return total makanan herbivore
   */
  public int CountFoodHerbivore() {
    int i, sum;
    i = 0;
    sum = 0;
    for (i = 0; i < n_cage; i++) {
      sum += cg[i].CountFoodHerbivore();
    }
    return sum;
  }
  /**
   * Menghitung total makanan carnivore dalam zoo
   *
   * @return total makanan carnivore
   */
  public int CountFoodCarnivore() {
    int i, sum;
    i = 0;
    sum = 0;
    for (i = 0; i < n_cage; i++) {
      sum += cg[i].CountFoodCarnivore();
    }
    return sum;
  }
  /**
   * Menghitung total makanan omnivore dalam zoo
   *
   * @return total makanan omnivore
   */
  public int CountFoodOmnivore() {
    int i, sum;
    i = 0;
    sum = 0;
    for (i = 0; i < n_cage; i++) {
      sum += cg[i].CountFoodOmnivore();
    }
    return sum;
  }
}