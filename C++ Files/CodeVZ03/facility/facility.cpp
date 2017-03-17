#include "facility.h"

Road::Road()
{
  loc_x = 0;
  loc_y = 0;
  cell_id = 21;
  Cell::SetCode(default_code);
}

Road::Road(int x, int y)
{
  loc_x = x;
  loc_y = y;
  cell_id = 21;
  Cell::SetCode(default_code);
}

Road::Road(int x, int y, bool IsEntrance)
{  
  loc_x = x;
  loc_y = y;
  if (IsEntrance) {
    cell_id = 210;
  }
  else {
    cell_id = 211;
  }
  Cell::SetCode(default_code);
}

Resto::Resto()
{
  loc_x = 0;
  loc_y = 0;
  cell_id = 22;
  Cell::SetCode(default_code);
}

Resto::Resto(int x, int y)
{
  loc_x = x;
  loc_y = y;
  cell_id = 22;
  Cell::SetCode(default_code);
}

Park::Park()
{
  loc_x = 0;
  loc_y = 0;
  cell_id = 23;
  Cell::SetCode(default_code);
}

Park::Park(int x, int y)
{
  loc_x = x;
  loc_y = y;
  cell_id = 23;
  Cell::SetCode(default_code);
}
