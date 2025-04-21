package ru.mentee.power;

public class TypePuzzle {
    public static void main(String[] args) {


        // 1. Сравнение чисел с плавающей точкой
        double a = 0.1;
        double b = 0.2;
        double sum = (a + b);

        System.out.println("Головоломка 1:  Сравнение чисел с плавающей точкой.");
        System.out.println(a + " + " + b + " == " + "0.3 " + (sum == 0.3) );
        System.out.println("Потому что: " + a + " + " + b + " = " + sum);
        System.out.println("Решение: использовать epsilon для сравнения с доопустимой погрешностью");
        System.out.println("Math.abs((0.1 + 0.2) - 0.3) < 0.0001? true");
        System.out.println();



        // 2. Странное поведение при переполнении

        int maxInt = Integer.MAX_VALUE;
        byte t = (byte) maxInt;

        System.out.println("Головоломка 2:  Странное поведение при переполнении.");
        System.out.println("при явном приведении int к  byte: " +  " Теряем данные из за перепонения"  );
        System.out.println("int " + maxInt + " -> " + "byte " + t   );
        System.out.println("Решение: делать проверку на переполнение или использовать другой тип ");
        System.out.println();


        // 3. Автоупаковка/распаковка (boxing/unboxing)
        char A = 'a';
        char B = 'b';

        System.out.println("Головоломка 3: Странное поведение char");
        System.out.println(" 'a' + 'b' = " + (A + B) );
        System.out.println("Объяснение: символы конвертируются в их коды (97 + 98) и складываются как числа");
        System.out.println("Решение:  для конкатенации символов:  + 'a' + 'b' = ab");


    }
}