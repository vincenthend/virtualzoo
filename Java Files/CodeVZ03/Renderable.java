class Zoo
{
	private int width;
	private int height;
	private int n_cage;
	private Cell c[][];
	private Cage cg[];
	Zoo()
	{
		n_cage = 0;
		width = 21;
		height = 21;
		c = new Cell[width][height];
		cg = new Cage[999];
	}
	Zoo(int w, int h)
	{
		n_cage = 0;
		width = w;
		height = h;
		c = new Cell[width][height];
		cg = new Cage[999];
	}
	public void AddCage()
	{
		cg[n_cage] = new Cage();
		cg[n_cage].SetCageID(n_cage);
		n_cage += 1;
	}
	public void AddCell(int x, int y, Cell C)
	{
		c[x][y] = C;
	}
	public int GetWidth()
	{
		return width;
	}
	public Cell GetCell(int x, int y)
	{
		return c[x][y];
	}
	public Cage GetCage()
	{
		return cg[n];
	}
	public int GetNCage()
	{
		return n_cage;
	}
	public int CountFoodHerbivore()
	{
		int i, sum;
		i = 0;
		sum = 0;
		for (i = 0; i < n_cage;i++) 
		{
			sum += cg[i].CountFoodHerbivore();
		}
		return sum;
	}
	public int CountFoodCarnivore()
	{
		int i, sum;
		i = 0;
		sum = 0;
		for (i = 0; i < n_cage;i++) 
		{
			sum += cg[i].CountFoodCarnivore();
		}
		return sum;
	}
	public int CountFoodOmnivore()
	{
		int i, sum;
		i = 0;
		sum = 0;
		for (i = 0; i < n_cage;i++) 
		{
			sum += cg[i].CountFoodOmnivore();
		}
		return sum;
	}
}