package animal;

/**
 * Class Penguin, mengatur konstruksi Penguin.
 * @author Vincent Hendryanto H/13515089
 */
public class Penguin extends Amphibian {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Penguin() {
    super(true, false, true);
    weight = 1;
    foodWeight = 1;
    foodType = 2;
    type = 24;
    countEnemy = 0;
    sound = "*waaaah*";
    code = '|';
  }
}


