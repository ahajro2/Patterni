package ba.unsa.etf.rpr;

import ba.unsa.etf.rpr.BuilderPattern.Phone;
import ba.unsa.etf.rpr.BuilderPattern.PhoneBuilder;
import ba.unsa.etf.rpr.FactoryPattern.Android;
import ba.unsa.etf.rpr.FactoryPattern.OperativniSistem;
import ba.unsa.etf.rpr.FactoryPattern.OperativniSistemFactory;

/**
 * Hello world!
 *
 */
public class Aplikacija
{
    public static void main( String[] args )
    {
        /**
         * Test Builder patterna, otkomentarisati za rad
         *                 Phone mobitel = (new PhoneBuilder("Android")).
         *                 setBaterija(5000).setMegapixeli(48).setProcesor("Snapdragon 865 5nm").build();
         *                 System.out.println(mobitel);
         */


        /**
         * Test Factory patterna, otkomentarisati za rad
         *         OperativniSistemFactory operativniSistemFactory = new OperativniSistemFactory();
         *         OperativniSistem os = operativniSistemFactory.getInstance("Closed source");
         *         os.specifikacije();
         */

    }
}
