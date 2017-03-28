package animal;
/**
 * @author Adrian Mulyana N / 13515075
 *         Class AirAnimal, mengatur konstruksi AirAnimal
 */
public abstract class AirAnimal extends Animal {
  /**
   * Mengatur konstruksi animal dengan spesifikasi yang sudah ditentukan
   */
  public AirAnimal() {
    super();
    habitat[1] = true;
  }
}


