package Exams;

import java.io.*;

public class Pupil implements Serializable {
    private int id;
    private String name;
    private int age;

    public Pupil(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Pupil{" + "id=" + id + ", name=" + name + ", age=" + age + '}';
    }
}



//class SerializeExample {
//    public static void main(String[] args) {
//        Pupil pupil = new Pupil(1, "Pupil", 12);
//        Pupil pupil2 = new Pupil(2, "Pupil2", 12);
//
//
//        try(ObjectOutputStream out = new ObjectOutputStream((new FileOutputStream("student.ser"))) {
//
//        }) {
//            out.writeObject(pupil);
//            out.writeObject(pupil2);
//            System.out.println("Objects serialized successfully");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}




class DeserializeExample {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
            Pupil pupil1 = (Pupil) in.readObject();
            Pupil pupil2 = (Pupil) in.readObject();

            System.out.println("Deserialized object: " + pupil1);
            System.out.println("Deserialized object: " + pupil2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}