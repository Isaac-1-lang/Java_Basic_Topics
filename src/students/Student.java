package students;

import java.util.*;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int code;
    private String email;

    public Student(String name, int code, String email) {
        this.name = name;
        this.code = code;
        this.email = email;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getCode() { return code; }
    public void setCode(int code) { this.code = code; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student st = (Student) o;
        return code == st.code && Objects.equals(name, st.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int res = Integer.compare(this.code, o.code);
        if (res != 0) return -res;
        return this.name.compareTo(o.name);
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        // based on the length
        return Integer.compare(o1.getName().length(), o2.getName().length());
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(List.of(
                new Student("Alain Barsime", 512, "alain250@gmail.com"),
                new Student("zYX", 12, "xyz@gmail.com"),
                new Student("Isaac", 13, "isaprecieux112@gmail.com")
        ));
        Collections.sort(students, new NameComparator());
        Collections.sort(students); // uses compareTo
        System.out.println(students);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(n+m);
    }
}
