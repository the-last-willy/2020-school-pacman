package model.grid;
 
public
class Grid {
    public
    Grid(int width, int height, int[][] data) {
        this.width = width;
        this.height = height;

        this.data = data;
    }

    public
    Grid clear(int i, int j) {
        data[j][i] = 0;
        return this;
    }

    public
    boolean isPellet(int i, int j) {
        return data[j][i] == 2;
    }

    public
    boolean isPowerPellet(int i, int j) {
        return data[j][i] == 3;
    }

    public
    boolean isWall(int i, int j) {
        return data[j][i] == 1;
    }

    public
    int getWidth() {
        return width;
    }

    public
    int getHeight() {
        return height;
    }

    private
    int width, height;

    private
    int[][] data;
}
