package it.epicode.pizzeria.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InfoNutrizionali {
    private int calorie;
    private int zuccheri;
    private int grassi;
}
