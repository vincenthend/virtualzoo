	/*
	* @author Vincent Hendryanto H/13515089
	* Class Squid, mengatur konstruksi Squid
	*/
	
package animal. squid;
import animal;
import animal.wateranimal;

class Squid extends WaterAnimal{
	/*
	* Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
	*/
	Squid() {
		weight = 300;
		food_weight = 2;
		food_type = 2;
		type = 19;
		c_enemy = 0;
		sound = "sluhb..sluhb..";
		code = ">";
	}
}


