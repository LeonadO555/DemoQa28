package main.java.HomeWork;

public class HomeworkPerson
{
    public static void main(String[] args)
    {
        String name = " Mark ";
        String surname = " Twain ";
        Short yearOfBirth = 1835;
        String[] array = new String[]{name, surname,",year of birth : ", String.valueOf(yearOfBirth)};
        System.out.print(name);
        System.out.println(surname);
        System.out.print("Year of birth : ");
        System.out.println(yearOfBirth);
      //  System.out.print(array[]);
        //    String [] array = {name, surname };
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);        }
     }
  }