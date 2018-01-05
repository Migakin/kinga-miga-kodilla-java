package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigmacBuilder{
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<String>();

        public BigmacBuilder roll (String roll){
            this.roll = roll;
            return this;
        }
        public BigmacBuilder burgers (int burgers){
            this.burgers = burgers;
            return this;
        }
        public BigmacBuilder sauce (String sauce){
            this.sauce = sauce;
            return this;
        }
        public BigmacBuilder ingrediends (String ingredient){
            ingredients.add(ingredient);
            return this;
        }
        public Bigmac build() {
            if (!roll.equals("sesame") && !roll.equals("regular"))
                throw new IllegalStateException ("You have to chose correct type of your roll!");
            if(burgers <= 0)
                throw new IllegalStateException("Your Bigmac have to contain at least one burger!");
            else
                return new Bigmac(roll, burgers, sauce, ingredients);
        }
    }
    private Bigmac(final String roll, final int burgers, final String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
