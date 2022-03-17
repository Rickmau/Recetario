import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
        Ingredients cucumber = new Ingredients("cucumber", true, 150);
        Ingredients crab = new Ingredients("crab", false, 350);
        Ingredients mayonnaise = new Ingredients("mayonnaise", true, 75);
        Ingredients onion = new Ingredients("onion", true, 50);

        //Ingredients on the arrayList
        // ArrayList<Ingredients> AvailableIngredients = new ArrayList<>(Arrays.asList(cucumber,crab,mayonnaise,onion));
        ArrayList<Ingredients> AvailableIngredients = new ArrayList<>();
        AvailableIngredients.add(cucumber);
        AvailableIngredients.add(crab);
        AvailableIngredients.add(mayonnaise);
        AvailableIngredients.add(onion);

        //Create a recipe
        Recipe surimi = new Recipe(
                30,
                //Ingredients
                new ArrayList<>(Arrays.asList(cucumber, crab, mayonnaise, onion)),
                //Steps
                new ArrayList<>(Arrays.asList("Cut the cucumber in small triangles",
                        "Cut the crab",
                        "Cut 2 entire onions",
                        "Mix the cucumber, the crab and the onions with the mayonnaise in a bowl",
                        "Ready to eat")));
        //Create on the recipe book
        recipeBook MyRecipeBook = new recipeBook("Erick", "Surimi Recipe", new ArrayList<>(Arrays.asList(surimi)));
        Scanner data = new Scanner(System.in);
        int answer;

        do {
            //Show the options that the user has
            System.out.println("Welcome, choose an option");
            System.out.println("1. Add an ingredient");
            System.out.println("2. Add a new recipe");
            System.out.println("3. See my recipe book");
            System.out.println("-1. Exit");
            answer = data.nextInt();

            switch (answer) {
                case 1:
                    Ingredients newIngredient = new Ingredients();
                    System.out.println("Enter the ingredient name");
                    newIngredient.setName(data.next());
                    System.out.println("Enter quantity");
                    newIngredient.setPeso(data.nextDouble());
                    System.out.println("Your ingredient is salty? 1. Yes\t2. No");
                    if (data.nextInt() == 1) {
                        newIngredient.setEsSalado(true);
                    } else {
                        newIngredient.setEsSalado(false);
                    }
                    System.out.println("Ingredient created");
                    AvailableIngredients.add(newIngredient);
                    break;
                case 2:
                    Recipe newRecipe = new Recipe();
                    System.out.println("Enter the name of the recipe");
                    newRecipe.setName(data.next());
                    System.out.println("Enter preparation time");
                    newRecipe.setPreparationTime(data.nextDouble());
                    System.out.println("Available Ingredients: ");
                    for (int i = 0; i < AvailableIngredients.size(); i++) {
                        System.out.println(i + 1 + ". " + AvailableIngredients.get(i).getName());
                    }
                    ArrayList<Ingredients> RecipeIngredients = new ArrayList<>();
                    System.out.println("Enter the number of the ingredient and if you don't want to add more just enter 0");
                    do {
                        if (answer != 0) {
                            RecipeIngredients.add(AvailableIngredients.get(answer - 1));
                        }
                    } while (answer != 0);
                    newRecipe.setIngredients(RecipeIngredients);
                    ArrayList<String> RecipeSteps = new ArrayList<>();
                    System.out.println("Enter the steps to follow and if you don't want to add more just enter 0");
                    String ans = "";
                    do {
                        if (!ans.equals("0")) {
                            RecipeIngredients.add(AvailableIngredients.get(answer - 1));
                        }
                    } while (!ans.equals("0"));
                    newRecipe.setSteps(RecipeSteps);
                    MyRecipeBook.getRecipes().add(newRecipe);
                    break;
                case 3:
                    MyRecipeBook.ShowRecipeBook();
                    break;
            }
        } while (answer != -1);

        //

    }

}
