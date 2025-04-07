package it.epicode.pizzeria.model;

import lombok.Data;

import java.util.List;
@Data
public class Pizza implements Prodotto {
    private String nome;
    private List<Topping> toppings;
    private boolean xxl;

    public Pizza(String nome, List<Topping> toppings, boolean xxl) {
        this.nome = nome;
        this.toppings = toppings;
        this.xxl = xxl;
    }
    @Override
    public double getPrezzo() {
        double prezzoBase = 4.99;
        double prezzoToppings = toppings.stream().mapToDouble(Topping::getPrezzo).sum();
        double totale = prezzoBase + prezzoToppings;
        return xxl ? totale * 1.2 : totale;
    }
    @Override
    public InfoNutrizionali getInfoNutrizionali() {
        int calorie = 1104;
        int zuccheri = 64;
        int grassi = 68;
        for (Topping t : toppings) {
            InfoNutrizionali info = t.getInfoNutrizionali();
            calorie += info.getCalorie();
            zuccheri += info.getZuccheri();
            grassi += info.getGrassi();


        }
        if (xxl) {
            calorie *= 1.2;
            zuccheri *= 1.2;
            grassi *= 1.2;
        }
        return new InfoNutrizionali(calorie, zuccheri, grassi);
    }
}
