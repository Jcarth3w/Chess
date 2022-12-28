public abstract class Tile
{
    int coordinate;

    Tile(int coordinate)
    {
        this.coordinate = coordinate;
    }

    public abstract boolean occupied();

    public abstract Piece getPiece();




}
