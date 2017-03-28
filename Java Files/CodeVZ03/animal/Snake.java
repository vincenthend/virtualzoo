package animal;
/**
 * @author Vincent Hendryanto H/13515089
 *         Class Snake, mengatur konstruksi Snake
 */
public class Snake extends LandAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Snake() {
    super();
    weight = 10;
    foodWeight = 1;
    foodType = 2;
    type = 14;
    cEnemy = 0;
    sound = "Hsssss...";
    code = ']';
  }
}


