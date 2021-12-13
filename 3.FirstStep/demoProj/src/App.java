package demoProj.src;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Helloooooooo, World!");

        int myInt = 5;
        float myFloat = 5.24f;
        double myDouble = 5.67d;
        String outString = String.format("int:%2d ,float: %f , double : %f", myInt,myFloat,myDouble);
        System.out.println(outString);

    }
}
