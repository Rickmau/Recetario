import java.sql.Array;
import java.util.ArrayList;

public class recipeBook {
    /*
    Necessary for the project:
        Recipe[];
        String Author;
        String title;
     */

    private ArrayList<Recipe> Recipes;
    private String Author;
    private String Title;
    public recipeBook(){}

    public ArrayList<Recipe> getRecipes() {
        return Recipes;
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        Recipes = recipes;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public recipeBook(String Author, String Title, ArrayList<Recipe> Recipes){
        this.Author = Author;
        this.Title = Title;
        this.Recipes = Recipes;
    }

    public void ShowRecipeBook(){
        System.out.println(Title);
        System.out.println(Author);
        for (Recipe recipe: Recipes) {
            recipe.ShowRecipe();
        }
    }
}
