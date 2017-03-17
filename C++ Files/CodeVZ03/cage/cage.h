#include "../animal/animal.h"
#include "../cell/cell.h"

#ifndef CAGE_H
#define CAGE_H


/**
 * @class   Cage
 * Kelas Cage
 */
class Cage{
  public :
    /** @brief Inisialisasi cage dengan n_animal 0 dan n_cell 0
    * membuat array a dan c sebanyak 999 buah
    */
    Cage();
	/** @brief dtor cage
    */
    ~Cage();
    /** @brief Mengembalikan kondisi penuh cage
    * @return true jika penuh dan false jika belum penuh
    */
    bool IsFull();
    /** @brief Menambahkan habitat ke dalam cage
    */
    void AddHabitat(Cell* H);
    /** @brief Menambahkan animal ke dalam cage
    */
    void AddAnimal(Animal* A);
    /** @brief cage_id diubah menjadi n
    * @param n Nilai untuk cage_id
    */
    void SetCageID(int n);
    /** @brief mengembalikan nilai cage_id
    * @return nilai cage_id
    */
    int GetCageID();
    /** @brief mengembalikan nilai cage_type
    * @return nilai cage_type
    */
    int GetCageType();
    /** @brief mengembalikan nilai alamat animal apakah x dan y dipakai, jika tidak maka null
    * @return pointer menuju animal
    */
    Animal* IsSpaceOccupied(int x, int y);
    /** @brief menghitung total jumlah makanan herbivore
    * @return nilai total makanan herbivore
    */
    int CountFoodHerbivore();
    /** @brief menghitung total jumlah makanan carnivore
    * @return nilai total makanan carnivore
    */
    int CountFoodCarnivore();
    /** @brief menghitung total jumlah makanan omnivore
    * @return nilai total makanan omnivore
    */
    int CountFoodOmnivore();
    /** @brief Mengembalikan keberadaan animal dengan type = ID
    * @return true jika ada dan false jika tidak ada
    */
    bool IsExist(int ID);
  private:
    int cage_id;
    int n_animal;
    int n_cell;
    int cage_type;
    Animal ** a;
    Cell ** c;
};
#endif
