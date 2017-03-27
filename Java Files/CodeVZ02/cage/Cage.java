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
  private int cage_id;
  private int n_animal;
  private int n_cell;
  private int cage_type;
  private Animal[] a;
  private Cell[] c;
  /**
   * Inisialisasi cage dengan n_animal 0 dan n_cell 0
   * membuat array a dan c sebanyak 999 buah
   */
  public Cage() {
    n_animal = 0;
    n_cell = 0;
    a = new Animal[999];
    c = new Cell[999];
    cage_id = -1;
    cage_type = 0;
  }
  /**
   * @return true jika penuh dan false jika belum penuh
   * Mengembalikan kondisi penuh cage
   */
  public boolean IsFull() {
    return (n_animal >= ((n_cell / 10) * 3));
  }
  /**
   * Menambahkan habitat ke dalam cage
   */
  public void AddHabitat(Cell H) {
    if (n_cell == 0) {
      cage_type = H.GetCellID();
      c[n_cell] = H;
      n_cell += 1;
      H.SetCageID(cage_id);
    }
    else {
      if (cage_type == H.GetCellID()) {
        c[n_cell] = H;
        n_cell += 1;
        H.SetCageID(cage_id);
      }
    }
  }
  /**
   * Menambahkan animal ke dalam cage
   */
  public void AddAnimal(Animal A) {
    A.SetLocationX(c[n_animal].GetLocationX());
    A.SetLocationY(c[n_animal].GetLocationY());
    a[n_animal] = A;
    n_animal += 1;
  }
  /**
   * @param n Nilai untuk cage_id
   *          cage_id diubah menjadi n
   */
  public void SetCageID(int n) {
    cage_id = n;
  }
  /**
   * @return nilai cage_id
   * Mengembalikan nilai cage_id
   */
  public int GetCageID() {
    return cage_id;
  }
  /**
   * @return nilai cage_type
   * Mengembalikan nilai cage_type
   */
  public int GetCageType() {
    return cage_type;
  }
  /**
   * @return pointer menuju animal
   * Mengembalikan nilai alamat animal apakah x dan y dipakai, jika tidak maka null
   */
  public Animal IsSpaceOccupied(int x, int y) {
    Animal ret;
    int i = 0;
    ret = null;
    while (ret == null && i < n_animal)
      if (a[i].GetLocationX() == x && a[i].GetLocationY() == y)
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
    for (i = 0; i < n_animal; i++) {
      if (a[i].GetFoodType() == 1)
        sum += a[i].GetFoodQuantity();
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
    for (i = 0; i < n_animal; i++) {
      if (a[i].GetFoodType() == 2)
        sum += a[i].GetFoodQuantity();
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
    for (i = 0; i < n_animal; i++) {
      if (a[i].GetFoodType() == 3)
        sum += a[i].GetFoodQuantity();
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
    while (i < n_animal) {
      if (a[i].GetType() == ID)
        found = true;
      i++;
    }
    return found;
  }
}
