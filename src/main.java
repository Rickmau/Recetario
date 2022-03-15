import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        /*
        Create a menu for:
            1. Ad ingredient
            2. Ad recipe
            3. Consult recipeBook
         */

        /*
            1. Create some ingredients
            2. Save those ingredients on an array list
            3. Create some recipes
            4. Create a recipe book
            5. Save those recipes on the recipe book
            6. Launch a menu
            7. Show available ingredients each one with its number
            8. Make an arrayList with the ingredients selected
            9. Import them with a get
            10. Use a do while to enter all the ingredients the user wants
         */

        //Create Ingredients
       Ingredients cucumber = new Ingredients("cucumber",true,150);
       Ingredients crab = new Ingredients("crab",false,350);
       Ingredients mayonnaise = new Ingredients("mayonnaise",true,75);
       Ingredients onion = new Ingredients("onion",true,50);

       //Ingredients on the arrayList
            // ArrayList<Ingredients> AvailableIngredients = new ArrayList<>(Arrays.asList(cucumber,crab,mayonnaise,onion));
        ArrayList<Ingredients> AvailableIngredients = new ArrayList<>();
        AvailableIngredients.add(cucumber);
        AvailableIngredients.add(crab);
        AvailableIngredients.add(mayonnaise);
        AvailableIngredients.add(onion);

        //Create a recipe
        Recipe surimi = new Recipe(
                "surimi",
                15.50,
                //Ingredients
                new ArrayList<>(Arrays.asList(cucumber,crab,mayonnaise,onion));
                //Steps
                new ArrayList<>(Arrays.asList("Cut the cucumber in small triangles",
                                            "Cut the crab"));
    }
}
