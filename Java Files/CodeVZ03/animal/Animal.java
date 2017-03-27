package animal;

/**
 * @author Adrian Mulyana / 13515075
 *         Class animal, melakukan pembuatan pada animal
 */
public class Animal {
  private boolean[] habitat;
  private int type;
  private int loc_x;
  private int loc_y;
  private int weight;
  private int food_weight;
  private int food_type;
  private char code;
  private String sound;
  private int[] enemy_id;
  private int c_enemy;
  /**
   * Konstruktor animal dengan type = id.
   *
   * @param id Tipe animal
   */
  public Animal(int id) {
    loc_x = -99;
    loc_y = -99;
    enemy_id = new int[99];
    c_enemy = 0;
    habitat = new boolean[]{false, false, false};
    if (id == 1) {
      type = 1;
      sound = "Kraoooo";
      weight = 5;
      food_weight = 1;
      food_type = 2;
      code = '!';
      habitat[1] = true;
      c_enemy = 0;
    }
    else if (id == 2) {
      type = 2;
      sound = "HootHoot";
      weight = 1;
      food_weight = 1;
      food_type = 2;
      code = '@';
      habitat[1] = true;
      c_enemy = 0;
    }
    else if (id == 3) {
      type = 3;
      sound = "Coo Coo";
      weight = 1;
      food_weight = 1;
      food_type = 1;
      code = '#';
      habitat[1] = true;
      c_enemy = 0;
    }
    else if (id == 4) {
      type = 4;
      sound = "Kweee";
      weight = 1;
      food_weight = 1;
      food_type = 1;
      code = '$';
      habitat[1] = true;
      c_enemy = 0;
    }
    else if (id == 5) {
      type = 5;
      sound = "shriekkkkkk";
      weight = 1;
      food_weight = 1;
      food_type = 1;
      code = '%';
      habitat[1] = true;
      c_enemy = 2;
      enemy_id = new int[c_enemy];
      enemy_id[0] = 2;
      enemy_id[1] = 4;
    }
    else if (id == 6) {
      type = 6;
      sound = "Squawk!";
      weight = 2;
      food_weight = 1;
      food_type = 2;
      code = '^';
      habitat[1] = true;
      c_enemy = 0;
    }
    else if (id == 7) {
      type = 7;
      sound = "*flies away*";
      weight = 1;
      food_weight = 1;
      food_type = 1;
      code = '&';
      habitat[1] = true;
      c_enemy = 0;
    }
    else if (id == 8) {
      type = 8;
      sound = "Cock-a-doodle-doo!";
      weight = 2;
      food_weight = 1;
      food_type = 3;
      code = '*';
      habitat[0] = true;
      c_enemy = 0;
    }
    else if (id == 9) {
      type = 9;
      sound = "Meow";
      weight = 4;
      food_weight = 1;
      food_type = 2;
      code = '-';
      habitat[0] = true;
      c_enemy = 0;
    }
    else if (id == 10) {
      type = 10;
      sound = "Mooo...";
      weight = 1000;
      food_weight = 2;
      food_type = 1;
      code = '+';
      habitat[0] = true;
      c_enemy = 0;
    }
    else if (id == 11) {
      type = 11;
      sound = "Squeak-squeak";
      weight = 2;
      food_weight = 1;
      food_type = 1;
      code = '~';
      habitat[0] = true;
      c_enemy = 1;
      enemy_id = new int[c_enemy];
      enemy_id[0] = 9;
    }
    else if (id == 12) {
      type = 12;
      sound = "Beeeeeek";
      weight = 100;
      food_weight = 2;
      food_type = 1;
      code = '"';
      habitat[0] = true;
      c_enemy = 0;
    }
    else if (id == 13) {
      type = 13;
      sound = "Neiigh!";
      weight = 500;
      food_weight = 2;
      food_type = 1;
      code = '[';
      habitat[0] = true;
      c_enemy = 0;
    }
    else if (id == 14) {
      type = 14;
      sound = "Hsssss...";
      weight = 10;
      food_weight = 1;
      food_type = 2;
      code = ']';
      habitat[0] = true;
      c_enemy = 0;
    }
    else if (id == 15) {
      type = 15;
      sound = "Baaaaaaaaaa";
      weight = 1;
      food_weight = 1;
      food_type = 1;
      code = '{';
      habitat[0] = true;
      c_enemy = 0;
    }
    else if (id == 16) {
      type = 16;
      sound = "Scrook...";
      weight = 1;
      food_weight = 1;
      food_type = 2;
      code = '}';
      habitat[0] = true;
      c_enemy = 0;
    }
    else if (id == 17) {
      type = 17;
      sound = "blub blub";
      weight = 1;
      food_weight = 1;
      food_type = 2;
      code = ':';
      habitat[2] = true;
      c_enemy = 2;
      enemy_id = new int[c_enemy];
      enemy_id[0] = 19;
      enemy_id[1] = 21;
    }
    else if (id == 18) {
      type = 18;
      sound = "wooooooooooooo";
      weight = 1;
      food_weight = 1;
      food_type = 2;
      code = '<';
      habitat[2] = true;
      c_enemy = 0;
    }
    else if (id == 19) {
      type = 19;
      sound = "sluhb..sluhb..";
      weight = 300;
      food_weight = 2;
      food_type = 2;
      code = '>';
      habitat[2] = true;
      c_enemy = 0;
    }
    else if (id == 20) {
      type = 20;
      sound = "*glub glub*";
      weight = 1;
      food_weight = 1;
      food_type = 2;
      code = '/';
      habitat[2] = true;
      c_enemy = 0;
    }
    else if (id == 21) {
      type = 21;
      sound = "swoosh";
      weight = 100;
      food_weight = 1;
      food_type = 2;
      code = '=';
      habitat[2] = true;
      c_enemy = 0;
    }
    else if (id == 22) {
      type = 22;
      sound = "Bawrk Bawrk!";
      code = ';';
      habitat[2] = true;
      weight = 25;
      food_weight = 1;
      food_type = 2;
      code = '/';
      habitat[2] = true;
      c_enemy = 0;
    }
    else if (id == 23) {
      type = 23;
      sound = "*swims slowly*";
      weight = 1;
      food_weight = 1;
      food_type = 1;
      code = '0';
      habitat[2] = true;
      c_enemy = 0;
    }
    else if (id == 24) {
      type = 24;
      sound = "Waaaah";
      weight = 5;
      food_weight = 1;
      food_type = 2;
      code = 'v'; //diganti sementara karena gabisa dicompile di java
      habitat[0] = true;
      habitat[2] = true;
      c_enemy = 0;
    }
  }
  /**
   * Menuliskan interaksi dengan hewan ke layar.
   */
  public void Interact() {
    System.out.println(sound);
  }
  /**
   * Menghitung jumlah makanan yang dibutuhkan hewan setiap harinya.
   *
   * @return Jumlah makanan yang dibutuhkan hewan setiap harinya.
   */
  public int GetFoodQuantity() {
    return (food_weight * weight);
  }
  /**
   * Mengembalikan jenis makanan yang dibutuhkan hewan.
   *
   * @return Kode makanan yang dibutuhkan hewan, 1 untuk herbivora, 2 untuk karnivora dan 3 untuk omnivora.
   */
  public int GetFoodType() {
    return food_type;
  }
  /**
   * Mengembalikan posisi absis hewan.
   *
   * @return Posisi absis hewan.
   */
  public int GetLocationX() {
    return loc_x;
  }
  /**
   * Mengembalikan posisi ordinat hewan.
   *
   * @return Posisi ordinat hewan.
   */
  public int GetLocationY() {
    return loc_y;
  }
  /**
   * Mengatur nilai X hewan
   *
   * @param x lokasi X hewan
   */
  public void SetLocationX(int x) {
    loc_x = x;
  }
  /**
   * Mengatur nilai y hewan
   *
   * @param y lokasi Y hewan
   */
  public void SetLocationY(int y) {

    loc_y = y;

  }
  /**
   * Mengembalikan nilai type hewan.
   *
   * @return Nilai type hewan.
   */
  public int GetType() {
    return type;
  }
  /**
   * Mengembalikan nilai habitat hewan.
   *
   * @return habitat yang dapat ditinggali hewan
   */
  public boolean[] GetHabitat() {
    return habitat;
  }
  /**
   * Memindahkan hewan sejauh x, y
   */
  public void Move(int x, int y) {
    loc_x += x;
    loc_y += y;
  }
  /**
   * Melakukan pencetakan terhadap code
   */
  public void Render() {
    System.out.print(code);
  }
  /**
   * Mengambil jumlah musuh hewan
   */
  public int GetCEnemy() {
    return c_enemy;
  }
  /**
   * Mengambil list musuh hewan
   */
  public int[] GetEnemyList() {
    return enemy_id;
  }
}