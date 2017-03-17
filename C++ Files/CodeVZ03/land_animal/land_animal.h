#include "../animal/animal.h"

#ifndef LAND_ANIMAL_H
#define LAND_ANIMAL_H
/** @class landAnimal
  * Kelas landAnimal 
  */
class LandAnimal : virtual public Animal {
  public:  
     /** @brief Konstruktor, menginisiasi.
       */
      LandAnimal();
};
class Chicken : public LandAnimal {
  public:
    Chicken();
    void Interact();
    void Render();
};
class Cat : public LandAnimal {
  public:
    Cat();
    void Interact();
    void Render();
};
class Cow : public LandAnimal {
  public:
    Cow();
    void Interact();
    void Render();
};
class Mouse : public LandAnimal {
  public:
    Mouse();
    void Interact();
    void Render();
};
class Goat : public LandAnimal {
  public:
    Goat();
    void Interact();
    void Render();
};
class Llama : public LandAnimal {
  public:
    Llama();
    void Interact();
    void Render();
};
class Snake : public LandAnimal {
  public:
    Snake();
    void Interact();
    void Render();
};
class Sheep : public LandAnimal {
  public:
    Sheep();
    void Interact();
    void Render();
};
class Chameleon : public LandAnimal {
  public:
    Chameleon();
    void Interact();
    void Render();
};
#endif
