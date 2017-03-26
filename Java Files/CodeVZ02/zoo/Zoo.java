/**
 * @author Alif Ijlal W / 13515122
 *         Class Zoo, mengatur konstruksi zoo dan penambahan animal/cage
 */
class Zoo {
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
  Zoo(int w, int h) {
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
  public void PrintZoo(int x, int y) {//lebih pas dipindah ke zoo
    int i, j;
    Cell c;
    Animal a;
    for (i = 0; i < GetWidth(); i++) {
      System.out.print("|");
      for (j = 0; j < GetHeight(); j++) {
        if (x == j && y == i) {
          System.out.print("X");
        }
        else {
          c = this.c[i][j];
          if (c != null) {
            if (c.GetCageID() > -1) {
              a = GetCage(c.GetCageID()).IsSpaceOccupied(i, j);
              if (a != null) {
                a.Render();
              }
              else {
                c.Render();
              }
            }
            else {
              c.Render();
            }
          }
          else {
            System.out.print("?");
          }
        }
        System.out.print("|");
      }
      System.out.println("");
    }
  }
  public void PrintZoo(int x1, int x2, int y1, int y2) {//lebih pas dipindah ke zoo
    int i, j;
    Cell c;
    Animal a;
    for (i = y1; i <= y2; i++) {
      System.out.print("|");
      for (j = x1; j <= x2; j++) {
        c = this.c[i][j];
        if (c != null) {
          if (c.GetCageID() > -1) {
            a = GetCage(c.GetCageID()).IsSpaceOccupied(i, j);
            if (a != null) {
              a.Render();
            }
            else {
              c.Render();
            }
          }
          else {
            c.Render();
          }
        }
        else {
          System.out.print("?");
        }
        System.out.print("|");
      }
      System.out.println("");
    }
  }
}
