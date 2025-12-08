import java.util.ArrayList;
import java.util.List;

class Pupil {
    int age;
    String name;
    int marks;
    public Pupil(int age, String name, int marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return this.age + " " + this.name + " " + this.marks;
    }
}

public class lambdaExps {
    public static void main(String[] args) {
        List<Pupil> pupils = new ArrayList<>();
        pupils.add(new Pupil(1, "Isaac", 100));
        pupils.add(new Pupil(29, "Paola", 89));
        pupils.add(new Pupil(3, "Anitha",45 ));
        pupils.add(new Pupil(4, "Aloys", 12));
        // Using lambda expression to sort students ascendingly with their ages
        pupils.sort((s1,s2)->Double.compare(s1.age,s2.age));
        pupils.sort((s1,s2)->Double.compare(s1.marks,s2.marks));
        pupils.sort((s1,s2)-> CharSequence.compare(s1.name,s2.name));
        for (Pupil pupil : pupils) {
            System.out.println(pupil.age+" "+pupil.name+" "+pupil.marks);
        }
        // System out made easy!!!!!!!!!!!!!!!!!!!!!
        pupils.forEach(System.out::println);
        System.out.println("Students aged above 20:\n");
        // Students older than 20 years old
        List<Pupil> olderStudents = pupils.stream().filter(s->s.age>20).toList();
        olderStudents.forEach(System.out::println);

    }
}


