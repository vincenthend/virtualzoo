	/*
	* @author Vincent Hendryanto H/13515089
	* Class Sheep, mengatur konstruksi Sheep
	*/
	
package animal. sheep;
import animal;
import animal.landanimal;

class Sheep extends LandAnimal{
	/*
	* Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
	*/
	Sheep() {
		weight = 1;
		food_weight = 1;
		food_type = 1;
		type = 15;
		c_enemy = 0;
		sound = "Baaaaaaaaaa";
		code = "{";
	}
}


