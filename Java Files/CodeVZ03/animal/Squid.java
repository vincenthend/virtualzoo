package animal;

/**
 * Class Squid, mengatur konstruksi Squid.
 * @author Vincent Hendryanto H/13515089
 */
public class Squid extends WaterAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Squid() {
    super();
    weight = 300;
    foodWeight = 2;
    foodType = 2;
    type = 19;
    countEnemy = 0;
    sound = "sluhb..sluhb..";
    code = '>';
  }
}


