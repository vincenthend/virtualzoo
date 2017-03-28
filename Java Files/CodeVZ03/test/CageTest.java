package test;
import animal.Animal;
import animal.Chicken;
import animal.Cat;
import animal.Cow;
import cage.Cage;
import cell.Cell;
import cell.habitat.Habitat;
import cell.habitat.LandHabitat;
import cell.habitat.AirHabitat;
import cell.habitat.WaterHabitat;
import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by user on 28-Mar-17.
 */
public class CageTest {
  @Test
  public void testCtor() {
    System.out.println("Testing Cage constructor...");
    Cage C = new Cage();
    assertTrue(C.getCageID() == -1);
    assertTrue(C.getCageType() == 0);
    assertTrue(C.isFull());
  }
  @Test
  public void testSetter() {
    System.out.println("Testing Cage setter...");
    Cage C = new Cage();
    C.setCageID(5);
    assertTrue(C.getCageID() == 5);
  }
  @Test
  public void testOther() {
    System.out.println("Testing Cage other method...");
    Cage C = new Cage();
    Cell H = new LandHabitat(0, 0);
    C.addHabitat(H);
    assertTrue(C.getCageType() == 11);
    H = new LandHabitat(1, 0);
    C.addHabitat(H);
    H = new LandHabitat(2, 0);
    C.addHabitat(H);
    H = new LandHabitat(3, 0);
    C.addHabitat(H);
    H = new LandHabitat(4, 0);
    C.addHabitat(H);
    H = new LandHabitat(5, 0);
    C.addHabitat(H);
    H = new LandHabitat(6, 0);
    C.addHabitat(H);
    H = new LandHabitat(7, 0);
    C.addHabitat(H);
    H = new LandHabitat(8, 0);
    C.addHabitat(H);
    H = new LandHabitat(9, 0);
    C.addHabitat(H);
    assertTrue(C.getCageType() == 11);
    Animal A = new Chicken();
    C.addAnimal(A);
    assertFalse(C.isFull());
    assertTrue(C.isExist(8));
    A = new Cat();
    C.addAnimal(A);
    assertFalse(C.isFull());
    assertTrue(C.isExist(9));
    A = new Cow();
    C.addAnimal(A);
    assertTrue(C.isFull());
    assertTrue(C.isExist(10));
    assertTrue(C.countFoodCarnivore() == 4);
    assertTrue(C.countFoodHerbivore() == 2000);
    assertTrue(C.countFoodOmnivore() == 2);
  }
}