import java.util.ArrayList;

public class Recipe {
     /*
    Necessary for the project:
        Ingredients [];
        String[] Steps;
        Double preparationTime;
     */

    private double preparationTime;
    private ArrayList<Ingredients> ingredients;
    private ArrayList<String> steps;

    public double getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(double preparationTime) {
        this.preparationTime = preparationTime;
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<String> getSteps() {
        return steps;
    }

    public void setSteps(ArrayList<String> steps) {
        this.steps = steps;
    }

    public Recipe(double preparationTime, ArrayList<Ingredients> ingredients, ArrayList<String> steps) {
        this.preparationTime = preparationTime;
        this.ingredients = ingredients;
        this.steps = steps;
        System.out.println("Recipe created");
    }
}
