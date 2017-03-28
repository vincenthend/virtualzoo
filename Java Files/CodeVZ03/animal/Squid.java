package animal;
/**
 * @author Vincent Hendryanto H/13515089
 *         Class Squid, mengatur konstruksi Squid
 */
public class Squid extends WaterAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Squid() {
    super();
    weight = 300;
    foodWeight = 2;
    foodType = 2;
    type = 19;
    cEnemy = 0;
    sound = "sluhb..sluhb..";
    code = '>';
  }
}


