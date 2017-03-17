#include "animal.h"
Animal::Animal(int id)
{
  loc_x = -99;
  loc_y = -99;
  enemy_id = new int [99];
  c_enemy = 0;
  if (id == 1) {
    type = 1;
    sound = "Kraoooo";
    weight = 5;
    food_weight = 1;
    food_type = 2;
    code = '!';
    habitat[1] = true;
    c_enemy = 0;
  }
  else if (id == 2) {
    type = 2;
    sound = "HootHoot";
    weight = 1;
    food_weight = 1;
    food_type = 2;
    code = '@';
    habitat[1] = true;
    c_enemy = 0;
  }
  else if (id == 3) {
    type = 3;
    sound = "Coo Coo";
    weight = 1;
    food_weight = 1;
    food_type = 1;
    code = '#';
    habitat[1] = true;
    c_enemy = 0;
  }
  else if (id == 4) {
    type = 4;
    sound = "Kweee";
    weight = 1;
    food_weight = 1;
    food_type = 1;
    code = '$';
    habitat[1] = true;
    c_enemy = 0;
  }
  else if (id == 5) {
    type = 5;
    sound = "shriekkkkkk";
    weight = 1;
    food_weight = 1;
    food_type = 1;
    code = '%';
    habitat[1] = true;
    c_enemy = 2;
    enemy_id = new int [c_enemy];
    enemy_id[0] = 2;
    enemy_id[1] = 4;
  }
  else if (id == 6) {
    type = 6;
    sound = "Squawk!";
    weight = 2;
    food_weight = 1;
    food_type = 2;
    code = '^';
    habitat[1] = true;
    c_enemy = 0;
  }
  else if (id == 7) {
    type = 7;
    sound = "*flies away*";
    weight = 1;
    food_weight = 1;
    food_type = 1;
    code = '&';
    habitat[1] = true;
    c_enemy = 0;
  }
  else if (id == 8) {
    type = 8;
    sound = "Cock-a-doodle-doo!";
    weight = 2;
    food_weight = 1;
    food_type = 3;
    code = '*';
    habitat[0] = true;
    c_enemy = 0;
  }
  else if (id == 9) {
    type = 9;
    sound = "Meow";
    weight = 4;
    food_weight = 1;
    food_type = 2;
    code = '-';
    habitat[0] = true;
    c_enemy = 0;
  }
  else if (id == 10) {
    type = 10;
    sound = "Mooo...";
    weight = 1000;
    food_weight = 2;
    food_type = 1;
    code = '+';
    habitat[0] = true;
    c_enemy = 0;
  }
  else if (id == 11) {
    type = 11;
    sound = "Squeak-squeak";
    weight = 2;
    food_weight = 1;
    food_type = 1;
    code = '~';
    habitat[0] = true;
    c_enemy = 1;
    enemy_id = new int [c_enemy];
    enemy_id[0] = 9;
  }
  else if (id == 12) {
    type = 12;
    sound = "Beeeeeek";
    weight = 100;
    food_weight = 2;
    food_type = 1;
    code = '"';
    habitat[0] = true;
    c_enemy = 0;
  }
  else if (id == 13) {
    type = 13;
    sound = "Neiigh!";
    weight = 500;
    food_weight = 2;
    food_type = 1;
    code = '[';
    habitat[0] = true;
    c_enemy = 0;
  }
  else if (id == 14) {
    type = 14;
    sound = "Hsssss...";
    weight = 10;
    food_weight = 1;
    food_type = 2;
    code = ']';
    habitat[0] = true;
    c_enemy = 0;
  }
  else if (id == 15) {
    type = 15;
    sound = "Baaaaaaaaaa";
    weight = 1;
    food_weight = 1;
    food_type = 1;
    code = '{';
    habitat[0] = true;
    c_enemy = 0;
  }
  else if (id == 16) {
    type = 16;
    sound = "Scrook...";
    weight = 1;
    food_weight = 1;
    food_type = 2;
    code = '}';
    habitat[0] = true;
    c_enemy = 0;
  }
  else if (id == 17) {
    type = 17;
    sound = "blub blub";
    weight = 1;
    food_weight = 1;
    food_type = 2;
    code = ':';
    habitat[2] = true;
    c_enemy = 2;
    enemy_id = new int [c_enemy];
    enemy_id [0] = 19;
    enemy_id [1] = 21;
  }
  else if (id == 18) {
    type = 18;
    sound = "wooooooooooooo";
    weight = 1;
    food_weight = 1;
    food_type = 2;
    code = '<';
    habitat[2] = true;
    c_enemy = 0;
  }
  else if (id == 19) {
    type = 19;
    sound = "sluhb..sluhb..";
    weight = 300;
    food_weight = 2;
    food_type = 2;
    code = '>';
    habitat[2] = true;
    c_enemy = 0;
  }
  else if (id == 20) {
    type = 20;
    sound = "*glub glub*";
    weight = 1;
    food_weight = 1;
    food_type = 2;
    code = '/';
    habitat[2] = true;
    c_enemy = 0;
  }
  else if (id == 21) {
    type = 21;
    sound = "swoosh";
    weight = 100;
    food_weight = 1;
    food_type = 2;
    code = '=';
    habitat[2] = true;
    c_enemy = 0;
  }
  else if (id == 22) {
    type = 22;
    sound = "Bawrk Bawrk!";
    code = ';';
    habitat[2] = true;
    weight = 25;
    food_weight = 1;
    food_type = 2;
    code = '/';
    habitat[2] = true;
    c_enemy = 0;
  }
  else if (id == 23) {
    type = 23;
    sound = "*swims slowly*";
    weight = 1;
    food_weight = 1;
    food_type = 1;
    code = '0';
    habitat[2] = true;
    c_enemy = 0;
  }
  else if (id == 24) {
    type = 24;
    sound = "Waaaah";
    weight = 5;
    food_weight = 1;
    food_type = 2;
    code = '¥';
    habitat[0] = true;
    habitat[2] = true;
    c_enemy = 0;
  }
}
void Animal::Interact() {
  cout << sound << endl;
}
int Animal::GetFoodQuantity () {
  return (food_weight * weight);
}
int Animal::GetFoodType() {
  return (food_type);
}
int Animal::GetLocationX(){
  return (loc_x);
}
int Animal::GetLocationY(){
  return (loc_y);
}
void Animal::SetLocationX(int x){
  loc_x = x;
}
void Animal::SetLocationY(int y){
  loc_y = y;
}
int Animal::GetType(){
  return type;
}
void Animal::Move(int x, int y){
  loc_x += x;
  loc_y += y;
}
void Animal::Render(){
  cout << code;
}
bool * Animal::GetHabitat(){
  return habitat;
}
int* Animal::GetEnemyList(){
  return enemy_id;
}
int Animal::GetCEnemy(){
  return c_enemy;
}
