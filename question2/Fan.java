class Fan{
	//data field
	private int speed;
	private static boolean on;
	private double radius;
	private String color;
	private String speedName;
	private static String status;
	private int Stat;
	Fan(){
		//no arg constructor
		speed =1;
		on = false;
		radius=1;
		color = "blue";
		speedName = "slow";
		status="fan is off";
		
	}
	Fan(int speed, double radius, String color){
		this.color=color;
		this.radius=radius;
		this.speed=speed;	
	}
	
	
	
	public int getStat() {
		return Stat;
	}
	public void setStat(int stat) {
	this.Stat=stat;
		
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
		if (speed == 1) {
			this.speedName = "slow";
			}
			else if (speed == 2) {
				this.speedName = "medium";
			}
			else if (speed == 3) {
				this.speedName = "fast";
			}
		
	
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSpeedName() {
		return speedName;
	}

	
	
	//action listener
	public void turnOn() {
		
		on=true;
		status = "fan is on";
	}
	public void turnOff() {
		
		on = false;
		
		status = "fan is off";
	}
	
	public String toString(){//overriding the toString() method  
		
		  return "Speed of fan : "+speedName+"\nRadius :"+radius+"\ncolor :"+color+ " \n"+status;  
		
		
}
}
