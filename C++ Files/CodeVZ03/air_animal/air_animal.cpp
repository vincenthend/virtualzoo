#include "air_animal.h"
AirAnimal::AirAnimal(){
  habitat[1] = true;
}
Pelican::Pelican() {
  weight = 5;
  food_weight = 1;
  food_type = 2;
  type = 1;
  c_enemy = 0;
}
void Pelican::Interact() {
  cout << "Kraoooo";
}
void Pelican::Render() {
  cout << "!";
}
Owl::Owl() {
  weight = 1;
  food_weight = 1;
  food_type = 2;
  type = 2;
  c_enemy = 0;
}
void Owl::Interact() {
  cout << "HootHoot";
}
void Owl::Render() {
  cout << "@";
}
Pigeon::Pigeon() {
  weight = 1;
  food_weight = 1;
  food_type = 1;
  type = 3;
  c_enemy = 0;
}
void Pigeon::Interact() {
  cout << "Coo Coo";
}
void Pigeon::Render() {
  cout << "#";
}
Canary::Canary() {
  weight = 1;
  food_weight = 1;
  food_type = 1;
  type = 4;
  c_enemy = 0;
}
void Canary::Interact() {
  cout << "Kweee";
}
void Canary::Render() {
  cout << "$";
}
Bat::Bat() {
  weight = 1;
  food_weight = 1;
  food_type = 1;
  type = 5;
  c_enemy = 2;
  enemy_id = new int [c_enemy];
  enemy_id[0] = 2;
  enemy_id[1] = 4;
}
void Bat::Interact() {
  cout << "shriekkkkkk";
}
void Bat::Render() {
  cout << "%";
}
Eagle::Eagle() {
  weight = 2;
  food_weight = 1;
  food_type = 2;
  type = 6;
  c_enemy = 0;
}
void Eagle::Interact() {
  cout << "Squawk!";
}
void Eagle::Render() {
  cout << "^";
}
Toucan::Toucan() {
  weight = 1;
  food_weight = 1;
  food_type = 1;
  type = 7;
  c_enemy = 0;
}
void Toucan::Interact() {
  cout << "*flies away*";
}
void Toucan::Render() {
  cout << "&";
}
