//Header to include all files
//Standard Headers
#include <iostream>
#include <fstream>

//Class Headers
#include "../animal/animal.h"
#include "../cage/cage.h"
#include "../cell/cell.h"
#include "../zoo/zoo.h"

#ifndef DRIVER_H
#define DRIVER_H

class Driver {
  public:
    /** @brief Membuat driver yang membuat Zoo sesuai file Input
    */
    Driver(string Input);
	/** @brief Dtor driver
    */
    ~Driver();
    /** @brief Mencetak menu dan memfasilitasi input menu
    */
    void PrintMenu();
    /** @brief Menjalankan Tour
    */
    void StartTour();
    /** @brief Mencetak keseluruhan zoo
    */
    void PrintZoo();
    /** @brief Mencetak zoo dengan x,y adalah posisi player
    * @param x posisi absis player
    * @param y posisi ordinat player
    */
    void PrintZoo(int x, int y);
    /** @brief Mencetak zoo dari titik (x1,y1) hingga (x2,y2)
    * @param x1 posisi absis awal
    * @param y1 posisi ordinat awal
    * @param x2 posisi absis akhir
    * @param y2 posisi ordinat akhir
    */
    void PrintZoo(int x1, int y1, int x2, int y2);
    /** @brief Mencetak jumlah makanan yang dibutuhkan 
    */
    void PrintStatus();
  private:
    Zoo* z;
};
#endif
