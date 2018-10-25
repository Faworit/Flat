import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Calculation {

    public int calculationWindows(ArrayList<Room> rooms) {
        int countWindows = 0;
        ArrayList<ArrayList<Window>> windows = new ArrayList<>();
        for (int i = 0; i < rooms.size(); i++) {
            Object obj = rooms.get(i);
            windows.add(((Room) obj).getWindows());
        }
        for (int i = 0; i < windows.size(); i++) {
            ArrayList<Window> win = new ArrayList<>();
            win = windows.get(i);
            for (int j = 0; j < win.size(); j++) {
                countWindows++;
            }
        }
        return countWindows;
    }

    public int calculationDoors(ArrayList<Room> rooms) {
        int countDoors = 0;
        ArrayList<ArrayList<Door>> doors = new ArrayList<>();
        for (int i = 0; i < rooms.size(); i++) {
            Object obj = rooms.get(i);
            doors.add(((Room) obj).getDoors());
        }
        for (int i = 0; i < doors.size(); i++) {
            ArrayList<Door> dor = new ArrayList<>();
            dor = doors.get(i);
            for (int j = 0; j < dor.size(); j++) {
                countDoors++;
            }
        }
        return countDoors;

    }

    public double squareOfFlat(ArrayList<Room> rooms) {
        double squareOfFlat = 0;
        double square;
        ArrayList<Double> squareOfRoom = new ArrayList<>();
        ArrayList<ArrayList<Wall>> walls = new ArrayList<>();
        for (int i = 0; i < rooms.size(); i++) {
            Object obj = rooms.get(i);
            walls.add(((Room) obj).getWalls());
        }
        Object nsWall;
        Object ewWall;
        for (int i = 0; i < walls.size(); i++) {

            ArrayList<Wall> wal = new ArrayList<>();
            wal = walls.get(i);
            nsWall = wal.get(1);
            ewWall = wal.get(3);
            square = ((Wall) nsWall).getWidth() * ((Wall) ewWall).getWidth();
            squareOfRoom.add(square);
        }
        for (int i = 0; i < squareOfRoom.size(); i++) {
            squareOfFlat += squareOfRoom.get(i);
        }
        return squareOfFlat;
    }

    public int countOfWall(ArrayList<Wall> kitchen, ArrayList<Wall> livingroom, ArrayList<Wall> bedroom){
        int countOfWall=0;
        HashSet<Wall> uniqueWalls = new HashSet<>();
        uniqueWalls.addAll(kitchen);
        uniqueWalls.addAll(livingroom);
        uniqueWalls.addAll(bedroom);
        for(int i =0; i<uniqueWalls.size(); i++){
            countOfWall++;
        }
        return countOfWall;
    }
}