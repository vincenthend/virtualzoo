package cage;

import animal.Animal;
import cell.Cell;

/**
 *  Class cage, melakukan konstruksi dan penambahan animal dalam
 *         cage dan mengatur habitat dalam cage.
 * @author Alif Ijlal Wafi / 13515122
 */
public class Cage {

  private int cageId;
  private int numAnimal;
  private int numCell;
  private int cageType;
  private Animal[] animalList;
  private Cell[] cellList;

  /**
   * Inisialisasi cage dengan numAnimal 0 dan numCell 0
   * membuat array animalList dan cellList sebanyak 999 buah.
   */
  public Cage() {
    numAnimal = 0;
    numCell = 0;
    animalList = new Animal[999];
    cellList = new Cell[999];
    cageId = -1;
    cageType = 0;
  }

  /**
   * Mengembalikan kondisi penuh cage jika ditambahkan 1 ekor binatang.
   *
   * @return true jika penuh dan false jika belum penuh
   */
  public boolean isFull() {
    return (numAnimal + 1 > ((numCell / 10) * 3));
  }

  /**
   * Menambahkan habitat ke dalam cage
   * I. S.: H terdefinisi, merupakan habitat yang valid
   * F. S.: Jumlah habitat dalam cage bertambah 1, habitat dimasukkan ke cage
   *
   * @param h Habitat yang akan dimasukkan
   */
  public void addHabitat(Cell h) {
    if (numCell == 0) {
      cageType = h.getCellId();
      cellList[numCell] = h;
      numCell += 1;
      h.setCageId(cageId);
    } else {
      if (cageType == h.getCellId()) {
        cellList[numCell] = h;
        numCell += 1;
        h.setCageId(cageId);
      }
    }
  }

  /**
   * Menambahkan animal ke dalam cage
   * I. S.: A terdefinisi, merupakan animal yang valid, cage tidak penuh
   * F. S.: Jumlah animal dalam cage bertambah 1, animal dimasukkan ke habitat yang ada di cage
   *
   * @param a Animal yang akan dimasukkan
   */
  public void addAnimal(Animal a) {
    a.setLocationX(cellList[numAnimal].getLocationX());
    a.setLocationY(cellList[numAnimal].getLocationY());
    animalList[numAnimal] = a;
    numAnimal += 1;
  }

  /**
   * Mengembalikan nilai cageId.
   *
   * @return nilai cageId
   */
  public int getCageId() {
    return cageId;
  }

  /**
   * Mengubah cageId menjadi n
   * I. S.: n terdefinisi
   * F. S.: cageId diubah menjadi n
   *
   * @param n Nilai untuk cageId
   */
  public void setCageId(int n) {
    cageId = n;
  }

  /**
   * Mengembalikan nilai cageType.
   *
   * @return nilai cageType
   */
  public int getCageType() {
    return cageType;
  }

  /**
   * Mengembalikan nilai alamat animal apakah x dan y dipakai, jika tidak maka null.
   *
   * @param x Posisi absis Cell yang akan dicek
   * @param y Posisi ordinat Cell yang akan dicek
   * @return pointer menuju animal
   */
  public Animal isSpaceOccupied(int x, int y) {
    Animal returnValue = null;
    int i = 0;
    while (returnValue == null && i < numAnimal) {
      if (animalList[i].getLocationX() == x && animalList[i].getLocationY() == y) {
        returnValue = animalList[i];
      } else {
        i += 1;
      }
    }
    return returnValue;
  }

  /**
   * Menghitung total jumlah makanan herbivore.
   *
   * @return nilai total makanan herbivore
   */
  public int countFoodHerbivore() {
    int i;
    int sum = 0;
    for (i = 0; i < numAnimal; i++) {
      if (animalList[i].getFoodType() == 1) {
        sum += animalList[i].getFoodQuantity();
      }
    }
    return sum;
  }

  /**
   * Menghitung total jumlah makanan carnivore.
   *
   * @return nilai total makanan carnivore
   */
  public int countFoodCarnivore() {
    int i;
    int sum = 0;
    for (i = 0; i < numAnimal; i++) {
      if (animalList[i].getFoodType() == 2) {
        sum += animalList[i].getFoodQuantity();
      }
    }
    return sum;
  }

  /**
   * Menghitung total jumlah makanan omnivore.
   *
   * @return nilai total makanan omnivore
   */
  public int countFoodOmnivore() {
    int i;
    int sum = 0;
    for (i = 0; i < numAnimal; i++) {
      if (animalList[i].getFoodType() == 3) {
        sum += animalList[i].getFoodQuantity();
      }
    }
    return sum;
  }

  /**
   * Mengembalikan keberadaan animal dengan type = Id.
   *
   * @param id Id Animal yang akan dicari
   * @return true jika ada dan false jika tidak ada
   */
  public boolean isExist(int id) {
    boolean found = false;
    int i = 0;
    while (i < numAnimal) {
      if (animalList[i].getType() == id) {
        found = true;
      }
      i++;
    }
    return found;
  }
}
