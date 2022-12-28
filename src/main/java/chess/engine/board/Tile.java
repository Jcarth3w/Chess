package chess.engine.board;
import chess.engine.pieces.Piece;

import java.util.HashMap;
import java.util.Map;

public abstract class Tile
{
    protected final int coordinate;
    private static final Map<Integer, EmptyTile> EMPTY_TILES = createAllPossibleEmptyTiles();

    Tile(int coordinate)
    {
        this.coordinate = coordinate;
    }

    public static Tile createTile(final int tileCoordinate, final Piece piece)
    {
        return piece != null ? new OccupiedTile(tileCoordinate, piece) : EMPTY_TILES.get(tileCoordinate);
    }

    public abstract boolean occupied();

    public abstract Piece getPiece();

    private static Map<Integer, EmptyTile> createAllPossibleEmptyTiles()
    {
        final Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();

        for(int i = 0; i < 64; i++)
        {
            emptyTileMap.put(i, new EmptyTile(i));
        }

        return emptyTileMap;
    }


}
