import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStudents
{
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();

        student.add(new Student(80,5000,"ABC"));
        student.add(new Student(45,6000,"DEF"));
        student.add(new Student(67,9000,"GHI"));
        student.add(new Student(34,3000,"JKL"));
        student.add(new Student(64,5000,"MNO"));

        Collections.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student S1, Student S2) {
                if(S1.getScore()>S2.getScore())
                    return 1;
                else if (S1.getScore()<S2.getScore())
                    return -1;
                else
                {
                    String arr1[] = S1.getName().split(" ",2);
                    String arr2[] = S2.getName().split(" ",2);
                    if (arr1[0].equals(arr2[0]))
                        return 1;
                    if (arr1[0].equals(arr2[0]))
                        return -1;
                }
                return 0;
            }
        });
        for (Student studentss: student )
        {
            System.out.println("Student Score: " + studentss.getScore() + "Name: " + studentss.getName() + " Age: " + studentss.getAge());
        }
    }
}

class Student
{
    private double Age;
    private double Score;
    private String Name;

    Student(double age,double score, String name)
    {
        this.Age=age;
        this.Score=score;
        this.Name=name;
    }

    double getAge() { return Age; }
    double getScore() { return Score; }
    String getName() { return Name; }


}