/**
 * @author Mikhael Artur Darmakesuma / 13515099
 * Class driver, main program dan inisialisasi isi awal zoo
 */

import animal.Animal;
import cell.Cell;
import zoo.Zoo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Driver {
  private Zoo z;

  public Driver() {
    //TBD
  }

  public Driver(String input_file) {
    try {
      //Input File
      FileReader infile = new FileReader(input_file);
      BufferedReader reader = new BufferedReader(infile);

      Cell c;
      StringBuffer st;
      int i, j, k, l, w, h, temp, a_id, a_count;
      boolean found, enemy;
      Animal a;

      c = null;

      h = Integer.parseInt(reader.readLine());
      w = Integer.parseInt(reader.readLine());

      z = new Zoo(w, h);
      for (i = 0; i < z.GetHeight(); i++) {
        st = new StringBuffer(reader.readLine());
        for (j = 0; j < z.GetWidth(); j++) {
          if ((st.substring(j,j+1)).equals("L")) {
            c = new Cell(i, j, 11);
          }
          else {
            if ((st.substring(j, j+1)).equals("W")) {
              c = new Cell(i, j, 12);
            }
            else {
              if ((st.substring(j, j+1).equals("A"))) {
                c = new Cell(i, j, 13);
              }
              else {
                if ((st.substring(j, j+1)).equals("S")) {
                  c = new Cell(i, j, 210);
                }
                else {
                  if ((st.substring(j, j+1)).equals("F")) {
                    c = new Cell(i, j, 211);
                  }
                  else {
                    if ((st.substring(j, j+1)).equals("X")) {
                      c = new Cell(i, j, 21);
                    }
                    else {
                      if ((st.substring(j, j+1)).equals("R")) {
                        c = new Cell(i, j, 22);
                      }
                      else {
                        if ((st.substring(j, j+1)).equals("P")) {
                          c = new Cell(i, j, 23);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          z.AddCell(i, j, c);
        }
      }
      //Add Cage
      for (i = 0; i < z.GetHeight(); i++) {
        for (j = 0; j < z.GetWidth(); j++) {
          found = false;
          c = z.GetCell(i, j);
          if ((c.GetCellID() >= 11) && (c.GetCellID() <= 13)) {
            if (((j - 1) >= 0) && (!(found))) {
              if (((z.GetCell(i, j).GetCellID()) == (z.GetCell(i, j - 1).GetCellID()))) {
                z.GetCage(z.GetCell(i, j - 1).GetCageID()).AddHabitat(z.GetCell(i, j));
                found = true;
              }
            }
            if (((i - 1) >= 0) && (!(found))) {
              if (((z.GetCell(i, j).GetCellID()) == (z.GetCell(i - 1, j).GetCellID()))) {
                z.GetCage(z.GetCell(i - 1, j).GetCageID()).AddHabitat(z.GetCell(i, j));
                found = true;
              }
            }
            if (!(found)) {
              z.AddCage();
              z.GetCage(z.GetNCage() - 1).AddHabitat(z.GetCell(i, j));
            }
          }
        }
      }

      //Add animal
      temp = Integer.parseInt(reader.readLine());
      for (i = 0; i < temp; i++) {
        st = new StringBuffer(reader.readLine());

        //Get Animal ID and Animal Count from line
        j = st.indexOf(" ");
        k = st.length();
        a_id = Integer.parseInt(st.substring(0,j));
        a_count = Integer.parseInt(st.substring(j+1,k));

        //Create a new animal and find a suitable cage
        for (j = 0; j < a_count; j++) {
          a = new Animal(a_id);
          found = false;
          //Finding a suitable cage
          while ((!(found)) && (k < z.GetNCage())) {
            if ((a.GetHabitat()[(((z.GetCage(k)).GetCageType()) % 10) - 1]) && !(z.GetCage(k).IsFull())) {
              l = 0;
              enemy = false;
              while (l < a.GetCEnemy()) {
                if (z.GetCage(k).IsExist(a.GetEnemyList()[l])) {
                  enemy = true;
                }
                l++;
              }
              if (!(enemy)) {
                found = true;
                (z.GetCage(k)).AddAnimal(a);
              }
            }
            k++;
          }
        }
      }
      reader.close();
    }
    catch(FileNotFoundException excp){
      System.out.println("File not Found");
    }
    catch(IOException excp){
      System.out.println("Input Error");
    }
  }

  public void PrintMenu() {
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
            z.PrintZoo(0,z.GetWidth(),0,z.GetHeight());
            PrintStatus();
          }
          else if (choice == 2) {
            System.out.println("Masukkan ukuran");
            System.out.println("X(0 - " + (z.GetWidth() - 1) + ")");
            System.out.println("Y(0 - " + (z.GetHeight() - 1) + ")");
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
            z.PrintZoo(x1, x2, y1, y2);
            System.out.println("");
            choice = 0;
          }
        } while (choice != 9);
      }
      else if (choice == 2) {
        StartTour();

      }
    } while (choice != 9);
  }
  public void PrintStatus() {//lebih pas dipindah ke zoo
    System.out.println("========================================");
    System.out.println("		 	  - Food Count -");
    System.out.println("	 Herbivore : " + z.CountFoodHerbivore());
    System.out.println("	 Carnivore : " + z.CountFoodCarnivore());
    System.out.println("	 Omnivore	: " + z.CountFoodOmnivore());
    System.out.println("========================================");
  }
  public void StartTour() {
    Random rand = new Random(System.currentTimeMillis());
    int i, j, tc, move, c_move;
    int t_move[] = new int[4];
    int tx[] = new int[10];
    int ty[] = new int[10];
    int temp;
    Cell c = null;
    Animal a;
    boolean walk = true;
    tc = 0;
    for (i = 0; i < z.GetWidth(); i++) {
      for (j = 0; j < z.GetHeight(); j++) {
        c = z.GetCell(i, j);
        if (c != null) {
          if (c.GetCellID() == 210) {
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
    while (c.GetCellID() != 211 && walk) {
      //Print Zoo
      z.PrintZoo(j, i);
      PrintStatus();
      System.out.println("(" + i + "," + j + ")" + c.GetCellID());

      //Interact
      if (((j - 1) >= 0) && (move != 3)) {
        c = z.GetCell(i, j - 1);
        if ((c.GetCellID() >= 11) && (c.GetCellID() <= 13)) {
          if (c != null) {
            if (c.GetCageID() > -1) {
              a = z.GetCage(c.GetCageID()).IsSpaceOccupied(i, j - 1);
              if (a != null) {
                a.Interact();
              }
            }
          }
        }
      }
      if (((i + 1) < z.GetHeight()) && (move != 4)) {
        c = z.GetCell(i + 1, j);
        if ((c.GetCellID() >= 11) && (c.GetCellID() <= 13)) {
          if (c != null) {
            if (c.GetCageID() > -1) {
              a = z.GetCage(c.GetCageID()).IsSpaceOccupied(i + 1, j);
              if (a != null) {
                a.Interact();
              }
            }
          }
        }
      }
      if (((j + 1) < z.GetWidth()) && (move != 1)) {
        c = z.GetCell(i, j + 1);
        if ((c.GetCellID() >= 11) && (c.GetCellID() <= 13)) {
          if (c != null) {
            if (c.GetCageID() > -1) {
              a = z.GetCage(c.GetCageID()).IsSpaceOccupied(i, j + 1);
              if (a != null) {
                a.Interact();
              }
            }
          }
        }
      }
      if (((i - 1) >= 0) && (move != 2)) {
        c = z.GetCell(i - 1, j);
        if ((c.GetCellID() >= 11) && (c.GetCellID() <= 13)) {
          if (c != null) {
            if (c.GetCageID() > -1) {
              a = z.GetCage(c.GetCageID()).IsSpaceOccupied(i - 1, j);
              if (a != null) {
                a.Interact();
              }
            }
          }
        }
      }
      c_move = 0;
      if (((j - 1) >= 0) && (move != 3)) {
        c = z.GetCell(i, j - 1);
        if (c.GetCellID() == 21 || c.GetCellID() == 211) {
          t_move[c_move] = 1;
          c_move++;
        }
      }
      if (((i + 1) < z.GetHeight()) && (move != 4)) {
        c = z.GetCell(i + 1, j);
        if (c.GetCellID() == 21 || c.GetCellID() == 211) {
          t_move[c_move] = 2;
          c_move++;
        }
      }
      if (((j + 1) < z.GetWidth()) && (move != 1)) {
        c = z.GetCell(i, j + 1);
        if (c.GetCellID() == 21 || c.GetCellID() == 211) {
          t_move[c_move] = 3;
          c_move++;
        }
      }
      if (((i - 1) >= 0) && (move != 2)) {
        c = z.GetCell(i - 1, j);
        if (c.GetCellID() == 21 || c.GetCellID() == 211) {
          t_move[c_move] = 4;
          c_move++;
        }
      }
      if (c_move > 0) {
        move = t_move[Math.abs((rand.nextInt() % c_move))];
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
      c = z.GetCell(i, j);
    }

  }

  public static void main(String[] args){
    Driver D = new Driver("resource/map.txt");

    D.PrintMenu();
  }
}