package chess.engine.pieces;
import chess.engine.Color;
import chess.engine.board.Board;
import chess.engine.board.Move;
import chess.engine.board.Tile;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece
{
    private final static int[] MOVE_COORDINATES = {-9, -8, -7, -1, 1, 7, 8, 9};

    public King(final int piecePosition, final Color pieceColor)
    {
        super(piecePosition, pieceColor);
    }

    @Override
    public List<Move> calculateLegalMoves(Board board)
    {
        int destinationCoordinate;
        List<Move> legalMoves = new ArrayList<>();

        for(final int currentMoveCoordinate : MOVE_COORDINATES)
        {
            destinationCoordinate = this.piecePosition + currentMoveCoordinate;

            if(true)
            {
                final Tile destinationTile = board.getTile(destinationCoordinate);
                if(destinationTile.occupied())
                {
                    legalMoves.add(new Move());
                }
                else
                {
                    final Piece pieceAtDestination = destinationTile.getPiece();
                    final Color pieceColor = pieceAtDestination.getPieceColor();

                    if(this.pieceColor != pieceColor)
                    {
                        legalMoves.add(new Move());
                    }
                }
            }
        }
        return legalMoves;
    }
}
