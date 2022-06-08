import java.util.Objects;

public class Position {
    int x;
    int y;
    Orientation o;

    public Position(int x, int y, Orientation o) {
        this.x = x;
        this.y = y;
        this.o = o;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Orientation getO() {
        return o;
    }

    @Override
    public boolean equals (Object o) {

        if (!(o instanceof Position)) {
            return false;
        }

        Position p = (Position) o;
        if (this.x == p.x && this.y == p.y && this.o == p.o){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, o);
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", o=" + o +
                '}';
    }
}