class Vendor
{
	private int total = 30;
	private boolean flag = true;

	public int getTotal()               // Getter Method For Getting Total Stock Of Candies.
	{
		return total;
	}

	public void setTotal(int total)    // Setter Method For Updating Total Stock.
	{
		this.total = total;
	}

	public boolean IsEmpty()          // Method To Check The Total Quantity Of Candies, After Every Purchase.
	{
		if(total <= 0)
		{
			flag = false;
		}
		return flag;
		
	}
}