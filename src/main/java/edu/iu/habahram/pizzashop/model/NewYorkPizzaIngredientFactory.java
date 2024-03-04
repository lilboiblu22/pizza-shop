package edu.iu.habahram.pizzashop.model;

public class NewYorkPizzaIngredientFactory
    implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Reggiano();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(),
                new Onions(),
                new Mushrooms(),
                new RedPeppers() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
