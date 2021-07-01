class Vendor
{
	private int total = 30;
	private boolean flag = true;

	public int getTotal()               // Getter
	{
		return total;
	}

	public void setTotal(int total)    // Setter
	{
		this.total = total;
	}

	public boolean IsEmpty()          // Method to check the total quantity of candies, after every purchase attempt made.
	{
		if(total <= 0)
		{
			flag = false;
		}
		return flag;
		
	}
}
