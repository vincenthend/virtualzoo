package animal;

/**
 * Class WaterAnimal, mengatur konstruksi WaterAnimal.
 *
 * @author Adrian Mulyana N / 13515075
 */
public abstract class WaterAnimal extends Animal {

  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan.
   */
  public WaterAnimal() {
    super();
    habitat[2] = true;
  }
}


