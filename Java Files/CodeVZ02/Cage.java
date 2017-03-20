class Cage
{
	Cage()
	{
		n_animal = 0;
		n_cell = 0;
		a = new Animal[999][];
		c = new Cell[999][];
		cage_id = -1;
		cage_type = 0;
	}
	public boolean IsFull()
	{
		return (n_animal >= ((n_cell / 10) * 3));
	}
	public void AddAnimal(Animal A)
	{
		A.SetLocationX(c[n_animal].GetLocationX());
		A.SetLocationY(c[n_animal].GetLocationY());
		a[n_animal] = A;
		n_animal +=1;
	}
	public void SetCageID(int n)
	{
		cage_id=n;
	}
	public int GetCageID()
	{
		return cage_id;
	}
	public int GetCageType()
	{
		return cage_type;
	}
	public Animal IsSpaceOccupied(int x, int y)
	{
		Animal ret;
		int i = 0;
		while (ret == null && i < n_animal)
			if (a[i].GetLocationX() == x && a[i].GetLocationY()== y)
				ret = a[i];
			else
				i += 1;
		return ret;	
	}
	
	int cage_id;
    int n_animal;
    int n_cell;
    int cage_type;
    Animal a[][];
    Cell c[][];
}			 
