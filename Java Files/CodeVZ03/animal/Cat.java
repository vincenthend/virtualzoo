/**
 * @author Vincent Hendryanto H/13515089
 * Class Cat, mengatur konstruksi Cat
 */
package animal;
public class Cat extends LandAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public Cat() {
    super();
    weight = 4;
    foodWeight = 1;
    foodType = 2;
    type = 9;
    cEnemy = 0;
    sound = "Meow";
    code = '-';
  }
}


