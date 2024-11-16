import java.util.List;

public class StudentHandler {

    // Удаляем студентов со средним баллом < 3.
    // Если средний балл >= 3, студент переводится на следующий курс.

    public void handlerStudents(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            double averageGrade = student.getAverageGrade();
            if (averageGrade < 3.0) {
                students.remove(i);
                i--;
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }
    // Вывод студентов на курсе

    public void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }
}
