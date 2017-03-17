#include <iostream>
#include "../renderable/renderable.h"
#include "../animal/animal.h"

#ifndef CELL_H
#define CELL_H

/** @class   Cell
 * Kelas Cell, cell_id didefinisikan pada turunan Cell, default ID = 0
 */
class Cell: public Renderable{  
  public:
    /** @brief Membuat cell dengan x dan y 0, cell_id 0, cell_id -1 dan code 0
    */
    Cell();
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
    virtual void SetCageID(int n);
	/** @brief Mengambil nilai cage_id
    * @return nilai cage_id
    */
    int GetCageID();
    /** @brief Mengambil nilai cell_id
    * @return nilai cell_id
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
  protected:
    int cell_id;
    int loc_x;
    int loc_y;
    int cage_id;
  private:
    char code;
};
#endif
