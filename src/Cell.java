/**
 * Created by harikris on 01/06/15.
 */
public class Cell {
    private boolean state;
    private Position position;
    private Integer aliveNeighbours;

    public Integer getAliveNeighbours() {
        return aliveNeighbours;
    }

    public void setAliveNeighbours(Integer aliveNeighbours) {
        this.aliveNeighbours = aliveNeighbours;
    }

    Cell(boolean state) {
        this.state = state;
    }

    public boolean isAlive() {
        return state;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
}
