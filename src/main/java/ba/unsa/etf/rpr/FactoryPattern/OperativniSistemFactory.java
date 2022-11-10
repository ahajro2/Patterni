package ba.unsa.etf.rpr.FactoryPattern;


/**
 * Ovo sto Factory pattern nudi je vraćanje instance klase koju nismo eksplicitno naveli
 * Tj. ono sto je najbitnije nismo morali znati ni koja je to klasa koja ce biti vracena, bitno je da zadovoljava ove uslove
 * navedene u stringu koji smo proslijedili
 * U ovom mom primjeru imamo klasu Android, IOS i Windows. One sve nasljedjuju interfejs "Operativni sistem" pomocu kojeg
 * imaju ovi jednu metodu "specifikacije" da bi se znalo o kojem operativnom sistemu je rijec.
 * Ono sto Factory klasa radi jeste da nam vraca instancu klase na osnovu uvjeta koji je proslijeđen kao string "tipObjekta"
 * Korisnik ne zna sta se ispod haube desava i koja ce to, u ovom slucaju, instanca sistema biti vraćena, njega jedino
 * interesuje da to bude ili "open source" ili "closed source" ili drugo(windows)
 */

public class OperativniSistemFactory {

    /**
     * Ono sto je jos jako pogodno kod ovog design pattern-a je da ukoliko dodamo jos jednu model klasu, promijenit ce se
     * samo ova klasa, tj. dodacemo samo jos jedan uslov provjere za vracanje te nove instance
     *
     * Ima jos dosta primjera koji mogu pokazati Factory pattern. Jedan od tih primjera je i npr. crtanje nekog od
     * geometrijskih oblika: kruga, kvadrata, pravougaonika.
     * Mozemo napraviti interfejs koji ce definisati metodu za crtanje, a isto tako i neku Factory klasu koja
     * ce imati implementaciju po kojoj ce "kljucnoj" rijeci znati koju instancu objekta od navedenih treba da vrati, tj.
     * da iscrta.
     * @param tipObjekta
     * @return
     */
    public OperativniSistem getInstance(String tipObjekta) {
        if(tipObjekta.toLowerCase().equals("open source") || tipObjekta.toLowerCase().equals("open"))
            return new Android();
        else if(tipObjekta.equals("Closed source") ||  tipObjekta.equals("Closed"))
            return new IOS();
        else
            return new Windows();
    }
}
