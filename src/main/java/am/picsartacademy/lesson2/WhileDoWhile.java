package am.picsartacademy.lesson2;

public class WhileDoWhile {
    public static void main(String[] args) {
        int a = 7;
        while (a < 5) {
            System.out.println(a);
            a++;

        }

        do {
            System.out.println(a);
        } while (a < 5);

        String[]  weekDays = new String[7];
        weekDays[0] = "Sunday";
        weekDays[1] = "Monday";
        weekDays[2] = "Tuesday";
        weekDays[3] = "Wednesday";
        weekDays[4] = "Thursday";
        weekDays[5] = "Friday";
        weekDays[6] = "Saturday";

        for (String weekDay : weekDays) {
            System.out.println(weekDay);
        }

        for (int i = 0; i < weekDays.length; i++) {
            if (weekDays[i].equals("Wednesday")) {
                continue;
            }
            System.out.println(weekDays[i] + " is number " + (i+1));
        }

    }
}
