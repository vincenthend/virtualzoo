package test;
import animal.Animal;
import animal.Cat;
import animal.Chicken;
import animal.Pigeon;
import cage.Cage;
import cell.Cell;
import cell.habitat.AirHabitat;
import cell.habitat.LandHabitat;
import cell.habitat.WaterHabitat;
import zoo.Zoo;

import static org.junit.Assert.assertTrue;

/**
 * @Author Vincent Hendryanto H / 13515089
 * Testclass for Zoo
 */
public class ZooTest {
  @org.junit.Test
  public void addCell() throws Exception {
    Zoo Z = new Zoo();
    Cell C = new AirHabitat();
    System.out.println("Testing addCell - getCell");
    assertTrue(Z.getCell(1, 1) == null);
    Z.addCell(1, 1, C);
    assertTrue(Z.getCell(1, 1) != null);
  }
  @org.junit.Test
  public void getWidth() throws Exception {
    Zoo Z1 = new Zoo();
    Zoo Z2 = new Zoo(25, 30);

    System.out.println("Testing width getter");
    assertTrue(Z1.getWidth() == 21);
    assertTrue(Z2.getWidth() == 25);
  }
  @org.junit.Test
  public void getHeight() throws Exception {
    Zoo Z1 = new Zoo();
    Zoo Z2 = new Zoo(25, 30);

    System.out.println("Testing width getter");
    assertTrue(Z1.getHeight() == 21);
    assertTrue(Z2.getHeight() == 30);
  }
  @org.junit.Test
  public void getCage() throws Exception {
    Zoo Z = new Zoo();
    System.out.println("Testing addCage - getCage");
    Z.addCell(1, 1, new AirHabitat(1, 1));
    assertTrue(Z.getCage(0) == null);
    Z.addCage();
    assertTrue(Z.getCage(0) != null);
  }
  @org.junit.Test
  public void getNCage() throws Exception {
    Zoo Z = new Zoo();
    System.out.println("Testing getNCage");
    Z.addCell(1, 1, new AirHabitat(1, 1));
    assertTrue(Z.getNCage() == 0);
    Z.addCage();
    assertTrue(Z.getNCage() == 1);
  }
  @org.junit.Test
  public void countFoodHerbivore() throws Exception {
    Zoo Z = new Zoo();

    //Creates a new cat (food_weight = 1, weight = 4)
    Animal a = new Cat();
    //Creates a new pigeon (food_weight = 1, weight = 1)
    Animal b = new Pigeon();
    //Creates a new chicken (food_weight = 1, weight = 2)
    Animal c = new Chicken();

    //Creates habitats for animals
    Cell cell1 = new AirHabitat();
    Cell cell2 = new LandHabitat();
    Cell cell3 = new WaterHabitat();
    Cage Cg;

    System.out.println("Testing countFoodHerbivore");
    assertTrue(Z.countFoodHerbivore() == 0);
    Z.addCell(1, 1, cell1);
    Z.addCage();
    Cg = Z.getCage(0);
    Cg.addAnimal(a);

    Z.addCell(1, 2, cell2);
    Z.addCage();
    Cg = Z.getCage(1);
    Cg.addAnimal(b);

    Z.addCell(1, 3, cell3);
    Z.addCage();
    Cg = Z.getCage(2);
    Cg.addAnimal(c);
    assertTrue(Z.countFoodHerbivore() == 1);
  }
  @org.junit.Test
  public void countFoodCarnivore() throws Exception {
    Zoo Z = new Zoo();

    //Creates a new cat (food_weight = 1, weight = 4)
    Animal a = new Cat();
    //Creates a new pigeon (food_weight = 1, weight = 1)
    Animal b = new Pigeon();
    //Creates a new chicken (food_weight = 1, weight = 2)
    Animal c = new Chicken();

    //Creates habitats for animals
    Cell cell1 = new AirHabitat();
    Cell cell2 = new LandHabitat();
    Cell cell3 = new WaterHabitat();
    Cage Cg;

    System.out.println("Testing countFoodHerbivore");
    assertTrue(Z.countFoodCarnivore() == 0);
    Z.addCell(1, 1, cell1);
    Z.addCage();
    Cg = Z.getCage(0);
    Cg.addAnimal(a);

    Z.addCell(1, 2, cell2);
    Z.addCage();
    Cg = Z.getCage(1);
    Cg.addAnimal(b);

    Z.addCell(1, 3, cell3);
    Z.addCage();
    Cg = Z.getCage(2);
    Cg.addAnimal(c);
    assertTrue(Z.countFoodCarnivore() == 4);
  }
  @org.junit.Test
  public void countFoodOmnivore() throws Exception {
    Zoo Z = new Zoo();

    //Creates a new cat (food_weight = 1, weight = 4)
    Animal a = new Cat();
    //Creates a new pigeon (food_weight = 1, weight = 1)
    Animal b = new Pigeon();
    //Creates a new chicken (food_weight = 1, weight = 2)
    Animal c = new Chicken();

    //Creates habitats for animals
    Cell cell1 = new AirHabitat();
    Cell cell2 = new LandHabitat();
    Cell cell3 = new WaterHabitat();
    Cage Cg;

    System.out.println("Testing countFoodHerbivore");
    assertTrue(Z.countFoodOmnivore() == 0);
    Z.addCell(1, 1, cell1);
    Z.addCage();
    Cg = Z.getCage(0);
    Cg.addAnimal(a);

    Z.addCell(1, 2, cell2);
    Z.addCage();
    Cg = Z.getCage(1);
    Cg.addAnimal(b);

    Z.addCell(1, 3, cell3);
    Z.addCage();
    Cg = Z.getCage(2);
    Cg.addAnimal(c);
    assertTrue(Z.countFoodOmnivore() == 2);
  }

}