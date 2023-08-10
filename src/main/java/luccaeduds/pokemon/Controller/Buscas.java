package luccaeduds.pokemon.Controller;

import java.util.ArrayList;
import java.util.List;

public class Buscas {
    
    //atributos
    private static List<Pokemon> todosPokemons = new ArrayList<>();

    
    //metodos
    public static void listaPokemons(List<Pokemon> todosPokemons)  {
        for (Pokemon poke : todosPokemons) {
        System.out.println(poke.getNome() + " " + poke.getNumNatdex() + " " +poke.getTipo());
        }
    }

    public static void detalhaPokemon(Pokemon pokemon)  {
        System.out.printf("Detalhes do %s: \n - Numero da NatDex: %d \n - Tipo: %s \n - Evolução: %s \n - Locais: %s",pokemon.getNome(),pokemon.getNumNatdex(),pokemon.getTipo(),pokemon.getEvolucoes(),pokemon.getLocais());
    }

    public static List<Pokemon> buscaNome(String nome){
        List<Pokemon> igualNome = new ArrayList<>();

        for (Pokemon p : todosPokemons) {
            if (p.getNome().equals(nome)) igualNome.add(p);
        }
        return igualNome;
    }

    public static List<Pokemon> buscaTipo(String tipo){
        List<Pokemon> achaTipo = new ArrayList<>();

        for (Pokemon p : todosPokemons) {
            if (p.getTipo().contains(tipo)) achaTipo.add(p);
        }
        return achaTipo;
    }

}

