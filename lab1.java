import java.util.Random;

public class lab1 {

    public static long factorial(int f) {
        long result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }

    private static double y;

    public static void main(String[] argv)
    {
        System.out.println("Завдання 1: ");
        for(double i = 0; i <= 5; i+=0.5d)
        {
            y = Math.pow(4 * Math.pow(i, 3) + i*i, 1./4);
            System.out.println("y = " + y + " i = " + i);
        }

        System.out.println("Завдання 2: ");
        for(int i = -10; i <= 10; i += 2)
        {
            if(i < 0)
            {
                System.out.printf("sin(cos(%d)) = %f \n", i, Math.sin(Math.cos(i)));
            }
            else
            {
                System.out.printf("cos(sin(%d)) = %f \n", i, Math.cos(Math.sin(i)));
            }
        }

        System.out.println("Завдання 3: ");
        int N = 10;
        int A[][] = new int[N][N];
        int count = 0;
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                Random random = new Random();
                A[i][j] = random.nextInt(30) - 15;
                System.out.print(A[i][j] + " ");
                if(((i == 0) || (j == 0) || (i == N-1) || (j == N-1)) && (A[i][j] > 0))
                    count++;
            }
            System.out.print('\n');
        }
        System.out.printf("Факторіал кількості додатніх чисел, які розміщені по периметру: f(%d) = %d", count, factorial(count));
    }
}
