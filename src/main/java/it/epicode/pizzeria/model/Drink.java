package it.epicode.pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Drink implements Prodotto{

    private String nome;
    private double prezzo;
    private InfoNutrizionali infoNutrizionali;

}
