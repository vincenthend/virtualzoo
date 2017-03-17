#include "amphibian.h"

Penguin::Penguin()
{
  weight = 5;
  food_weight = 1;
  food_type = 2;
  type = 24;
  c_enemy = 0;
}

void Penguin::Interact()
{
  cout << "Waaaaah";
}

void Penguin::Render()
{
  cout << "¥";
}
