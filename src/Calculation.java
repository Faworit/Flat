import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Calculation {

    public int calculationWindows(ArrayList<Room> rooms) {
        int countWindows = 0;
        ArrayList<ArrayList<Window>> windows = new ArrayList<>();
        for (int i = 0; i < rooms.size(); i++) {
            Object obj = rooms.get(i);
            windows.add(((Room) obj).windows);
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
            doors.add(((Room) obj).doors);
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
            walls.add(((Room) obj).walls);
        }
        Object nsWall;
        Object ewWall;
        for (int i = 0; i < walls.size(); i++) {

            ArrayList<Wall> wal = new ArrayList<>();
            wal = walls.get(i);
            nsWall = wal.get(1);
            ewWall = wal.get(3);
            square = ((Wall) nsWall).width * ((Wall) ewWall).width;
            squareOfRoom.add(square);
        }
        for (int i = 0; i < squareOfRoom.size(); i++) {
            squareOfFlat += squareOfRoom.get(i);
        }
        return squareOfFlat;
    }

    public int countOfWall(ArrayList<Wall> kitchen, ArrayList<Wall> livingroom, ArrayList<Wall> bedroom){
        int countOfWall=0;
        ArrayList<Wall> allWalls = new ArrayList<>();
        ArrayList<Integer> idOfWalls = new ArrayList<>();
        HashSet<Integer> uniqueId = new HashSet<>();
        HashSet<Wall> uniqueWall = new HashSet<>();

       allWalls.addAll(kitchen);
       allWalls.addAll(livingroom);
       allWalls.addAll(bedroom);

       uniqueWall.addAll(allWalls);
       for (int i=0; i<allWalls.size(); i++){
           countOfWall++;
       }
        return countOfWall;
    }

    /*public int countOfWall(ArrayList<Room> rooms) {
        int countOfWall = 0;
        ArrayList<Object> singleWalls = new ArrayList<>();
        ArrayList<Integer> idOfWall = new ArrayList<>();
        ArrayList<ArrayList<Wall>> walls = new ArrayList<>();
        Set<Integer> uniqueId = new HashSet<>();

        for (int i = 0; i < rooms.size(); i++) {
            Object obj = rooms.get(i);
            walls.add(((Room) obj).walls);
        }

        for (int i = 0; i < walls.size(); i++) {
            ArrayList<Wall> wal = new ArrayList<>();
            wal = walls.get(i);
            for (int z = 0; z < wal.size(); z++) {
                Object nWall;
                nWall = wal.get(i);
                singleWalls.add(nWall);
            }
        }
        for (int i = 0; i < singleWalls.size(); i++) {
            Object nWall;
            nWall = singleWalls.get(i);
            int id = ((Wall) nWall).id;
            idOfWall.add(id);
        }

        uniqueId.addAll(idOfWall);
        for (int i = 0; i < uniqueId.size(); i++) {
            countOfWall++;
        }
        return countOfWall;
    }*/
}
