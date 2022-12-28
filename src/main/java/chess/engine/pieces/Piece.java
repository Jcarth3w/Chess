package chess.engine.pieces;

import chess.engine.Color;
import chess.engine.board.Board;
import chess.engine.board.Move;

import java.util.List;

public abstract class Piece
{
    protected final int piecePosition;
    protected final Color pieceColor;

    Piece(final int piecePosition, final Color pieceColor)
    {
        this.piecePosition = piecePosition;
        this.pieceColor = pieceColor;
    }

    public abstract List<Move> calculateLegalMoves(final Board board);

    public Color getPieceColor()
    {
        return this.pieceColor;
    }

}
