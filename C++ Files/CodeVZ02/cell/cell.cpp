#include "cell.h"
Cell::Cell():cell_id(0) {
  loc_x = 0;
  loc_y = 0;
  cage_id = -1;
}
void Cell::SetCageID(int n) {
  cage_id = n;
}
Cell::Cell(int x, int y, int ID){
  cell_id = ID;
  loc_x = x;
  loc_y = y;
  if (cell_id == 11) {
    code = 'L'; //Code Land Habitat
  }
  else if (cell_id == 12) {
    code = 'A'; //Code Air Habitat
  }
  else if (cell_id == 13) {
    code = 'W'; //Code Water Habitat
  }
  else if (cell_id == 21 || cell_id == 210 || cell_id == 211) {
    code = ' '; //Code Road
  }
  else if (cell_id == 22) {
    code = 'R'; //Code Resto
  }
  else if (cell_id == 23) {
    code = 'P'; //Code Park
  }
  cage_id = -1;
}
void Cell::Render() {
  cout << code;
}
int Cell::GetCageID() {
  return cage_id;
}
int Cell::GetCellID() {
  return cell_id;
}
int Cell::GetLocationX() {
  return (loc_x);
}
int Cell::GetLocationY() {
  return (loc_y);
}
