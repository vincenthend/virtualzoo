#include <iostream>
#include "../animal/animal.h"

#ifndef CELL_H
#define CELL_H

/** @class   Cell
 * Kelas Cell, cell_id didefinisikan pada turunan Cell, default ID = 0
 */
class Cell {  
  public:
    /** @brief Membuat cell dengan loc_x 0, loc_y 0, cell_id 0 dan cage_id -1
    */
    Cell();
    /** @brief Membuat cell dengan loc_x = x, loc_y = y, cell_id ID dan cage_id -1
    * 11 = LandHabitat; 12 = WaterHabitat; 13 = AirHabitat;
    * 21 = Road; 210 = Entrance; 211 = Exit; 22 = Resto; 23 = Park;
    * @param x
    * lokasi x
    * @param y
    * lokasi y
    * @param ID
    * nilai cell_id (tetap)
    */ 
    Cell(int x, int y, int ID);
    /** @brief Melakukan Render (mencetak Code)
    */
    void Render();
    /** @brief Mengatur code
    * @param c Code yang diinginkan
    */
    void SetCode(char c);
    /** @brief Mengatur nilai cage_id
    * @param n Nilai cage_id yang diinginkan
    */
    void SetCageID(int n);
    /** @brief Mengembalikan nilai cage_id
    */
    int GetCageID();
    /** @brief Mengembalikan nilai cell_id
    */
    int GetCellID();
    /** @brief Mengembalikan posisi absis hewan.
       * @return Posisi absis cell.
       */
    int GetLocationX();
    /** @brief Mengembalikan posisi ordinat hewan.
       * @return Posisi ordinat cell.
       */
    int GetLocationY();
  private:
    int cell_id;
    int loc_x;
    int loc_y;
    int cage_id;
    char code;
};
#endif
