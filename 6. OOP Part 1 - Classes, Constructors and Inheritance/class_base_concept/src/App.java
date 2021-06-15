public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("welcome to Car world");
        Car mycar= new Car();

        mycar.setBrand("odi");
        System.out.println(mycar.getBrand());
        mycar.setBrand("suzuki");

        // will output unknown
        System.out.println(mycar.getBrand());
    }
}
