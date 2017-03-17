#include "habitat.h"

LandHabitat::LandHabitat()
{
  loc_x = 0;
  loc_y = 0;
  cell_id = 11;
  Cell::SetCode(default_code);
}

LandHabitat::LandHabitat(int x, int y)
{
  loc_x = x;
  loc_y = y;
  cell_id = 11;
  Cell::SetCode(default_code);
}

WaterHabitat::WaterHabitat()
{
  loc_x = 0;
  loc_y = 0;
  cell_id = 13;
  Cell::SetCode(default_code);
}

WaterHabitat::WaterHabitat(int x, int y)
{
  loc_x = x;
  loc_y = y;
  cell_id = 13;
  Cell::SetCode(default_code);
}

AirHabitat::AirHabitat()
{
  loc_x = 0;
  loc_y = 0;
  cell_id = 12;
  Cell::SetCode(default_code);
}

AirHabitat::AirHabitat(int x, int y)
{
  loc_x = x;
  loc_y = y;
  cell_id = 12;
  Cell::SetCode(default_code);
}

void AirHabitat::Render()
{
  cout << "A";
}

void Habitat::SetCageID(int n)
{
  cage_id = n;
}

int Habitat::GetCageID()
{
  return cage_id;
}
