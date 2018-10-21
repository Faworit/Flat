import java.lang.reflect.Array;
import java.util.ArrayList;

public class Room {
    ArrayList<Wall> walls = new ArrayList<>();
    ArrayList<Door> doors = new ArrayList<>();
    ArrayList<Window> windows = new ArrayList<>();

    Room(ArrayList walls, ArrayList doors, ArrayList windows){
        this.walls = walls;
        this.doors = doors;
        this.windows = windows;
    }


}
