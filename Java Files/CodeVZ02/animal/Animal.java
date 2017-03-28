package animal;

/**
 * Class animal, melakukan pembuatan pada animal.
 * @author Adrian Mulyana / 13515075
 */
public class Animal {

  private boolean[] habitat;
  private int type;
  private int locX;
  private int locY;
  private int weight;
  private int foodWeight;
  private int foodType;
  private char code;
  private String sound;
  private int[] enemyId;
  private int numEnemy;

  /**
   * Konstruktor animal dengan type = id.
   *
   * @param id Tipe animal
   */
  public Animal(int id) {
    locX = -99;
    locY = -99;
    enemyId = new int[99];
    numEnemy = 0;
    habitat = new boolean[]{false, false, false};
    if (id == 1) {
      type = 1;
      sound = "Kraoooo";
      weight = 5;
      foodWeight = 1;
      foodType = 2;
      code = '!';
      habitat[1] = true;
      numEnemy = 0;
    } else if (id == 2) {
      type = 2;
      sound = "HootHoot";
      weight = 1;
      foodWeight = 1;
      foodType = 2;
      code = '@';
      habitat[1] = true;
      numEnemy = 0;
    } else if (id == 3) {
      type = 3;
      sound = "Coo Coo";
      weight = 1;
      foodWeight = 1;
      foodType = 1;
      code = '#';
      habitat[1] = true;
      numEnemy = 0;
    } else if (id == 4) {
      type = 4;
      sound = "Kweee";
      weight = 1;
      foodWeight = 1;
      foodType = 1;
      code = '$';
      habitat[1] = true;
      numEnemy = 0;
    } else if (id == 5) {
      type = 5;
      sound = "shriekkkkkk";
      weight = 1;
      foodWeight = 1;
      foodType = 1;
      code = '%';
      habitat[1] = true;
      numEnemy = 2;
      enemyId = new int[numEnemy];
      enemyId[0] = 2;
      enemyId[1] = 4;
    } else if (id == 6) {
      type = 6;
      sound = "Squawk!";
      weight = 2;
      foodWeight = 1;
      foodType = 2;
      code = '^';
      habitat[1] = true;
      numEnemy = 0;
    } else if (id == 7) {
      type = 7;
      sound = "*flies away*";
      weight = 1;
      foodWeight = 1;
      foodType = 1;
      code = '&';
      habitat[1] = true;
      numEnemy = 0;
    } else if (id == 8) {
      type = 8;
      sound = "Cock-a-doodle-doo!";
      weight = 2;
      foodWeight = 1;
      foodType = 3;
      code = '*';
      habitat[0] = true;
      numEnemy = 0;
    } else if (id == 9) {
      type = 9;
      sound = "Meow";
      weight = 4;
      foodWeight = 1;
      foodType = 2;
      code = '-';
      habitat[0] = true;
      numEnemy = 0;
    } else if (id == 10) {
      type = 10;
      sound = "Mooo...";
      weight = 1000;
      foodWeight = 2;
      foodType = 1;
      code = '+';
      habitat[0] = true;
      numEnemy = 0;
    } else if (id == 11) {
      type = 11;
      sound = "Squeak-squeak";
      weight = 2;
      foodWeight = 1;
      foodType = 1;
      code = '~';
      habitat[0] = true;
      numEnemy = 1;
      enemyId = new int[numEnemy];
      enemyId[0] = 9;
    } else if (id == 12) {
      type = 12;
      sound = "Beeeeeek";
      weight = 100;
      foodWeight = 2;
      foodType = 1;
      code = '"';
      habitat[0] = true;
      numEnemy = 0;
    } else if (id == 13) {
      type = 13;
      sound = "Neiigh!";
      weight = 500;
      foodWeight = 2;
      foodType = 1;
      code = '[';
      habitat[0] = true;
      numEnemy = 0;
    } else if (id == 14) {
      type = 14;
      sound = "Hsssss...";
      weight = 10;
      foodWeight = 1;
      foodType = 2;
      code = ']';
      habitat[0] = true;
      numEnemy = 0;
    } else if (id == 15) {
      type = 15;
      sound = "Baaaaaaaaaa";
      weight = 1;
      foodWeight = 1;
      foodType = 1;
      code = '{';
      habitat[0] = true;
      numEnemy = 0;
    } else if (id == 16) {
      type = 16;
      sound = "Scrook...";
      weight = 1;
      foodWeight = 1;
      foodType = 2;
      code = '}';
      habitat[0] = true;
      numEnemy = 0;
    } else if (id == 17) {
      type = 17;
      sound = "blub blub";
      weight = 1;
      foodWeight = 1;
      foodType = 2;
      code = ':';
      habitat[2] = true;
      numEnemy = 2;
      enemyId = new int[numEnemy];
      enemyId[0] = 19;
      enemyId[1] = 21;
    } else if (id == 18) {
      type = 18;
      sound = "wooooooooooooo";
      weight = 1;
      foodWeight = 1;
      foodType = 2;
      code = '<';
      habitat[2] = true;
      numEnemy = 0;
    } else if (id == 19) {
      type = 19;
      sound = "sluhb..sluhb..";
      weight = 300;
      foodWeight = 2;
      foodType = 2;
      code = '>';
      habitat[2] = true;
      numEnemy = 0;
    } else if (id == 20) {
      type = 20;
      sound = "*glub glub*";
      weight = 1;
      foodWeight = 1;
      foodType = 2;
      code = '/';
      habitat[2] = true;
      numEnemy = 0;
    } else if (id == 21) {
      type = 21;
      sound = "swoosh";
      weight = 100;
      foodWeight = 1;
      foodType = 2;
      code = '=';
      habitat[2] = true;
      numEnemy = 0;
    } else if (id == 22) {
      type = 22;
      sound = "Bawrk Bawrk!";
      code = ';';
      habitat[2] = true;
      weight = 25;
      foodWeight = 1;
      foodType = 2;
      code = '/';
      habitat[2] = true;
      numEnemy = 0;
    } else if (id == 23) {
      type = 23;
      sound = "*swims slowly*";
      weight = 1;
      foodWeight = 1;
      foodType = 1;
      code = '0';
      habitat[2] = true;
      numEnemy = 0;
    } else if (id == 24) {
      type = 24;
      sound = "Waaaah";
      weight = 5;
      foodWeight = 1;
      foodType = 2;
      code = 'v'; //diganti sementara karena gabisa dicompile di java
      habitat[0] = true;
      habitat[2] = true;
      numEnemy = 0;
    }
  }

