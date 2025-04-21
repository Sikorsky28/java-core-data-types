package ru.mentee.power;

public class SmartCalculator {
    public static void main(String[] args) {
        System.out.println("Умный калькулятор:\n");

        // Примеры операций
        calculate("Сложение", 5, 3, '+');
        calculate("Вычитание", 5.5, 2.2, '-');
        calculate("Умножение", 4, 2.5, '*');
        calculate("Деление", 10, 3, '/');
        calculate("Деление целочисленное", 10, 3, '\\');
        calculate("Остаток от деления", 10, 3, '%');
        calculate("Возведение в степень", 2, 10, '^');

        // Особые случаи
        System.out.println("\nОбработка особых случаев:");
        calculate("Попытка деления на ноль (для double)", 5.0, 0.0, '/');
        try {
            calculate("Попытка деления на ноль (для int)", 5, 0, '/');
        } catch (ArithmeticException e) {
            System.out.println("Попытка деления на ноль (для int): Exception in thread \"main\" " + e);
        }
    }

    public static void calculate(String operationName, Number a, Number b, char operator) {
        Object result;
        String type;

        try {
            switch (operator) {
                case '+':
                    result = a.doubleValue() + b.doubleValue();
                    break;
                case '-':
                    result = a.doubleValue() - b.doubleValue();
                    break;
                case '*':
                    result = a.doubleValue() * b.doubleValue();
                    break;
                case '/':
                    if (a instanceof Integer && b instanceof Integer && b.intValue() == 0) {
                        throw new ArithmeticException("/ by zero");
                    }
                    result = a.doubleValue() / b.doubleValue();
                    break;
                case '\\': // Специальный символ для целочисленного деления
                    result = a.intValue() / b.intValue();
                    break;
                case '%':
                    result = a.intValue() % b.intValue();
                    break;
                case '^':
                    result = Math.pow(a.doubleValue(), b.doubleValue());
                    break;
                default:
                    throw new IllegalArgumentException("Неизвестный оператор: " + operator);
            }

            // Определяем тип результата
            if (operator == '\\' || operator == '%') {
                type = "int";
            } else if (result instanceof Double && Double.isInfinite((Double) result)) {
                type = "Infinity";
            } else {
                type = result.getClass().getSimpleName().toLowerCase();
            }

            System.out.printf("%s: %s %c %s = %s (тип: %s)%n",
                    operationName, a, operator, b, result, type);

        } catch (ArithmeticException e) {
            throw e;
        }
    }
}