/**
 * @author Vincent Hendryanto H/13515089
 * Class Cat, mengatur konstruksi Cat
 */

package animal.landanimal.cat;
import animal.landanimal.LandAnimal;

class Cat extends LandAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  Cat() {
    weight = 4;
    food_weight = 1;
    food_type = 2;
    type = 9;
    c_enemy = 0;
    sound = "Meow";
    code = "-";
  }
}


