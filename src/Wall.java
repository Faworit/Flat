import java.util.Objects;

public class Wall {
    int id;
    double height;
    double width;

    Wall(int id, double height, double weight){
        this.id = id;
        this.height = height;
        this.width = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wall wall = (Wall) o;
        return id == wall.id
                &&
                Double.compare(wall.height, height) == 0 &&
                Double.compare(wall.width, width) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, height, width);
    }
}
