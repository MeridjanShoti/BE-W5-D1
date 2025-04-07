package it.epicode.pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class Menu {
    private List<Prodotto> prodotti;
    public void stampaMenu() {
        System.out.println("===MENU PIZDERIA===");
        for (Prodotto p : prodotti) {
            System.out.printf("- %s - Prezzo: %s - Calorie: %s - Zuccheri: %s - Grassi: %s\n", p.getNome(), p.getPrezzo(), p.getInfoNutrizionali().getCalorie(), p.getInfoNutrizionali().getZuccheri(), p.getInfoNutrizionali().getGrassi());
        }
    }

}
