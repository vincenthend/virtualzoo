/**
 * @author Mikhael Artur Darmakesuma / 13515099
 * Class driver, main program dan inisialisasi isi awal zoo
 */

import java.util.Scanner;
import java.util.Random;

class Driver {
  private Zoo z;
  public Driver(String input) {
    Cell c;
	DataInputStream in_stream = new DataInputStream(
      new BufferedInputStream(
        new FileInputStream(Input)));
    String s;
    int i, j, k, l, w, h, temp, a_id, a_count;
    bool found, enemy;
    Animal a;
    a = NULL;
    getline(myfile, s);
    i = 0;
    temp = 0;
    c = NULL;
    while ((s[i] >= '0') && (s[i] <= '9')) {
      temp = (temp * 10) + (s[i] - '0');
      i++;
    }
    h = temp;
    getline(myfile, s);
    i = 0;
    temp = 0;
    while ((s[i] >= '0') && (s[i] <= '9')) {
      temp = (temp * 10) + (s[i] - '0');
      i++;
    }
    w = temp;
    z = new Zoo(w, h);
    for (i = 0; i < z.GetHeight(); i++) {
      getline(myfile, s);
      for (j = 0; j <= z.GetWidth(); j++) {
        if (s[j] == 'L'){
          c = new Cell(i, j, 11);
        }
        else {
          if (s[j] == 'W') {
            c = new Cell(i, j, 12);
          }
          else {
            if (s[j] == 'A') {
              c = new Cell(i, j, 13);
            }
            else {
              if (s[j] == 'S') {
                c = new Cell(i, j, 210);
              }
              else {
                if (s[j] == 'F') {
                  c = new Cell(i, j, 211);
                }
                else {
                  if (s[j] == 'X') {
                    c = new Cell(i, j, 21);
                  }
                  else {
                    if (s[j] == 'R') {
                      c = new Cell(i, j, 22);
                    }
                    else {
                      if (s[j] == 'P') {
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
    for (i = 0; i < z.GetHeight(); i++) {
      for (j = 0; j < z.GetWidth(); j++) {
        found = false;
        c = z.GetCell(i, j);
        if ((c.GetCellID()>= 11) && (c.GetCellID() <= 13)) {
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
    getline(myfile, s);
    i = 0;
    temp = 0;
    while ((s[i] >= '0') && (s[i] <= '9')) {
      temp = (temp * 10) + (s[i] - '0');
      i++;
    }
    for (i = 0; i < temp; i++) {
      getline(myfile, s);
      a_id = 0;
      j = 0;
      while ((s[j] >= '0') && (s[j] <= '9')) {
        a_id = (a_id * 10) + (s[j] - '0');
        j++;
      }
      j++;
      a_count = 0;
      while ((s[j] >= '0') && (s[j] <= '9')) {
        a_count = (a_count * 10) + (s[j] - '0');
        j++;
      }
      k = 0;
      for (j = 0; j < a_count; j++) {
        a = new Animal(a_id);
        found = false;
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
    myfile.close();
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
            PrintZoo();
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
            PrintZoo(x1, y1, x2, y2);
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
  public void PrintZoo() {//lebih pas dipindah ke zoo
    int i, j;
    Cell c;
    Animal a;
    for (i = 0; i < z.GetWidth(); i++) {
      System.out.print("|");
      for (j = 0; j < z.GetHeight(); j++) {
        if (x == j && y == i) {
          System.out.print("X");
        }
        else {
          c = z.GetCell(i, j);
          if (c != null) {
            if (c.GetCageID() > -1) {
              a = z.GetCage(c.GetCageID()).IsSpaceOccupied(i, j);
              if (a != null) {
                a.Render();
              }
              else {
                c.Render();
              }
            }
            else {
              c.Render();
            }
          }
          else {
            System.out.print("?");
          }
        }
        System.out.print("|");
      }
      System.out.println();
    }
  }
  public void PrintZoo(int x, int y) {//lebih pas dipindah ke zoo
    int i, j;
    Cell c;
    Animal a;
    for (i = 0; i < z.GetWidth(); i++) {
      System.out.print("|");
      for (j = 0; j < z.GetHeight(); j++) {
        if (x == j && y == i) {
          System.out.print("X");
        }
        else {
          c = z.GetCell(i, j);
          if (c != null) {
            if (c.GetCageID() > -1) {
              a = z.GetCage(c.GetCageID()).IsSpaceOccupied(i, j);
              if (a != null) {
                a.Render();
              }
              else {
                c.Render();
              }
            }
            else {
              c.Render();
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
  public void PrintZoo(int x1, int x2, int y1, int y2) {//lebih pas dipindah ke zoo
    int i, j;
    Cell c;
    Animal a;
    for (i = y1; i <= y2; i++) {
      System.out.print("|");
      for (j = x1; j <= x2; j++) {
        c = z.GetCell(i, j);
        if (c != null) {
          if (c.GetCageID() > -1) {
            a = z.GetCage(c.GetCageID()).IsSpaceOccupied(i, j);
            if (a != null) {
              a.Render();
            }
            else {
              c.Render();
            }
          }
          else {
            c.Render();
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
    PrintZoo();
    PrintStatus();
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
    temp = (rand.nextInt() % (tc));
    i = tx[temp];
    j = ty[temp];
    while (c.GetCellID() != 211 && walk) {
      //Print Zoo
      PrintZoo(j, i);
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
        move = t_move[(rand.nextInt() % c_move)];
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
    Driver D = new Driver();

    D.PrintMenu();
  }
}
