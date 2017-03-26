	/*
	* @author Vincent Hendryanto H/13515089
	* Class Llama, mengatur konstruksi Llama
	*/
	
package animal. llama;
import animal;
import animal.landanimal;

class Llama extends LandAnimal{
	/*
	* Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
	*/
	Llama() {
		weight = 500;
		food_weight = 2;
		food_type = 1;
		type = 13;
		c_enemy = 0;
		sound = "Neiigh!";
		code = "[";
	}
}


