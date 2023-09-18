package main.java.Pizza;

public class PizzaCalories {
    double diameter ;

    double unitCalories;

    //S= Pi* r*r
    // S= Pi* (D/2) *(D/2)
    //S= Pi *D*D  /4
    double area = Math.PI*diameter*diameter /4;
    double totalCalories = area * unitCalories;
    
}
