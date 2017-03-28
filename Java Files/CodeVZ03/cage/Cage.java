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
  private Animal animalList[];
  private Cell cellList[];
  /**
   * Inisialisasi cage dengan nAnimal 0 dan nCell 0
   * membuat array animalList dan cellList sebanyak 999 buah
   */
  public Cage() {
    nAnimal = 0;
    nCell = 0;
    animalList = new Animal[999];
    cellList = new Cell[999];
    cageId = -1;
    cageType = 0;
  }
  /**
   * @return true jika penuh dan false jika belum penuh
   * Mengembalikan kondisi penuh cage jika ditambahkan 1 ekor binatang
   */
  public boolean isFull() {
    return (nAnimal + 1 > ((nCell / 10) * 3));
  }
  /**
   * Menambahkan habitat ke dalam cage
   * I. S.: H terdefinisi, merupakan habitat yang valid
   * F. S.: Jumlah habitat dalam cage bertambah 1, habitat dimasukkan ke cage
   */
  public void addHabitat(Cell H) {
    if (nCell == 0) {
      cageType = H.getCellId();
      cellList[nCell] = H;
      nCell += 1;
      H.setCageId(cageId);
    }
    else {
      if (cageType == H.getCellId()) {
        cellList[nCell] = H;
        nCell += 1;
        H.setCageId(cageId);
      }
    }
  }
  /**
   * Menambahkan animal ke dalam cage
   * I. S.: H terdefinisi, merupakan animal yang valid, cage tidak penuh
   * F. S.: Jumlah animal dalam cage bertambah 1, animal dimasukkan ke habitat yang ada di cage
   */
  public void addAnimal(Animal A) {
    A.setLocationX(cellList[nAnimal].getLocationX());
    A.setLocationY(cellList[nAnimal].getLocationY());
    animalList[nAnimal] = A;
    nAnimal += 1;
  }
  /**
   * @param n Nilai untuk cageId
   * Mengubah cageId menjadi n
   * I. S.: n terdefinisi
   * F. S.: cageId diubah menjadi n
   */
  public void setCageID(int n) {
    cageId = n;
  }
  /**
   * @return nilai cageId
   * Mengembalikan nilai cageId
   */
  public int getCageID() {
    return cageId;
  }
  /**
   * @return nilai cageType
   * Mengembalikan nilai cageType
   */
  public int getCageType() {
    return cageType;
  }
  /**
   * @return pointer menuju animal
   * Mengembalikan nilai alamat animal apakah x dan y dipakai, jika tidak maka null
   */
  public Animal isSpaceOccupied(int x, int y) {
    Animal returnValue = null;
    int i = 0;
    while (returnValue == null && i < nAnimal)
      if (animalList[i].getLocationX() == x && animalList[i].getLocationY() == y)
        returnValue = animalList[i];
      else
        i += 1;
    return returnValue;
  }
  /**
   * @return nilai total makanan herbivore
   * Menghitung total jumlah makanan herbivore
   */
  public int countFoodHerbivore() {
    int i;
    int sum = 0;
    for (i = 0; i < nAnimal; i++) {
      if (animalList[i].getFoodType() == 1)
        sum += animalList[i].getFoodQuantity();
    }
    return sum;
  }
  /**
   * @return nilai total makanan carnivore
   * Menghitung total jumlah makanan carnivore
   */
  public int countFoodCarnivore() {
    int i;
    int sum = 0;
    for (i = 0; i < nAnimal; i++) {
      if (animalList[i].getFoodType() == 2)
        sum += animalList[i].getFoodQuantity();
    }
    return sum;
  }
  /**
   * @return nilai total makanan omnivore
   * Menghitung total jumlah makanan omnivore
   */
  public int countFoodOmnivore() {
    int i;
    int sum = 0;
    for (i = 0; i < nAnimal; i++) {
      if (animalList[i].getFoodType() == 3)
        sum += animalList[i].getFoodQuantity();
    }
    return sum;
  }
  /**
   * @return true jika ada dan false jika tidak ada
   * Mengembalikan keberadaan animal dengan type = ID
   */
  public boolean isExist(int ID) {
    boolean found = false;
    int i = 0;
    while (i < nAnimal) {
      if (animalList[i].getType() == ID)
        found = true;
      i++;
    }
    return found;
  }
}
