#include "cell.h"
Cell::Cell() {
  cell_id = 0;
  loc_x = 0;
  loc_y = 0;
  code = 0;
  cage_id = -1;
}
void Cell::SetCode(char c) {
  code = c;
}
void Cell::Render() {
  cout << code;
}
void Cell::SetCageID(int n){
	cage_id = n;
}
int Cell::GetCageID(){
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
