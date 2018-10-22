import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Flat extends Constants {
    static double height;
    public static void main(String[] args) throws IOException {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Enter height of wall");
            String a = rd.readLine();
            height = Double.parseDouble(a);
            if(height<=0){
                System.out.println("You enter not correct height");
            }
        }
       while(height<=0);
        Create wall = new Create();
        ArrayList<Wall> kitchenWalls = new ArrayList<>();
        kitchenWalls = wall.createWalls(height);
        //пробовал как работает метод
       /* for (int i = 0; i<kitchenWall.size(); i++){
            Object obj = kitchenWall.get(i);
            System.out.println(((Wall) obj).weight);
        }*/
       ArrayList<Wall> livingRoomWalls = new ArrayList<>();
       livingRoomWalls = wall.createWalls(height);
       ArrayList<Wall> bedRoomWalls = new ArrayList<>();
       bedRoomWalls = wall.createWalls(height);

       Create door = new Create();
       ArrayList<Door> kitchenDoors = new ArrayList<>();
       kitchenDoors = door.createDoors(height);
       ArrayList<Door> livingRoomDoors = new ArrayList<>();
       livingRoomDoors = door.createDoors(height);
       ArrayList<Door> bedRoomDoors = new ArrayList<>();
       bedRoomDoors = door.createDoors(height);

       Create window = new Create();
       ArrayList<Window> kitchenWindoews = new ArrayList<>();
       kitchenWindoews = window.createWindows(height);
       ArrayList<Window> livingRoomWindows = new ArrayList<>();
       livingRoomWindows = window.createWindows(height);
       ArrayList<Window> bedRoomWindows = new ArrayList<>();
       bedRoomWindows = window.createWindows(height);

       Room kitchen = new Room(kitchenWalls, kitchenDoors, kitchenWindoews);
       Room livingRoom = new Room(livingRoomWalls, livingRoomDoors, livingRoomWindows);
       Room bedRoom = new Room(bedRoomWalls, bedRoomDoors, bedRoomWindows);
       ArrayList<Room> rooms = new ArrayList<>();
       rooms.add(kitchen);
       rooms.add(livingRoom);
       rooms.add(bedRoom);

       Calculation calculation = new Calculation();
       int countWindows = calculation.calculationWindows(rooms);
        System.out.println(countWindows);

        int countDoors = calculation.calculationDoors(rooms);
        System.out.println(countDoors);

       double squareOfFlat = calculation.squareOfFlat(rooms);
        System.out.println(squareOfFlat);


    }
}
