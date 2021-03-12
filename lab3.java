import java.util.Scanner;

abstract class Solid
{
    abstract double Getvolume();
    public abstract double GetArea();

    protected static int counter;

    {
        counter++;
    }
}

class Cube extends Solid
{
    private double A;

    {
        A = 1;
    }

    Cube(double A)
    {
        this.A = A;
    }

    @Override
    double Getvolume()
    {
        return Math.pow(A, 3);
    }

    @Override public double GetArea()
    {
        return this.A * 3;
    }
}

class RectSolid extends Solid
{
    private double width;
    private double length;
    private double height;

    {
        width = 1;
        length = 1;
        height = 1;
    }

    RectSolid(double width, double length, double height) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
    @Override
    double Getvolume()
    {
        return width * length * height;
    }

    @Override public double GetArea()
    {
        return 2*(width*height + height*length + width*length);
    }
}

public class lab3 {


    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);
        Solid cube;

        System.out.println("Введіьть значення сторони куба: ");
        double a1 = scan.nextDouble( );

        cube = new Cube(a1);

        System.out.println("Обєм куба: " + cube.Getvolume());
        System.out.println("Периметр куба: " + cube.GetArea());
        Solid rect;

        System.out.println("Введіьть значення ширини прямокутного паралепіпеда: ");
        double w = scan.nextDouble( );
        System.out.println("Введіьть значення висоти прямокутного паралепіпеда: ");
        double h = scan.nextDouble( );
        System.out.println("Введіьть значення довжини прямокутного паралепіпеда: ");
        double l = scan.nextDouble( );

        rect = new RectSolid(w, l, h);

        System.out.println("Обєм прямокутного паралепіпеда: " + rect.Getvolume());
        System.out.println("Периметр рямокутного паралепіпеда: " + rect.GetArea());
        System.out.println("Кількість створених обєктів: " + Solid.counter);

    }


}
