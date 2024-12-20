package HomeWork.HomeWork1215;

/*
 * ## 题目4：

​	定义数组存储3个学生对象。

​	学生的属性：学号，姓名，年龄。

​	要求1：添加的时候需要进行学号的唯一性判断。

​	要求2：添加完毕之后，遍历所有学生信息。

​	要求3：通过id删除学生信息

​             如果存在，则删除，如果不存在，则提示删除失败。

​	要求4：删除完毕之后，遍历所有学生信息。

​	要求5：id为2的学生，年龄+1岁
 */

public class Task12154 {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        // 添加的时候需要进行学号的唯一性判断。
        addStudent(students, new Student(1, "张三", 20));
        addStudent(students, new Student(2, "李四", 22));
        addStudent(students, new Student(2, "王五", 22));
        // addStudent(students, new Student(3, "王五", 22));

        // 添加完毕之后，遍历所有学生信息。
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());
            }
        }

        // 通过id删除学生信息
        if (deleteStudentById(students, 1)) {
            System.out.println("删除成功！");
        } else {
            System.out.println("删除失败！");
        }

        // 删除完毕之后，遍历所有学生信息。
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());
            }
        }

        // id为2的学生，年龄+1岁
        if (updateStudentAgeById(students, 2)) {
            System.out.println("修改成功！");
        } else {
            System.out.println("修改失败！");
        }

        // 遍历所有学生信息。
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].toString());
            }
        }
    }

    // 添加的时候需要进行学号的唯一性判断。
    public static void addStudent(Student[] students, Student student) {
        boolean isUnique = true;
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            index = i;
            if (students[i] == null)
                break;
            if (students[i].getId() == student.getId()) {
                isUnique = false;
            }
        }
        if (isUnique) {
            students[index] = student;
        }
    }

    // 通过id删除学生信息
    public static boolean deleteStudentById(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i] = null;
                return true;
            }
        }
        return false;
    }

    // id为2的学生，年龄+1岁
    public static boolean updateStudentAgeById(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                students[i].setAge(students[i].getAge() + 1);
                return true;
            }

        }
        return false;
    }
}