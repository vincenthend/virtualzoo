#include "animal.h"
Animal::~Animal(){
	delete [] enemy_id;
}
int Animal::GetFoodQuantity (){
  return (food_weight * weight);
}

int Animal::GetFoodType(){
  return (food_type);
}

int Animal::GetLocationX(){
  return (loc_x);
}

int Animal::GetLocationY(){
  return (loc_y);
}

void Animal::SetLocationX(int x) {
  loc_x = x;
}

void Animal::SetLocationY(int y) {
  loc_y = y;
}

int Animal::GetType()
{
  return type;
}

void Animal::Move(int x, int y){
  loc_x += x;
  loc_y += y;
}

bool * Animal::GetHabitat()
{
  return habitat;
}

int* Animal::GetEnemyList()
{
  return enemy_id;
}

int Animal::GetCEnemy()
{
  return c_enemy;
}
