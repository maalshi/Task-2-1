package Items;


public abstract class ElectricityItem {
	

	private String name = null;
	private Integer power = 0;
	private int consumption = 0;
	Boolean turnedOn;
	
	
	//constructor
	public ElectricityItem (String name, int power, int consumption){
		this.name=name;
		
		this.power = power;
		this.consumption = consumption;
		turnedOn=false;
	
	}
	
		//getters and setters
		public String getName(){
		return name;
		}
	
		public void setName (String name){
		this.name = name;
		}
		
		public  int getPower(){
		return power;
		}
	
		public void setPower (int power) {
			
			this.power = power;
		}
				
		public int getConsumption(){
		return consumption;
		}
	
		public void setConsumption (int consumption) {
			
		this.consumption = consumption;
		}
		
		public Boolean getTurnedOn(){
			return turnedOn;
			}
		
		public void setTurnedOn (Boolean turnedOn){
			this.turnedOn = turnedOn;
			}
		
		
		//create method Turn On
		public void turnOn(){
		
		turnedOn =true;
		}
		
		
		//create method Turn Off
		public void turnOff(){
		
		turnedOn =false;
		}
	
	
	 //create general for all items method "Working"
	 public String working()  {
	 	 		 
	    return "Work has started: ";
		 
	 }
	 
	 
	 	 
	//convert to String
	public String toString(){
		return( "[Item from: " + getClass()+ " name = " + name +" power= "+power +" consumption= "+ consumption+" turnedOn= "+ turnedOn + " ]");
	}
	
	

}



