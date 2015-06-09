import java.util.ArrayList;

/**
 * Created by harikris on 01/06/15.
 */
public class Grid {
    private Integer size;
    private ArrayList<ArrayList<Cell>> grid = new ArrayList<ArrayList<Cell>>(size);

    public Integer countAliveNeighbours(Cell cell) {
        Position pos = cell.getPosition();

        return 0;
    }

    public void IntializeGrid() {
        for (int i = 0; i < grid.size(); i++)
            for (int j = 0; j < grid.size(); j++) {
                Cell c = grid.get(i).get(j);
                c.setPosition(new Position(i, j));
                c.setAliveNeighbours(countAliveNeighbours(c));
            }
    }

    public boolean isCornerCell(Cell cell) {
        int x = cell.getPosition().getX();
        int y = cell.getPosition().getY();
        if ((x == 0 || x == size - 1) && (y == 0 || y == size - 1)) {
            return true;
        } else {
            return false;
        }
    }


    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }

    public ArrayList<ArrayList<Cell>> getGrid() {
        return grid;
    }
}
