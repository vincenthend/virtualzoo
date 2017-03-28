package animal;
/**
 * @author Vincent Hendryanto H/13515089
 *         Class Turtle, mengatur konstruksi Turtle
 */
public class Turtle extends WaterAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Turtle() {
    super();
    weight = 100;
    foodWeight = 1;
    foodType = 2;
    type = 21;
    cEnemy = 0;
    sound = "swoosh";
    code = '=';
  }
}


