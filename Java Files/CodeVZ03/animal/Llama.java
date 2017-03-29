package animal;

/**
 * Class Llama, mengatur konstruksi Llama.
 *
 * @author Vincent Hendryanto H/13515089
 */
public class Llama extends LandAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Llama() {
    super();
    weight = 500;
    foodWeight = 2;
    foodType = 1;
    type = 13;
    countEnemy = 0;
    sound = "Neiigh!";
    code = '[';
  }
}


