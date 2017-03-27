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
  private char borderCode = '|';
  private char nullCode = '?';
  private char positionCode = 'X';
  private char newLine = '\n';
  /**
   * Membuat Zoo dengan width 21 dan height 21
   */
  Zoo() {
    n_cage = 0;
    width = 21;
    height = 21;
    c = new Cell[width][height];
    cg = new Cage[width * height];
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
    cg = new Cage[width * height];
  }
  /**
   * Melakukan penambahan cage,
   */
  public void AddCage() {
    int i, j;
    for (i = 0; i < height; i++) {
      for (j = 0; j < width; j++) {
        if ((c[i][j].GetCageID() == -1) && c[i][j].IsHabitat()) {
          InitCage(i, j);
        }
      }
    }
  }
  /** <TBD></TBD>
   *
   */
  public void InitCage(int x, int y) {
    AddToCage(x, y);
    n_cage++;
  }
  /** <TBD></TBD>
   *
   */
  public void AddToCage(int x, int y) {
    cg[n_cage].AddHabitat(c[x][y]);
    if (IsInRange(x - 1, y)) {
      if (c[x][y].GetCellID() == c[x - 1][y].GetCellID()) {
        AddToCage(x - 1, y);
      }
    }
    if (IsInRange(x + 1, y)) {
      if (c[x][y].GetCellID() == c[x + 1][y].GetCellID()) {
        AddToCage(x + 1, y);
      }
    }
    if (IsInRange(x, y - 1)) {
      if (c[x][y].GetCellID() == c[x][y - 1].GetCellID()) {
        AddToCage(x, y - 1);
      }
    }
    if (IsInRange(x, y + 1)) {
      if (c[x][y].GetCellID() == c[x][y + 1].GetCellID()) {
        AddToCage(x, y + 1);
      }
    }
  }
  /** <TBD></TBD>
   *
   */
  public boolean IsInRange(int x, int y) {
    return (x >= 0 && x < height && y >= 0 && y < width);
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
  public void PrintZoo(int x, int y) {
    int i, j;
    Cell c;
    Animal a;
    for (i = 0; i < GetWidth(); i++) {
      System.out.print(borderCode);
      for (j = 0; j < GetHeight(); j++) {
        if (x == j && y == i) {
          System.out.print(positionCode);
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
            System.out.print(nullCode);
          }
        }
        System.out.print(borderCode);
      }
      System.out.println(newLine);
    }
  }
  public void PrintZoo(int x1, int x2, int y1, int y2) {
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
          System.out.print(nullCode);
        }
        System.out.print(borderCode);
      }
      System.out.print(newLine);
    }
  }
}
