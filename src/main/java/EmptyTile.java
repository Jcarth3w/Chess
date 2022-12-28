public class EmptyTile extends Tile
{
    EmptyTile(int coordinate)
    {
        super(coordinate);
    }

    @Override
    public boolean occupied()
    {
        return false;
    }

    @Override
    public Piece getPiece()
    {
        return null;
    }


}
