package io.codeforall.bootcamp.field;

public class Position {

    private int Col;

    private int Row;

    public Position(int col, int row){
        this.Col = col;
        this.Row = row;
    }

    public int getCol() {
        return Col;
    }

    public int getRow() {
        return Row;
    }

    public void setCol(int col) {

        Col = col;
    }

    public void setRow(int row) {
        Row = row;
    }


}
