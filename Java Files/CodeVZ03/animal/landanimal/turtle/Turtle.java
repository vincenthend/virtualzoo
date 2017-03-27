/**
 * @author Vincent Hendryanto H/13515089
 * Class Turtle, mengatur konstruksi Turtle
 */

package animal.wateranimal.turtle;
import animal.wateranimal.WaterAnimal;

class Turtle extends WaterAnimal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  Turtle() {
    weight = 100;
    food_weight = 1;
    food_type = 2;
    type = 21;
    c_enemy = 0;
    sound = "swoosh";
    code = "=";
  }
}


