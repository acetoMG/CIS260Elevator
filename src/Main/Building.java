
package Main;



public class Building {
    private int floors, columns;
    private String buildingName;
    private Simulator sim = new Simulator();
    private float test;
    
    
    public Building(int floors, int columns) {
        this.floors = floors;
        this.columns = columns;
    }
    public Building() {
        
    }                
    public void setBuildingPref() {
        sim.setPreferences(this.floors, this.columns, this.buildingName);
    }
    
    

    
    public int getFloors(){
        return this.floors;
    }
    public int getColumns(){
        return this.columns;
    }
    public void setFloors(int floors) {
        this.floors = floors;
    }
    public void setColumns(int columns) {
        this.columns = columns;
    }
    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }
}
