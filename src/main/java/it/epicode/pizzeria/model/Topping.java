package it.epicode.pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Topping {
    private String nome;
    private double prezzo;
    private InfoNutrizionali infoNutrizionali;
}
