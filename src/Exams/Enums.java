package Exams;

enum Gender {
    MALE,FEMALE
}


enum DaysOfWeek {
    MONDAY(1),TUESDAY(2),WESNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);
    private int day;
    DaysOfWeek(int index) {
        this.day = index;
    }


    public int getDay() {
        return day;
    }
    @Override
    public String toString() {
        switch (this) {
            case MONDAY:
                return "Monday";
            case TUESDAY:
                return "Tuesday";
            case WESNESDAY:
                return "Wednesday";
            case THURSDAY:
                return "Thursday";
            case FRIDAY:
                return "Friday";
            case SATURDAY:
                return "Saturday";
            case SUNDAY:
                return "Sunday";
                default:
                    return "";
        }

    }

}
public class Enums {
    public static void main(String[] args) {
        // Printing all things from enum DaysOfWeek
        for(DaysOfWeek day:DaysOfWeek.values()) {
            System.out.println(day.getDay());
        }
        DaysOfWeek day = DaysOfWeek.MONDAY;

        System.out.print(day.name()+ " ");
        System.out.println(day.getDay());
    }
}
