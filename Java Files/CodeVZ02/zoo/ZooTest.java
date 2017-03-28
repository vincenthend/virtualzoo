package zoo;
import animal.Animal;
import cage.Cage;
import cell.Cell;

import static org.junit.Assert.assertTrue;

/**
 * @Author Vincent Hendryanto H / 13515089
 * Testclass for Zoo
 */
public class ZooTest {
  @org.junit.Test
  public void addCell() throws Exception {
    Zoo Z = new Zoo();
    Cell C = new Cell();
    System.out.println("Testing addCell - getCell");
    assertTrue(Z.getCell(1,1) == null);
    Z.addCell(1,1, C);
    assertTrue(Z.getCell(1,1) != null);
  }
  @org.junit.Test
  public void getWidth() throws Exception {
    Zoo Z1 = new Zoo();
    Zoo Z2 = new Zoo(25,30);

    System.out.println("Testing width getter");
    assertTrue(Z1.getWidth() == 21);
    assertTrue(Z2.getWidth() == 25);
  }
  @org.junit.Test
  public void getHeight() throws Exception {
    Zoo Z1 = new Zoo();
    Zoo Z2 = new Zoo(25,30);

    System.out.println("Testing width getter");
    assertTrue(Z1.getHeight() == 21);
    assertTrue(Z2.getHeight() == 30);
  }
  @org.junit.Test
  public void getCage() throws Exception {
    Zoo Z = new Zoo();
    System.out.println("Testing addCage - getCage");
    assertTrue(Z.getCage(0) == null);
    Z.addCage();
    assertTrue(Z.getCage(0) != null);
  }
  @org.junit.Test
  public void getNCage() throws Exception {
    Zoo Z = new Zoo();
    System.out.println("Testing getNCage");
    assertTrue( Z.getNCage() == 0);
    Z.addCage();
    assertTrue(Z.getNCage() == 1);
  }
  @org.junit.Test
  public void countFoodHerbivore() throws Exception {
    Zoo Z = new Zoo();

    //Creates a new cat (food_weight = 1, weight = 4)
    Animal a = new Animal(9);
    //Creates a new pigeon (food_weight = 1, weight = 1)
    Animal b = new Animal(3);
    //Creates a new chicken (food_weight = 1, weight = 2)
    Animal c = new Animal(8);

    //Creates habitats for animals
    Cell cell1 = new Cell(1,1,11);
    Cell cell2 = new Cell(1,2,12);
    Cell cell3 = new Cell(1,3,13);
    Cage Cg;

    System.out.println("Testing countFoodHerbivore");
    assertTrue(Z.countFoodHerbivore() == 0);
    Z.addCage();
    Cg = Z.getCage(0);
    Cg.AddHabitat(cell1);
    Cg.AddAnimal(a);

    Z.addCage();
    Cg = Z.getCage(1);
    Cg.AddHabitat(cell2);
    Cg.AddAnimal(b);

    Z.addCage();
    Cg = Z.getCage(2);
    Cg.AddHabitat(cell3);
    Cg.AddAnimal(c);
    assertTrue(Z.countFoodHerbivore() == 1);
  }
  @org.junit.Test
  public void countFoodCarnivore() throws Exception {
    Zoo Z = new Zoo();

    //Creates a new cat (food_weight = 1, weight = 4)
    Animal a = new Animal(9);
    //Creates a new pigeon (food_weight = 1, weight = 1)
    Animal b = new Animal(3);
    //Creates a new chicken (food_weight = 1, weight = 2)
    Animal c = new Animal(8);

    //Creates habitats for animals
    Cell cell1 = new Cell(1,1,11);
    Cell cell2 = new Cell(1,2,12);
    Cell cell3 = new Cell(1,3,13);
    Cage Cg;

    System.out.println("Testing countFoodCarnivore");
    assertTrue(Z.countFoodCarnivore() == 0);
    Z.addCage();
    Cg = Z.getCage(0);
    Cg.AddHabitat(cell1);
    Cg.AddAnimal(a);

    Z.addCage();
    Cg = Z.getCage(1);
    Cg.AddHabitat(cell2);
    Cg.AddAnimal(b);

    Z.addCage();
    Cg = Z.getCage(2);
    Cg.AddHabitat(cell3);
    Cg.AddAnimal(c);
    assertTrue(Z.countFoodCarnivore() == 4);
  }
  @org.junit.Test
  public void countFoodOmnivore() throws Exception {
    Zoo Z = new Zoo();

    //Creates a new cat (food_weight = 1, weight = 4)
    Animal a = new Animal(9);
    //Creates a new pigeon (food_weight = 1, weight = 1)
    Animal b = new Animal(3);
    //Creates a new chicken (food_weight = 1, weight = 2)
    Animal c = new Animal(8);

    //Creates habitats for animals
    Cell cell1 = new Cell(1,1,11);
    Cell cell2 = new Cell(1,2,12);
    Cell cell3 = new Cell(1,3,13);
    Cage Cg;

    System.out.println("Testing countFoodCarnivore");
    assertTrue(Z.countFoodOmnivore() == 0);
    Z.addCage();
    Cg = Z.getCage(0);
    Cg.AddHabitat(cell1);
    Cg.AddAnimal(a);

    Z.addCage();
    Cg = Z.getCage(1);
    Cg.AddHabitat(cell2);
    Cg.AddAnimal(b);

    Z.addCage();
    Cg = Z.getCage(2);
    Cg.AddHabitat(cell3);
    Cg.AddAnimal(c);

    assertTrue(Z.countFoodOmnivore() == 2);
  }

}