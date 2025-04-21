package ru.mentee.power;

public class CurrencyConverter {
    public static void main(String[] args) {

        final double usd_currency = 90.50;
        final double thb_currency = 2.45;
        final double eur_currency = 98.20;




        //  переменные для сумм в различных валютах

        double rubles = 10000.0;
        double dollars = 100.0;
        double euros = 80.0;
        double baths = 500.0;




        // Конвертация

        double rubToUsd = rubles / usd_currency;
        double rubToEur = rubles / eur_currency;
        double rubToThb = rubles / thb_currency;

        double usdToRub = dollars * usd_currency;
        double eurToRub = euros * eur_currency;
        double thbToRub = baths * thb_currency;

        // красивый вывод


        System.out.println("=== Конвертация валют ===");
        System.out.printf("%.2f RUB = %.2f USD\n", rubles, rubToUsd);
        System.out.printf("%.2f RUB = %.2f EUR\n", rubles, rubToEur);
        System.out.printf("%.2f RUB = %.2f THB\n", rubles, rubToThb);
        System.out.println();
        System.out.printf("%.2f USD = %.2f RUB\n", dollars, usdToRub);
        System.out.printf("%.2f EUR = %.2f RUB\n", euros, eurToRub);
        System.out.printf("%.2f THB = %.2f RUB\n", baths, thbToRub);






        // Демонстрация не точности при операциях с double

        double sum = 0.1 + 0.2;
        boolean isEqual = (sum == 0.3);
        System.out.println("Демонстрация проблемы не точности с double: ");
        System.out.println(" 0.1 + 0.2 = " + sum );
        System.out.println(isEqual);






    }
}