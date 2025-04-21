package ru.mentee.power.datatype;



public class MenteeDemo {
    public static void main(String[] args) {

        Mentee excellentMentee = new Mentee("Мария", "Ивановна", 19, 4.8, 1);
        excellentMentee.displayInfo();
        excellentMentee.isExcellent();
        excellentMentee.advanceToNextLevel();
        excellentMentee.calculateScholarship();
        System.out.println();


        Mentee goodMentee = new Mentee("Алексей", "Смирнов", 18, 4.2, 1);
        goodMentee.isExcellent();
        goodMentee.calculateScholarship();
        goodMentee.displayInfo();
        goodMentee.advanceToNextLevel();
        System.out.println();

        Mentee averageMentee = new Mentee("Петр", "Сидоров", 21, 3.9, 3);
        averageMentee.isExcellent();
        averageMentee.calculateScholarship();
        averageMentee.advanceToNextLevel();
        averageMentee.displayInfo();
        System.out.println();


        Mentee borderlineMentee1 = new Mentee("Ольга", "Козлова", 22, 4.5, 5); // Ровно 4.5
        borderlineMentee1.isExcellent();
        borderlineMentee1.calculateScholarship();
        borderlineMentee1.advanceToNextLevel();
        borderlineMentee1.displayInfo();
        System.out.println();

        Mentee borderlineMentee2 = new Mentee("Иван", "Иванов", 20, 4.0, 2); // Ровно 4.0
        borderlineMentee2.displayInfo();
        borderlineMentee2.calculateScholarship();
        borderlineMentee2.advanceToNextLevel();
        borderlineMentee2.calculateScholarship();
        System.out.println();











    }
}