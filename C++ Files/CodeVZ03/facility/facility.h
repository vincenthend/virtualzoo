#include <iostream>
#include "../cell/cell.h"

#ifndef FACILITY_H
#define FACILITY_H


/**
* @class Facility
* Kelas Road, cellID bernilai 21
* @param type
* type entrance bernilai 1, exit bernilai 2, default 0
*/
class Facility: public Cell{
};
/**
 * @class Road
 * Kelas Road, cellID bernilai 21
 */
class Road: public Facility{
  public:
    /** @brief Membuat road dengan X dan Y 0 dan cellID 21 dan tipe 0
    */
    Road();
    /** @brief Membuat road dengan X dan Y terdefinisi dan cellID 21 dan tipe 0
    * @param x Lokasi x road
    * @param y Lokasi y road
    */
    Road(int x, int y);
    /** @brief Membuat road dengan X dan Y terdefinisi dan cellID sesuai tipe
    * @param x Lokasi x road
    * @param y Lokasi y road
    * @param IsEntrance Jika true akan menghasilkan entrance (cellID = 210)
    * jika false akan menghasilkan exit (cellID = 211)
    */
    Road(int x, int y, bool IsEntrance);
  private:
    const char default_code = ' ';
};

/**
 * @class Resto
 * Kelas Resto, cellID bernilai 22
 */
class Resto: public Facility{
  public:
    /** @brief Membuat Resto dengan X dan Y 0 dan cellID 22
    */
    Resto();
    /** @brief Membuat Resto dengan X dan Y terdefinisi dan cellID 22
    * @param x Lokasi x resto
    * @param y Lokasi y resto
    */
    Resto(int x, int y);
  private:
    const char default_code = 'R';
};

/**
 * @class Park
 * Kelas Park, cellID bernilai 23
 *
 */
class Park: public Facility{
  public:
    /** @brief Membuat Park dengan X dan Y terdefinisi dan cellID 23
    */
    Park();
    /** @brief Membuat Park dengan X dan Y terdefinisi dan cellID 23
    * @param x Lokasi x park
    * @param y Lokasi y park
    */
    Park(int x, int y);
  private:
    const char default_code = 'P';
};
#endif
