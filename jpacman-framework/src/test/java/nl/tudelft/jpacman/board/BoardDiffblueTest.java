package nl.tudelft.jpacman.board;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BoardDiffblueTest {
    /**
     * Test {@link Board#Board(Square[][])}.
     *
     * <ul>
     *   <li>When 2D array of {@link Square} with {@code null}.
     * </ul>
     *
     * <p>Method under test: {@link Board#Board(Square[][])}
     */
    @Test
    @DisplayName("Test new Board(Square[][]); when 2D array of Square with 'null'")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testNewBoard_when2dArrayOfSquareWithNull() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot read the array length because "<local7>" is null
        //       at nl.tudelft.jpacman.board.Board.invariant(Board.java:36)
        //       at nl.tudelft.jpacman.board.Board.<init>(Board.java:27)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Square[][] grid = new Square[][]{null};

        // Act
        new Board(grid);
    }

    /**
     * Test {@link Board#Board(Square[][])}.
     *
     * <ul>
     *   <li>When array of {@link Square} with {@link BasicSquare} (default constructor).
     *   <li>Then return Height is one.
     * </ul>
     *
     * <p>Method under test: {@link Board#Board(Square[][])}
     */
    @Test
    @DisplayName(
            "Test new Board(Square[][]); when array of Square with BasicSquare (default constructor); then return Height is one")
    @Tag("MaintainedByDiffblue")
    void testNewBoard_whenArrayOfSquareWithBasicSquare_thenReturnHeightIsOne() {
        // Arrange
        Square[][] grid = new Square[][]{new Square[]{new BasicSquare()}};

        // Act
        Board actualBoard = new Board(grid);

        // Assert
        assertEquals(1, actualBoard.getHeight());
        assertEquals(1, actualBoard.getWidth());
        assertTrue(actualBoard.invariant());
    }

    /**
     * Test {@link Board#invariant()}.
     *
     * <p>Method under test: {@link Board#invariant()}
     */
    @Test
    @DisplayName("Test invariant()")
    @Tag("MaintainedByDiffblue")
    void testInvariant() {
        // Arrange
        Square[][] grid = new Square[][]{new Square[]{new BasicSquare()}};
        Board board = new Board(grid);

        // Act and Assert
        assertTrue(board.invariant());
    }

    /**
     * Test {@link Board#getWidth()}.
     *
     * <p>Method under test: {@link Board#getWidth()}
     */
    @Test
    @DisplayName("Test getWidth()")
    @Tag("MaintainedByDiffblue")
    void testGetWidth() {
        // Arrange
        Square[][] grid = new Square[][]{new Square[]{new BasicSquare()}};
        Board board = new Board(grid);

        // Act and Assert
        assertEquals(1, board.getWidth());
    }

    /**
     * Test {@link Board#getHeight()}.
     *
     * <ul>
     *   <li>Given array of {@link Square} with {@link BasicSquare} (default constructor).
     *   <li>Then return one.
     * </ul>
     *
     * <p>Method under test: {@link Board#getHeight()}
     */
    @Test
    @DisplayName(
            "Test getHeight(); given array of Square with BasicSquare (default constructor); then return one")
    @Tag("MaintainedByDiffblue")
    void testGetHeight_givenArrayOfSquareWithBasicSquare_thenReturnOne() {
        // Arrange
        Square[][] grid = new Square[][]{new Square[]{new BasicSquare()}};
        Board board = new Board(grid);

        // Act and Assert
        assertEquals(1, board.getHeight());
    }

    /**
     * Test {@link Board#getHeight()}.
     *
     * <ul>
     *   <li>Given {@link Board#Board(Square[][])} with grid is empty 2D array of {@link Square}.
     * </ul>
     *
     * <p>Method under test: {@link Board#getHeight()}
     */
    @Test
    @DisplayName("Test getHeight(); given Board(Square[][]) with grid is empty 2D array of Square")
    @Disabled("TODO: Complete this test")
    @Tag("MaintainedByDiffblue")
    void testGetHeight_givenBoardWithGridIsEmpty2dArrayOfSquare() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        //       at nl.tudelft.jpacman.board.Board.getHeight(Board.java:60)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Board board = new Board(new Square[][]{});

        // Act
        board.getHeight();
    }

    /**
     * Test {@link Board#squareAt(int, int)}.
     *
     * <p>Method under test: {@link Board#squareAt(int, int)}
     */
    @Test
    @DisplayName("Test squareAt(int, int)")
    @Tag("MaintainedByDiffblue")
    void testSquareAt() {
        // Arrange
        BasicSquare basicSquare = new BasicSquare();
        Square[][] grid = new Square[][]{new Square[]{basicSquare}};
        Board board = new Board(grid);

        // Act and Assert
        assertSame(basicSquare, board.squareAt(0, 0));
    }

    /**
     * Test {@link Board#withinBorders(int, int)}.
     *
     * <p>Method under test: {@link Board#withinBorders(int, int)}
     */
    @Test
    @DisplayName("Test withinBorders(int, int)")
    @Tag("MaintainedByDiffblue")
    void testWithinBorders() {
        // Arrange
        Board board =
                new Board(
                        new Square[][]{
                                new Square[]{new BasicSquare()},
                                new Square[]{new BasicSquare()},
                                new Square[]{new BasicSquare()}
                        });

        // Act and Assert
        assertFalse(board.withinBorders(2, 3));
    }

    /**
     * Test {@link Board#withinBorders(int, int)}.
     *
     * <ul>
     *   <li>When minus one.
     *   <li>Then return {@code false}.
     * </ul>
     *
     * <p>Method under test: {@link Board#withinBorders(int, int)}
     */
    @Test
    @DisplayName("Test withinBorders(int, int); when minus one; then return 'false'")
    @Tag("MaintainedByDiffblue")
    void testWithinBorders_whenMinusOne_thenReturnFalse() {
        // Arrange
        Square[][] grid = new Square[][]{new Square[]{new BasicSquare()}};
        Board board = new Board(grid);

        // Act and Assert
        assertFalse(board.withinBorders(0, -1));
    }

    /**
     * Test {@link Board#withinBorders(int, int)}.
     *
     * <ul>
     *   <li>When minus one.
     *   <li>Then return {@code false}.
     * </ul>
     *
     * <p>Method under test: {@link Board#withinBorders(int, int)}
     */
    @Test
    @DisplayName("Test withinBorders(int, int); when minus one; then return 'false'")
    @Tag("MaintainedByDiffblue")
    void testWithinBorders_whenMinusOne_thenReturnFalse2() {
        // Arrange
        Square[][] grid = new Square[][]{new Square[]{new BasicSquare()}};
        Board board = new Board(grid);

        // Act and Assert
        assertFalse(board.withinBorders(-1, 0));
    }

    /**
     * Test {@link Board#withinBorders(int, int)}.
     *
     * <ul>
     *   <li>When two.
     *   <li>Then return {@code false}.
     * </ul>
     *
     * <p>Method under test: {@link Board#withinBorders(int, int)}
     */
    @Test
    @DisplayName("Test withinBorders(int, int); when two; then return 'false'")
    @Tag("MaintainedByDiffblue")
    void testWithinBorders_whenTwo_thenReturnFalse() {
        // Arrange
        Square[][] grid = new Square[][]{new Square[]{new BasicSquare()}};
        Board board = new Board(grid);

        // Act and Assert
        assertFalse(board.withinBorders(2, 3));
    }

    /**
     * Test {@link Board#withinBorders(int, int)}.
     *
     * <ul>
     *   <li>When zero.
     *   <li>Then return {@code true}.
     * </ul>
     *
     * <p>Method under test: {@link Board#withinBorders(int, int)}
     */
    @Test
    @DisplayName("Test withinBorders(int, int); when zero; then return 'true'")
    @Tag("MaintainedByDiffblue")
    void testWithinBorders_whenZero_thenReturnTrue() {
        // Arrange
        Square[][] grid = new Square[][]{new Square[]{new BasicSquare()}};
        Board board = new Board(grid);

        // Act and Assert
        assertTrue(board.withinBorders(0, 0));
    }
}
