public class Ingredients {
    /*
    Necessary for the project:
        String Name;
        Boolean ;
        Double peso;
     */

    private String name;
    private boolean esSalado;
    private double peso;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEsSalado() {
        return esSalado;
    }

    public void setEsSalado(boolean esSalado) {
        this.esSalado = esSalado;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Ingredients(String name, boolean esSalado, double peso){
        this.name = name;
        this.esSalado = esSalado;
        this.peso = peso;
        System.out.println("Ingredient created");
    }
}
