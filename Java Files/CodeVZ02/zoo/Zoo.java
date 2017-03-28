package zoo;
import cage.Cage;
import cell.Cell;

/**
 * @author Alif Ijlal W / 13515122
 *         Class Zoo, mengatur konstruksi zoo dan penambahan animal/cage
 */
public class Zoo {
  private int width;
  private int height;
  private int nCage;
  private Cell[][] cellList;
  private Cage[] cageList;
  /**
   * Membuat Zoo dengan width 21 dan height 21
   */
  Zoo() {
    nCage = 0;
    width = 21;
    height = 21;
    cellList = new Cell[width][height];
    cageList = new Cage[999];
  }
  /**
   * Membuat Zoo dengan width w dan height h
   *
   * @param w Lebar zoo
   * @param h Tinggi zoo
   */
  public Zoo(int w, int h) {
    nCage = 0;
    width = w;
    height = h;
    cellList = new Cell[width][height];
    cageList = new Cage[999];
  }
  /**
   * Melakukan penambahan cage,
   */
  public void addCage() {
    cageList[nCage] = new Cage();
    cageList[nCage].setCageID(nCage);
    nCage += 1;
  }
  /**
   * Melakukan penambahan cell dengan cell C yang sudah dictor di tempat lain
   *
   * @param x Lokasi x Cell
   * @param y Lokasi y Cell
   * @param C Cell yang akan ditambahkan
   */
  public void addCell(int x, int y, Cell C) {
    cellList[x][y] = C;
  }
  /**
   * Mengembalikan nilai width pada zoo
   *
   * @return Nilai Width Zoo
   */
  public int getWidth() {
    return width;
  }
  /**
   * Mengembalikan nilai height pada zoo
   *
   * @return Nilai Height Zoo
   */
  public int getHeight() {
    return height;
  }
  /**
   * Getter untuk cell dengan posisi x dan y
   *
   * @param x Lokasi x Cell
   * @param y Lokasi y Cell
   * @return Alamat cell pada (x,y) dalam memory
   */
  public Cell getCell(int x, int y) {
    return cellList[x][y];
  }
  /**
   * Getter untuk cage ke-n
   *
   * @param n Nomor cage yang akan diambil
   * @return Alamat cage ke-n dalam memory
   */
  public Cage getCage(int n) {
    return cageList[n];
  }
  /**
   * Getter untuk cage ke-n
   *
   * @return jumlah cage pada saat ini
   */
  public int getNCage() {
    return nCage;
  }
  /**
   * Menghitung total makanan herbivore dalam zoo
   *
   * @return total makanan herbivore
   */
  public int countFoodHerbivore() {
    int i, sum;
    i = 0;
    sum = 0;
    for (i = 0; i < nCage; i++) {
      sum += cageList[i].countFoodHerbivore();
    }
    return sum;
  }
  /**
   * Menghitung total makanan carnivore dalam zoo
   *
   * @return total makanan carnivore
   */
  public int countFoodCarnivore() {
    int i, sum;
    i = 0;
    sum = 0;
    for (i = 0; i < nCage; i++) {
      sum += cageList[i].countFoodCarnivore();
    }
    return sum;
  }
  /**
   * Menghitung total makanan omnivore dalam zoo
   *
   * @return total makanan omnivore
   */
  public int countFoodOmnivore() {
    int i, sum;
    i = 0;
    sum = 0;
    for (i = 0; i < nCage; i++) {
      sum += cageList[i].countFoodOmnivore();
    }
    return sum;
  }
}