#include "amphibian/amphibian.h"
#include "animal/animal.h"
#include "cage/cage.h"
#include "cell/cell.h"
#include "zoo/zoo.h"
#include<gtest/gtest.h>
#include <string>

class VZTest : public ::testing::Test {
  protected:
    VZTest(){}
};

TEST(VZTest, OutputTest1) {
	Penguin P;
	EXPECT_EQ(2, P.GetFoodType());
}

TEST(VZTest, OutputTest2) {
  
  Cage cage;
  
  int s;
  s =  cage.GetCageID();
  
  EXPECT_EQ((-1),s);
}

TEST(VZTest, OutputTest3) {
  
  Cell cell;
  int d;
  
  d =  cell.GetLocationX();
  
  EXPECT_EQ(0,d);
}

TEST(VZTest, OutputTest4) {
  
  Zoo zoo;
  int f;
  
  f =  zoo.GetWidth();
  
  EXPECT_EQ(21,f);
}
