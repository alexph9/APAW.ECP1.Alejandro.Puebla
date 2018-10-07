package es.upm.miw.apaw.patterns.strategy;

public class Translator {

    private Language strategy;

    public Translator(Language strategy){
        this.strategy = strategy;
    }

    public String greet(){
        return strategy.greet();
    }
}
