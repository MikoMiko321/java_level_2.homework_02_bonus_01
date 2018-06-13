package geekbrains.java_level_2.homework_02_bonus_01;

//Требуется реализовать enum DayOfWeek, который будет представлять дни недели.
//        С его помощью необходимо решить задачу определения кол-ва рабочих часов до конца недели по заднному текущему дню.
//
//        Возвращает кол-во оставшихся рабочих часов до конца
//        недели по заданному текущему дню. Считается, что
//        текущий день ещё не начался, и рабочие часы за него
//        должны учитываться.

public class Main {
    public static int getWorkingHours(DayOfWeek d){
        int remainingWorkingHours;

        if(d.ordinal()<5) {
            remainingWorkingHours = (5 - d.ordinal())*8;
        } else {
            remainingWorkingHours = 0;
        }
        return remainingWorkingHours;
    }
    public static void main(final String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));
        System.out.println(getWorkingHours(DayOfWeek.TUESDAY));
        System.out.println(getWorkingHours(DayOfWeek.WEDNESDAY));
        System.out.println(getWorkingHours(DayOfWeek.THURSDAY));
        System.out.println(getWorkingHours(DayOfWeek.FRIDAY));
        System.out.println(getWorkingHours(DayOfWeek.SATURDAY));
        System.out.println(getWorkingHours(DayOfWeek.SUNDAY));
    }
}
