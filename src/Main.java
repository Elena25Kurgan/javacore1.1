public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        //int c = calc.devide.apply(a, b);  //не обрабатывается ошибка деления на ноль, можно использовать другой вариант
        try {
            int c1 = calc.devide.apply(a, b);
            calc.println.accept(c1);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль невозможно!");
        }

    }
}
