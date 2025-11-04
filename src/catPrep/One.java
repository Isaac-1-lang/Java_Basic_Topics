package catPrep;

import java.io.*;


class Student1 implements Serializable{
        private static final long serialVersionUID = 1L;

        String name;
        int age;

        Student1(String name, int age) {
                this.name = name;
                this.age = age;
        }
}



public class One {
        public static void main(String[] args) {
                Student1 s1 = new Student1("Isaac",12);
                Student1 s2 = new Student1("Jack",23);


                try {
                        // Serialization
                        FileOutputStream fileOut = new FileOutputStream("student.ser");
                        ObjectOutputStream out  = new ObjectOutputStream(fileOut);
                        out.writeObject(s1); // Mainly serialization occurs here
                        out.close();
                        fileOut.close();
                        System.out.println("Student object serialized successfully");
                        // Deserialization
                        FileInputStream fileIn = new FileInputStream("student.ser");
                        ObjectInputStream in  = new ObjectInputStream(fileIn);
                        Student og = (Student)in.readObject();
                        in.close();
                        fileIn.close();
                        System.out.println(og);
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }
}