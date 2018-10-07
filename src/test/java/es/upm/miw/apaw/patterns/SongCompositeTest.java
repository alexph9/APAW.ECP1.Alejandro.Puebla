package es.upm.miw.apaw.patterns;

import es.upm.miw.apaw.entities.Artist;
import es.upm.miw.apaw.entities.Genre;
import es.upm.miw.apaw.entities.Song;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SongCompositeTest {

    private SongComposite rock;
    private SongLeaf song, song2;

    @BeforeEach
    void before(){
        this.rock = new SongComposite("rock");
        this.song = new SongLeaf(
                new Song("1", "One", new Artist("1", "U2", false), Genre.ROCK));
        this.song2 = new SongLeaf(
                new Song("2", "Beautiful Day", new Artist("1", "U2", false), Genre.ROCK));
        this.rock.add(song);
        this.rock.add(song2);
    }

    @Test
    void testSongComponent(){
        assertEquals(true,rock.isComposite());
        this.rock.remove(song);
        this.rock.remove(song2);
        assertEquals(true,rock.songComponentList.isEmpty());

    }

    @Test
    void testSongLeaf(){
        assertEquals(false, song.isComposite());
        assertNotNull(song.getSong());
    }
}
