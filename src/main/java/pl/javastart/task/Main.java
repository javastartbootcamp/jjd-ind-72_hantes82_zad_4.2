package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person firstPerson = new Person("Konrad", "Putelbergier");
        Person secondPerson = new Person("Marcin", "Kowalski");

        Task firstTask = new Task("Migration", "Migration of Australia to Exchange Online", 8,
                firstPerson);
        Task secondTask = new Task("Data move", "Onedrive data move", 0, firstPerson);
        Task thirdTask = new Task("Azure sync", "Azure sync rules creation", -3);
        Task fourthTask = new Task("Support tasks review", "Tickets check", -5, secondPerson);

        System.out.println("Czy priorytet taska" + firstTask.name + " jest wysoki? " + firstTask.highPriority());
        System.out.println("Czy priorytet taska" + firstTask.name + " jest średni? " + firstTask.mediumPriority());
        System.out.println("Czy priorytet taska" + firstTask.name + " jest niski? " + firstTask.lowPriority());
        System.out.println("Czy priorytet taska" + secondTask.name + " jest wysoki? " + secondTask.highPriority());
        System.out.println("Czy priorytet taska" + secondTask.name + " jest średni? " + secondTask.mediumPriority());
        System.out.println("Czy priorytet taska" + secondTask.name + " jest niski? " + secondTask.lowPriority());
        System.out.println("Czy priorytet taska" + thirdTask.name + " jest wysoki? " + thirdTask.highPriority());
        System.out.println("Czy priorytet taska" + thirdTask.name + " jest średni? " + thirdTask.mediumPriority());
        System.out.println("Czy priorytet taska" + thirdTask.name + " jest niski? " + thirdTask.lowPriority());
        System.out.println("Czy priorytet taska" + fourthTask.name + " jest wysoki? " + fourthTask.highPriority());
        System.out.println("Czy priorytet taska" + fourthTask.name + " jest średni? " + fourthTask.mediumPriority());
        System.out.println("Czy priorytet taska" + fourthTask.name + " jest niski? " + fourthTask.lowPriority());
    }
}
