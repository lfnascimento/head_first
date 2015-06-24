public class ChicagoStyleCheesePizza extends Pizza {
  public ChicagoStyleCheesePizza() {
    name = "Chicago Style Deep Dish Cheese Pizza";
    dough = "Extra ThickCrust Dough";
    sauce = "Plum Tomato Sauce";

    toppings.add("Shredded Cheeese");
  }

  void cut() {
    System.out.println("Cutting the pizza into square slices");
  }
}
