import java.util.Scanner;

public class lab2 {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] argv)
    {
       //System.out.println("Завдання 1: ");
        char universityArray[] = {'Н', 'Л', 'Т', 'У', ' ',
                'І', 'Д', 'Т', 'Д', ' ', '2','1',' ',
                'К', 'о', 'м', 'п', 'ю', 'т', 'е', 'р', 'н', 'і', ' ', 'н', 'а', 'у', 'к', 'и'};
        String s_university1 = new String(universityArray, 0, 12);
        String s_university2 = new String(reverseString(s_university1));
        System.out.println(s_university2);

        String s_university3 = new String(s_university1.toUpperCase());
        System.out.println(s_university1);
        System.out.println(s_university3);
        if(s_university1.compareTo(s_university3) == 0)
        {
            System.out.println("Нова стрічка рівна першій! ");
        }
        else
        {
            System.out.println("Нова стрічка не рівна першій! ");
        }

        System.out.println(s_university1.substring(5, 9));

        System.out.println("Перше і останнє входження літери Д у 1 рядку: ");
        System.out.println(s_university1.indexOf('Д') + " " + s_university1.lastIndexOf('Д'));

        StringBuffer myInfo = new StringBuffer("Ольшанський Володимир Орестович 02.08.2002");

        System.out.println(myInfo.delete(32, 38));

        System.out.println(myInfo.append(" Новояворівськ"));

        System.out.println(myInfo.insert( 36, " чоловік"));

        System.out.println("Довжина: " + myInfo.length() + " Розмір: " + myInfo.length() * 2 + " байт");

        myInfo.setLength(31);
        System.out.println("Вкорочена стрічка: " + myInfo);

        System.out.println("Дзеркальрне відображення прізвища: " + reverseString(myInfo.substring(0, 11)));
    }
}
