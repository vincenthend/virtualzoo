package test;
import cell.Cell;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Adrian Mulyana N. / 13515075
 */
public class CellTest {
  @Test
  public void testCtor() {
    System.out.println("Testing Cell constructor...");
    Cell C = new Cell();
    assertTrue(C.getCageId() == -1);
    assertTrue(C.getLocationX() == 0);
    assertTrue(C.getLocationY() == 0);
    assertTrue(C.getCellId() == 0);
  }
  @Test
  public void testSetter() {
    System.out.println("Testing Cell setter...");
    Cell C = new Cell();
    C.setCageId(11);
    assertTrue(C.getCageId() == 11);
  }
  @Test
  public void testOther() {
    System.out.println("Testing other methods of Cell...");
    Cell C = new Cell(3, 2, 13);
    C.setCageId(24);
    assertTrue(C.getCageId() == 24);
    assertTrue(C.getLocationX() == 3);
    assertTrue(C.getLocationY() == 2);
    assertTrue(C.getCellId() == 13);
  }
}
