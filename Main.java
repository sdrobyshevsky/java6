// 1)расширить класс калькулятор на умножение 
// 2)расширить класс калькулятор на деление 
// 3)расширить класс калькулятор на бинарный перевод(принимаемые значения как стринг, так и инт - тут необходимо подумать как наилучшим образом реализовать, 
// что будет если будут приниматься округляемые Double/Float (округляемые -> с нулем на конце прим. 3.0 , 4.0 и тд т))


// 1 вариант Калькулятора

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Main {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();
//         List<Double> data1 = new ArrayList<>(Arrays.asList(2.0, 4.5, 5.3));
//         List<Integer> data2 = new ArrayList<>(Arrays.asList(4, 5, 3));
//         List<Integer> data3 = new ArrayList<>(Arrays.asList(1, 3, 6));
//         System.out.println();
//         System.out.println("Суммирование");
//         System.out.println("calc.sum(data1) = " + calc.sum(data1));
//         System.out.println("calc.sum(data2) = " + calc.sum(data2));
//         System.out.println();
//         System.out.println("Умноженме");
//         System.out.println("calc.multiplication(data2) = " + calc.multiplication(data2));
//         System.out.println("calc.multiplication(data1) = " + calc.multiplication(data1));
//         System.out.println();
//         System.out.println("Деление");
//         System.out.println("calc.devision(data2) = " + calc.devision(data2));
//         System.out.println("calc.devision(data3) = " + calc.devision(data3));
//     }
// }


// 5 вариант Калькулятора

public class Main 
{
   public static void main(String[] args) 
   {

    String binary1 = "101";

    String binary2 = "11";

    Calculator calculator = new Calculator(binary1, binary2);

    String sum = calculator.add();

    String difference = calculator.subtract();

    String product = calculator.multiply();

    String quotient = calculator.divide();

    System.out.println("Сумма: " + sum);
    
    System.out.println("Разность: " + difference);

    System.out.println("Произведение: " + product);

    System.out.println("Частное: " + quotient);

   } 

} 

