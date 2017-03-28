package cage;

import animal.Animal;
import cell.Cell;

/**
 * @author Alif Ijlal Wafi / 13515122
 *         <p>
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

  public boolean IsFull() {
    return (nAnimal >= ((nCell / 10) * 3));
  }
  /**
   * Menambahkan habitat ke dalam cage
   */
  public void AddHabitat(Cell H) {
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
  public void AddAnimal(Animal A) {
    A.setLocationX(c[nAnimal].getLocationX());
    A.setLocationY(c[nAnimal].getLocationY());
    a[nAnimal] = A;
    nAnimal += 1;
  }
  /**
   * @param n Nilai untuk cageId
   *          cageId diubah menjadi n
   */
  public void SetCageID(int n) {
    cageId = n;
  }
  /**
   * @return nilai cageId
   * Mengembalikan nilai cageId
   */
  public int GetCageID() {
    return cageId;
  }
  /**
   * @return nilai cageType
   * Mengembalikan nilai cageType
   */
  public int GetCageType() {
    return cageType;
  }
  /**
   * @return pointer menuju animal
   * Mengembalikan nilai alamat animal apakah x dan y dipakai, jika tidak maka null
   */
  public Animal IsSpaceOccupied(int x, int y) {
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
   * @return nilai total makanan herbivore
   * Menghitung total jumlah makanan herbivore
   */
  public int CountFoodHerbivore() {
    int i;
    int sum = 0;
    for (i = 0; i < nAnimal; i++) {
      if (a[i].getFoodType() == 1)
        sum += a[i].getFoodQuantity();
    }
    return sum;
  }
  /**
   * @return nilai total makanan carnivore
   * Menghitung total jumlah makanan carnivore
   */
  public int CountFoodCarnivore() {
    int i;
    int sum = 0;
    for (i = 0; i < nAnimal; i++) {
      if (a[i].getFoodType() == 2)
        sum += a[i].getFoodQuantity();
    }
    return sum;
  }
  /**
   * @return nilai total makanan omnivore
   * Menghitung total jumlah makanan omnivore
   */
  public int CountFoodOmnivore() {
    int i;
    int sum = 0;
    for (i = 0; i < nAnimal; i++) {
      if (a[i].getFoodType() == 3)
        sum += a[i].getFoodQuantity();
    }
    return sum;
  }
  /**
   * @return true jika ada dan false jika tidak ada
   * Mengembalikan keberadaan animal dengan type = ID
   */
  public boolean IsExist(int ID) {
    boolean found = false;
    int i = 0;
    while (i < nAnimal) {
      if (a[i].getType() == ID)
        found = true;
      i++;
    }
    return found;
  }
}
