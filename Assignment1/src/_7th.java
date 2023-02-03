// Name - Arju Mondal, Roll no- 39
// 7.	Create four different classes with three of them containing the function main.
//Save the file with a different name than that of the class name and run each of the classes with the main function.
class MultipleMain{

    public static void main(String args[]){
        System.out.println("Name - Arju Mondal, Roll no- 39");
        MultipleMain2 my1 = new MultipleMain2();
        MultipleMain3 my2 = new MultipleMain3();
        MultipleMain4 my3 = new MultipleMain4();
        my1.main(1);
        my2.main('c');
        my3.main("MyString");
    }}
class MultipleMain2{

    public static void main(int i){
        System.out.println("Inside Overloaded main(int)");
    }}
class MultipleMain3{
    public static void main(char i){
        System.out.println("Inside Overloaded main(char)");
    }}
class MultipleMain4{
    public static void main(String str){
        System.out.println("Inside Overloaded main(string)");
    }
}