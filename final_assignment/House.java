
public class House implements Building {
	
	protected int floors;
	protected double flArea;
	protected int totalRooms =0;
	protected int maxFloor = 0;
	protected double rooms[][] = new double[100][100]; //store my rooms
	


	public House(int floors) {
		this.floors = floors;
		//following are needed in the methods but arnt passed in
		this.flArea = flArea; //total floor area
		this.totalRooms = totalRooms;
		
		
		if(floors <0 || floors > 5 ) {
			throw new IllegalArgumentException("A house needs at least 1 floor");
		}
	}//end constructor
		
		public void addRoom(double area, int floor){
			totalRooms = totalRooms + 1;
			
			rooms[floor][area]= rooms[floor][(int) area];
			
		}//end add room
		
	
	
		public int getNumWindows() {
			//houses 2 windows per floor + 1 for extra room. More then 3 floors +2 extra room
			int windows = 0;
			windows = floors * 2;
			if(totalRooms > 0) {
				windows =+ totalRooms;
			}
			
			System.out.println(windows);
			return windows;
			
		}//end add windows

	public  double getFloorSpace(int floor) {
		double i=0;
		
	
			for(int j=0;j<100; j++) {
				i =+ rooms[floor][j];
			}//end loop
			return i;
	}//end return floor space
	public double getTotalFloorSpace() {
		return flArea;
	}
	
	public String tostring() {
		return "House: " + getNumWindows() + " Windows," + totalRooms + " Rooms, Floor Space: " + flArea + "and " + floors + "Floors" ;
					}
}//end class


