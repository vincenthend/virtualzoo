import animal.Animal;
import cell.Cell;
import java.awt.Button;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import zoo.Zoo;

/**
 * Class driver, main program dan inisialisasi isi awal
 * zoo.
 *
 * @author Mikhael Artur Darmakesuma / 13515099
 */
public class GUIDriver {

  private Zoo zoo;
  private JFrame mainWindow;
  private JPanel zooMap;
  private JPanel buttonPane;
  private JPanel statusPane;
  private JLabel[][] mapLabel;
  private JLabel interactLabel;
  private boolean nextStep;

  /**
   * Inisialisasi driver dengan membaca dari file inputFile
   * Memasukkan data animal, habitat dari inputFile ke zoo dan menginisiasi cage.
   *
   * @param inputFile Nama file input
   */
  public GUIDriver(String inputFile) {
    try {
      //Input File
      FileReader inFile = new FileReader(inputFile);
      BufferedReader reader = new BufferedReader(inFile);
      Cell cellTemp;
      StringBuffer stringBuffer;
      int k;
      int l;
      boolean found;
      boolean enemy;
      Animal a;
      cellTemp = null;
      int height = Integer.parseInt(reader.readLine());
      int width = Integer.parseInt(reader.readLine());
      zoo = new Zoo(width, height);

      int i;
      int j;
      for (i = 0; i < zoo.getHeight(); i++) {
        stringBuffer = new StringBuffer(reader.readLine());
        for (j = 0; j < zoo.getWidth(); j++) {
          if ((stringBuffer.substring(j, j + 1)).equals("L")) {
            cellTemp = new Cell(i, j, 11);
          } else if ((stringBuffer.substring(j, j + 1)).equals("W")) {
            cellTemp = new Cell(i, j, 12);
          } else if ((stringBuffer.substring(j, j + 1).equals("A"))) {
            cellTemp = new Cell(i, j, 13);
          } else if ((stringBuffer.substring(j, j + 1)).equals("S")) {
            cellTemp = new Cell(i, j, 210);
          } else if ((stringBuffer.substring(j, j + 1)).equals("F")) {
            cellTemp = new Cell(i, j, 211);
          } else if ((stringBuffer.substring(j, j + 1)).equals("X")) {
            cellTemp = new Cell(i, j, 21);
          } else if ((stringBuffer.substring(j, j + 1)).equals("R")) {
            cellTemp = new Cell(i, j, 22);
          } else if ((stringBuffer.substring(j, j + 1)).equals("P")) {
            cellTemp = new Cell(i, j, 23);
          }
          zoo.addCell(i, j, cellTemp);
        }
      }
      zoo.addCage();
      //Add animal
      int temp = Integer.parseInt(reader.readLine());
      int animalId;
      int animalCount;
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
          while ((!(found)) && (k < zoo.getNCage())) {
            if ((a.getHabitat()[(((zoo.getCage(k)).getCageType()) % 10) - 1]) && !(zoo.getCage(k)
                .isFull())) {
              l = 0;
              enemy = false;
              while (l < a.getCEnemy()) {
                if (zoo.getCage(k).isExist(a.getEnemyList()[l])) {
                  enemy = true;
                }
                l++;
              }
              if (!(enemy)) {
                found = true;
                (zoo.getCage(k)).addAnimal(a);
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
    GUIDriver d = new GUIDriver("resource/map.txt");
    d.printInitial();
  }

  public void printInitial() {
    initWindow();

    //Print Map
    printZoo();
    mainWindow.add(zooMap);

    //Button Pane
    buttonPane = new JPanel();
    buttonPane.setLayout(new GridLayout(4, 0));

    Button startTour = new Button("Start Tour");
    buttonPane.add(startTour);
    mainWindow.add(buttonPane);

    mainWindow.setVisible(true);
    //Action Button
    startTour.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        try {
          startTourClick();
          mainWindow.getContentPane().removeAll();
          mainWindow.revalidate();
          mainWindow.repaint();
          mainWindow.setVisible(true);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    });
    //interactLabel = new JLabel("",JLabel.CENTER);
    //interactLabel.setSize(350,100);
  }

  public void initWindow() {
    mainWindow = new JFrame("VirtualZoo");
    mainWindow.setSize((zoo.getWidth() * 25 * 3) / 2, zoo.getHeight() * 25);
    mainWindow.setLayout(new GridLayout(0, 2));
  }

  private void startTourClick() throws InterruptedException {
    startTour();
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
    //Print Map
    zooMap = new JPanel();
    zooMap.setLayout(new GridBagLayout());
    zooMap.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));

    GridBagConstraints c = new GridBagConstraints();
    c.ipadx = 5;
    c.ipady = 5;

    //Print Zoo Map
    int i;
    int j;
    String symbol = "";
    Cell cell;
    Animal animal;
    mapLabel = new JLabel[zoo.getHeight()][zoo.getWidth()];
    for (i = 0; i < zoo.getHeight(); i++) {
      for (j = 0; j < zoo.getWidth(); j++) {
        c.gridx = j;
        c.gridy = i;

        cell = zoo.getCell(i, j);
        if (cell != null) {
          if (cell.getCageId() > -1) {
            animal = zoo.getCage(cell.getCageId()).isSpaceOccupied(i, j);
            if (animal != null) {
              symbol = animal.render();
            } else {
              symbol = cell.render();
            }
          } else {
            symbol = cell.render();
          }
        }
        mapLabel[i][j] = new JLabel(symbol);
        zooMap.add(mapLabel[i][j], c);
      }
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
    //Print Map
    zooMap = new JPanel();
    zooMap.setLayout(new GridBagLayout());
    zooMap.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));

    GridBagConstraints c = new GridBagConstraints();
    c.ipadx = 5;
    c.ipady = 5;

    //Print Zoo Map
    int i;
    int j;
    String symbol = "";
    Cell cell;
    Animal animal;
    mapLabel = new JLabel[zoo.getHeight()][zoo.getWidth()];
    for (i = 0; i < zoo.getHeight(); i++) {
      for (j = 0; j < zoo.getWidth(); j++) {
        c.gridx = j;
        c.gridy = i;
        if (j == x && i == y) {
          symbol = "X";
        } else {
          cell = zoo.getCell(i, j);
          if (cell != null) {
            if (cell.getCageId() > -1) {
              animal = zoo.getCage(cell.getCageId()).isSpaceOccupied(i, j);
              if (animal != null) {
                symbol = animal.render();
              } else {
                symbol = cell.render();
              }
            } else {
              symbol = cell.render();
            }
          }
        }
        mapLabel[i][j] = new JLabel(symbol);
        zooMap.add(mapLabel[i][j], c);
      }
    }
  }