  /**
   * Menuliskan interaksi dengan hewan ke layar.
   */
  public void interact() {
    System.out.println(sound);
  }

  /**
   * Menghitung jumlah makanan yang dibutuhkan hewan setiap harinya.
   *
   * @return Jumlah makanan yang dibutuhkan hewan setiap harinya.
   */
  public int getFoodQuantity() {
    return (foodWeight * weight);
  }

  /**
   * Mengembalikan jenis makanan yang dibutuhkan hewan.
   *
   * @return Kode makanan yang dibutuhkan hewan, 1 untuk herbivora, 2 untuk karnivora dan 3 untuk
   *         omnivora.
   */
  public int getFoodType() {
    return foodType;
  }

  /**
   * Mengembalikan posisi absis hewan.
   *
   * @return Posisi absis hewan.
   */
  public int getLocationX() {
    return locX;
  }

  /**
   * Mengatur nilai X hewan.
   *
   * @param x lokasi X hewan
   */
  public void setLocationX(int x) {
    locX = x;
  }

  /**
   * Mengembalikan posisi ordinat hewan.
   *
   * @return Posisi ordinat hewan.
   */
  public int getLocationY() {
    return locY;
  }

  /**
   * Mengatur nilai y hewan.
   *
   * @param y lokasi Y hewan
   */
  public void setLocationY(int y) {
    locY = y;
  }

  /**
   * Mengembalikan nilai type hewan.
   *
   * @return Nilai type hewan.
   */
  public int getType() {
    return type;
  }

  /**
   * Mengembalikan nilai habitat hewan.
   *
   * @return habitat yang dapat ditinggali hewan
   */
  public boolean[] getHabitat() {
    return habitat;
  }

  /**
   * Memindahkan hewan sejauh x, y.
   *
   * @param x Jarak absis
   * @param y Jarak ordinat
   */
  public void move(int x, int y) {
    locX += x;
    locY += y;
  }

  /**
   * Melakukan pencetakan terhadap code.
   */
  public void render() {
    System.out.print(code);
  }

  /**
   * Mengambil jumlah musuh hewan.
   *
   * @return Jumlah musuh hewan
   */
  public int getCEnemy() {
    return numEnemy;
  }

  /**
   * Mengambil list musuh hewan.
   *
   * @return List musuh hewan
   */
  public int[] getEnemyList() {
    return enemyId;
  }
}