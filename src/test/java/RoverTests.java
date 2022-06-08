import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTests {
    @Test
    public void GivenNoCommandsNorth_Move_ReturnsTheSamePosition()
    {
        Command[] commands = {  };
        Position result = Rover.move(new Position(0,0,Orientation.N), Arrays.asList(commands));
        assertEquals(new Position(0,0,Orientation.N), result);
    }

    @Test
    public void GivenCommandsNorth_TurnLeft_ReturnsOrientation()
    {
        Command[] commands = { Command.Left };
        Position start = new Position(0,0,Orientation.N);
        Position result = Rover.turnLeft(start);
        assertEquals(new Position(0,0,Orientation.W), result);
    }
    @Test
    public void GivenCommandsWest_TurnLeft_ReturnsOrientation()
    {
        Command[] commands = { Command.Left };
        Position start = new Position(0,0,Orientation.W);
        Position result = Rover.turnLeft(start);
        assertEquals(new Position(0,0,Orientation.S), result);
    }
    @Test
    public void GivenCommandsSouth_TurnLeft_ReturnsOrientation()
    {
        Command[] commands = { Command.Left };
        Position start = new Position(0,0,Orientation.S);
        Position result = Rover.turnLeft(start);
        assertEquals(new Position(0,0,Orientation.E), result);
    }
    @Test
    public void GivenCommandsEast_TurnLeft_ReturnsOrientation()
    {
        Command[] commands = { Command.Left };
        Position start = new Position(0,0,Orientation.E);
        Position result = Rover.turnLeft(start);
        assertEquals(new Position(0,0,Orientation.N), result);
    }

    @Test
    public void GivenCommandsNorth_TurnRight_ReturnsOrientation()
    {
        Command[] commands = { Command.Right };
        Position start = new Position(0,0,Orientation.N);
        Position result = Rover.turnRight(start);
        assertEquals(new Position(0,0,Orientation.E), result);
    }
    @Test
    public void GivenCommandsWest_TurnRight_ReturnsOrientation()
    {
        Command[] commands = { Command.Right };
        Position start = new Position(0,0,Orientation.W);
        Position result = Rover.turnRight(start);
        assertEquals(new Position(0,0,Orientation.N), result);
    }
    @Test
    public void GivenCommandsSouth_TurnRight_ReturnsOrientation()
    {
        Command[] commands = { Command.Right };
        Position start = new Position(0,0,Orientation.S);
        Position result = Rover.turnRight(start);
        assertEquals(new Position(0,0,Orientation.W), result);
    }
    @Test
    public void GivenCommandsEast_TurnRight_ReturnsOrientation()
    {
        Command[] commands = { Command.Right };
        Position start = new Position(0,0,Orientation.E);
        Position result = Rover.turnRight(start);
        assertEquals(new Position(0,0,Orientation.S), result);
    }

    @Test
    public void GivenCommandsNorth_Advance_ReturnsPosition()
    {
        Command[] commands = { Command.Advance };
        Position start = new Position(0,0,Orientation.N);
        Position result = Rover.advance(start);
        assertEquals(new Position(start.getX() , start.getY() + 1, Orientation.N), result);
    }
    @Test
    public void GivenCommandsWest_Advance_ReturnsPosition()
    {
        Command[] commands = { Command.Advance };
        Position start = new Position(0,0,Orientation.W);
        Position result = Rover.advance(start);
        assertEquals(new Position(start.getX() - 1, start.getY(), Orientation.W), result);
    }
    @Test
    public void GivenCommandsSouth_Advance_ReturnsPosition()
    {
        Command[] commands = { Command.Advance };
        Position start = new Position(0,0,Orientation.S);
        Position result = Rover.advance(start);
        assertEquals(new Position(start.getX(), start.getY() - 1, Orientation.S), result);
    }
    @Test
    public void GivenCommandsEast_Advance_ReturnsPosition()
    {
        Command[] commands = { Command.Advance };
        Position start = new Position(0,0,Orientation.E);
        Position result = Rover.advance(start);
        assertEquals(new Position(start.getX() + 1, start.getY(), Orientation.E), result);
    }

    @Test
    public void GivenCommandsNorth_turnRightAndAvance_ReturnsPosition()
    {
        Command[] commands = { Command.Right, Command.Advance };
        Position start = new Position(5,5,Orientation.N);
        Position step1 = Rover.turnRight(start);
        Position step2 = Rover.advance(step1);
        assertEquals(new Position(start.getX() + 1, start.getY(), Orientation.E), step2);
    }
    @Test
    public void GivenCommandsWest_turnRightAndAvance_ReturnsPosition()
    {
        Command[] commands = { Command.Right, Command.Advance };
        Position start = new Position(5,5,Orientation.W);
        Position step1 = Rover.turnRight(start);
        Position step2 = Rover.advance(step1);
        assertEquals(new Position(start.getX(), start.getY() + 1, Orientation.N), step2);
    }
}
