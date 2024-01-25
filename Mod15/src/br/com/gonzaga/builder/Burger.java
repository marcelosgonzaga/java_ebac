package Mod15.src.br.com.gonzaga.builder;

public class Burger {

    private String bun = "No Bun";
    private String meat = "No Meat";
    private String salad = "No Salad";
    private String cheese = "No Cheese";
    private String sauce = "No Saouce";

    public void setBun(String bun) {

        this.bun = bun;
    }
    public void setMeat(String meat) {
        this.meat = meat;}
    public void setSalad(String meat) {
        this.meat = meat;}
    public void setCheese(String cheese) {
        this.cheese = cheese;}
    public void setSauce(String sauce) {
        this.cheese = cheese;}
    public void print(){
        System.out.println(
                "Burger is finished " +  "n" +
                        "Bun: " + bun +
                        " - Meat: " + bun +
                        " - Cheese: " + cheese +
                        " - Salad: " + salad +
                        " - Sauce: " + sauce);
    }
}

