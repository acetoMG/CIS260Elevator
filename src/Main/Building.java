
package Main;



public class Building {
    private int floors, columns;
    
    public Building(int floors, int columns) {
        this.floors = floors;
        this.columns = columns;
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
    
}