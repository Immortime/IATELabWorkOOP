import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentHandler studentHandler = new StudentHandler();
        // У меня Java 8, поэтому List.of у меня нет, так чтоооо
        List<Integer> grades1 = new ArrayList<>();
        grades1.add(4);
        grades1.add(5);
        grades1.add(3);
        grades1.add(4);

        List<Integer> grades2 = new ArrayList<>();
        grades2.add(4);
        grades2.add(4);
        grades2.add(5);
        grades2.add(5);

        List<Integer> grades3 = new ArrayList<>();
        grades3.add(4);
        grades3.add(3);
        grades3.add(5);
        grades3.add(4);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Александр Эдуардович", "М2-М24", 1, grades1));
        students.add(new Student("Максим Максимович", "Ис-Б20", 4, grades2));
        students.add(new Student("Эгамбердиев Тимур", "ПМ-Б21", 3, grades3));

        //Перевод студентов на курсы другие
        studentHandler.handlerStudents(students);
        //Принтим студентов с нужного курса
        studentHandler.printStudents(students, 2);

    }
}
