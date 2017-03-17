CC = g++
DEBUG = -g
CFLAGS = -Wall -c -std=c++11 $(DEBUG)
LFLAGS = -Wall -std=c++11 $(DEBUG)
OBJS = animal.o cage.o cell.o driver.o VirtualZoo.o  zoo.o

main: $(OBJS)
	$(CC) $(LFLAGS) $(OBJS) -o main
animal.o: ./animal/animal.cpp ./animal/animal.h
	$(CC) $(CFLAGS) ./animal/animal.cpp
cage.o: ./cage/cage.cpp ./cage/cage.h ./animal/animal.h ./cell/cell.h
	$(CC) $(CFLAGS) ./cage/cage.cpp
cell.o: ./cell/cell.cpp ./cell/cell.h ./animal/animal.h
	$(CC) $(CFLAGS) ./cell/cell.cpp
driver.o: ./driver/driver.cpp ./driver/driver.h ./animal/animal.h ./cage/cage.h ./cell/cell.h ./zoo/zoo.h
	$(CC) $(CFLAGS) ./driver/driver.cpp
VirtualZoo.o: ./VirtualZoo.cpp ./driver/driver.h ./animal/animal.h ./cage/cage.h ./cell/cell.h ./zoo/zoo.h
	$(CC) $(CFLAGS) ./VirtualZoo.cpp
zoo.o: ./zoo/zoo.cpp ./zoo/zoo.h ./cell/cell.h ./animal/animal.h ./cage/cage.h
	$(CC) $(CFLAGS) ./zoo/zoo.cpp
clean:
	\rm *.o *~ main
exec:
	ulimit -t 3; ulimit -v 16384; /main