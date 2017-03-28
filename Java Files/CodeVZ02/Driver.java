import animal.Animal;
import cell.Cell;
import zoo.Zoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Mikhael Artur Darmakesuma / 13515099
 *         Class driver, main program dan inisialisasi isi awal zoo
 */

public class Driver {
  private Zoo z;

  public Driver() {
    //TBD
  }

  public Driver(String input_file) {
    try {
      //Input File
      FileReader inFile = new FileReader(input_file);
      BufferedReader reader = new BufferedReader(inFile);

      Cell cellTemp;
      StringBuffer stringBuffer;
      int i, j, k, l, width, height, temp, animalId, animalCount;
      boolean found, enemy;
      Animal a;

      cellTemp = null;

      height = Integer.parseInt(reader.readLine());
      width = Integer.parseInt(reader.readLine());

      z = new Zoo(width, height);
      for (i = 0; i < z.getHeight(); i++) {
        stringBuffer = new StringBuffer(reader.readLine());
        for (j = 0; j < z.getWidth(); j++) {
          if ((stringBuffer.substring(j, j + 1)).equals("L")) {
            cellTemp = new Cell(i, j, 11);
          }
          else {
            if ((stringBuffer.substring(j, j + 1)).equals("W")) {
              cellTemp = new Cell(i, j, 12);
            }
            else {
              if ((stringBuffer.substring(j, j + 1).equals("A"))) {
                cellTemp = new Cell(i, j, 13);
              }
              else {
                if ((stringBuffer.substring(j, j + 1)).equals("S")) {
                  cellTemp = new Cell(i, j, 210);
                }
                else {
                  if ((stringBuffer.substring(j, j + 1)).equals("F")) {
                    cellTemp = new Cell(i, j, 211);
                  }
                  else {
                    if ((stringBuffer.substring(j, j + 1)).equals("X")) {
                      cellTemp = new Cell(i, j, 21);
                    }
                    else {
                      if ((stringBuffer.substring(j, j + 1)).equals("R")) {
                        cellTemp = new Cell(i, j, 22);
                      }
                      else {
                        if ((stringBuffer.substring(j, j + 1)).equals("P")) {
                          cellTemp = new Cell(i, j, 23);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          z.addCell(i, j, cellTemp);
        }
      }

      //Add Cage
      for (i = 0; i < z.getHeight(); i++) {
        for (j = 0; j < z.getWidth(); j++) {
          found = false;
          cellTemp = z.getCell(i, j);
          if ((cellTemp.getCellId() >= 11) && (cellTemp.getCellId() <= 13)) {
            if (((j - 1) >= 0) && (!(found))) {
              if (((z.getCell(i, j).getCellId()) == (z.getCell(i, j - 1).getCellId()))) {
                z.getCage(z.getCell(i, j - 1).getCageId()).addHabitat(z.getCell(i, j));
                found = true;
              }
            }
            if (((i - 1) >= 0) && (!(found))) {
              if (((z.getCell(i, j).getCellId()) == (z.getCell(i - 1, j).getCellId()))) {
                z.getCage(z.getCell(i - 1, j).getCageId()).addHabitat(z.getCell(i, j));
                found = true;
              }
            }
            if (!(found)) {
              z.addCage();
              z.getCage(z.getNCage() - 1).addHabitat(z.getCell(i, j));
            }
          }
        }
      }

      //Add animal
      temp = Integer.parseInt(reader.readLine());
      for (i = 0; i < temp; i++) {
        stringBuffer = new StringBuffer(reader.readLine());

        //Get Animal ID and Animal Count from line
        j = stringBuffer.indexOf(" ");
        k = stringBuffer.length();
        animalId = Integer.parseInt(stringBuffer.substring(0, j));
        animalCount = Integer.parseInt(stringBuffer.substring(j + 1, k));

        //Create a new animal and find a suitable cage
        for (j = 0; j < animalCount; j++) {
          a = new Animal(animalId);
          found = false;
          //Finding a suitable cage
          while ((!(found)) && (k < z.getNCage())) {
            if ((a.getHabitat()[(((z.getCage(k)).getCageType()) % 10) - 1]) && !(z.getCage(k).isFull())) {
              l = 0;
              enemy = false;
              while (l < a.getCEnemy()) {
                if (z.getCage(k).isExist(a.getEnemyList()[l])) {
                  enemy = true;
                }
                l++;
              }
              if (!(enemy)) {
                found = true;
                (z.getCage(k)).addAnimal(a);
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

  public void printMenu() {
    int choice, x1, y1, x2, y2;
    Scanner in = new Scanner(System.in);
    choice = 0;
    do {
      System.out.println("=========================================");
      System.out.println("|		          VIRTUAL ZOO		      |");
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
          System.out.println("|		          VIRTUAL ZOO		      |");
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
          }
          else if (choice == 2) {
            System.out.println("Masukkan ukuran");
            System.out.println("X(0 - " + (z.getWidth() - 1) + ")");
            System.out.println("Y(0 - " + (z.getHeight() - 1) + ")");
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
            printZoo(x1, y1, x2, y2);
            System.out.println("");
            choice = 0;
          }
        } while (choice != 9);
      }
      else if (choice == 2) {
        startTour();

      }
    } while (choice != 9);
  }
  public void printStatus() {//lebih pas dipindah ke zoo
    System.out.println("========================================");
    System.out.println("		 	  - Food Count -");
    System.out.println("	 Herbivore : " + z.countFoodHerbivore());
    System.out.println("	 Carnivore : " + z.countFoodCarnivore());
    System.out.println("	 Omnivore	: " + z.countFoodOmnivore());
    System.out.println("========================================");
  }
  public void printZoo() {//lebih pas dipindah ke zoo
    int i, j;
    Cell c;
    Animal a;
    for (i = 0; i < z.getWidth(); i++) {
      System.out.print("|");
      for (j = 0; j < z.getHeight(); j++) {
        c = z.getCell(i, j);
        if (c != null) {
          if (c.getCageId() > -1) {
            a = z.getCage(c.getCageId()).isSpaceOccupied(i, j);
            if (a != null) {
              a.render();
            }
            else {
              c.render();
            }
          }
          else {
            c.render();
          }
        }
        else {
          System.out.print("?");
        }
        System.out.print("|");
      }
      System.out.println();
    }
  }
  public void printZoo(int x, int y) {//lebih pas dipindah ke zoo
    int i, j;
    Cell cellTemp;
    Animal animalTemp;
    for (i = 0; i < z.getWidth(); i++) {
      System.out.print("|");
      for (j = 0; j < z.getHeight(); j++) {
        if (x == j && y == i) {
          System.out.print("X");
        }
        else {
          cellTemp = z.getCell(i, j);
          if (cellTemp != null) {
            if (cellTemp.getCageId() > -1) {
              animalTemp = z.getCage(cellTemp.getCageId()).isSpaceOccupied(i, j);
              if (animalTemp != null) {
                animalTemp.render();
              }
              else {
                cellTemp.render();
              }
            }
            else {
              cellTemp.render();
            }
          }
          else {
            System.out.print("?");
          }
        }
        System.out.print("|");
      }
      System.out.println("");
    }
  }
  public void printZoo(int x1, int x2, int y1, int y2) {//lebih pas dipindah ke zoo
    int i, j;
    Cell cellTemp;
    Animal animalTemp;
    for (i = y1; i <= y2; i++) {
      System.out.print("|");
      for (j = x1; j <= x2; j++) {
        cellTemp = z.getCell(i, j);
        if (cellTemp != null) {
          if (cellTemp.getCageId() > -1) {
            animalTemp = z.getCage(cellTemp.getCageId()).isSpaceOccupied(i, j);
            if (animalTemp != null) {
              animalTemp.render();
            }
            else {
              cellTemp.render();
            }
          }
          else {
            cellTemp.render();
          }
        }
        else {
          System.out.print("?");
        }
        System.out.print("|");
      }
      System.out.println("");
    }
  }
  public void startTour() {
    Random rand = new Random(System.currentTimeMillis());
    int i, j, tc, move, cMove;
    int t_move[] = new int[4];
    int tx[] = new int[10];
    int ty[] = new int[10];
    int temp;
    Cell c = null;
    Animal a;
    boolean walk = true;
    tc = 0;
    printZoo();
    printStatus();
    for (i = 0; i < z.getWidth(); i++) {
      for (j = 0; j < z.getHeight(); j++) {
        c = z.getCell(i, j);
        if (c != null) {
          if (c.getCellId() == 210) {
            tx[tc] = i;
            ty[tc] = j;
            tc++;
          }
        }
      }
    }
    move = 0;
    temp = Math.abs((rand.nextInt() % (tc)));
    i = tx[temp];
    j = ty[temp];
    while (c.getCellId() != 211 && walk) {
      //Print Zoo
      printZoo(j, i);
      printStatus();
      System.out.println("(" + i + "," + j + ")" + c.getCellId());

      //interact
      if (((j - 1) >= 0) && (move != 3)) {
        c = z.getCell(i, j - 1);
        if ((c.getCellId() >= 11) && (c.getCellId() <= 13)) {
          if (c != null) {
            if (c.getCageId() > -1) {
              a = z.getCage(c.getCageId()).isSpaceOccupied(i, j - 1);
              if (a != null) {
                a.interact();
              }
            }
          }
        }
      }
      if (((i + 1) < z.getHeight()) && (move != 4)) {
        c = z.getCell(i + 1, j);
        if ((c.getCellId() >= 11) && (c.getCellId() <= 13)) {
          if (c != null) {
            if (c.getCageId() > -1) {
              a = z.getCage(c.getCageId()).isSpaceOccupied(i + 1, j);
              if (a != null) {
                a.interact();
              }
            }
          }
        }
      }
      if (((j + 1) < z.getWidth()) && (move != 1)) {
        c = z.getCell(i, j + 1);
        if ((c.getCellId() >= 11) && (c.getCellId() <= 13)) {
          if (c != null) {
            if (c.getCageId() > -1) {
              a = z.getCage(c.getCageId()).isSpaceOccupied(i, j + 1);
              if (a != null) {
                a.interact();
              }
            }
          }
        }
      }
      if (((i - 1) >= 0) && (move != 2)) {
        c = z.getCell(i - 1, j);
        if ((c.getCellId() >= 11) && (c.getCellId() <= 13)) {
          if (c != null) {
            if (c.getCageId() > -1) {
              a = z.getCage(c.getCageId()).isSpaceOccupied(i - 1, j);
              if (a != null) {
                a.interact();
              }
            }
          }
        }
      }
      cMove = 0;
      if (((j - 1) >= 0) && (move != 3)) {
        c = z.getCell(i, j - 1);
        if (c.getCellId() == 21 || c.getCellId() == 211) {
          t_move[cMove] = 1;
          cMove++;
        }
      }
      if (((i + 1) < z.getHeight()) && (move != 4)) {
        c = z.getCell(i + 1, j);
        if (c.getCellId() == 21 || c.getCellId() == 211) {
          t_move[cMove] = 2;
          cMove++;
        }
      }
      if (((j + 1) < z.getWidth()) && (move != 1)) {
        c = z.getCell(i, j + 1);
        if (c.getCellId() == 21 || c.getCellId() == 211) {
          t_move[cMove] = 3;
          cMove++;
        }
      }
      if (((i - 1) >= 0) && (move != 2)) {
        c = z.getCell(i - 1, j);
        if (c.getCellId() == 21 || c.getCellId() == 211) {
          t_move[cMove] = 4;
          cMove++;
        }
      }
      if (cMove > 0) {
        move = t_move[Math.abs((rand.nextInt() % cMove))];
        if (move == 1) {
          j--;
        }
        else {
          if (move == 2) {
            i++;
          }
          else {
            if (move == 3) {
              j++;
            }
            else {
              i--;
            }
          }
        }
      }
      else {
        walk = false;
      }
      c = z.getCell(i, j);
    }

  }

  public static void main(String[] args) {
    Driver D = new Driver("resource/map.txt");

    D.printMenu();
  }
}