#include "cage.h"

Cage::Cage()
{
  n_animal = 0;
  n_cell = 0;
  a = new Animal*[999];
  c = new Cell*[999];
  cage_id = -1;
  cage_type = 0;
}

bool Cage::IsFull() {
  return (n_animal >= ((n_cell / 10) * 3));
}

void Cage::AddAnimal(Animal* A)
{
  //indeks 
  //Harus diubah, gak ngecek habitable lagi, jadiin I.S. udah pasti habitable
  //Harus ngeset X Y animal berdasarkan habitat yang available, kayaknya perlu gethabitat
  A->SetLocationX(c[n_animal]->GetLocationX());
  A->SetLocationY(c[n_animal]->GetLocationY());
  a[n_animal] = A;
  n_animal += 1;
}

Cage::~Cage(){
	delete a;
}


void Cage::SetCageID(int n)
{
  cage_id = n;
}

int Cage::GetCageID()
{
  return cage_id;
}

int Cage::GetCageType()
{
  return cage_type;
}

Animal* Cage::IsSpaceOccupied(int x, int y)
{
  Animal* ret = NULL;
  int i = 0;

  while (ret == NULL && i < n_animal)
    if (a[i]->GetLocationX() == x && a[i]->GetLocationY() == y) {
      ret = a[i];
    }
    else {
      i++;
    }

    return ret;
}

int Cage::CountFoodHerbivore()
{
  int i;
  int sum;
  sum = 0;
  for (i = 0; i < n_animal; i++) {
    if (a[i]->GetFoodType() == 1) {
      sum += a[i]->GetFoodQuantity();
    }
  }
  return sum;
}

int Cage::CountFoodCarnivore()
{
  int i;
  int sum;
  sum = 0;
  for (i = 0; i < n_animal; i++) {
    if (a[i]->GetFoodType() == 2) {
      sum += a[i]->GetFoodQuantity();
    }
  }
  return sum;
}

int Cage::CountFoodOmnivore()
{
  int i;
  int sum;
  sum = 0;
  for (i = 0; i < n_animal; i++) {
    if (a[i]->GetFoodType() == 3) {
      sum += a[i]->GetFoodQuantity();
    }
  }
  return sum;
}

void Cage::AddHabitat(Cell* H)
{
  //Cek apakah sudah ada isi
  if (n_cell == 0) {
    cage_type = H->GetCellID();
    c[n_cell] = H;
    n_cell += 1;
    H->SetCageID(cage_id);
  }
  else {
    //Cek apakah tipe habitat sama
    if (cage_type == H->GetCellID()) {
      c[n_cell] = H;
      n_cell += 1;
      H->SetCageID(cage_id);
    }
  }
}

bool Cage::IsExist(int ID)
{
  bool found = false;
  int i = 0; 
  while (i < n_animal){
    if (a[i]->GetType() == ID){
      found = true;
    }
    i++;
  }
  return (found);
}
