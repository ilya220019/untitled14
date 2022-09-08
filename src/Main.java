import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double [] digitals = {2.3, 5.6, -9.2, -16.8, 88, 41.7, -12.9, 79, 54.2, -123.9, 12.4, 22.3, -55, -65.3, 88.1};
double summa = 0;
int namberDigit = 0;
boolean proverka = false;
        for (double digit:digitals) {
            if (digit<0){
                proverka = true;
            }
            else if (digit>0 && proverka) {
                namberDigit++;
                summa += digit;
                            }
        }
        System.out.println("Среднее арифметическое положительных чисел массива " + (summa/namberDigit));
        double x = 0;
                for (int i = 0; i<digitals.length; i++) {
            for (int j = i + 1; j < digitals.length; j++) {
                if (digitals[i] > digitals[j]) {
                    x = digitals[i];
                    digitals[i] = digitals[j];
                    digitals[j] = x;
                }

            }
                    System.out.println(Arrays.toString(digitals));
        }
    }
}
