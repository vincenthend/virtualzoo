package animal;
/**
 * @author Vincent Hendryanto H/13515089
 *         Class Sheep, mengatur konstruksi Sheep
 */
public class Sheep extends LandAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Sheep() {
    super();
    weight = 1;
    foodWeight = 1;
    foodType = 1;
    type = 15;
    cEnemy = 0;
    sound = "Baaaaaaaaaa";
    code = '{';
  }
}


