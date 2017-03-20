class Cage
{
	private int cage_id;
    private int n_animal;
    private int n_cell;
    private int cage_type;
    private Animal a[];
    private Cell c[];
	Cage()
	{
		n_animal = 0;
		n_cell = 0;
		a = new Animal[999];
		c = new Cell[999];
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
	public int CountFoodHerbivore()
	{
		int i;
		int sum = 0;
		for(i=0;i<n_animal;i++)
		{
			if (a[i].GetFoodType==1)
				sum += a[i].GetFoodQuantity();
		}
		return sum;
	}
	public int CountFoodCarnivore()
	{
		int i;
		int sum = 0;
		for(i=0;i<n_animal;i++)
		{
			if (a[i].GetFoodType==2)
				sum += a[i].GetFoodQuantity();
		}
		return sum;
	}
	public int CountFoodOmnivore()
	{
		int i;
		int sum = 0;
		for(i=0;i<n_animal;i++)
		{
			if (a[i].GetFoodType==3)
				sum += a[i].GetFoodQuantity();
		}
		return sum;
	}
	public void AddHabitat(Cell H)
	{
		if (n_cell==0)
		{
			cage_type = H.GetCellID();
			c[n_cell] = H;
			n_cell += 1;
			H.SetCageID(cage_id);
		}
		else
		{
			if (cage_type == H.GetCellID())
			{
				c[n_cell] = H;
				n_cell += 1;
				H.SetCageID(cage_id);
			}
		}
	}
	public boolean IsExist(int ID)
	{
		boolean found = false;
		int i = 0;
		while (i < n_animal)
		{
			if (a[i].GetType() == ID)
				found = true;
			i++;
		}
		return found;
	}
}			 
