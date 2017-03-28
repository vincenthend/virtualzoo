/**
 * @author Vincent Hendryanto H/13515089
 * Class Llama, mengatur konstruksi Llama
 */
package animal;
public class Llama extends LandAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Llama() {
    super();
    weight = 500;
    foodWeight = 2;
    foodType = 1;
    type = 13;
    cEnemy = 0;
    sound = "Neiigh!";
    code = '[';
  }
}


