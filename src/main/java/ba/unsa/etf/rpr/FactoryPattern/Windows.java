package ba.unsa.etf.rpr.FactoryPattern;

public class Windows implements OperativniSistem{
    @Override
    public void specifikacije() {
        System.out.println("Windows - Clearly only for PCs and laptops (Sorry NOKIA)");
    }
}
