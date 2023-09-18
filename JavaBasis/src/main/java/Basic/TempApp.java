package main.java.Basic;

public class TempApp {
    public static void main(String[] args) {
        TempConverter tempConverter = new TempConverter();
        UserInput ui = new UserInput();

        double tempCelsium = ui.userInput("Please enter temp in Celsius");
        double tempFahr = tempConverter.converterFromCelsiumToFehrengeit(tempCelsium);

        // вызов метода передачи результата нашей конвертации температуры пользователю
        System.out.println("Your temp in Fahrenheit is " + tempFahr);


        tempFahr = ui.userInput("Please enter temp in Fahrenheit");
        tempCelsium = tempConverter.converterFromFehrengeitToCelsium(tempFahr);
        System.out.println("Your temp in Celsium is " + tempCelsium);


    }
}