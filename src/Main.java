import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри Поттер", "Гриффиндор", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Gryffindor("Гермиона Грейнджер", "Гриффиндор", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Gryffindor("Рон Уизли", "Гриффиндор", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит", "Пуффендуй", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Hufflepuff("Седрик Диггори", "Пуффендуй", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Hufflepuff("Джастин Финч-Флетчли", "Пуффендуй", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", "Когтевран", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Ravenclaw("Падма Патил", "Когтевран", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Ravenclaw("Маркус Белби", "Когтевран", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", "Слизерин", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Slytherin("Грэхэм Монтегю", "Слизерин", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
                new Slytherin("Грегори Гойл", "Слизерин", random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101), random.nextInt(101)),
        };

        PrintStudents printStudents = new PrintStudents();
        printStudents.print(gryffindors);
        printStudents.print(hufflepuffs);
        printStudents.print(ravenclaws);
        printStudents.print(slytherins);

        gryffindors[1].compare(gryffindors[2]);
        hufflepuffs[1].compare(hufflepuffs[2]);
        ravenclaws[1].compare(ravenclaws[2]);
        slytherins[1].compare(slytherins[2]);

        System.out.println();
        gryffindors[0].compare(slytherins[0]);
    }
}