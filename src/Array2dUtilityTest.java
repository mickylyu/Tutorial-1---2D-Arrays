import static org.junit.jupiter.api.Assertions.*;

public class Array2dUtilityTest {

    private int[][] array2d;
    private int[][] array2d2;

    private int[][] array2d3;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        array2d =
                new int[][]{
                        {1, -2, 3, 4, 5},
                        {6, 7, -8, 9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, -22, 23, 24, 25}
                };

        array2d2 =
                new int[][]{
                        {11, -2, 3, 14, 5},
                        {6, 71, 28, 9, 30},
                        {11, 123, -13, 14, 15},
                        {16, 17, 108, -29, 20},
                        {21, 22, 203, 24, 45}
                };

        array2d3 =
                new int[][] {
                        {14, 2, 3, 14, 5},
                        {6, 71, 28, 9, 30},
                        {11, 123, 13, 14, 15},
                        {16, 127, 108, 39, 20},
                        {21, 222, 20, 29, 45}
                };

    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        array2d = null;
        array2d2 = null;
        array2d3 = null;
    }

    @org.junit.jupiter.api.Test
    void sum() {
        assertTrue(Array2dUtility.sum(array2d) == 261);
        assertTrue(Array2dUtility.sum(array2d2) == 772);
        assertTrue(Array2dUtility.sum(array2d3) == 1005);
    }

    @org.junit.jupiter.api.Test
    void average() {
        assertTrue(Array2dUtility.average(array2d) == 10.44);
        assertTrue(Array2dUtility.average(array2d2) == 30.88);
        assertTrue(Array2dUtility.average(array2d3) == 40.2);
    }

    @org.junit.jupiter.api.Test
    void minimum() {
        assertTrue(Array2dUtility.minimum(array2d) == -22);
        assertTrue(Array2dUtility.minimum(array2d2) == -29);
        assertTrue(Array2dUtility.minimum(array2d3) == 2);
    }

    @org.junit.jupiter.api.Test
    void maximum() {
        assertTrue(Array2dUtility.maximum(array2d) == 25);
        assertTrue(Array2dUtility.maximum(array2d2) == 203);
        assertTrue(Array2dUtility.maximum(array2d3) == 222);
    }

    @org.junit.jupiter.api.Test
    void evenCountStandard() {
        assertTrue(Array2dUtility.evenCountStandard(array2d) == 12);
        assertTrue(Array2dUtility.evenCountStandard(array2d2) == 11);
        assertTrue(Array2dUtility.evenCountStandard(array2d3) == 12);
    }

    @org.junit.jupiter.api.Test
    void evenCountEnhanced() {
        assertTrue(Array2dUtility.evenCountEnhanced(array2d) == 12);
        assertTrue(Array2dUtility.evenCountEnhanced(array2d2) == 11);
        assertTrue(Array2dUtility.evenCountEnhanced(array2d3) == 12);
    }

    @org.junit.jupiter.api.Test
    void allPositive() {
        assertTrue(Array2dUtility.allPositive(array2d) == false);
        assertTrue(Array2dUtility.allPositive(array2d2) == false);
        assertEquals(true, Array2dUtility.allPositive(array2d3));
    }

    @org.junit.jupiter.api.Test
    void rowSums() {
        int[] rowSums1 = Array2dUtility.rowSums(array2d);
        int[] rowSums2 = Array2dUtility.rowSums(array2d2);
        int[] rowSums3 = Array2dUtility.rowSums(array2d3);

        assertEquals(11, rowSums1[0]);
        assertEquals(24, rowSums1[1]);
        assertEquals(65, rowSums1[2]);
        assertEquals(90, rowSums1[3]);
        assertEquals(71, rowSums1[4]);

        assertEquals(31, rowSums2[0]);
        assertEquals(144, rowSums2[1]);
        assertEquals(150, rowSums2[2]);
        assertEquals(132, rowSums2[3]);
        assertEquals(315, rowSums2[4]);

        assertEquals(38, rowSums3[0]);
        assertEquals(144, rowSums3[1]);
        assertEquals(176, rowSums3[2]);
        assertEquals(310, rowSums3[3]);
        assertEquals(337, rowSums3[4]);
    }

    @org.junit.jupiter.api.Test
    void colSums() {
        int[] colSums1 = Array2dUtility.colSums(array2d);
        int[] colSums2 = Array2dUtility.colSums(array2d2);
        int[] colSums3 = Array2dUtility.colSums(array2d3);

        assertEquals(55, colSums1[0]);
        assertEquals(12, colSums1[1]);
        assertEquals(49, colSums1[2]);
        assertEquals(70, colSums1[3]);
        assertEquals(75, colSums1[4]);

        assertEquals(65, colSums2[0]);
        assertEquals(231, colSums2[1]);
        assertEquals(329, colSums2[2]);
        assertEquals(32, colSums2[3]);
        assertEquals(115, colSums2[4]);

        assertEquals(68, colSums3[0]);
        assertEquals(545, colSums3[1]);
        assertEquals(172, colSums3[2]);
        assertEquals(105, colSums3[3]);
        assertEquals(115, colSums3[4]);
    }

}