  /**
   * Menjalankan tour kebun binatang dari pintu masuk ke pintu keluar
   * I. S.: Sembarang
   * F. S.: Perjalanan tour kebun binatang tertulis di layar
   */
  public void startTour() throws InterruptedException {
    int[] availMove = new int[4];
    int[] tx = new int[10];
    int[] ty = new int[10];
    final Cell[] c = {null};
    final Animal[] a = new Animal[1];
    int tc = 0;
    final int[] i = new int[1];
    final int[] j = new int[1];
    for (i[0] = 0; i[0] < zoo.getWidth(); i[0]++) {
      for (j[0] = 0; j[0] < zoo.getHeight(); j[0]++) {
        c[0] = zoo.getCell(i[0], j[0]);
        if (c[0] != null) {
          if (c[0].getCellId() == 210) {
            tx[tc] = i[0];
            ty[tc] = j[0];
            tc++;
          }
        }
      }
    }
    Random rand = new Random(System.currentTimeMillis());
    int temp = Math.abs((rand.nextInt() % (tc)));
    final int[] move = {0};
    final int[] cntMove = new int[1];
    i[0] = tx[temp];
    j[0] = ty[temp];
    final boolean[] walk = {true};
    final Container[] container = {null};

    int delay = 20;
    Timer timer = new Timer(delay, null);
    timer.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (c[0].getCellId() == 211 || !walk[0]) {
          timer.stop();
        } else {
          //Print Map

          container[0] = mainWindow.getContentPane();
          container[0].removeAll();

          //Print Zoo
          printZoo(j[0], i[0]);
          container[0].add(zooMap);

          mainWindow.setVisible(true);
          mainWindow.revalidate();
          mainWindow.repaint();
          printStatus();

          System.out.println("(" + i[0] + "," + j[0] + ")" + c[0].getCellId());
          //interact
          if (((j[0] - 1) >= 0) && (move[0] != 3)) {
            c[0] = zoo.getCell(i[0], j[0] - 1);
            if (c[0] != null) {
              if ((c[0].getCellId() >= 11) && (c[0].getCellId() <= 13)) {
                if (c[0].getCageId() > -1) {
                  a[0] = zoo.getCage(c[0].getCageId()).isSpaceOccupied(i[0], j[0] - 1);
                  if (a[0] != null) {
                    a[0].interact();
                  }
                }
              }
            }
          }
          if (((i[0] + 1) < zoo.getHeight()) && (move[0] != 4)) {
            c[0] = zoo.getCell(i[0] + 1, j[0]);
            if (c[0] != null) {
              if ((c[0].getCellId() >= 11) && (c[0].getCellId() <= 13)) {
                if (c[0].getCageId() > -1) {
                  a[0] = zoo.getCage(c[0].getCageId()).isSpaceOccupied(i[0] + 1, j[0]);
                  if (a[0] != null) {
                    a[0].interact();
                  }
                }
              }
            }
          }
          if (((j[0] + 1) < zoo.getWidth()) && (move[0] != 1)) {
            c[0] = zoo.getCell(i[0], j[0] + 1);
            if (c[0] != null) {
              if ((c[0].getCellId() >= 11) && (c[0].getCellId() <= 13)) {
                if (c[0].getCageId() > -1) {
                  a[0] = zoo.getCage(c[0].getCageId()).isSpaceOccupied(i[0], j[0] + 1);
                  if (a[0] != null) {
                    a[0].interact();
                  }
                }
              }
            }
          }
          if (((i[0] - 1) >= 0) && (move[0] != 2)) {
            c[0] = zoo.getCell(i[0] - 1, j[0]);
            if (c[0] != null) {
              if ((c[0].getCellId() >= 11) && (c[0].getCellId() <= 13)) {
                if (c[0].getCageId() > -1) {
                  a[0] = zoo.getCage(c[0].getCageId()).isSpaceOccupied(i[0] - 1, j[0]);
                  if (a[0] != null) {
                    a[0].interact();
                  }
                }
              }
            }
          }
          cntMove[0] = 0;
          if (((j[0] - 1) >= 0) && (move[0] != 3)) {
            c[0] = zoo.getCell(i[0], j[0] - 1);
            if (c[0].getCellId() == 21 || c[0].getCellId() == 211) {
              availMove[cntMove[0]] = 1;
              cntMove[0]++;
            }
          }
          if (((i[0] + 1) < zoo.getHeight()) && (move[0] != 4)) {
            c[0] = zoo.getCell(i[0] + 1, j[0]);
            if (c[0].getCellId() == 21 || c[0].getCellId() == 211) {
              availMove[cntMove[0]] = 2;
              cntMove[0]++;
            }
          }
          if (((j[0] + 1) < zoo.getWidth()) && (move[0] != 1)) {
            c[0] = zoo.getCell(i[0], j[0] + 1);
            if (c[0].getCellId() == 21 || c[0].getCellId() == 211) {
              availMove[cntMove[0]] = 3;
              cntMove[0]++;
            }
          }
          if (((i[0] - 1) >= 0) && (move[0] != 2)) {
            c[0] = zoo.getCell(i[0] - 1, j[0]);
            if (c[0].getCellId() == 21 || c[0].getCellId() == 211) {
              availMove[cntMove[0]] = 4;
              cntMove[0]++;
            }
          }
          if (cntMove[0] > 0) {
            move[0] = availMove[Math.abs((rand.nextInt() % cntMove[0]))];
            if (move[0] == 1) {
              j[0]--;
            } else {
              if (move[0] == 2) {
                i[0]++;
              } else {
                if (move[0] == 3) {
                  j[0]++;
                } else {
                  i[0]--;
                }
              }
            }
          } else {
            walk[0] = false;
          }
          c[0] = zoo.getCell(i[0], j[0]);
        }
      }
    });
    timer.start();
    container[0].add(buttonPane);
  }
}