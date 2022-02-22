import java.security.SecureRandom;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Math {

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the difficulty level: ");
            System.out.println("'1' - Level 1\n '2' - Level 2\n '3' - Level 3\n '4' - Level 4");
            int level = s.nextInt();
            System.out.println("Type of Arithmetic: ");
            System.out.println("'1' - Addition");
            System.out.println("'2' - Subtraction");
            System.out.println("'3' - Multiplication");
            System.out.println("'4' - Division");
            System.out.println("'5' - Random arithmetic problems");

            int type = s.nextInt();
            mathFunction(level, type);
        }
    }

    public static int random(int min, int max) {
        SecureRandom rand = new SecureRandom();
        int x = (int) (rand.nextDouble() * ((max - min) + 1)) + min;
        return x;
    }

    public static void mathFunction(int level, int type) {
        int i, counter = 0;

        if (type == 1) {
            for (i = 0; i < 10; i++)
                counter += addition(level);
        }
        else if (type == 2)
        {
            for (i = 0; i < 10; i++)
                counter += subtraction(level);
        }
        else if (type == 3)
        {
            for (i = 0; i < 10; i++)
                counter += multiplication(level);
        }
        else if (type == 4)
        {
            for (i = 0; i < 10; i++)
                counter += division(level);
        }
        else if (type == 5)
        {
            for (i = 0; i < 10; i++)
            {
                int rand = random(1,4);
                if(rand == 1)
                    counter += addition(level);
                if (rand == 2)
                    counter += subtraction(level);
                if (rand == 3)
                    counter += multiplication(level);
                if(rand == 4)
                    counter += division(level);
            }

        }
        else
        {
            System.out.println("Invalid Number");
            return;
        }

        if(((double) counter / 10) *(double) 100 >= (double) 75 )
            System.out.println("Congratulations, you are ready to go to the next level!");
        else
            System.out.println("Please ask your teacher for extra help");

    }

    public static int addition(int level) {
        Scanner s = new Scanner(System.in);
        int x = 0, y = 0;

        switch (level) {
            case 1:
                x = random(0, 9);
                y = random(0, 9);
                break;

            case 2:
                x = random(10, 99);
                y = random(10, 99);
                break;

            case 3:
                x = random(100, 999);
                y = random(100, 999);
                break;

            case 4:
                x = random(1000, 9999);
                y = random(1000, 9999);
                break;
        }

        System.out.println("How much is " + x + " plus " + y);
        int ans = s.nextInt();
        int res = x + y;
        if (ans == res) {
            int choice = random(1, 4);
            switch (choice) {
                case 1:
                    System.out.println("Very good!");
                    break;

                case 2:
                    System.out.println("Excellent!");
                    break;

                case 3:
                    System.out.println("Nice work!");
                    break;

                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
            return 1;
        } else {
            int choice2 = random(1, 4);
            switch (choice2) {
                case 1:
                    System.out.println("No. Please try again.");
                    break;

                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;

                case 3:
                    System.out.println("Don't give up!");
                    break;

                case 4:
                    System.out.println("No. Keep trying");
                    break;

            }

            while (true) {
                int answer = s.nextInt();
                if (ans == res) {
                    int choice3 = random(1, 4);
                    switch (choice3) {
                        case 1:
                            System.out.println("Very good!");
                            break;

                        case 2:
                            System.out.println("Excellent!");
                            break;

                        case 3:
                            System.out.println("Nice work!");
                            break;

                        case 4:
                            System.out.println("Keep up the good work!");
                            break;
                    }
                    return 0;
                } else {
                    int choice4 = random(1, 4);
                    switch (choice4) {
                        case 1:
                            System.out.println("No. Please try again.");
                            break;

                        case 2:
                            System.out.println("Wrong. Try once more.");
                            break;

                        case 3:
                            System.out.println("Don't give up!");
                            break;

                        case 4:
                            System.out.println("No. Keep trying");
                            break;

                    }
                }
            }
        }
    }

    public static int subtraction(int level) {
        Scanner s = new Scanner(System.in);
        int x = 0, y = 0;

        switch (level) {
            case 1:
                x = random(0, 9);
                y = random(0, 9);
                break;

            case 2:
                x = random(10, 99);
                y = random(10, 99);
                break;

            case 3:
                x = random(100, 999);
                y = random(100, 999);
                break;

            case 4:
                x = random(1000, 9999);
                y = random(1000, 9999);
                break;
        }

        System.out.println("How much is " + x + " minus " + y);
        int ans = s.nextInt();
        int res = x - y;
        if (ans == res) {
            int choice = random(1, 4);
            switch (choice) {
                case 1:
                    System.out.println("Very good!");
                    break;

                case 2:
                    System.out.println("Excellent!");
                    break;

                case 3:
                    System.out.println("Nice work!");
                    break;

                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
            return 1;
        } else {
            int choice2 = random(1, 4);
            switch (choice2) {
                case 1:
                    System.out.println("No. Please try again.");
                    break;

                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;

                case 3:
                    System.out.println("Don't give up!");
                    break;

                case 4:
                    System.out.println("No. Keep trying");
                    break;

            }

            while (true) {
                int answer = s.nextInt();
                if (ans == res) {
                    int choice3 = random(1, 4);
                    switch (choice3) {
                        case 1:
                            System.out.println("Very good!");
                            break;

                        case 2:
                            System.out.println("Excellent!");
                            break;

                        case 3:
                            System.out.println("Nice work!");
                            break;

                        case 4:
                            System.out.println("Keep up the good work!");
                            break;
                    }
                    return 0;
                } else {
                    int choice4 = random(1, 4);
                    switch (choice4) {
                        case 1:
                            System.out.println("No. Please try again.");
                            break;

                        case 2:
                            System.out.println("Wrong. Try once more.");
                            break;

                        case 3:
                            System.out.println("Don't give up!");
                            break;

                        case 4:
                            System.out.println("No. Keep trying");
                            break;

                    }
                }
            }
        }
    }

    public static int multiplication(int level) {
        Scanner s = new Scanner(System.in);
        int x = 0, y = 0;

        switch (level) {
            case 1:
                x = random(0, 9);
                y = random(0, 9);
                break;

            case 2:
                x = random(10, 99);
                y = random(10, 99);
                break;

            case 3:
                x = random(100, 999);
                y = random(100, 999);
                break;

            case 4:
                x = random(1000, 9999);
                y = random(1000, 9999);
                break;
        }

        System.out.println("How much is " + x + " times " + y);
        int ans = s.nextInt();
        int res = x * y;
        if (ans == res) {
            int choice = random(1, 4);
            switch (choice) {
                case 1:
                    System.out.println("Very good!");
                    break;

                case 2:
                    System.out.println("Excellent!");
                    break;

                case 3:
                    System.out.println("Nice work!");
                    break;

                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
            return 1;
        } else {
            int choice2 = random(1, 4);
            switch (choice2) {
                case 1:
                    System.out.println("No. Please try again.");
                    break;

                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;

                case 3:
                    System.out.println("Don't give up!");
                    break;

                case 4:
                    System.out.println("No. Keep trying");
                    break;

            }

            while (true) {
                int answer = s.nextInt();
                if (ans == res) {
                    int choice3 = random(1, 4);
                    switch (choice3) {
                        case 1:
                            System.out.println("Very good!");
                            break;

                        case 2:
                            System.out.println("Excellent!");
                            break;

                        case 3:
                            System.out.println("Nice work!");
                            break;

                        case 4:
                            System.out.println("Keep up the good work!");
                            break;
                    }
                    return 0;
                } else {
                    int choice4 = random(1, 4);
                    switch (choice4) {
                        case 1:
                            System.out.println("No. Please try again.");
                            break;

                        case 2:
                            System.out.println("Wrong. Try once more.");
                            break;

                        case 3:
                            System.out.println("Don't give up!");
                            break;

                        case 4:
                            System.out.println("No. Keep trying");
                            break;

                    }
                }
            }
        }
    }

    public static int division(int level) {
        Scanner s = new Scanner(System.in);
        float x = 0, y = 0;

        switch (level) {
            case 1:
                x = random(0, 9);
                y = random(0, 9);
                break;

            case 2:
                x = random(10, 99);
                y = random(10, 99);
                break;

            case 3:
                x = random(100, 999);
                y = random(100, 999);
                break;

            case 4:
                x = random(1000, 9999);
                y = random(1000, 9999);
                break;
        }

        System.out.println("How much is " + x + " divided by " + y);
        String ans = s.nextLine();
        float res = y / x;
        if (ans.equals(df2.format(x / y))) {
            int choice = random(1, 4);
            switch (choice) {
                case 1:
                    System.out.println("Very good!");
                    break;

                case 2:
                    System.out.println("Excellent!");
                    break;

                case 3:
                    System.out.println("Nice work!");
                    break;

                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
            return 1;
        } else {
            int choice2 = random(1, 4);
            switch (choice2) {
                case 1:
                    System.out.println("No. Please try again.");
                    break;

                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;

                case 3:
                    System.out.println("Don't give up!");
                    break;

                case 4:
                    System.out.println("No. Keep trying");
                    break;

            }

            while (true) {
                String answer = s.nextLine();
                if (answer.equals(df2.format(x / y))) {
                    int choice3 = random(1, 4);
                    switch (choice3) {
                        case 1:
                            System.out.println("Very good!");
                            break;

                        case 2:
                            System.out.println("Excellent!");
                            break;

                        case 3:
                            System.out.println("Nice work!");
                            break;

                        case 4:
                            System.out.println("Keep up the good work!");
                            break;
                    }
                    return 0;
                } else {
                    int choice4 = random(1, 4);
                    switch (choice4) {
                        case 1:
                            System.out.println("No. Please try again.");
                            break;

                        case 2:
                            System.out.println("Wrong. Try once more.");
                            break;

                        case 3:
                            System.out.println("Don't give up!");
                            break;

                        case 4:
                            System.out.println("No. Keep trying");
                            break;

                    }
                }
            }
        }
    }
}