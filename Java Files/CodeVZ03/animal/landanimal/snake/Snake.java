	/*
	* @author Vincent Hendryanto H/13515089
	* Class Snake, mengatur konstruksi Snake
	*/
	
package animal. snake;
import animal;
import animal.landanimal;

class Snake extends LandAnimal{
	/*
	* Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
	*/
	Snake() {
		weight = 10;
		food_weight = 1;
		food_type = 2;
		type = 14;
		c_enemy = 0;
		sound = "Hsssss...";
		code = "]";
	}
}


