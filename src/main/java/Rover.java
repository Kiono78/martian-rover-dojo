import java.util.List;

public class Rover {
    public static Position move(Position start, List<Command> commands)
    {
        // for (Command command: commands)
        // {
        //     switch (command):
        //     {
        //         case Command.Left:
                    
        //     }
        // }

        return new Position(0,0,start.getO());
    }
    public static Position turnLeft(Position start)
    {
        switch(start.getO())
        {
            case N:
                return (new Position(start.getX(), start.getY(), Orientation.W));
            case W:
                return (new Position(start.getX(), start.getY(), Orientation.S));
             case S:
                return (new Position(start.getX(), start.getY(), Orientation.E));
             case E:
                return (new Position(start.getX(), start.getY(), Orientation.N));
            default:
                return start;
        }
    }
    public static Position turnRight(Position start)
    {
        switch(start.getO())
        {
            case N:
                return (new Position(start.getX(), start.getY(), Orientation.E));
            case W:
                return (new Position(start.getX(), start.getY(), Orientation.N));
             case S:
                return (new Position(start.getX(), start.getY(), Orientation.W));
             case E:
                return (new Position(start.getX(), start.getY(), Orientation.S));
            default:
                return start;
        }
    }

    public static Position advance(Position start)
    {
        switch(start.getO())
        {
            case N:
                return (new Position(start.getX(), start.getY() + 1, start.getO()));
            case W:
                return (new Position(start.getX() - 1, start.getY(), start.getO()));
            case S:
                return (new Position(start.getX(), start.getY() - 1, start.getO()));
            case E:
                return (new Position(start.getX() + 1, start.getY(), start.getO()));
            default:
                return start;
        }
    }
}
