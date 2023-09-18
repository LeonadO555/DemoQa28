package main.java.HomeWork;

import java.util.Scanner;

public class HomeworkCityPopulation {
    public static void main(String[] args) {
        int[] cityValueSizeGermany = {100000, 400000, 1000000, 10000000};
        int[] cityValueSizeFrance = {200000, 500000, 1500000, 10000000};
        String[] citySizeGermany = {"small for Germany", "medium for Germany", "big for Germany", "very big for Germany",};
        String[] citySizeFrance = {"small for France", "medium for France", "big for France", "very big for France"};
        //Разработайте алгоритм, который будет получать значение
        // населения того или иного города, а так же идентификатора страны и определять
        // насколько большой город в зависимости от страны.
        //Например, для Германии город с населением до 100к человек маленький, до 400к человек средний,
        // больше 1кк человек - большой. Для Франции, до 200к маленький, до 500к - средний, более 1.5кк - большой.
        //for Germany, a city with a population of up to 100k people is small,
        //up to 400k people average,from 400k to 1kk big person ,more than 1k person - very big.
        //For France, up to 200k small,up to 500k people - medium, up to 1500k people - large,
        //  more than 1.5kk - very large.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter please the name  city: ");
        String cityName = (sc.next());
        System.out.println("Name of this city is:" + cityName);
        System.out.print("Please enter country name(FR/DE): ");
        String countryName = sc.next();
        System.out.println("Name of this country is:" + countryName);
        System.out.print("Please enter the value of the population of city  " + cityName + " :");
        int cityValuePopulation = sc.nextInt();
        System.out.println("the value of the population of city " + cityName + " is : " + cityValuePopulation + " people");
        sc.close();
        if (countryName.equals("DE")) {
            System.out.println("Germany");
            for (int i = 0; i < 4;  i++) {
                if (cityValuePopulation < cityValueSizeGermany[i]) {
                    System.out.println("City " + cityName + " in Germany " + citySizeGermany[i]);
                    System.out.println(i);
                    i = 4;
                }
            }
        } else {
            System.out.println("France");
            if (countryName.equals("FR")) {
                for (int i = 0; i < 4; i++) {
                    if (cityValuePopulation < cityValueSizeFrance[i]) {
                        System.out.println("City " + cityName + " in  France " + citySizeFrance[i]);
                        System.out.println(i);
                        i = 4;
                    }
                }

            } else {

                System.out.println("wrong country id");
            }


        }


    }


}

