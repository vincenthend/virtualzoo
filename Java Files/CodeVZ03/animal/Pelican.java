package animal;

/**
 * Class Pelican, mengatur konstruksi Pelican.
 * @author Vincent Hendryanto H/13515089
 */
public class Pelican extends AirAnimal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public Pelican() {
    super();
    weight = 5;
    foodWeight = 1;
    foodType = 2;
    type = 1;
    countEnemy = 0;
    sound = "Kraoooo";
    code = '!';
  }
}


