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

        ArrayList<Wall> kitchenWalls = new ArrayList<>();
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
            if(id<=0 || weight<=0){9
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





    }
}
