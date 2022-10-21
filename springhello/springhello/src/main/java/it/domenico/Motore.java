package it.domenico;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Motore {
    private String alimentazione;
    private int cilindrata;

    public Motore(String alimentazione, int cilindrata) {
        this.alimentazione = alimentazione;
        this.cilindrata = cilindrata;
    }

}