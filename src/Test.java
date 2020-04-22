public class Test {
    public static void main(String[] args){
        Employee micheal = new ProductManager("Micheal", 50000, 10, 10);
        Employee jim = new TechnicalWriter("Jim", 50000, 10, 5);
        Employee dwight = new Engineer("Dwight", 50000, 13, 7);

        System.out.println(micheal.toString());
        System.out.println(jim.toString());
        System.out.println(dwight.toString());
    }
}
