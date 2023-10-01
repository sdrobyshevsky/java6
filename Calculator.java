// 1 вариант Калькулятора 

// import java.util.List;

// public class Calculator {

//     public double sum(List<? extends Number> numbers) {
//         double res = 0.0;
//         for (Number n : numbers) {
//             res += n.doubleValue();
//         }
//         return res;
//     }

//     public double multiplication(List<? extends Number> numbers) {
//         double res = 1.0;
//         for (Number n : numbers) {
//             res *= n.doubleValue();
//         }
//         return res;
//     }

//     public double devision(List<? extends Number> numbers) {
//         double res = numbers.get(0).doubleValue();
//         for (int i = 1; i < numbers.size(); i++) {
//             res = res / numbers.get(i).doubleValue();
//         }
//         return res;
//     }

// }



// 2 вариант Калькулятора

// import java.util.Scanner;
 
// public class Calculator  {

// 	public static void main(String[] args) {
	
// 		try (Scanner input = new Scanner(System.in)) {
//             int operation; 
//             double firstNumber;
//             double secondNumber;
//             double result;
            
//             System.out.println("Choose an operation:\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Exit");
            
//             do {
//             	operation = input.nextInt();
            
//             	if (operation == 1) { 
//             		System.out.print("Enter first number: ");
//             		firstNumber = input.nextDouble();

//             		System.out.print("Enter second number: ");
//             		secondNumber = input.nextDouble();

//             		result = firstNumber + secondNumber;

//             		System.out.print("The sum is " + result);
            	
//             	} else if (operation == 2) { 

//             		System.out.print("Enter first number: ");
//             		firstNumber = input.nextDouble();

//             		System.out.print("Enter second number: ");
//             		secondNumber = input.nextDouble();

//             		result = firstNumber - secondNumber;

//             		System.out.print("The subtrahend is " + result);
            	
//             	} else if (operation == 3) { 
            	
//             		System.out.print("Enter first number: ");
//             		firstNumber = input.nextDouble();

//             		System.out.print("Enter second number: ");
//             		secondNumber = input.nextDouble();

//             		result = firstNumber * secondNumber;

//             		System.out.print("The product is " + result);
            	
//             	} else if (operation == 4) { 
            	
//             		System.out.print("Enter first number: ");
//             		firstNumber = input.nextDouble();

//             		System.out.print("Enter second number: ");
//             		secondNumber = input.nextDouble();

//             		result = firstNumber / secondNumber;

//             		System.out.print("The quotient is " + result);
            		
//             	} else if (operation == 5){
//             		System.out.println("Goodbye");
//             		System.exit(0);
            		
//             	} else { 
            		
//             		System.out.println("You're doing it wrong.");
//             	}
//             } while (operation < 1 || operation > 5);
//         }
// 	}
// }



// 3 вариант Калькулятора  

// import java.util.Scanner;

// public class Calculator {
//     static Scanner scanner = new Scanner(System.in);

//     public static void main(String[] args) {
//         int operand1 = nextInt();
//         int operand2 = nextInt();
//         char operation = getOperation();
//         int result = calc(operand1,operand2,operation);
//         System.out.println("Результат операции: "+result);
//     }

//     public static int nextInt(){
//         System.out.println("Введите число:");
//         int operand;
//         if(scanner.hasNextInt()){
//             operand = scanner.nextInt();
//         } else {
//             System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
//             scanner.next();
//             operand = nextInt();
//         }
//         return operand;
//     }

//     public static char getOperation(){
//         System.out.println("Введите операцию:");
//         char operation;
//         if(scanner.hasNext()){
//             operation = scanner.next().charAt(0);
//         } else {
//             System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
//             scanner.next();
//             operation = getOperation();
//         }
//         return operation;
//     }

//     public static int calc(int operand1, int operand2, char operation){
//         int result;
//         switch (operation){
//             case '+':
//                 result = operand1+operand2;
//                 break;
//             case '-':
//                 result = operand1-operand2;
//                 break;
//             case '*':
//                 result = operand1*operand2;
//                 break;
//             case '/':
//                 result = operand1/operand2;
//                 break;
//             default:
//                 System.out.println("Операция не распознана. Повторите ввод.");
//                 result = calc(operand1, operand2, getOperation());
//         }
//         return result;
//     }
// }


// 4 вариант Калькулятора

// import java.util.Scanner;
// public class Calculator {
//    public static void main(String[] args) {
//       double num1;
//       double num2;
//       double ans;
//       char op;
//       try (Scanner reader = new Scanner(System.in)) {
//         System.out.print("Enter two numbers: ");
//           num1 = reader.nextDouble();
//           num2 = reader.nextDouble();
//           System.out.print("\nEnter an operator (+, -, *, /): ");
//           op = reader.next().charAt(0);
//     }
//       switch(op) {
//          case '+': ans = num1 + num2;
//             break;
//          case '-': ans = num1 - num2;
//             break;
//          case '*': ans = num1 * num2;
//             break;
//          case '/': ans = num1 / num2;
//             break;
//          default:  System.out.printf("Error! Enter correct operator");
//             return;
//       }
//       System.out.print("\nThe result is given as follows:\n");
//       System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
//    }
// }


// 5 вариант Калькулятора

public class Calculator {

    private String binary1;

    public String getBinary1() {
        return binary1;
    }

    private String binary2;

    public String getBinary2() {
        return binary2;
    }

    public void setBinary2(String binary2) {
        this.binary2 = binary2;
    }

    private int decimal1;

    private int decimal2;


// Конструктор класса

public Calculator(String binary1, String binary2) {

    this.binary1 = binary1;

    this.binary2 = binary2;

    this.decimal1 = Integer.parseInt(binary1, 2);

    this.decimal2 = Integer.parseInt(binary2, 2); 

}

// Метод для сложения двоичных чисел

public String add() {

    int sumDecimal = decimal1 + decimal2;

    return Integer.toBinaryString(sumDecimal);

}

// Метод для вычитания двоичных чисел

public String subtract() {

    int diffDecimal = decimal1 - decimal2;

    return Integer.toBinaryString(diffDecimal);

}

// Метод для умножения двоичных чисел

public String multiply() {

    int productDecimal = decimal1 * decimal2;

    return Integer.toBinaryString(productDecimal);

}

// Метод для деления двоичных чисел

public String divide() {

    int quotientDecimal = decimal1 / decimal2;

    return Integer.toBinaryString(quotientDecimal);

}
}
