package es.upm.miw.apaw.patterns.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TranslatorTest {

    private Translator translator;

    @Test
    void testEnglishTranslator(){
        translator = new Translator(new English());
        assertEquals("Hello!", translator.greet());
    }

    @Test
    void testItalianTranslator(){
        translator = new Translator(new Italian());
        assertEquals("Ciao!", translator.greet());
    }

    @Test
    void testSpanishTranslator(){
        translator = new Translator(new Spanish());
        assertEquals("Hola!", translator.greet());
    }
}
