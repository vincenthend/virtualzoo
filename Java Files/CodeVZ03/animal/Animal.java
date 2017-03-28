package animal;
import renderable.Renderable;

/**
 * @author Adrian Mulyana / 13515075
 *         Class animal, melakukan pembuatan pada animal
 */
public abstract class Animal implements Renderable {
  protected boolean[] habitat;
  protected int type;
  protected int weight;
  protected int foodWeight;
  protected int foodType;
  protected char code;
  protected String sound;
  protected int[] enemyId;
  protected int cEnemy;
  private int locX;
  private int locY;
  /**
   * Konstruktor Animal
   */
  public Animal() {
    habitat = new boolean[3];
    habitat[0] = false;
    habitat[1] = false;
    habitat[2] = false;
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
   * @return Kode makanan yang dibutuhkan hewan, 1 untuk herbivora, 2 untuk karnivora dan 3 untuk omnivora.
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
   * Mengatur nilai X hewan
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
   * Mengatur nilai y hewan
   *
   * @param y lokasi Y hewan
   */
  public void setLocationY(int y) {
    locY = y;
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
   * Memindahkan hewan sejauh x, y
   */
  public void move(int x, int y) {
    locX += x;
    locY += y;
  }
  /**
   * Melakukan pencetakan terhadap code
   */
  public void render() {
    System.out.print(code);
  }
  /**
   * Mengambil jumlah musuh hewan
   */
  public int getCEnemy() {
    return cEnemy;
  }
  /**
   * Mengambil list musuh hewan
   */
  public int[] getEnemyList() {
    return enemyId;
  }
  public int getType() {
    return type;
  }
  public void setType(int type) {
    this.type = type;
  }
}