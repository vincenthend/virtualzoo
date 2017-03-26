	/*
	* @author Vincent Hendryanto H/13515089
	* Class Cow, mengatur konstruksi Cow
	*/
	
package animal. cow;
import animal;
import animal.landanimal;

class Cow extends LandAnimal{
	/*
	* Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
	*/
	Cow() {
		weight = 1000;
		food_weight = 2;
		food_type = 1;
		type = 10;
		c_enemy = 0;
		sound = "Mooo...";
		code = "+";
	}
}


