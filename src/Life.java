class Life extends Insurance
{    
	public Life() 
	{        
		super("life");   
	}    
  
	public void setInsuranceCost(double cost) 
	{        
		super.setMonthlyCost(cost);    
	}    
 
	public void displayInfo() 
	{        
		System.out.println("Insurance:\n\ttype: " + this.getTypeInsurance() + 
				"\n\tMonthly Cost: " + this.getMonthlyCost());    
	}
}