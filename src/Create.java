import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Create {

    public ArrayList<Wall> createWalls(double height) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Wall> walls = new ArrayList<>();
        int id;
        double width;
        do{
            System.out.println("Enter id of wall");
            String a = rd.readLine();
            id = Integer.parseInt(a);
            System.out.println("Enter wall width");
            String w = rd.readLine();
            width = Double.parseDouble(w);
            if(id<=0 || width<=0){
                System.out.println("You enter not correct information");
            }
        }
        while(id<=0 || width<=0);
        Wall northWall = new Wall(id, height, width);
        walls.add(northWall);

        do{
            System.out.println("Enter id of wall");
            String a = rd.readLine();
            id = Integer.parseInt(a);
            System.out.println("Enter wall width");
            String w = rd.readLine();
            width = Double.parseDouble(w);
            if(id<=0 || width<=0){
                System.out.println("You enter not correct information");
            }
        }
        while(id<=0 || width<=0);
        Wall southWall = new Wall(id, height, width);
        walls.add(southWall);

        do{
            System.out.println("Enter id of wall");
            String a = rd.readLine();
            id = Integer.parseInt(a);
            System.out.println("Enter wall width");
            String w = rd.readLine();
            width = Double.parseDouble(w);
            if(id<=0 || width<=0){
                System.out.println("You enter not correct information");
            }
        }
        while(id<=0 || width<=0);
        Wall westWall = new Wall(id, height, width);
        walls.add(westWall);

        do{
            System.out.println("Enter id of wall");
            String a = rd.readLine();
            id = Integer.parseInt(a);
            System.out.println("Enter wall width");
            String w = rd.readLine();
            width = Double.parseDouble(w);
            if(id<=0 || width<=0){
                System.out.println("You enter not correct information");
            }
        }
        while(id<=0 || width<=0);
        Wall eastWall = new Wall(id, height, width);
        walls.add(eastWall);
        return walls;
    }
    public ArrayList<Door> createDoors(double height) throws IOException {
        ArrayList<Door> doors = new ArrayList<>();
        String exit;
        String ex = "exit";
        do {
            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
            double heightOfDoor;
            do {
                System.out.println("Enter height of door");
                String a = rd.readLine();
                heightOfDoor = Double.parseDouble(a);
                if (heightOfDoor > height) {
                    System.out.println("door above wall");
                }
            }
            while (heightOfDoor > height);

            int id;
            double width;
            do {
                System.out.println("Enter id of door");
                String a = rd.readLine();
                id = Integer.parseInt(a);
                System.out.println("Enter width of door");
                String b = rd.readLine();
                width = Double.parseDouble(b);
                if (id <= 0 || width <= 0) {
                    System.out.println("You enter not correct information");
                }
            }
            while (id <= 0 || width <= 0);
            Door door = new Door(id, height, width);
            doors.add(door);
            System.out.println("If you don't need to create next door enter \"exit\"");
            exit = rd.readLine();
        }
        while(!exit.equals(ex));

        return doors;
    }
}
