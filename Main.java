public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(10 ,2);

        calc.println.accept(c);
    }
}