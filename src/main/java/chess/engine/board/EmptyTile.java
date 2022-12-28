package chess.engine.board;

import chess.engine.pieces.Piece;

public class EmptyTile extends Tile
{
    EmptyTile(final int coordinate)
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
