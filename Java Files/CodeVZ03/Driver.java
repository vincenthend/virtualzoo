import animal.Animal;
import animal.Bat;
import animal.Canary;
import animal.Cat;
import animal.Chameleon;
import animal.Chicken;
import animal.Cow;
import animal.Dolphin;
import animal.Eagle;
import animal.Goat;
import animal.Goldfish;
import animal.Llama;
import animal.Mouse;
import animal.Owl;
import animal.Pelican;
import animal.Pigeon;
import animal.Salmon;
import animal.Seal;
import animal.Sheep;
import animal.Snake;
import animal.Squid;
import animal.Toucan;
import animal.Turtle;
import animal.Whale;
import cell.Cell;
import cell.facility.Park;
import cell.facility.Resto;
import cell.facility.Road;
import cell.habitat.AirHabitat;
import cell.habitat.LandHabitat;
import cell.habitat.WaterHabitat;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import zoo.Zoo;

/**
 * Class driver, main program dan inisialisasi isi awal zoo.
 *
 * @author Mikhael Artur Darmakesuma / 13515099
 */
public class Driver {

  private Zoo zoo;

  /**
   * Inisialisasi driver dengan membaca dari file inputFile.
   * Memasukkan data animal, habitat dari inputFile ke zoo dan menginisiasi cage.
   *
   * @param inputFile Nama file input
   */
  public Driver(String inputFile) {
    try {
      //Input File
      FileReader inFile = new FileReader(inputFile);
      BufferedReader reader = new BufferedReader(inFile);

      StringBuffer stringBuffer;
      int k;
      int l;
      boolean found;
      boolean enemy;
      Animal animalTemp = null;

      Cell cellTemp = null;

      int height = Integer.parseInt(reader.readLine());
      int width = Integer.parseInt(reader.readLine());

      int i;
      int j;
      zoo = new Zoo(width, height);
      for (i = 0; i < zoo.getHeight(); i++) {
        stringBuffer = new StringBuffer(reader.readLine());
        for (j = 0; j < zoo.getWidth(); j++) {
          if ((stringBuffer.substring(j, j + 1)).equals("L")) {
            cellTemp = new LandHabitat(i, j);
          } else {
            if ((stringBuffer.substring(j, j + 1)).equals("W")) {
              cellTemp = new WaterHabitat(i, j);
            } else {
              if ((stringBuffer.substring(j, j + 1).equals("A"))) {
                cellTemp = new AirHabitat(i, j);
              } else {
                if ((stringBuffer.substring(j, j + 1)).equals("S")) {
                  cellTemp = new Road(i, j, true);
                } else {
                  if ((stringBuffer.substring(j, j + 1)).equals("F")) {
                    cellTemp = new Road(i, j, false);
                  } else {
                    if ((stringBuffer.substring(j, j + 1)).equals("X")) {
                      cellTemp = new Road(i, j);
                    } else {
                      if ((stringBuffer.substring(j, j + 1)).equals("R")) {
                        cellTemp = new Resto(i, j);
                      } else {
                        if ((stringBuffer.substring(j, j + 1)).equals("P")) {
                          cellTemp = new Park(i, j);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          zoo.addCell(i, j, cellTemp);
        }
      }
      //Add Cage
      zoo.addCage();
      //Add animal
      int animalId;
      int animalCount;
      int temp = Integer.parseInt(reader.readLine());
      for (i = 0; i < temp; i++) {
        stringBuffer = new StringBuffer(reader.readLine());

        //Get Animal ID and Animal Count from line
        j = stringBuffer.indexOf(" ");
        k = stringBuffer.length();
        animalId = Integer.parseInt(stringBuffer.substring(0, j));
        animalCount = Integer.parseInt(stringBuffer.substring(j + 1, k));

        //Create a new animal and find a suitable cage
        for (j = 0; j < animalCount; j++) {
          if (animalId == 1) {
            animalTemp = new Pelican();
          } else if (animalId == 2) {
            animalTemp = new Owl();
          } else if (animalId == 3) {
            animalTemp = new Pigeon();
          } else if (animalId == 4) {
            animalTemp = new Canary();
          } else if (animalId == 5) {
            animalTemp = new Bat();
          } else if (animalId == 6) {
            animalTemp = new Eagle();
          } else if (animalId == 7) {
            animalTemp = new Toucan();
          } else if (animalId == 8) {
            animalTemp = new Chicken();
          } else if (animalId == 9) {
            animalTemp = new Cat();
          } else if (animalId == 10) {
            animalTemp = new Cow();
          } else if (animalId == 11) {
            animalTemp = new Mouse();
          } else if (animalId == 12) {
            animalTemp = new Goat();
          } else if (animalId == 13) {
            animalTemp = new Llama();
          } else if (animalId == 14) {
            animalTemp = new Snake();
          } else if (animalId == 15) {
            animalTemp = new Sheep();
          } else if (animalId == 16) {
            animalTemp = new Chameleon();
          } else if (animalId == 17) {
            animalTemp = new Salmon();
          } else if (animalId == 18) {
            animalTemp = new Whale();
          } else if (animalId == 19) {
            animalTemp = new Squid();
          } else if (animalId == 20) {
            animalTemp = new Goldfish();
          } else if (animalId == 21) {
            animalTemp = new Turtle();
          } else if (animalId == 22) {
            animalTemp = new Seal();
          } else if (animalId == 23) {
            animalTemp = new Dolphin();
          }

          //Finding a suitable cage
          found = false;
          while ((!(found)) && (k < zoo.getNCage())) {
            if ((animalTemp.getHabitat()[(((zoo.getCage(k)).getCageType()) % 10) - 1]) && !(zoo
                .getCage(k).isFull())) {
              l = 0;
              enemy = false;
              while (l < animalTemp.getCEnemy()) {
                if (zoo.getCage(k).isExist(animalTemp.getEnemyList()[l])) {
                  enemy = true;
                }
                l++;
              }
              if (!(enemy)) {
                found = true;
                (zoo.getCage(k)).addAnimal(animalTemp);
              }
            }
            k++;
          }
        }
      }
      reader.close();
    } catch (FileNotFoundException excp) {
      System.out.println("File not Found");
    } catch (IOException excp) {
      System.out.println("Input Error");
    }
  }

  /**
   * Main Program.
   *
   * @param args Parameter saat eksekusi program
   */
  public static void main(String[] args) {
    Driver d = new Driver("resource/map.txt");
    d.printMenu();
  }

  /**
   * Menuliskan menu ke layar, menerima pilihan menu dan mengeksekusi pilihan
   * I. S.: Sembarang
   * F. S.: Menu tertulis di layar, pilihan diterima dan dieksekusi
   */
  public void printMenu() {
    int choice;
    int x1;
    int x2;
    int y1;
    int y2;
    Scanner in = new Scanner(System.in);
    do {
      System.out.println("=========================================");
      System.out.println("|\t\t\t\t\t\t\t\tVIRTUAL ZOO\t\t\t\t\t\t\t\t|");
      System.out.println("=========================================");
      System.out.println("Menu :");
      System.out.println("1. Tampilkan Zoo");
      System.out.println("2. Mulai Tour");
      System.out.println("9. Keluar");
      System.out.println("Pilihan : ");
      choice = in.nextInt();
      in.nextLine();
      if (choice == 1) {
        do {
          System.out.println("=========================================");
          System.out.println("|\t\t\t\t\t\t\t\tVIRTUAL ZOO\t\t\t\t\t\t\t\t|");
          System.out.println("=========================================");
          System.out.println("1. Tampilkan seluruhnya");
          System.out.println("2. Tampilkan sebagian");
          System.out.println("9. Keluar");
          System.out.println("Pilihan : ");
          choice = in.nextInt();
          in.nextLine();
          if (choice == 1) {
            printZoo();
            printStatus();
          } else if (choice == 2) {
            System.out.println("Masukkan ukuran");
            System.out.println("X(0 - " + (zoo.getWidth() - 1) + ")");
            System.out.println("Y(0 - " + (zoo.getHeight() - 1) + ")");
            System.out.println("X1 :");
            x1 = in.nextInt();
            in.nextLine();
            System.out.println("Y1 :");
            y1 = in.nextInt();
            in.nextLine();
            System.out.println("X2 :");
            x2 = in.nextInt();
            in.nextLine();
            System.out.println("Y2 :");
            y2 = in.nextInt();
            in.nextLine();
            printZoo(x1, x2, y1, y2);
            System.out.println("");
            choice = 0;
          }
        } while (choice != 9);
      } else if (choice == 2) {
        startTour();
      }
    } while (choice != 9);
  }

  /**
   * Menuliskan status kebun binatang ke layar berkaitan dengan jumlah makanan
   * I. S.: Sembarang
   * F. S.: Status kebun binatang tertulis di layar
   */
  public void printStatus() {
    System.out.println("========================================");
    System.out.println("\t\t\t\t\t\t\t\t- Food Count -");
    System.out.println("\t\t\t\t\t\tHerbivore : " + zoo.countFoodHerbivore());
    System.out.println("\t\t\t\t\t\tCarnivore : " + zoo.countFoodCarnivore());
    System.out.println("\t\t\t\t\t\tOmnivore\t: " + zoo.countFoodOmnivore());
    System.out.println("========================================");
  }

  /**
   * Menuliskan peta kebun binatang
   * I. S.: Sembarang
   * F. S.: Peta kebun binatang tertulis di layar
   */
  public void printZoo() {
    int i;
    int j;
    Cell cellTemp;
    Animal animalTemp;
    for (i = 0; i < zoo.getWidth(); i++) {
      System.out.print("|");
      for (j = 0; j < zoo.getHeight(); j++) {
        cellTemp = zoo.getCell(i, j);
        if (cellTemp != null) {
          if (cellTemp.getCageId() > -1) {
            animalTemp = zoo.getCage(cellTemp.getCageId()).isSpaceOccupied(i, j);
            if (animalTemp != null) {
              animalTemp.render();
            } else {
              cellTemp.render();
            }
          } else {
            cellTemp.render();
          }
        } else {
          System.out.print("?");
        }
        System.out.print("|");
      }
      System.out.println();
    }
  }

  /**
   * Menuliskan peta kebun binatang dengan posisi tour di x, y
   * I. S.: Sembarang
   * F. S.: Peta kebun binatang tertulis di layar
   *
   * @param x Posisi absis tour
   * @param y Posisi ordinat tour
   */
  public void printZoo(int x, int y) {
    int i;
    int j;
    Cell cellTemp;
    Animal animalTemp;
    for (i = 0; i < zoo.getWidth(); i++) {
      System.out.print("|");
      for (j = 0; j < zoo.getHeight(); j++) {
        if (x == j && y == i) {
          System.out.print("X");
        } else {
          cellTemp = zoo.getCell(i, j);
          if (cellTemp != null) {
            if (cellTemp.getCageId() > -1) {
              animalTemp = zoo.getCage(cellTemp.getCageId()).isSpaceOccupied(i, j);
              if (animalTemp != null) {
                animalTemp.render();
              } else {
                cellTemp.render();
              }
            } else {
              cellTemp.render();
            }
          } else {
            System.out.print("?");
          }
        }
        System.out.print("|");
      }
      System.out.println("");
    }
  }

  /**
   * Menuliskan peta kebun binatang dari range x1-x2,y1-y2
   * I. S.: x1 lebih kecil dari x2, y1 lebih kecil dari y2
   * F. S.: Peta kebun binatang tertulis di layar
   *
   * @param x1 Titik mulai x
   * @param x2 Titik akhir x
   * @param y1 Titik mulai y
   * @param y2 Titik akhir y
   */
  public void printZoo(int x1, int x2, int y1, int y2) {
    int i;
    int j;
    Cell cellTemp;
    Animal animalTemp;
    for (i = y1; i <= y2; i++) {
      System.out.print("|");
      for (j = x1; j <= x2; j++) {
        cellTemp = zoo.getCell(i, j);
        if (cellTemp != null) {
          if (cellTemp.getCageId() > -1) {
            animalTemp = zoo.getCage(cellTemp.getCageId()).isSpaceOccupied(i, j);
            if (animalTemp != null) {
              animalTemp.render();
            } else {
              cellTemp.render();
            }
          } else {
            cellTemp.render();
          }
        } else {
          System.out.print("?");
        }
        System.out.print("|");
      }
      System.out.println("");
    }
  }

  /**
   * Menjalankan tour kebun binatang dari pintu masuk ke pintu keluar
   * I. S.: Sembarang
   * F. S.: Perjalanan tour kebun binatang tertulis di layar
   */
  public void startTour() {
    int countMove;
    int[] availMove = new int[4];
    int[] tx = new int[10];
    int[] ty = new int[10];
    Cell c = null;
    Animal a;
    int tc = 0;
    printZoo();
    printStatus();
    int i;
    int j;
    for (i = 0; i < zoo.getWidth(); i++) {
      for (j = 0; j < zoo.getHeight(); j++) {
        c = zoo.getCell(i, j);
        if (c != null) {
          if (c.getCellId() == 210) {
            tx[tc] = i;
            ty[tc] = j;
            tc++;
          }
        }
      }
    }

    Random rand = new Random(System.currentTimeMillis());
    int move = 0;
    int temp = Math.abs((rand.nextInt() % (tc)));
    boolean walk = true;
    i = tx[temp];
    j = ty[temp];
    while (c.getCellId() != 211 && walk) {
      //Print Zoo
      printZoo(j, i);
      printStatus();
      System.out.println("(" + i + "," + j + ")" + c.getCellId());
      //interact
      if (((j - 1) >= 0) && (move != 3)) {
        c = zoo.getCell(i, j - 1);
        if ((c.getCellId() >= 11) && (c.getCellId() <= 13)) {
          if (c != null) {
            if (c.getCageId() > -1) {
              a = zoo.getCage(c.getCageId()).isSpaceOccupied(i, j - 1);
              if (a != null) {
                a.interact();
              }
            }
          }
        }
      }
      if (((i + 1) < zoo.getHeight()) && (move != 4)) {
        c = zoo.getCell(i + 1, j);
        if ((c.getCellId() >= 11) && (c.getCellId() <= 13)) {
          if (c != null) {
            if (c.getCageId() > -1) {
              a = zoo.getCage(c.getCageId()).isSpaceOccupied(i + 1, j);
              if (a != null) {
                a.interact();
              }
            }
          }
        }
      }
      if (((j + 1) < zoo.getWidth()) && (move != 1)) {
        c = zoo.getCell(i, j + 1);
        if ((c.getCellId() >= 11) && (c.getCellId() <= 13)) {
          if (c != null) {
            if (c.getCageId() > -1) {
              a = zoo.getCage(c.getCageId()).isSpaceOccupied(i, j + 1);
              if (a != null) {
                a.interact();
              }
            }
          }
        }
      }
      if (((i - 1) >= 0) && (move != 2)) {
        c = zoo.getCell(i - 1, j);
        if ((c.getCellId() >= 11) && (c.getCellId() <= 13)) {
          if (c != null) {
            if (c.getCageId() > -1) {
              a = zoo.getCage(c.getCageId()).isSpaceOccupied(i - 1, j);
              if (a != null) {
                a.interact();
              }
            }
          }
        }
      }
      countMove = 0;
      if (((j - 1) >= 0) && (move != 3)) {
        c = zoo.getCell(i, j - 1);
        if (c.getCellId() == 21 || c.getCellId() == 211) {
          availMove[countMove] = 1;
          countMove++;
        }
      }
      if (((i + 1) < zoo.getHeight()) && (move != 4)) {
        c = zoo.getCell(i + 1, j);
        if (c.getCellId() == 21 || c.getCellId() == 211) {
          availMove[countMove] = 2;
          countMove++;
        }
      }
      if (((j + 1) < zoo.getWidth()) && (move != 1)) {
        c = zoo.getCell(i, j + 1);
        if (c.getCellId() == 21 || c.getCellId() == 211) {
          availMove[countMove] = 3;
          countMove++;
        }
      }
      if (((i - 1) >= 0) && (move != 2)) {
        c = zoo.getCell(i - 1, j);
        if (c.getCellId() == 21 || c.getCellId() == 211) {
          availMove[countMove] = 4;
          countMove++;
        }
      }
      if (countMove > 0) {
        move = availMove[Math.abs((rand.nextInt() % countMove))];
        if (move == 1) {
          j--;
        } else {
          if (move == 2) {
            i++;
          } else {
            if (move == 3) {
              j++;
            } else {
              i--;
            }
          }
        }
      } else {
        walk = false;
      }
      c = zoo.getCell(i, j);
    }
  }
}