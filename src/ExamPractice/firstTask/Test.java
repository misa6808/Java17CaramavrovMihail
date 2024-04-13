package ExamPractice.firstTask;
//Реализуйте метод, который печатает все цифры из введенного String (Можете использовать метод character,isDigit())
// Найти в готовом массиве максимальный по значению элемент.
public class Test {
    public static int[] printNumbers(String str){
        int count = 0;
        for (char elements:str.toCharArray()) {
            if( Character.isDigit(elements)){
                count++;
                System.out.println(elements);
        }
            }
        int[] digits = new int[count];
        int index = 0;
        for (char ch : str.toCharArray()) {
                if (Character.isDigit(ch)) {
                    digits[index++] = ch - '0'; // Convert char digit to int
                }
            }

        return digits;
    }
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Extracted digits: ");
        int[] digits = printNumbers("aldfe221kwf3mr54");
        for (int digit : digits) {
            System.out.print(digit);
        }
        System.out.println();
        // Find max in the extracted digits array
        int maxDigit = findMax(digits);
        System.out.println("Maximum digit: " + maxDigit);
    }
    }

