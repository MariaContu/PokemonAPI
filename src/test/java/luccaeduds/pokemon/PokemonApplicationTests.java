package luccaeduds.pokemon;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import luccaeduds.pokemon.Controller.Buscas;
import luccaeduds.pokemon.Controller.Pokemon;

@SpringBootTest(classes = PokemonApplicationTests.class)
class PokemonApplicationTests {

	@Test
	void contextLoads() {
	}

	    @Test
    public void testListaPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(25, "Pikachu", List.of("Elétrico"), new ArrayList<>(), new ArrayList<>()));
        pokemons.add(new Pokemon(1, "Bulbasaur", List.of("Grama"), new ArrayList<>(), new ArrayList<>()));

        String expectedOutput = "Pikachu 25 [Elétrico]\nBulbasaur 1 [Grama]\n";

        // Capturar a saída padrão
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Executar o método que imprime a lista de Pokémon
        Buscas.listaPokemons(pokemons);

        // Restaurar a saída padrão
        System.setOut(System.out);

        // Comparar a saída capturada com a saída esperada
        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testDetalhaPokemon() {
        Pokemon pokemon = new Pokemon(25, "Pikachu", List.of("Elétrico"), List.of("Raichu"), List.of("Floresta"));

        String expectedOutput = "Detalhes do Pikachu:\n - Numero da NatDex: 25\n - Tipo: [Elétrico]\n - Evolução: [Raichu]\n - Locais: [Floresta]";

        // Capturar a saída padrão
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Executar o método que imprime os detalhes do Pokémon
        Buscas.detalhaPokemon(pokemon);

        // Restaurar a saída padrão
        System.setOut(System.out);

        // Comparar a saída capturada com a saída esperada
        assertEquals(expectedOutput, outputStream.toString());
    }
    @Test
    public void testBuscaNome() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(25, "Pikachu", List.of("Elétrico"), new ArrayList<>(), new ArrayList<>()));
        pokemons.add(new Pokemon(1, "Bulbasaur", List.of("Grama"), new ArrayList<>(), new ArrayList<>()));

        List<Pokemon> foundPokemons = Buscas.buscaNome("Pikachu");

        assertEquals(1, foundPokemons.size());
        assertEquals("Pikachu", foundPokemons.get(0).getNome());
    }

    @Test
    public void testBuscaTipo() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(25, "Pikachu", List.of("Elétrico"), new ArrayList<>(), new ArrayList<>()));
        pokemons.add(new Pokemon(1, "Bulbasaur", List.of("Grama"), new ArrayList<>(), new ArrayList<>()));

        List<Pokemon> foundPokemons = Buscas.buscaTipo("Elétrico");

        assertEquals(1, foundPokemons.size());
        assertEquals("Pikachu", foundPokemons.get(0).getNome());
    }

}
