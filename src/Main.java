import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width;
        double height;

        //Width input//
        do
        {
            System.out.println("Enter the width of the rectangle: ");
            width = in.nextDouble();

            if (width <= 0)
            {
                System.out.println("Invalid input. You must input a positive number");
            }
        }
        while (width <= 0);

        //Height input//
        do
        {
            System.out.println("Enter the height of the rectangle: ");
            height = in.nextDouble();

            if (height <= 0)
            {
                System.out.println("Invalid input. You must input a positive number");
            }
        }
        while (height <= 0);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        //results//
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The length of the diagonal is: " + diagonal);
    }
}