#include "../animal/animal.h"

#ifndef WATER_ANIMAL_H
#define WATER_ANIMAL_H
/** @class waterAnimal
  * Kelas waterAnimal 
  */
class WaterAnimal : virtual public Animal {
  public:  
     /** @brief Konstruktor, menginisiasi.
       */
      WaterAnimal();
};

class Salmon : public WaterAnimal {
  public:
    Salmon();
    void Interact();
    void Render();
};
class Whale : public WaterAnimal {
  public:
    Whale();
    void Interact();
    void Render();
};
class Squid : public WaterAnimal {
  public:
    Squid();
    void Interact();
    void Render();
};
class Goldfish : public WaterAnimal {
  public:
    Goldfish();
    void Interact();
    void Render();
};
class Turtle : public WaterAnimal {
  public:
    Turtle();
    void Interact();
    void Render();
};
class Seal : public WaterAnimal {
  public:
    Seal();
    void Interact();
    void Render();
};
class Dolphin : public WaterAnimal {
  public:
    Dolphin();
    void Interact();
    void Render();
};

#endif
