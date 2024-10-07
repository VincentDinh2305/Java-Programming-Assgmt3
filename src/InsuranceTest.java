import java.util.Scanner;
class InsuranceTest 
{    
	public static void main(String[] args) 
	{        
		try (Scanner sc = new Scanner(System.in)) 
		{
			String choice = "";        
			while (true) 
			{
				Insurance ins = null;            
				System.out.print("Do you want to continue? (Y/N): ");            
				choice = sc.nextLine(); 
				
				if (choice.equalsIgnoreCase("n"))                
					break;            
				System.out.print("Enter type of insurance (Health/Life): ");            
				String type = sc.nextLine();            
				System.out.print("Enter monthly cost: ");            
				double cost = sc.nextDouble();            
				sc.nextLine();
				
				if (type.equalsIgnoreCase("Health")) 
				{                
					ins = new Health();                
					ins.setMonthlyCost(cost);                
					ins.displayInfo();            
				} 
				
				else if (type.equalsIgnoreCase("Life")) 
				{                
					ins = new Life();                
					ins.setMonthlyCost(cost);                
					ins.displayInfo();            
				}        
			}
		}    
	}
}