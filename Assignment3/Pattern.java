/* 5. Create the following vase pattern using a loop:<br>
  <img width="150" alt="image" src="https://user-images.githubusercontent.com/78160448/219923496-936658c1-048f-45c1-982a-fac2dae86658.png">

<br><b>--> Pattern.java</b>
<br><br><br> */
// Name - Arju Mondal, Roll no- 39
public class Pattern {
    static void printStar(int len){
        for (int i = 0; i < len; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printFrontCover(int len){
        System.out.print("\\");
        for (int i = 0; i < len-2; i++) {
            System.out.print(" ");
        }
        System.out.println("/\n");
    }

    static void printBackCover(int len){
        System.out.print("/");
        for (int i = 0; i < len-2; i++) {
            System.out.print(" ");
        }
        System.out.println("\\\n");
    }

    public static void main(String[] args) {
        int height = 7;
        int length = 12;
        System.out.println("Name - Arju Mondal, Roll no- 39");
        printStar(length);
        for (int i = 0; i < height-2; i++) {
           printFrontCover(length);
           printBackCover(length);
        }
        printStar(length);
    }


}
