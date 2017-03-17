#include "land_animal.h"
LandAnimal::LandAnimal(){
  habitat[0] = true;
}
Chicken::Chicken() {
  weight = 2;
  food_weight = 1;
  food_type = 3;
  type = 8;
  c_enemy = 0;
}
void Chicken::Interact() {
  cout << "Cock-a-doodle-doo!";
}
void Chicken::Render() {
  cout << "*";
}
Cat::Cat() {
  weight = 4;
  food_weight = 1;
  food_type = 2;
  type = 9;
  c_enemy = 0;
}
void Cat::Interact() {
  cout << "Meow";
}
void Cat::Render() {
  cout << "-";
}
Cow::Cow() {
  weight = 1000;
  food_weight = 2;
  food_type = 1;
  type = 10;
  c_enemy = 0;
}
void Cow::Interact() {
  cout << "Mooo...";
}
void Cow::Render() {
  cout << "+";
}
Mouse::Mouse() {
  weight = 2;
  food_weight = 1;
  food_type = 1;
  type = 11;
  c_enemy = 1;
  enemy_id = new int [c_enemy];
  enemy_id[0] = 9;
}
void Mouse::Interact() {
  cout << "Squeak-squeak";
}
void Mouse::Render() {
  cout << "~";
}
Goat::Goat() {
  weight = 100;
  food_weight = 2;
  food_type = 1;
  type = 12;
  c_enemy = 0;
}
void Goat::Interact() {
  cout << "Beeeeeek";
}
void Goat::Render() {
  cout << ";";
}
Llama::Llama() {
  weight = 500;
  food_weight = 2;
  food_type = 1;
  type = 13;
  c_enemy = 0;
}
void Llama::Interact() {
  cout << "Neiigh!";
}
void Llama::Render() {
  cout << "[";
}
Snake::Snake() {
  weight = 10;
  food_weight = 1;
  food_type = 2;
  type = 14;
  c_enemy = 0;
}
void Snake::Interact() {
  cout << "Hsssss...";
}
void Snake::Render() {
  cout << "]";
}
Sheep::Sheep() {
  weight = 1;
  food_weight = 1;
  food_type = 1;
  type = 15;
  c_enemy = 0;
}
void Sheep::Interact() {
  cout << "Baaaaaaaaaa";
}
void Sheep::Render() {
  cout << "{";
}
Chameleon::Chameleon() {
  weight = 1;
  food_weight = 1;
  food_type = 2;
  type = 16;
  c_enemy = 0;
}
void Chameleon::Interact() {
  cout << "Scrook...";
}
void Chameleon::Render() {
  cout << "}";
}
