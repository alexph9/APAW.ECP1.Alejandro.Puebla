package es.upm.miw.apaw.patterns.strategy;

public class Spanish implements Language {

    private String languageId;

    public Spanish(){
        this.languageId = "ES";
    }

    @Override
    public String greet() {
        return "Hola!";
    }
}
