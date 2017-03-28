package animal;

/**
 * Class Goldfish, mengatur konstruksi Goldfish.
 * @author Vincent Hendryanto H/13515089
 */
public class Goldfish extends WaterAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Goldfish() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 2;
    type = 20;
    countEnemy = 0;
    sound = "*glub glub*";
    code = '/';
  }
}


