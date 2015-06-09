import java.util.ArrayList;

/**
 * Created by harikris on 01/06/15.
 */
public class GameOfLife {
    private Grid layout;

    GameOfLife(Grid layout) {
        this.layout = layout;
    }

    public void startGame() {
        Integer size = layout.getSize();
        for (ArrayList<Cell> eachRow : layout.getGrid()) {
            for (Cell eachCell : eachRow) {

            }

        }
    }

    public void setLayout(Grid layout) {
        this.layout = layout;
    }

    public Grid getLayout() {

        return layout;
    }
}
