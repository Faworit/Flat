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

       Calculation calculationWindows = new Calculation();
       int countWindows = calculationWindows.calculationWindows(rooms);
        System.out.println(countWindows);




       //Доделай окна и сортировку с расчетами












       /* ArrayList<Wall> kitchenWalls = new ArrayList<>();
        int id;
        double weight;
        do{
            System.out.println("Enter id of wall");
            String a = rd.readLine();
            id = Integer.parseInt(a);
            System.out.println("Enter weight of wall");
            String w = rd.readLine();
            weight = Double.parseDouble(w);
            if(id<=0 || weight<=0){
                System.out.println("You enter not correct information");
            }
        }
        while(id<=0 || weight<=0);
        Wall northKitchenWall = new Wall(id, height, weight);
        kitchenWalls.add(northKitchenWall);

        do{
            System.out.println("Enter id of wall");
            String a = rd.readLine();
            id = Integer.parseInt(a);
            System.out.println("Enter weight of wall");
            String w = rd.readLine();
            weight = Double.parseDouble(w);
            if(id<=0 || weight<=0){
                System.out.println("You enter not correct information");
            }
        }
        while(id<=0 || weight<=0);
        Wall southKitchenWall = new Wall(id, height, weight);
        kitchenWalls.add(southKitchenWall);

        do{
            System.out.println("Enter id of wall");
            String a = rd.readLine();
            id = Integer.parseInt(a);
            System.out.println("Enter weight of wall");
            String w = rd.readLine();
            weight = Double.parseDouble(w);
            if(id<=0 || weight<=0){
                System.out.println("You enter not correct information");
            }
        }
        while(id<=0 || weight<=0);
        Wall westKitchenWall = new Wall(id, height, weight);
        kitchenWalls.add(westKitchenWall);

        do{
            System.out.println("Enter id of wall");
            String a = rd.readLine();
            id = Integer.parseInt(a);
            System.out.println("Enter weight of wall");
            String w = rd.readLine();
            weight = Double.parseDouble(w);
            if(id<=0 || weight<=0){
                System.out.println("You enter not correct information");
            }
        }
        while(id<=0 || weight<=0);
        Wall eastKitchenWall = new Wall(id, height, weight);
        kitchenWalls.add(eastKitchenWall);

        // I finish walls of kitchen, continue next room

        ArrayList<Wall> livingRoomWalls = new ArrayList<>();
        do{
            System.out.println("Enter id of wall");
            String a = rd.readLine();
            id = Integer.parseInt(a);
            System.out.println("Enter weight of wall");
            String w = rd.readLine();
            weight = Double.parseDouble(w);
            if(id<=0 || weight<=0){
                System.out.println("You enter not correct information");
            }
        }
        while(id<=0 || weight<=0);
        Wall northLivingRoomWall = new Wall(id, height, weight);
        livingRoomWalls.add(northLivingRoomWall);

        do{
            System.out.println("Enter id of wall");
            String a = rd.readLine();
            id = Integer.parseInt(a);
            System.out.println("Enter weight of wall");
            String w = rd.readLine();
            weight = Double.parseDouble(w);
            if(id<=0 || weight<=0){
                System.out.println("You enter not correct information");
            }
        }
        while(id<=0 || weight<=0);
        Wall southLivingRoomWall = new Wall(id, height, weight);
        livingRoomWalls.add(southLivingRoomWall);

        do{
            System.out.println("Enter id of wall");
            String a = rd.readLine();
            id = Integer.parseInt(a);
            System.out.println("Enter weight of wall");
            String w = rd.readLine();
            weight = Double.parseDouble(w);
            if(id<=0 || weight<=0){
                System.out.println("You enter not correct information");
            }
        }
        while(id<=0 || weight<=0);
        Wall westLivingRoomWall = new Wall(id, height, weight);
        livingRoomWalls.add(westLivingRoomWall);

        do{
            System.out.println("Enter id of wall");
            String a = rd.readLine();
            id = Integer.parseInt(a);
            System.out.println("Enter weight of wall");
            String w = rd.readLine();
            weight = Double.parseDouble(w);
            if(id<=0 || weight<=0){
                System.out.println("You enter not correct information");
            }
        }
        while(id<=0 || weight<=0);
        Wall eastLivingRoomWall = new Wall(id, height, weight);
        livingRoomWalls.add(eastLivingRoomWall);
        */





    }
}
