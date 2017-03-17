#include "../animal/animal.h"

#ifndef AIR_ANIMAL_H
#define AIR_ANIMAL_H
/** @class airAnimal
  * Kelas airAnimal 
  */
class AirAnimal : virtual public Animal   {
  public:  
     /** @brief Konstruktor, menginisiasi.
       */
      AirAnimal();
};
class Pelican : public AirAnimal {
  public:
    Pelican();
    void Interact();
    void Render();
};
class Owl : public AirAnimal {
  public:
    Owl();
    void Interact();
    void Render();
};
class Pigeon : public AirAnimal {
  public:
    Pigeon();
    void Interact();
    void Render();
};
class Canary : public AirAnimal {
  public:
    Canary();
    void Interact();
    void Render();
};
class Bat : public AirAnimal {
  public:
    Bat();
    void Interact();
    void Render();
};
class Eagle : public AirAnimal {
  public:
    Eagle();
    void Interact();
    void Render();
};
class Toucan : public AirAnimal {
  public:
    Toucan();
    void Interact();
    void Render();
};
#endif
