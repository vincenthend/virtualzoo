CC = g++ -std=c++11
DEBUG = -g
CFLAGS = -Wall -c -std=c++11 $(DEBUG)
LFLAGS = -Wall -std=c++11 $(DEBUG)
OBJS = air_animal.o amphibian.o animal.o cage.o cell.o driver.o facility.o habitat.o land_animal.o VirtualZoo.o water_animal.o zoo.o

main: $(OBJS)
	$(CC) $(LFLAGS) $(OBJS) -o main
air_animal.o: ./air_animal/air_animal.cpp ./air_animal/air_animal.h ./animal/animal.h ./renderable/renderable.h
	$(CC) $(CFLAGS) ./air_animal/air_animal.cpp
amphibian.o: ./amphibian/amphibian.cpp ./amphibian/amphibian.h ./air_animal/air_animal.h ./animal/animal.h ./renderable/renderable.h ./land_animal/land_animal.h ./water_animal/water_animal.h
	$(CC) $(CFLAGS) ./amphibian/amphibian.cpp
animal.o: ./animal/animal.cpp ./animal/animal.h ./renderable/renderable.h
	$(CC) $(CFLAGS) ./animal/animal.cpp
cage.o: ./cage/cage.cpp ./cage/cage.h ./animal/animal.h ./renderable/renderable.h ./habitat/habitat.h ./cell/cell.h
	$(CC) $(CFLAGS) ./cage/cage.cpp	
cell.o: ./cell/cell.cpp ./cell/cell.h ./renderable/renderable.h ./animal/animal.h
	$(CC) $(CFLAGS) ./cell/cell.cpp	
driver.o: ./driver/driver.cpp ./driver/driver.h ./animal/animal.h ./renderable/renderable.h ./cage/cage.h ./habitat/habitat.h ./cell/cell.h ./facility/facility.h ./renderable/renderable.h ./zoo/zoo.h 
	$(CC) $(CFLAGS) ./driver/driver.cpp	
facility.o: ./facility/facility.cpp ./facility/facility.h ./cell/cell.h ./renderable/renderable.h ./animal/animal.h
	$(CC) $(CFLAGS) ./facility/facility.cpp	
habitat.o: ./habitat/habitat.cpp ./habitat/habitat.h ./cell/cell.h ./renderable/renderable.h ./animal/animal.h
	$(CC) $(CFLAGS) ./habitat/habitat.cpp	
land_animal.o: ./land_animal/land_animal.cpp ./land_animal/land_animal.h ./animal/animal.h ./renderable/renderable.h
	$(CC) $(CFLAGS) ./land_animal/land_animal.cpp	
VirtualZoo.o: VirtualZoo.cpp ./driver/driver.h ./animal/animal.h ./renderable/renderable.h ./cage/cage.h ./habitat/habitat.h ./cell/cell.h ./facility/facility.h ./zoo/zoo.h
	$(CC) $(CFLAGS) VirtualZoo.cpp	
water_animal.o: ./water_animal/water_animal.cpp ./water_animal/water_animal.h ./animal/animal.h ./renderable/renderable.h
	$(CC) $(CFLAGS) ./water_animal/water_animal.cpp
zoo.o: ./zoo/zoo.cpp ./zoo/zoo.h ./cell/cell.h ./renderable/renderable.h ./animal/animal.h ./cage/cage.h ./habitat/habitat.h
	$(CC) $(CFLAGS) ./zoo/zoo.cpp
	
clean:
	\rm -f *.o *~ main
	
exec:
	ulimit -t 3; ulimit -v 16384; /main