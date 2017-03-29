package animal;

/**
 * Class Cat, mengatur konstruksi Cat.
 *
 * @author Vincent Hendryanto H/13515089
 */
public class Cat extends LandAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Cat() {
    super();
    weight = 4;
    foodWeight = 1;
    foodType = 2;
    type = 9;
    countEnemy = 0;
    sound = "Meow";
    code = '-';
  }
}


