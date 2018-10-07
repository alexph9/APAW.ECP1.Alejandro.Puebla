package es.upm.miw.apaw.patterns.strategy;

public class English implements Language {

    private String languageId;

    public English(){
        this.languageId = "EN";
    }

    @Override
    public String greet() {
        return "Hello!";
    }
}
