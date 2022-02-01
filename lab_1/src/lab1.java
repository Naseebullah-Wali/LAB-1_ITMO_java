// Лабораторная работа №1
// Вариант 33110
import static java.lang.Math.*;


public class lab1 {
    public static void main(String[] args) {
        // Declaring and populating the first array
        final int F_SIZE = 13;
        final int F_MAX = 17;
        long [] f = new long[F_SIZE];

        for (int i=0; i<F_SIZE; i++) {
            f[i] = F_MAX-i;
        }

        // Declaring and filling the second array
        final int X_SIZE = 19;
        final double MIN_RANGE = -12.0f;
        final double MAX_RANGE = 13.0f;
        double[] x = new double[X_SIZE];

        for (int i=0; i<X_SIZE; i++) {
            x[i] = (Math.random() * (MAX_RANGE-MIN_RANGE)) + MIN_RANGE;
        }

        // Declaring and filling the third (final) array
        final int T_FIRST_SIZE = 7;
        final int T_SECOND_SIZE = 19;
        double[][] t = new double[T_FIRST_SIZE][T_SECOND_SIZE];
        double store;

        for (int i=0; i<T_FIRST_SIZE; i++) {
            for (int j=0; j<T_SECOND_SIZE; j++) {
                if (f[i] == 15) {
                    store = Math.asin(Math.sin((0.5 + atan((x[j] + 0.5 / 25)))));
                    store = Math.pow(store, Math.sin(x[j]));

                } else if (f[i] == 5 || f[i] == 7 || f[i] == 17 ) {
                    store = 2*Math.atan(Math.cos(x[j]));
                    store= Math.pow(store,2);
                } else {
                    store = Math.cbrt(Math.pow(Math.cbrt(Math.pow(0.5* x[j], x[j])) /2, 2));
//
                }
                t[i][j] = store;
            }
        }

        //Output of the third (final) array
        for (int i=0; i<T_FIRST_SIZE; i++) {
            for (int j=0; j<T_SECOND_SIZE; j++) {
                System.out.printf("%.5f ", t[i][j]);
            }
            System.out.println();
        }
    }
}