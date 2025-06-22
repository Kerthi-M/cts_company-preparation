package mcv_pattern;

public class TestMVCPattern {
    public static void main(String[] args) {
        Student model = new Student();
        model.setName("Arun");
        model.setRollNo(101);

        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Keerthana");
        controller.setStudentRollNo(102);
        controller.updateView();
    }
}
