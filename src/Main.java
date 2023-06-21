public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", "Гриффиндор", 100, 50, 80, 90, 60),
                new Gryffindor("Гермиона Грейнджер", "Гриффиндор", 60, 30, 70, 95, 55),
                new Gryffindor("Рон Уизли", "Гриффиндор", 35, 40, 50, 40, 45),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", "Пуффендуй", 60, 70, 50, 80, 70),
                new Hufflepuff("Седрик Диггори", "Пуффендуй", 55, 40, 70, 35, 60),
                new Hufflepuff("Джастин Финч-Флетчли", "Пуффендуй", 45, 40, 60, 45, 45),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", "Когтевран", 70, 70, 80, 75, 50, 30),
                new Ravenclaw("Падма Патил", "Когтевран", 50, 70, 45, 95, 55, 20),
                new Ravenclaw("Маркус Белби", "Когтевран", 55, 45, 55, 45, 55, 65),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", "Слизерин", 80, 30, 80, 70, 90, 50, 75),
                new Slytherin("Грэхэм Монтегю", "Слизерин", 60, 30, 70, 95, 25, 20, 15),
                new Slytherin("Грегори Гойл", "Слизерин", 35, 40, 50, 40, 15, 60, 30),
        };

        PrintStudents printStudents = new PrintStudents();
        printStudents.print(gryffindors);
        printStudents.print(hufflepuffs);
        printStudents.print(ravenclaws);
        printStudents.print(slytherins);

    }
}