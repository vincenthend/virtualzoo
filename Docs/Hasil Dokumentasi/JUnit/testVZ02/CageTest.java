package test;
import animal.Animal;
import cage.Cage;
import cell.Cell;
import org.testng.annotations.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Mikhael Artur Darmakesuma / 13515099
 * Testclass for Cage
 */
public class CageTest {
  @Test
  public void testCtor() {
    System.out.println("Testing Cage constructor...");
    Cage C = new Cage();
    assertTrue(C.getCageId() == -1);
    assertTrue(C.getCageType() == 0);
    assertTrue(C.isFull());
  }
  @Test
  public void testSetter() {
    System.out.println("Testing Cage setter...");
    Cage C = new Cage();
    C.setCageId(5);
    assertTrue(C.getCageId() == 5);
  }
  @Test
  public void testOther() {
    System.out.println("Testing Cage other method...");
    Cage C = new Cage();
    Cell H = new Cell(0, 0, 11);
    C.addHabitat(H);
    assertTrue(C.getCageType() == 11);
    H = new Cell(1, 0, 11);
    C.addHabitat(H);
    H = new Cell(2, 0, 11);
    C.addHabitat(H);
    H = new Cell(3, 0, 11);
    C.addHabitat(H);
    H = new Cell(4, 0, 11);
    C.addHabitat(H);
    H = new Cell(5, 0, 11);
    C.addHabitat(H);
    H = new Cell(6, 0, 11);
    C.addHabitat(H);
    H = new Cell(7, 0, 11);
    C.addHabitat(H);
    H = new Cell(8, 0, 11);
    C.addHabitat(H);
    H = new Cell(9, 0, 11);
    C.addHabitat(H);
    assertTrue(C.getCageType() == 11);
    Animal A = new Animal(8);
    C.addAnimal(A);
    assertFalse(C.isFull());
    assertTrue(C.isExist(8));
    A = new Animal(9);
    C.addAnimal(A);
    assertFalse(C.isFull());
    assertTrue(C.isExist(9));
    A = new Animal(10);
    C.addAnimal(A);
    assertTrue(C.isFull());
    assertTrue(C.isExist(10));
    assertTrue(C.countFoodCarnivore() == 4);
    assertTrue(C.countFoodHerbivore() == 2000);
    assertTrue(C.countFoodOmnivore() == 2);
  }
}