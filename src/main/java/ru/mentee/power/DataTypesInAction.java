package ru.mentee.power;

public class DataTypesInAction {
    public static void main(String[] args) {

        // 1. Целочисленное деление с отбрасыванием дробной части
        int a = 1000;
        int b = 3;
        int resInt = a / b;
        System.out.println(resInt);                  // при делении целых чисел дробная часть отбрасывается!
        System.out.println("1. Целочисленное деление:");
        System.out.println("   " + a + " / " + b + " = " + resInt + " (дробная часть отбрасывается)");
        System.out.println();



        // 2. Деление целого числа на число с плавающей точкой
        double doubleVar = 3.43;
        double resDouble = a / doubleVar;
        System.out.println("2. Деление целого числа на число с плавающей точкой :");
        System.out.println("   " + a + " / " +  doubleVar + " = " + resDouble + " (результат имеет тип double)");     // результат double
        System.out.println("");


        // 3. Явное приведение типов (различные варианты)
        double d = 8.270;
        int aproximeteDouble = (int) d;

        System.out.println("3. Явное приведение типов: ");
        System.out.println("  " + " double " + d + " к  int: " + aproximeteDouble + " округление и потеря данных!!!"  );


        int intVar = 8;
        int intVar2 = 3;
        double varDouble = (double) intVar / intVar2; // 2.6666666666666665  (без приведения было 2.0)

        System.out.println("  " + " int (8 / 3)  к  double: " + varDouble + " (без приведения было 2.0)"  );
        System.out.println();

        int mil = 1000;
        byte t = (byte) mil;
        System.out.println("  " + " int (1000)  к  byte: " + t + " Переполнение и потеря данных!"  );
        System.out.println();

        // 4. Автоматическое повышение типа при операциях
        byte byteVar = 2;
        short shortVar = 4;
        int sum = byteVar + shortVar;


        System.out.println("4. Автоматическое повышение типа при операциях: ");
        System.out.println("   " + "byte " + byteVar + " + " + "short " + shortVar + ": " +  sum + " (результат int) ");           // результат int  ( byte,short,char всегда повышаются до int при операциях)

        System.out.println("   doubleVar + intVar: // результат double" );           // результат double
        System.out.println();

        // 5. Операции с boolean

        boolean A = true;
        boolean B = false;
        boolean result = A && B; // false (true И false = false)
        System.out.println( "   " + "true && false = " + result); // false



        boolean C = true;
        boolean D = false;
        boolean result2 = C || D; // true (true ИЛИ false = true)
        System.out.println(  "   " + "true || false = " + result2);
        System.out.println();

        // 6. Работа с символами (char) и их кодами
        char c = 'A';
        int code = (int) c;  // Приведение char → int (получаем код символа)
        System.out.println("5. Работа с символами (char) и их кодами: ");
        System.out.println("   Приведение char 'A' → int " + code + " (получаем код символа): " + code );

        int num = 66;
        char ch = (char) num;  // Приведение int → char
        System.out.println("   Приведение int '66' → char: " + c );

    }
}