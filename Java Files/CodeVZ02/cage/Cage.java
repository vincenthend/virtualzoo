package cage;
import animal.Animal;
import cell.Cell;

/**
 * @author Alif Ijlal Wafi / 13515122
 *         Class cage, melakukan konstruksi dan penambahan animal dalam cage
 *         dan mengatur habitat dalam cage
 */
public class Cage {
  private int cageId;
  private int nAnimal;
  private int nCell;
  private int cageType;
  private Animal[] a;
  private Cell[] c;
  /**
   * Inisialisasi cage dengan nAnimal 0 dan nCell 0
   * membuat array a dan c sebanyak 999 buah
   */
  public Cage() {
    nAnimal = 0;
    nCell = 0;
    a = new Animal[999];
    c = new Cell[999];
    cageId = -1;
    cageType = 0;
  }
  /**
   * @return true jika penuh dan false jika belum penuh
   * Mengembalikan kondisi penuh cage
   */
  public boolean isFull() {
    return (nAnimal >= ((nCell / 10) * 3));
  }
  /**
   * Menambahkan habitat ke dalam cage
   */
  public void addHabitat(Cell H) {
    if (nCell == 0) {
      cageType = H.getCellId();
      c[nCell] = H;
      nCell += 1;
      H.setCageId(cageId);
    }
    else {
      if (cageType == H.getCellId()) {
        c[nCell] = H;
        nCell += 1;
        H.setCageId(cageId);
      }
    }
  }
  /**
   * Menambahkan animal ke dalam cage
   */
  public void addAnimal(Animal A) {
    A.setLocationX(c[nAnimal].getLocationX());
    A.setLocationY(c[nAnimal].getLocationY());
    a[nAnimal] = A;
    nAnimal += 1;
  }
  /**
   * @return nilai cageId
   * Mengembalikan nilai cageId
   */
  public int getCageID() {
    return cageId;
  }
  /**
   * cageId diubah menjadi n
   *
   * @param n Nilai untuk cageId
   */
  public void setCageID(int n) {
    cageId = n;
  }
  /**
   * Mengembalikan nilai cageType
   *
   * @return nilai cageType
   */
  public int getCageType() {
    return cageType;
  }
  /**
   * Mengembalikan nilai alamat animal apakah x dan y dipakai, jika tidak maka null
   *
   * @return pointer menuju animal
   */
  public Animal isSpaceOccupied(int x, int y) {
    Animal ret;
    int i = 0;
    ret = null;
    while (ret == null && i < nAnimal)
      if (a[i].getLocationX() == x && a[i].getLocationY() == y)
        ret = a[i];
      else
        i += 1;
    return ret;
  }
  /**
   * Menghitung total jumlah makanan herbivore
   *
   * @return nilai total makanan herbivore
   */
  public int countFoodHerbivore() {
    int i;
    int sum = 0;
    for (i = 0; i < nAnimal; i++) {
      if (a[i].getFoodType() == 1)
        sum += a[i].getFoodQuantity();
    }
    return sum;
  }
  /**
   * Menghitung total jumlah makanan carnivore
   *
   * @return nilai total makanan carnivore
   */
  public int countFoodCarnivore() {
    int i;
    int sum = 0;
    for (i = 0; i < nAnimal; i++) {
      if (a[i].getFoodType() == 2)
        sum += a[i].getFoodQuantity();
    }
    return sum;
  }
  /**
   * Menghitung total jumlah makanan omnivore
   *
   * @return nilai total makanan omnivore
   */
  public int countFoodOmnivore() {
    int i;
    int sum = 0;
    for (i = 0; i < nAnimal; i++) {
      if (a[i].getFoodType() == 3)
        sum += a[i].getFoodQuantity();
    }
    return sum;
  }
  /**
   * Mengembalikan keberadaan animal dengan type = ID
   *
   * @return true jika ada dan false jika tidak ada
   */
  public boolean isExist(int Id) {
    boolean found = false;
    int i = 0;
    while (i < nAnimal) {
      if (a[i].getType() == Id)
        found = true;
      i++;
    }
    return found;
  }
}
