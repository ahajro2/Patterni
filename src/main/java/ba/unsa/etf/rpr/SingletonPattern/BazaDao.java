package ba.unsa.etf.rpr.SingletonPattern;


/**
 * Implementacija BazaDao klase kao primjera jedne "Data Access Object" koja ce raditi s bazom.
 * Poenta Singleton patterna je u tome sto pozivanje "stvaranja" instance nece napraviti dvije instance klase koja radi
 * s bazom. U slucaju da se to desilo, u programu bi moglo doci do kraha s radom s bazom, jer bi bila otvorena s dvije instance.
 * Ovako je baza bezbijedna i moze normalno da radi sa jednom instancom.
 * Otvaranje baze i njeno regeneriranje je jako skup proces pogotovo kada je rijec o nekim realnim problemima i podacima.
 *
 */
public class BazaDao {

    private static BazaDao instanca = null;

    /**
     * Metoda getInstance() ne da pravljenje vise od jedne instance ove klase
     * @return
     */
    public static BazaDao getInstance() {
        if(instanca != null)
            instanca = new BazaDao();
        return instanca;
    }


    /**
     * Metoda remove instance samo uklanja instancu klase BazaDao i omogucava otvaranje baze
     * ponovo pozivom metode getInstance();
     */
    public static void removeInstance() {
        if(instanca == null) return;
        instanca = null;
    }
}
