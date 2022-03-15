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
    private String name;
    public Recipe(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public void ShowIngredients(){
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.println(i+1 + "- " + ingredients.get(i));
        }
    }

    public void ShowSteps(){
        for (int i = 0; i < steps.size(); i++) {
            System.out.println(+1 + ". " + steps.get(i));
        }
    }

    public void ShowRecipe(){
        System.out.println(name);
        System.out.println(preparationTime);
        ShowIngredients();
        ShowSteps();
    }
}
