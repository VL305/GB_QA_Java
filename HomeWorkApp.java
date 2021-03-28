public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWorlds();
        checkSumSign(2, 2);
        printColor(1);
        compareNumbers(3, 7);

    }
    public static void printThreeWorlds(){
        System.out.println("Orange,\nBanana, \nApple");
    }
    public static void checkSumSign(int a, int b){
        if ((a+b)>=0) System.out.println("Сумма положительная");
        else{System.out.println("Сумма отрицательная");}

    }
    public static void printColor(int value){
        if (value <= 0) System.out.println("Красный");
        else if ( value > 0 || value <= 100) System.out.println("Жёлтый");
        else System.out.println("Зелёный");
    }
    public static void compareNumbers(int a, int b){
        if (a >= b) System.out.println("a >= b ");
        else System.out.println("a < b");
    }




}
