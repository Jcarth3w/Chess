package chess.engine.board;

import chess.engine.pieces.Piece;

public class OccupiedTile extends Tile
{
    private Piece pieceOnTile;

    OccupiedTile(int coordinate, Piece pieceOnTile)
    {
        super(coordinate);
        this.pieceOnTile = pieceOnTile;
    }

    @Override
    public boolean occupied()
    {
        return true;
    }

    public Piece getPiece()
    {
        return this.pieceOnTile;
    }


}
