/**
 * @author Vincent Hendryanto H/13515089
 * Class Pelican, mengatur konstruksi Pelican
 */

package animal.airanimal.pelican;
import animal.airanimal.AirAnimal;

class Pelican extends AirAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  Pelican() {
    weight = 5;
    food_weight = 1;
    food_type = 2;
    type = 1;
    c_enemy = 0;
    sound = "Kraoooo";
    code = "!";
  }
}


