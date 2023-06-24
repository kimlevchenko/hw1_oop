public class PrintStudents {

    public void print(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя: " + gryffindor.getName()
                    + "; Факультет: " + gryffindor.getFaculty()
                    + "; Сила магии: " + gryffindor.getPower()
                    + "; Трансгрессия: " + gryffindor.getTransgress()
                    + "; Благородство: " + gryffindor.getNobility()
                    + "; Честь: " + gryffindor.getHonor()
                    + "; Храбрость: " + gryffindor.getBravery());
        }
        System.out.println();
    }

    public void print(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя: " + hufflepuff.getName()
                    + "; Факультет: " + hufflepuff.getFaculty()
                    + "; Сила магии: " + hufflepuff.getPower()
                    + "; Трансгрессия: " + hufflepuff.getTransgress()
                    + "; Трудолюбие: " + hufflepuff.getIndustriousness()
                    + "; Верность: " + hufflepuff.getLoyalty()
                    + "; Честность: " + hufflepuff.getHonesty());
        }
        System.out.println();
    }

    public void print(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя: " + ravenclaw.getName()
                    + "; Факультет: " + ravenclaw.getFaculty()
                    + "; Сила магии: " + ravenclaw.getPower()
                    + "; Трансгрессия: " + ravenclaw.getTransgress()
                    + "; Ум: " + ravenclaw.getClever()
                    + "; Мудрость: " + ravenclaw.getWisdom()
                    + "; Остроумие: " + ravenclaw.getWit()
                    + "; Творчество: " + ravenclaw.getCreation());
        }
        System.out.println();
    }

    public void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя: " + slytherin.getName()
                    + "; Факультет: " + slytherin.getFaculty()
                    + "; Сила магии: " + slytherin.getPower()
                    + "; Трансгрессия: " + slytherin.getTransgress()
                    + "; Хитрость" + slytherin.getCunning()
                    + "; Решительность: " + slytherin.getResolve()
                    + "; Амбициозность: " + slytherin.getAmbition()
                    + "; Находчивость: " + slytherin.getResourcefulness()
                    + "; Жажда власти: " + slytherin.getAuthority());
        }
        System.out.println();
    }
}
