package animal;

/**
 * Class Snake, mengatur konstruksi Snake.
 *
 * @author Vincent Hendryanto H/13515089
 */
public class Snake extends LandAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Snake() {
    super();
    weight = 10;
    foodWeight = 1;
    foodType = 2;
    type = 14;
    countEnemy = 0;
    sound = "Hsssss...";
    code = ']';
  }
}


