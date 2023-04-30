/* 4. Using an enhanced for (for-each) loop, copy the content of one
3-dimensional array to another 3-dimensional array and display its
contents.
<br><b>--> Array3D.java</b>
<br><br><br> */
// Name - Arju Mondal, Roll no- 39
public class Array3D {
    public static void main(String[] args) {
        System.out.println("Name - Arju Mondal, Roll no- 39");
        int[][][] array = {
                {
                    {1, 2}, {3, 4}
                },
                {
                    {5, 6}, {7, 8}
                },
        };

        // using for each loop ...
        for (int[][] a : array) {
            for (int [] b : a) {
                for (int c : b) {
                    System.out.print(c + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        // using normal for loop ...
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.println ("intArray [" + i + "][" + j + "][" + k + "] = " + array[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
