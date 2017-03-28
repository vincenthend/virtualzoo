package animal;

/**
 * Class Amphibian, mengatur konstruksi Amphibian.
 * @author Adrian Mulyana N / 13515075
 */
public abstract class Amphibian extends Animal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   *
   * @param land true jika amfibi dapat hidup di darat, false jika tidak
   * @param air true jika amfibi dapat hidup di udara, false jika tidak
   * @param water true jika amfibi dapat hidup di air, false jika tidak
   */
  public Amphibian(boolean land, boolean air, boolean water) {
    super();
    habitat[0] = land;
    habitat[1] = air;
    habitat[2] = water;
  }
}


