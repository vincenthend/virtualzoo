package animal;

import java.io.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAnimal
{
	@Test
	public void InitialAssertTest1()
	{
		Animal animaltest = new Pelican();
		assertEquals("1.Tipe salah!",1,animaltest.getType());
		assertEquals("1.Jumlah makanan salah!",5,animaltest.getFoodQuantity());
		assertEquals("1.Tipe makanan salah!",2,animaltest.getFoodType());
		assertEquals("1.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("1.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("1.Habitat salah!",false,animaltest.getHabitat()[0]);
		assertEquals("1.Habitat salah!",true,animaltest.getHabitat()[1]);
		assertEquals("1.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("1.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("1.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest2()
	{
		Animal animaltest = new Owl();
		assertEquals("2.Tipe salah!",2,animaltest.getType());
		assertEquals("2.Jumlah makanan salah!",1,animaltest.getFoodQuantity());
		assertEquals("2.Tipe makanan salah!",2,animaltest.getFoodType());
		assertEquals("2.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("2.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("2.Habitat salah!",false,animaltest.getHabitat()[0]);
		assertEquals("2.Habitat salah!",true,animaltest.getHabitat()[1]);
		assertEquals("2.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("2.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("2.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest3()
	{
		Animal animaltest = new Pigeon();
		assertEquals("3.Tipe salah!",3,animaltest.getType());
		assertEquals("3.Jumlah makanan salah!",1,animaltest.getFoodQuantity());
		assertEquals("3.Tipe makanan salah!",1,animaltest.getFoodType());
		assertEquals("3.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("3.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("3.Habitat salah!",false,animaltest.getHabitat()[0]);
		assertEquals("3.Habitat salah!",true,animaltest.getHabitat()[1]);
		assertEquals("3.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("3.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("3.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest4()
	{
		Animal animaltest = new Canary();
		assertEquals("4.Tipe salah!",4,animaltest.getType());
		assertEquals("4.Jumlah makanan salah!",1,animaltest.getFoodQuantity());
		assertEquals("4.Tipe makanan salah!",1,animaltest.getFoodType());
		assertEquals("4.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("4.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("4.Habitat salah!",false,animaltest.getHabitat()[0]);
		assertEquals("4.Habitat salah!",true,animaltest.getHabitat()[1]);
		assertEquals("4.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("4.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("4.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest5()
	{
		Animal animaltest = new Bat();
		assertEquals("5.Tipe salah!",5,animaltest.getType());
		assertEquals("5.Jumlah makanan salah!",1,animaltest.getFoodQuantity());
		assertEquals("5.Tipe makanan salah!",1,animaltest.getFoodType());
		assertEquals("5.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("5.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("5.Habitat salah!",false,animaltest.getHabitat()[0]);
		assertEquals("5.Habitat salah!",true,animaltest.getHabitat()[1]);
		assertEquals("5.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("5.Initial jumlah musuh salah!",2,animaltest.getCEnemy());
		assertEquals("5.Array Enemy salah!",2,animaltest.getEnemyList()[0]);
		assertEquals("5.Array Enemy salah!",4,animaltest.getEnemyList()[1]);
	}
	@Test
	public void InitialAssertTest6()
	{
		Animal animaltest = new Eagle();
		assertEquals("6.Tipe salah!",6,animaltest.getType());
		assertEquals("6.Jumlah makanan salah!",2,animaltest.getFoodQuantity());
		assertEquals("6.Tipe makanan salah!",2,animaltest.getFoodType());
		assertEquals("6.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("6.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("6.Habitat salah!",false,animaltest.getHabitat()[0]);
		assertEquals("6.Habitat salah!",true,animaltest.getHabitat()[1]);
		assertEquals("6.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("6.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("6.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest7()
	{
		Animal animaltest = new Toucan();
		assertEquals("7.Tipe salah!",7,animaltest.getType());
		assertEquals("7.Jumlah makanan salah!",1,animaltest.getFoodQuantity());
		assertEquals("7.Tipe makanan salah!",1,animaltest.getFoodType());
		assertEquals("7.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("7.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("7.Habitat salah!",false,animaltest.getHabitat()[0]);
		assertEquals("7.Habitat salah!",true,animaltest.getHabitat()[1]);
		assertEquals("7.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("7.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("7.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest8()
	{
		Animal animaltest = new Chicken();
		assertEquals("8.Tipe salah!",8,animaltest.getType());
		assertEquals("8.Jumlah makanan salah!",2,animaltest.getFoodQuantity());
		assertEquals("8.Tipe makanan salah!",3,animaltest.getFoodType());
		assertEquals("8.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("8.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("8.Habitat salah!",true,animaltest.getHabitat()[0]);
		assertEquals("8.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("8.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("8.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("8.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest9()
	{
		Animal animaltest = new Cat();
		assertEquals("9.Tipe salah!",9,animaltest.getType());
		assertEquals("9.Jumlah makanan salah!",4,animaltest.getFoodQuantity());
		assertEquals("9.Tipe makanan salah!",2,animaltest.getFoodType());
		assertEquals("9.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("9.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("9.Habitat salah!",true,animaltest.getHabitat()[0]);
		assertEquals("9.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("9.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("9.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("9.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest10()
	{
		Animal animaltest = new Cow();
		assertEquals("10.Tipe salah!",10,animaltest.getType());
		assertEquals("10.Jumlah makanan salah!",2000,animaltest.getFoodQuantity());
		assertEquals("10.Tipe makanan salah!",1,animaltest.getFoodType());
		assertEquals("10.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("10.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("10.Habitat salah!",true,animaltest.getHabitat()[0]);
		assertEquals("10.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("10.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("10.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("10.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest11()
	{
		Animal animaltest = new Mouse();
		assertEquals("11.Tipe salah!",11,animaltest.getType());
		assertEquals("11.Jumlah makanan salah!",2,animaltest.getFoodQuantity());
		assertEquals("11.Tipe makanan salah!",1,animaltest.getFoodType());
		assertEquals("11.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("11.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("11.Habitat salah!",true,animaltest.getHabitat()[0]);
		assertEquals("11.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("11.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("11.Initial jumlah musuh salah!",1,animaltest.getCEnemy());
		assertEquals("11.Array Enemy awal kosong!",9,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest12()
	{
		Animal animaltest = new Goat();
		assertEquals("12.Tipe salah!",12,animaltest.getType());
		assertEquals("12.Jumlah makanan salah!",200,animaltest.getFoodQuantity());
		assertEquals("12.Tipe makanan salah!",1,animaltest.getFoodType());
		assertEquals("12.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("12.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("12.Habitat salah!",true,animaltest.getHabitat()[0]);
		assertEquals("12.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("12.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("12.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("12.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest13()
	{
		Animal animaltest = new Llama();
		assertEquals("13.Tipe salah!",13,animaltest.getType());
		assertEquals("13.Jumlah makanan salah!",1000,animaltest.getFoodQuantity());
		assertEquals("13.Tipe makanan salah!",1,animaltest.getFoodType());
		assertEquals("13.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("13.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("13.Habitat salah!",true,animaltest.getHabitat()[0]);
		assertEquals("13.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("13.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("13.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("13.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest14()
	{
		Animal animaltest = new Snake();
		assertEquals("14.Tipe salah!",14,animaltest.getType());
		assertEquals("14.Jumlah makanan salah!",10,animaltest.getFoodQuantity());
		assertEquals("14.Tipe makanan salah!",2,animaltest.getFoodType());
		assertEquals("14.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("14.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("14.Habitat salah!",true,animaltest.getHabitat()[0]);
		assertEquals("14.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("14.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("14.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("14.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest15()
	{
		Animal animaltest = new Sheep();
		assertEquals("15.Tipe salah!",15,animaltest.getType());
		assertEquals("15.Jumlah makanan salah!",1,animaltest.getFoodQuantity());
		assertEquals("15.Tipe makanan salah!",1,animaltest.getFoodType());
		assertEquals("15.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("15.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("15.Habitat salah!",true,animaltest.getHabitat()[0]);
		assertEquals("15.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("15.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("15.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("15.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest16()
	{
		Animal animaltest = new Chameleon();
		assertEquals("16.Tipe salah!",16,animaltest.getType());
		assertEquals("16.Jumlah makanan salah!",1,animaltest.getFoodQuantity());
		assertEquals("16.Tipe makanan salah!",2,animaltest.getFoodType());
		assertEquals("16.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("16.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("16.Habitat salah!",true,animaltest.getHabitat()[0]);
		assertEquals("16.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("16.Habitat salah!",false,animaltest.getHabitat()[2]);		
		assertEquals("16.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("16.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest17()
	{
		Animal animaltest = new Salmon();
		assertEquals("17.Tipe salah!",17,animaltest.getType());
		assertEquals("17.Jumlah makanan salah!",1,animaltest.getFoodQuantity());
		assertEquals("17.Tipe makanan salah!",2,animaltest.getFoodType());
		assertEquals("17.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("17.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("17.Habitat salah!",false,animaltest.getHabitat()[0]);
		assertEquals("17.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("17.Habitat salah!",true,animaltest.getHabitat()[2]);		
		assertEquals("17.Initial jumlah musuh salah!",2,animaltest.getCEnemy());
		assertEquals("17.Array Enemy awal kosong!",19,animaltest.getEnemyList()[0]);
		assertEquals("17.Array Enemy awal salah!",21,animaltest.getEnemyList()[1]);
	}
	@Test
	public void InitialAssertTest18()
	{
		Animal animaltest = new Whale();
		assertEquals("18.Tipe salah!",18,animaltest.getType());
		assertEquals("18.Jumlah makanan salah!",1,animaltest.getFoodQuantity());
		assertEquals("18.Tipe makanan salah!",2,animaltest.getFoodType());
		assertEquals("18.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("18.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("18.Habitat salah!",false,animaltest.getHabitat()[0]);
		assertEquals("18.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("18.Habitat salah!",true,animaltest.getHabitat()[2]);		
		assertEquals("18.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("18.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest19()
	{
		Animal animaltest = new Squid();
		assertEquals("19.Tipe salah!",19,animaltest.getType());
		assertEquals("19.Jumlah makanan salah!",600,animaltest.getFoodQuantity());
		assertEquals("19.Tipe makanan salah!",2,animaltest.getFoodType());
		assertEquals("19.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("19.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("19.Habitat salah!",false,animaltest.getHabitat()[0]);
		assertEquals("19.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("19.Habitat salah!",true,animaltest.getHabitat()[2]);		
		assertEquals("19.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("19.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest20()
	{
		Animal animaltest = new Goldfish();
		assertEquals("20.Tipe salah!",20,animaltest.getType());
		assertEquals("20.Jumlah makanan salah!",1,animaltest.getFoodQuantity());
		assertEquals("20.Tipe makanan salah!",2,animaltest.getFoodType());
		assertEquals("20.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("20.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("20.Habitat salah!",false,animaltest.getHabitat()[0]);
		assertEquals("20.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("20.Habitat salah!",true,animaltest.getHabitat()[2]);		
		assertEquals("20.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("20.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest21()
	{
		Animal animaltest = new Turtle();
		assertEquals("21.Tipe salah!",21,animaltest.getType());
		assertEquals("21.Jumlah makanan salah!",100,animaltest.getFoodQuantity());
		assertEquals("21.Tipe makanan salah!",2,animaltest.getFoodType());
		assertEquals("21.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("21.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("21.Habitat salah!",false,animaltest.getHabitat()[0]);
		assertEquals("21.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("21.Habitat salah!",true,animaltest.getHabitat()[2]);		
		assertEquals("21.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("21.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest22()
	{
		Animal animaltest = new Seal();
		assertEquals("22.Tipe salah!",22,animaltest.getType());
		assertEquals("22.Jumlah makanan salah!",25,animaltest.getFoodQuantity());
		assertEquals("22.Tipe makanan salah!",2,animaltest.getFoodType());
		assertEquals("22.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("22.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("22.Habitat salah!",false,animaltest.getHabitat()[0]);
		assertEquals("22.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("22.Habitat salah!",true,animaltest.getHabitat()[2]);		
		assertEquals("22.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("22.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void InitialAssertTest23()
	{
		Animal animaltest = new Dolphin();
		assertEquals("23.Tipe salah!",23,animaltest.getType());
		assertEquals("23.Jumlah makanan salah!",1,animaltest.getFoodQuantity());
		assertEquals("23.Tipe makanan salah!",1,animaltest.getFoodType());
		assertEquals("23.Lokasi initial X salah!",-99,animaltest.getLocationX());
		assertEquals("23.Lokasi initial Y salah!",-99,animaltest.getLocationY());
		assertEquals("23.Habitat salah!",false,animaltest.getHabitat()[0]);
		assertEquals("23.Habitat salah!",false,animaltest.getHabitat()[1]);
		assertEquals("23.Habitat salah!",true,animaltest.getHabitat()[2]);		
		assertEquals("23.Initial jumlah musuh salah!",0,animaltest.getCEnemy());
		assertEquals("23.Array Enemy awal tidak kosong!",0,animaltest.getEnemyList()[0]);
	}
	@Test
	public void SetterTest()
	{
		Animal animaltest = new Pelican();
		animaltest.setLocationX(0);
		animaltest.setLocationY(0);
		assertEquals("Setter X gagal!",0,animaltest.getLocationX());
		assertEquals("Setter Y gagal!",0,animaltest.getLocationY());
		animaltest.move(3,5);
		assertEquals("Move X gagal!",3,animaltest.getLocationX());
		assertEquals("Move Y gagal!",5,animaltest.getLocationY());
		
	}
}
