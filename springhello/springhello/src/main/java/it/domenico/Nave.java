package it.domenico;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Nave {
    private Motore motore;

    public Nave(Motore motore) {
        this.motore = motore;
    }

}