import java.util.Scanner;

interface Solid
{
    double GetVolume();
    double GetArea();
}

class Cube implements Solid
{
    private double A;

    {
        A = 1;
    }

    Cube(double A)
    {
        this.A = A;
    }

    public double GetVolume() { return Math.pow(A, 3); }
    public double GetArea()
    {
        return this.A * 3;
    }
}

class RectSolid implements Solid
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

    public double GetVolume()
    {
        return width * length * height;
    }
    public double GetArea()
    {
        return 2*(width*height + height*length + width*length);
    }
}

public class lab3 {


    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);
        Cube cube;

        System.out.println("Введіьть значення сторони куба: ");
        double a1 = scan.nextDouble( );

        cube = new Cube(a1);

        System.out.println("Обєм куба: " + cube.GetVolume());
        System.out.println("Периметр куба: " + cube.GetArea());
        RectSolid rect;

        System.out.println("Введіьть значення ширини прямокутного паралепіпеда: ");
        double w = scan.nextDouble( );
        System.out.println("Введіьть значення висоти прямокутного паралепіпеда: ");
        double h = scan.nextDouble( );
        System.out.println("Введіьть значення довжини прямокутного паралепіпеда: ");
        double l = scan.nextDouble( );

        rect = new RectSolid(w, l, h);

        System.out.println("Обєм прямокутного паралепіпеда: " + rect.GetVolume());
        System.out.println("Периметр рямокутного паралепіпеда: " + rect.GetArea());
    }
}
