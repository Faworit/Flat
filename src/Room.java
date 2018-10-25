
import java.util.ArrayList;

public class Room {
   private ArrayList<Wall> walls = new ArrayList<>();
   private ArrayList<Door> doors = new ArrayList<>();
   private ArrayList<Window> windows = new ArrayList<>();

    Room(ArrayList walls, ArrayList doors, ArrayList windows){
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
    }

    public ArrayList<Wall> getWalls() {
        return walls;
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public ArrayList<Window> getWindows() {
        return windows;
    }

    public void setWalls(ArrayList<Wall> walls) {
        this.walls = walls;
    }

    public void setDoors(ArrayList<Door> doors) {
        this.doors = doors;
    }

    public void setWindows(ArrayList<Window> windows) {
        this.windows = windows;
    }
}
