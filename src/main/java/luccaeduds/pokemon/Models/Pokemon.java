package luccaeduds.pokemon.Models;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Pokemon
 */


@AllArgsConstructor
@Getter
@Setter
public class Pokemon {
    private int numNatdex;
    private String Nome;
    private List<String> tipo = new ArrayList<>();
    private List<String> evolucoes = new ArrayList<>();
    private List<String> locais = new ArrayList<>();
}
