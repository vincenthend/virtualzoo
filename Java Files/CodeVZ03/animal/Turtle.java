package animal;

/**
 * Class Turtle, mengatur konstruksi Turtle.
 *
 * @author Vincent Hendryanto H/13515089
 */
public class Turtle extends WaterAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Turtle() {
    super();
    weight = 100;
    foodWeight = 1;
    foodType = 2;
    type = 21;
    countEnemy = 0;
    sound = "swoosh";
    code = '=';
  }
}


