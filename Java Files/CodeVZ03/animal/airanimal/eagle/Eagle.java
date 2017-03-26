	/*
	* @author Vincent Hendryanto H/13515089
	* Class Eagle, mengatur konstruksi Eagle
	*/
	
package animal. eagle;
import animal;
import animal.airanimal;

class Eagle extends AirAnimal{
	/*
	* Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
	*/
	Eagle() {
		weight = 2;
		food_weight = 1;
		food_type = 2;
		type = 6;
		c_enemy = 0;
		sound = "Squawk!";
		code = "^";
	}
}


