#include "water_animal.h"
WaterAnimal::WaterAnimal(){
  habitat[2] = true;
}
Salmon::Salmon() {
  weight = 1;
  food_weight = 1;
  food_type = 2;
  type = 17;
  c_enemy = 0;
  enemy_id = new int [c_enemy];
  enemy_id [0] = 19;
  enemy_id [1] = 21;
}
void Salmon::Interact() {
  cout << "blub blub";
}
void Salmon::Render() {
  cout << ":";
}
Whale::Whale() {
  weight = 1;
  food_weight = 1;
  food_type = 2;
  type = 18;
  c_enemy = 0;
}
void Whale::Interact() {
  cout << "wooooooooooooo";
}
void Whale::Render() {
  cout << "<";
}
Squid::Squid() {
  weight = 300;
  food_weight = 2;
  food_type = 2;
  type = 19;
  c_enemy = 0;
}
void Squid::Interact() {
  cout << "sluhb..sluhb..";
}
void Squid::Render() {
  cout << ">";
}
Goldfish::Goldfish() {
  weight = 1;
  food_weight = 1;
  food_type = 2;
  type = 20;
  c_enemy = 0;
}
void Goldfish::Interact() {
  cout << "*glub glub*";
}
void Goldfish::Render() {
  cout << "/";
}
Turtle::Turtle() {
  weight = 100;
  food_weight = 1;
  food_type = 2;
  type = 21;
  c_enemy = 0;
}
void Turtle::Interact() {
  cout << "swoosh";
}
void Turtle::Render() {
  cout << "=";
}
Seal::Seal() {
  weight = 25;
  food_weight = 1;
  food_type = 2;
  type = 22;
  c_enemy = 0;
}
void Seal::Interact() {
  cout << "Bawrk Bawrk!";
}
void Seal::Render() {
  cout << "/";
}
Dolphin::Dolphin() {
  weight = 1;
  food_weight = 1;
  food_type = 1;
  type = 23;
  c_enemy = 0;
}
void Dolphin::Interact() {
  cout << "*swims slowly*";
}
void Dolphin::Render() {
  cout << "0";
}
