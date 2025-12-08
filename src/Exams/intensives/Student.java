package Exams.intensives;

 class Student {
     int id;
    String name;
    int score;
    Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Synchronized to prevent race conditions
     public synchronized void updateScore(int delta) {
         this.score += delta;
     }

     public synchronized int getScore() {
         return score;
     }


     @Override
     public String toString() {
         return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
     }
}
