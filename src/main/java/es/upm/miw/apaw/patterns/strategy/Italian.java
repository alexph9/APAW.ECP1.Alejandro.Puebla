package es.upm.miw.apaw.patterns.strategy;

public class Italian implements Language {

    private String languageId;

    public Italian(){
        this.languageId = "IT";
    }

    @Override
    public String greet() {
        return "Ciao!";
    }
}
