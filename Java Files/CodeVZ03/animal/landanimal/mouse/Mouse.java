	/*
	* @author Vincent Hendryanto H/13515089
	* Class Mouse, mengatur konstruksi Mouse
	*/
	
package animal. mouse;
import animal;
import animal.landanimal;

class Mouse extends LandAnimal{
	/*
	* Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
	*/
	Mouse() {
		weight = 2;
		food_weight = 1;
		food_type = 1;
		type = 11;
		c_enemy = 0;
		sound = "Squeak-squeak";
		code = "~";
	}
}


