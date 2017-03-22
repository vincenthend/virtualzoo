/**
 * @author Mikhael Artur Darmakesuma / 13515099
 * Class driver, main program dan inisialisasi isi awal zoo
 */

import java.util.Scanner;

class Driver {
  private Zoo z;
  public Driver(String input) {
    //TBD
  }
  public void PrintMenu() {
    int choice, x1, y1, x2, y2;
    Scanner in = new Scanner(System.in);
    choice = 0;
    do {
      System.out.println("=========================================");
      System.out.println("|							 VIRTUAL ZOO						 |");
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
          System.out.println("|							 VIRTUAL ZOO						 |");
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
            System.out.println("X(0 - " << z -> GetWidth() - 1 << ")");
            System.out.println("Y(0 - " << z -> GetHeight() - 1 << ")");
            System.out.println("X1 :";
            cin >> x1;
            System.out.println("Y1 :";
            cin >> y1;
            System.out.println("X2 :";
            cin >> x2;
            System.out.println("Y2 :";
            cin >> y2;
            PrintZoo(x1, y1, x2, y2);
            System.out.println(endl;
            choice = 0;
          }
        } while (choice != 9);
      }
      else if (choice == 2) {
        StartTour();

      }
    } while (choice != 9);
  }
  public void PrintStatus() {
    System.out.println("========================================");
    System.out.println("			- Food Count -");
    System.out.println("	 Herbivore : " + z.CountFoodHerbivore());
    System.out.println("	 Carnivore : " + z.CountFoodCarnivore());
    System.out.println("	 Omnivore	: " + z.CountFoodOmnivore());
    System.out.println("========================================");
  }
  public void PrintZoo() {
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
          if (c != NULL) {
            if (c.GetCageID() > -1) {
              a = z.GetCage(c.GetCageID()).IsSpaceOccupied(i, j);
              if (a != NULL) {
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
      System.out.println(endl;
    }
  }
  public void PrintZoo(int x, int y) {
    int i, j;
    Cell * c;
    Animal * a;
    for (i = 0; i < z.GetWidth(); i++) {
      System.out.print("|");
      for (j = 0; j < z.GetHeight(); j++) {
        if (x == j && y == i) {
          System.out.print("X");
        }
        else {
          c = z.GetCell(i, j);
          if (c != NULL) {
            if (c.GetCageID() > -1) {
              a = z.GetCage(c.GetCageID()).IsSpaceOccupied(i, j);
              if (a != NULL) {
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
      System.out.println(endl;
    }
  }
  public void PrintZoo(int x1, int x2, int y1, int y2) {
    int i, j;
    Cell c;
    Animal a;
    for (i = y1; i <= y2; i++) {
      System.out.print("|");
      for (j = x1; j <= x2; j++) {
        c = z.GetCell(i, j);
        if (c != NULL) {
          if (c.GetCageID() > -1) {
            a = z.GetCage(c.GetCageID()).IsSpaceOccupied(i, j);
            if (a != NULL) {
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
      System.out.print("\n");
    }
  }
  public void StartTour() {
    int i, j, tx[ 10],ty[10], tc, move, t_move[4], c_move;
    int temp;
    Cell * c;
    Animal * a;
    bool walk = true;
    tc = 0;
    PrintZoo();
    PrintStatus();
    for (i = 0; i < z.GetWidth(); i++) {
      for (j = 0; j < z.GetHeight(); j++) {
        c = z.GetCell(i, j);
        if (c != NULL) {
          if (c.GetCellID() == 210) {
            tx[tc] = i;
            ty[tc] = j;
            tc++;
          }
        }
      }
    }
    move = 0;
    temp = (rand() % (tc));
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
          if (c != NULL) {
            if (c.GetCageID() > -1) {
              a = z.GetCage(c.GetCageID()).IsSpaceOccupied(i, j - 1);
              if (a != NULL) {
                a.Interact();
              }
            }
          }
        }
      }
      if (((i + 1) < z.GetHeight()) && (move != 4)) {
        c = z.GetCell(i + 1, j);
        if ((c.GetCellID() >= 11) && (c.GetCellID() <= 13)) {
          if (c != NULL) {
            if (c.GetCageID() > -1) {
              a = z.GetCage(c.GetCageID()).IsSpaceOccupied(i + 1, j);
              if (a != NULL) {
                a.Interact();
              }
            }
          }
        }
      }
      if (((j + 1) < z.GetWidth()) && (move != 1)) {
        c = z.GetCell(i, j + 1);
        if ((c.GetCellID() >= 11) && (c.GetCellID() <= 13)) {
          if (c != NULL) {
            if (c.GetCageID() > -1) {
              a = z.GetCage(c.GetCageID()).IsSpaceOccupied(i, j + 1);
              if (a != NULL) {
                a.Interact();
              }
            }
          }
        }
      }
      if (((i - 1) >= 0) && (move != 2)) {
        c = z.GetCell(i - 1, j);
        if ((c.GetCellID() >= 11) && (c.GetCellID() <= 13)) {
          if (c != NULL) {
            if (c.GetCageID() > -1) {
              a = z.GetCage(c.GetCageID()).IsSpaceOccupied(i - 1, j);
              if (a != NULL) {
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
        move = t_move[(rand() % c_move)];
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
  ;
