import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of task(1-4):");
        int num_task = sc.nextInt();
        while (num_task != 5) {
            System.out.println("Enter the number of subtask(1-5):");
            int num_subtask = sc.nextInt();
            switch (num_task) {
                case 1:
                    switch (num_subtask) {
                        case 1:
                            System.out.println("Enter the number(>9):");
                            System.out.println("Summary of last two numbers:" + main.sumLastNums(sc.nextInt()));
                            break;
                        case 2:
                            System.out.println("Enter the number(!=0):");
                            System.out.println("Number is positive:" + main.isPositive(sc.nextInt()));
                            break;
                        case 3:
                            System.out.println("Enter the character:");
                            System.out.println(main.isUpperCase(sc.next().charAt(0)));
                            break;
                        case 4:
                            System.out.println("Enter two numbers:");
                            System.out.println("First number is divider of second number:" + main.isDivisor(sc.nextInt(), sc.nextInt()));
                            break;
                        case 5:
                            System.out.println("Enter five numbers:");
                            int res = main.lastNumSum(sc.nextInt(), sc.nextInt());
                            for (int i = 0; i < 3; i++) {
                                System.out.println("Remaining:"+res);
                                res = main.lastNumSum(res, sc.nextInt());
                            }
                            System.out.println("Result:" + res);
                            break;
                    }
                    break;
                case 2:
                    switch (num_subtask) {
                        case 1:
                            System.out.println("Enter two numbers:");
                            System.out.println("Division of numbers:" + main.safeDiv(sc.nextInt(), sc.nextInt()));
                            break;
                        case 2:
                            System.out.println("Enter two numbers:");
                            System.out.println(main.makeDecision(sc.nextInt(), sc.nextInt()));
                            break;
                        case 3:
                            System.out.println("Enter three numbers:");
                            System.out.println("Can get third number from others:" + main.sum3(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                            break;
                        case 4:
                            System.out.println("Enter age:");
                            System.out.println("Result:" + main.age(sc.nextInt()));
                            break;
                        case 5:
                            System.out.println("Enter day of week:");
                            main.printDays(sc.next());
                            break;
                    }
                    break;
                case 3:
                    switch (num_subtask) {
                        case 1:
                            System.out.println("Enter the number:");
                            System.out.println("Result:" + main.reverseListNums(sc.nextInt()));
                            break;
                        case 2:
                            System.out.println("Enter two numbers:");
                            System.out.println("Result:" + main.pow(sc.nextInt(), sc.nextInt()));
                            break;
                        case 3:
                            System.out.println("Enter the number:");
                            System.out.println("Result:" + main.equalNum(sc.nextInt()));
                            break;
                        case 4:
                            System.out.println("Enter the number:");
                            main.leftTriangle(sc.nextInt());
                            break;
                        case 5:
                            System.out.println("Guess the number game!");
                            main.guessGame();
                            break;
                    }
                    break;
                case 4:
                    switch (num_subtask) {
                        case 1:
                            System.out.println("Enter an array of numbers:");
                            int[] arr = main.read_arr();
                            System.out.println("Enter the number from array:");
                            System.out.println("Index: " + main.findLast(arr, sc.nextInt()));
                            break;
                        case 2:
                            System.out.println("Enter an array of numbers:");
                            int[] arr1 = main.read_arr();
                            System.out.println("Enter number which to be added to array:");
                            int x = sc.nextInt();
                            System.out.println("Enter position:");
                            System.out.println("Result:" + Arrays.toString(main.add(arr1, x, sc.nextInt())));
                            break;
                        case 3:
                            System.out.println("Enter an array of numbers:");
                            main.reverse(main.read_arr());
                            break;
                        case 4:
                            System.out.println("Enter first array:");
                            int[] arr3 = main.read_arr();
                            System.out.println("Enter second array:");
                            System.out.println("Result:" + Arrays.toString(main.concat(arr3, main.read_arr())));
                            break;
                        case 5:
                            System.out.println("Enter an array of numbers:");
                            System.out.println("Result:" + Arrays.toString(main.deleteNegative(main.read_arr())));
                            break;
                    }
                    break;
            }
            System.out.println("Enter the number of task(1-4), 5-exit:");
            num_task = sc.nextInt();
        }
        sc.close();
    }
    //Task 1
    public int sumLastNums (int x){
        if (x < 9) {
            throw new ArithmeticException("Number must be more than 9");
        }
        return (x % 10 + (x % 100) / 10);
    }
    public boolean isPositive (int x){
        if (x == 0){
            throw new ArithmeticException("0 - neither positive nor negative number");
        }
        return (x > 0);
    }
    public boolean isUpperCase (char x) {
        return (x >= 'A' && x <= 'Z');
    }
    public boolean isDivisor (int x, int y) {
        return (y % x == 0);
    }
    public int lastNumSum(int a, int b) {
        return ((a % 10) + (b % 10)) % 10;
    }
    //Task 2
    public double safeDiv (int x, int y) {
        if (y == 0) {
            return 0;
        }
        return (double) x / y;
    }
    public String makeDecision (int x, int y) {
        if (x > y){
            return (x + ">" + y);
        }
        if (x < y) {
            return (x + "<" + y);
        }
        return (x + "==" + y);
    }
    public boolean sum3 (int x, int y, int z) {
        return ((x + y == z) || (x + z == y) || (y+ z == x));
    }
    public String age (int x) {
        if (x % 10 == 1 && x != 11){
            return (x + " год");
        }
        if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && x != 12 && x != 13 && x != 14){
            return (x + " года");
        }
        return (x + " лет");
    }
    public void printDays (String x) {
        switch (x) {
            case "понедельник":
                System.out.println("вторник");
            case "вторник":
                System.out.println("среда");
            case "среда":
                System.out.println("четверг");
            case "четверг":
                System.out.println("пятница");
            case "пятница":
                System.out.println("суббота");
            case "суббота":
                System.out.println("воскресенье");
                break;
            case "воскресенье":
                System.out.println("It's the last day of week");
                break;
            default:
                System.out.println("It's not a valid day of week");
                break;
        }
    }
    //Task 3
    public String reverseListNums (int x) {
        String result = "";
        for (int i = x; i >= 0; i--) {
            result += String.valueOf(i) + " ";
        }
        return result;
    }
    public double pow (int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
    public boolean equalNum (int x) {
        int match_num = x % 10;
        while (x != 0){
            if (match_num != x % 10){ return false; }
            x /= 10;
        }
        return true;
    }
    public void leftTriangle (int x) {
        System.out.println("Result:");
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void guessGame() {
        System.out.println("Enter a number from 0 to 9:");
        Scanner sc = new Scanner(System.in);
        Random rand  = new Random();
        int rand_num = rand.nextInt(9);
        int num_attempt = 1;
        while (sc.nextInt() != rand_num) {
            System.out.println("You guessed wrong, enter a number from 0 to 9:");
            num_attempt++;
        }
        System.out.println("You guessed the right number!");
        System.out.println("You guessed in " + num_attempt + " attempts.");
    }
    //Task 4
    public int[] read_arr (){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String input = sc.nextLine();
        String[] stringNumbers = input.replace(",", " ").split(" ");
        for (String str : stringNumbers) {
            int number = Integer.parseInt(str);
            numbers.add(number);
        }
        int[] arr = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            arr[i] = numbers.get(i);
        }
        return arr;
    }
    public int findLast (int[] arr, int x) {
        for (int i = arr.length; i > 0; i--) {
            if (arr[i-1] == x) {
                return i;
            }
        }
        return -1;
    }
    public int[] add (int[] arr, int x, int pos) {
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            res[i] = arr[i];
        }
        res[pos] = x;
        for (int i = pos + 1; i <= arr.length; i++) {
            res[i] = arr[i - 1];
        }
        return res;
    }
    public void reverse (int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("Result:" + Arrays.toString(arr));
    }
    public int[] concat (int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            res[i + arr1.length] = arr2[i];
        }
        return res;
    }
    public int[] deleteNegative (int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                cnt++;
            }
        }
        int[] res = new int[cnt];
        cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                res[cnt] = arr[i];
                cnt++;
            }
        }
        return res;
    }
}