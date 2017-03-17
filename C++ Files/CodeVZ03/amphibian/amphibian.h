#include "../air_animal/air_animal.h"
#include "../land_animal/land_animal.h"
#include "../water_animal/water_animal.h"

#ifndef AMPHIBIAN_H
#define AMPHIBIAN_H
/** @class airAnimal
  * Kelas airAnimal 
  */
class Penguin : public WaterAnimal, public LandAnimal {
public:
  Penguin();
  void Interact();
  void Render();
};
#endif
