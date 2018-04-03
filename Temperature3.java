import java.util.Scanner;


public class Temperature3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int temperatures[][] = new int[4][7];

        String[] daysOfWeek = {"Sunday " , "Monday " , "Tuesday " , "Wednesday " , "Thursday " , "Friday " , "Saturday " };
        String[] times = {"7am ", "3pm ", "7pm ", "3am "};
        float weeklyTotal = 0;
        float weeklyAvg = 0;

        temperatures[0] = new int[]{68, 70, 76, 70, 68, 71, 75};
        temperatures[1] = new int[]{76, 76, 87, 84, 82, 75, 83};
        temperatures[2] = new int[]{73, 72, 81, 78, 76, 73, 77};
        temperatures[3] = new int[]{64, 65, 69, 68, 70, 74, 72};
        //temperatures at 4 times per day 7 days per week;

        for (int row = 0; row < temperatures.length; row++) {
            System.out.println(times[row]);
            for (int column = 0; column < temperatures[0].length; column++) {
                System.out.print(temperatures[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("The average temperatures for the week.");

        //calculate and print average temperature
        for (int column = 0; column < temperatures[0].length; column++) {
            int sum = 0;
            int dailyAvg = 0;
            for (int row = 0; row < temperatures.length; row++) {
                sum += temperatures[row][column];
            }
            dailyAvg = sum / temperatures.length;
            System.out.println(daysOfWeek [column] + dailyAvg);
        }
        System.out.println();

            //calculates and prints averages for times
            for (int row = 0; row < temperatures.length; row++) {
                int sum = 0;
                int timeOfDayAvg = 0;
                for (int column = 0; column < temperatures[0].length; column++) {
                    sum += temperatures[row][column];

                }
                timeOfDayAvg = sum / temperatures[0].length;
                System.out.println(times[row] + timeOfDayAvg);
            }
            //calculates weekly average temp
            for (int row = 0; row < temperatures.length; row++) {
                for (int column = 0; column < temperatures[0].length; column++) {
                    weeklyTotal += temperatures[row][column];
                }
            }
            weeklyAvg = weeklyTotal / (temperatures.length * temperatures[0].length);
            System.out.println("The final average temperature for week was:");
            System.out.println("OVERALL: " + weeklyAvg);
        }

    }





