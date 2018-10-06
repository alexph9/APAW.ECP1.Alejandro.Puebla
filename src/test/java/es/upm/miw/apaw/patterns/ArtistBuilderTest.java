package es.upm.miw.apaw.patterns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArtistBuilderTest {

    private ArtistBuilder artistBuilder;

    @BeforeEach
    void before(){ artistBuilder = new ArtistBuilder("1", "U2", false);}

    @Test
    void testBuilder(){
        artistBuilder.name("Bono");
        artistBuilder.isSoloSinger(true);
        assertEquals("Bono", artistBuilder.build().getName());
        assertEquals(true, artistBuilder.build().isSoloSinger());
    }
}
