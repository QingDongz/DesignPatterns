package cn.summerwaves.runoob;

public class MainApp {

    public static void main(String[] args) {
        Student model = getStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        model.setName("新名字");

        controller.updateView();
    }


    private static Student getStudentFromDatabase(){
        Student student = new Student();
        student.setName("旧名字");
        student.setRollNo("10");
        return student;
    }
}
