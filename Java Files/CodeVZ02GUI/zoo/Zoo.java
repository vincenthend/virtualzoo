package zoo;

import cage.Cage;
import cell.Cell;

/**
 * Class Zoo, mengatur konstruksi zoo dan penambahan animal/cage.
 * @author Alif Ijlal W / 13515122
 */
public class Zoo {

  private int width;
  private int height;
  private int numCage;
  private Cell[][] cellList;
  private Cage[] cageList;

  /**
   * Membuat Zoo dengan width 21 dan height 21.
   */
  public Zoo() {
    numCage = 0;
    width = 21;
    height = 21;
    cellList = new Cell[width][height];
    cageList = new Cage[width * height];
  }

  /**
   * Membuat Zoo dengan width w dan height h.
   *
   * @param w Lebar zoo
   * @param h Tinggi zoo
   */
  public Zoo(int w, int h) {
    numCage = 0;
    width = w;
    height = h;
    cellList = new Cell[width][height];
    cageList = new Cage[width * height];
  }

  /**
   * Melakukan penambahan cage untuk seluruh zoo.
   * I. S.: Sembarang
   * F. S.: Seluruh cage dalam zoo dibuat dari habitat sejenis yang bersebelahan
   */
  public void addCage() {
    int i;
    int j;
    for (i = 0; i < height; i++) {
      for (j = 0; j < width; j++) {
        if (cellList[i][j] != null) {
          if ((cellList[i][j].getCageId() == -1) && cellList[i][j].isHabitat()) {
            initCage(i, j);
          }
        }
      }
    }
  }

  /**
   * Membuat sebuah cage baru
   * I. S.: Sembarang
   * F. S.: Sebuah cage dibuat dari habitat sejenis yang bersebelahan, jumlah cage bertambah 1
   *
   * @param x Posisi absis habitat di mana cage akan dibuat
   * @param y Posisi ordinat habitat di mana cage akan dibuat
   */
  public void initCage(int x, int y) {
    if (cellList[x][y] != null) {
      cageList[numCage] = new Cage();
      cageList[numCage].setCageId(numCage);
      addToCage(x, y);
      numCage++;
    }
  }

  /**
   * Memasukkan habitat yang bersebelahan ke cage I. S.: Cage sudah dibuat F. S.: Sebuah habitat dan
   * habitat sejenis yang bersebelahan dengan habitat tersebut dimasukkan ke dalam cage
   *
   * @param x Posisi absis habitat yang akan dimasukkan
   * @param y Posisi ordinat habitat yang akan dimasukkan
   */
  public void addToCage(int x, int y) {
    cageList[numCage].addHabitat(cellList[x][y]);
    if (isInRange(x - 1, y) && cellList[x - 1][y] != null) {
      if (cellList[x][y].getCellId() == cellList[x - 1][y].getCellId()
          && cellList[x - 1][y].getCageId() == -1) {
        addToCage(x - 1, y);
      }
    }
    if (isInRange(x + 1, y) && cellList[x + 1][y] != null) {
      if (cellList[x][y].getCellId() == cellList[x + 1][y].getCellId()
          && cellList[x + 1][y].getCageId() == -1) {
        addToCage(x + 1, y);
      }
    }
    if (isInRange(x, y - 1) && cellList[x][y - 1] != null) {
      if (cellList[x][y].getCellId() == cellList[x][y - 1].getCellId()
          && cellList[x][y - 1].getCageId() == -1) {
        addToCage(x, y - 1);
      }
    }
    if (isInRange(x, y + 1) && cellList[x][y + 1] != null) {
      if (cellList[x][y].getCellId() == cellList[x][y + 1].getCellId()
          && cellList[x][y + 1].getCageId() == -1) {
        addToCage(x, y + 1);
      }
    }
  }

  /**
   * Mengembalikan ada tidaknya cell x, y di dalam zoo.
   *
   * @param x Lokasi x cell
   * @param y Lokasi y cell
   * @return true jika cell x, y ada di dalam range zoo, false jika tidak
   */
  public boolean isInRange(int x, int y) {
    return (x >= 0 && x < height && y >= 0 && y < width);
  }

  /**
   * Melakukan penambahan cell dengan cell C yang sudah dictor di tempat lain.
   *
   * @param x Lokasi x Cell
   * @param y Lokasi y Cell
   * @param c Cell yang akan ditambahkan
   */
  public void addCell(int x, int y, Cell c) {
    cellList[x][y] = c;
  }

  /**
   * Mengembalikan nilai width pada zoo.
   *
   * @return Nilai Width Zoo
   */
  public int getWidth() {
    return width;
  }

  /**
   * Mengembalikan nilai height pada zoo.
   *
   * @return Nilai Height Zoo
   */
  public int getHeight() {
    return height;
  }

  /**
   * Getter untuk cell dengan posisi x dan y.
   *
   * @param x Lokasi x Cell
   * @param y Lokasi y Cell
   * @return Alamat cell pada (x,y) dalam memory
   */
  public Cell getCell(int x, int y) {
    return cellList[x][y];
  }

  /**
   * Getter untuk cage ke-n.
   *
   * @param n Nomor cage yang akan diambil
   * @return Alamat cage ke-n dalam memory
   */
  public Cage getCage(int n) {
    return cageList[n];
  }

  /**
   * Getter untuk cage ke-n.
   *
   * @return jumlah cage pada saat ini
   */
  public int getNCage() {
    return numCage;
  }

  /**
   * Menghitung total makanan herbivore dalam zoo.
   *
   * @return total makanan herbivore
   */
  public int countFoodHerbivore() {
    int i;
    int sum = 0;
    for (i = 0; i < numCage; i++) {
      sum += cageList[i].countFoodHerbivore();
    }
    return sum;
  }

  /**
   * Menghitung total makanan carnivore dalam zoo.
   *
   * @return total makanan carnivore
   */
  public int countFoodCarnivore() {
    int i;
    int sum = 0;
    for (i = 0; i < numCage; i++) {
      sum += cageList[i].countFoodCarnivore();
    }
    return sum;
  }

  /**
   * Menghitung total makanan omnivore dalam zoo.
   *
   * @return total makanan omnivore
   */
  public int countFoodOmnivore() {
    int i;
    int sum = 0;
    for (i = 0; i < numCage; i++) {
      sum += cageList[i].countFoodOmnivore();
    }
    return sum;
  }
}