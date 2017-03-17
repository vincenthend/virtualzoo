#include <iostream>
#include "../cell/cell.h"

using namespace std;

#ifndef HABITAT_H
#define HABITAT_H

/**
 * @class   Habitat
 * Kelas Habitat
 *
 */
class Habitat: public Cell{
  
  public:
  /** @brief Mengubah nilai cageID menjadi n
  */
  void SetCageID(int n);

  /** @brief Mengembalikan nilai cageID
  */
  int GetCageID();
};

/**
 * @class   landHabitat
 * Kelas landHabitat, cellID bernilai 11
 *
 */
class LandHabitat: public Habitat{
  public:
    //ctor, dtor, cctor
    /** @brief Membuat landHabitat dengan X dan Y 0 dan cellID 11
       */
    LandHabitat();
    
    /** @brief Membuat landHabitat dengan X dan Y terdefinisi dan cellID 11
       */
    LandHabitat(int x, int y);
  private:
    const char default_code = 'L';
  
};

/**
 * @class   WaterHabitat
 * Kelas WaterHabitat, cellID bernilai 13
 *
 */
class WaterHabitat: public Habitat{
  public:
    //ctor, dtor, cctor
    /** @brief Membuat waterHabitat dengan X dan Y 0 dan cellID 11
    */
    WaterHabitat();
  
    /** @brief Membuat waterHabitat dengan X dan Y terdefinisi dan cellID 11
    */
    WaterHabitat(int x, int y);
  private:
    const char default_code = 'W';

};


/**
* @class   airHabitat
* Kelas airHabitat, cellID bernilai 12
*
*/
class AirHabitat : public Habitat {
  public:
    //ctor, dtor, cctor
    /** @brief Membuat airHabitat dengan X dan Y 0 dan cellID 12
    */
    AirHabitat();
  
    /** @brief Membuat airHabitat dengan X dan Y terdefinisi dan cellID 12
    */
    AirHabitat(int x, int y);

    void Render();

  private:
    const char default_code = 'A';

};

#endif
