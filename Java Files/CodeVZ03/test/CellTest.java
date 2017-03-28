package test;
import cell.facility.Park;
import cell.facility.Resto;
import cell.facility.Road;
import cell.habitat.AirHabitat;
import cell.habitat.LandHabitat;
import cell.habitat.WaterHabitat;

import static org.junit.Assert.assertTrue;

/**
 * @Author Adrian Mulyana N. / 13515075
 * Testclass for Cell dkk
 */
public class CellTest {
  @org.junit.Test
  public void addPark() throws Exception {
    Park P = new Park(3, 3);
    System.out.println("Testing addPark - getCellId");
    assertTrue(P.getCellId() == 22);
    System.out.println("Testing addPark - getLocationY");
    assertTrue(P.getLocationY() == 3);
  }
  @org.junit.Test
  public void addResto() throws Exception {
    Resto R = new Resto(5, 7);
    System.out.println("Testing addResto - getCellId");
    assertTrue(R.getCellId() == 23);
    System.out.println("Testing addResto - getLocationY");
    assertTrue(R.getLocationY() == 7);
  }
  @org.junit.Test
  public void addRoad() throws Exception {
    Road R1 = new Road();
    System.out.println("Testing addRoad - getCellId");
    assertTrue(R1.getCellId() == 21);
    System.out.println("Testing addRoad - getLocationX");
    assertTrue(R1.getLocationX() == 0);
    //------------------------------------------------------
    Road R2 = new Road(2, 4, true);
    System.out.println("Testing addRoad - getCellId");
    assertTrue(R2.getCellId() == 210);
    System.out.println("Testing addRoad - getLocationX");
    assertTrue(R2.getLocationX() == 2);
  }
  @org.junit.Test
  public void addAirH() throws Exception {
    AirHabitat A = new AirHabitat(6, 6);
    System.out.println("Testing addAirH - getCellId");
    assertTrue(A.getCellId() == 12);
    System.out.println("Testing addAirH - getLocationY");
    assertTrue(A.getLocationY() == 6);
  }
  @org.junit.Test
  public void addLandH() throws Exception {
    LandHabitat L = new LandHabitat(7, 7);
    System.out.println("Testing addLandH - getCellId");
    assertTrue(L.getCellId() == 11);
    System.out.println("Testing addLandH - getLocationX");
    assertTrue(L.getLocationY() == 7);
  }
  @org.junit.Test
  public void addWaterH() throws Exception {
    WaterHabitat W = new WaterHabitat(8, 8);
    System.out.println("Testing addWaterH - getCellId");
    assertTrue(W.getCellId() == 13);
    System.out.println("Testing addWaterH - getLocationY");
    assertTrue(W.getLocationY() == 8);
  }

}
