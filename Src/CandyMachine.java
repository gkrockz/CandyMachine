import javax.swing.*; 

public class CandyMachine 
{
	public static void main(String[] args) 
 {		
		Vendor obj = new Vendor();       // Instance Of Vendor Machine.
		int tot = obj.getTotal();
		
		while(obj.IsEmpty())    
		{
			String input = JOptionPane.showInputDialog(null , "Enter The Number Of Candies  🍬  You Need : ", null , JOptionPane.PLAIN_MESSAGE);
			
			int n = Integer.parseInt(input);    
			if (n > tot) 
			{	
				JOptionPane.showMessageDialog(null,"Candy Issued 🍬 : " + (tot),null, JOptionPane.INFORMATION_MESSAGE);               // Candy UI.
				JOptionPane.showMessageDialog(null, "Sorry Candies Got Over!. You Can Collect Remaining " + (n-tot) +" 🍬 Candies When The Stock Is Up. Thank You, Come Agian.😊", null , JOptionPane.WARNING_MESSAGE);
				tot = tot - n;
				obj.setTotal(tot);
				if(obj.IsEmpty())
				{
					break;
				}
			
			} 
			
			else 
			{
				JOptionPane.showMessageDialog(null,"Candy Issued 🍬 :  " + n,null, JOptionPane.INFORMATION_MESSAGE);
				tot = tot - n;
				obj.setTotal(tot);
				if(!obj.IsEmpty())
				{
					JOptionPane.showMessageDialog(null, "Sorry Candies Got Over !. Thank You, Come Agian.😊", null , JOptionPane.WARNING_MESSAGE);
				}
			}
		}
	}
}
