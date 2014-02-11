package sv.project_titanic.model;
import java.util.ArrayList;


public class Ship 
{
	private ArrayList<Coordinate> initialCoords;
	private ArrayList<Coordinate> currentCoords;
	
	public Ship(Coordinate[] inputCoords)
	{
		ArrayList<Coordinate> initalCoords = new ArrayList<Coordinate>();
		ArrayList<Coordinate> currentCoords = new ArrayList<Coordinate>();
		addShip(inputCoords);
		
	}
	
	/**
	 * Private method to add coords to arrayList.
	 */
	private void addShip(Coordinate[] input)
	{
		for(Coordinate inputCoord : input)
		{
			initialCoords.add(inputCoord);
			currentCoords.add(inputCoord);
		}
	}
	
	
	/**
	 * Checks if coord is a hit on the ship.
	 * Returns nothing but removes the corresponding Coordinate object if hit.
	 */
	public void shipHit(Coordinate coord)
	{
		Iterator<Coordinate> it = currentCoords.iterator();
		
		while(it.hasNext()){
			Coordinate shipCoord = it.next();
			
			if(shipCoord.equals(coord)){
				it.remove();
				return;
			}
		}
	}
	
	/**
	 * Checks if coords contains any Coordinate objects.
	 * @return True if no Coordinate objects exist in coords.
	 */
	public boolean noMoreShip()
	{
		if(currentCoords.isEmpty()){
			return true;
		}
		return false;
	}
	
	/**
	 * Returns True if coords contains coord.
	 * @return True if the ship contains the coordinate.
	 */
	public boolean hasCoordinate(Coordinate coord)
	{
		for(Coordinate shipCoord : coords){
			if(shipCoord.equals(coord)){
				return true;
			}
		}
		return false;
	}
	/*
	 * Returns the inital coords of the ship.
	 */
	public ArrayList<Coordinate> getInitialCoords()
	{
		return initialCoords;
	}
}


