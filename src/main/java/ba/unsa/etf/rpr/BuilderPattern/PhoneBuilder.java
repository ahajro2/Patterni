package ba.unsa.etf.rpr.BuilderPattern;


/**
 * Ovo je PhoneBuilder klasa koja opisuje BuilderPattern
 * Ono sto se veze za nju jeste da ima sve atribute koji su potrebni
 * Potrebni atributi su svi oni koji se nalaze u "model" klasi koju ovaj Builder pattern opisuje
 * U ovom slucaju mi opisujemo klasu Phone i samim tim treba da ima sve atribute te klase
 * Ono sto je prednost ovakvog rada jeste sto necemo morati pozivati konstruktor uvijek pri inicijalizaciji Phone objekata
 * Inicijaliziramo samo one atribute koji su nama bitni preko builder patterna
 * Primjer kupovine telefona od strane kupca kojeg ne interesuju performanse, nego samo da je Android OS podrzan na mobilnom
 * uređaju.
 * Builder pattern ima i svoje neke nedostatke, a to su da se mora prvo napraviti builder klasa, prije model klase sto u stvarnosti
 * moze oduzeti dosta vremena i resursa
 *
 *
 * Builder pattern je dobar su slucaju da mi imamo model klasu koja ima mnogo atributa koji su opcionalni, tacnije,
 * da ne bismo imali ogroman konstruktor pri svakoj inicijalizaciji, s Builder patternom uradimo samo ono sto je obavezno,
 * a ostalo je na nama da rijesimo preko setter-a.
 *
 * U slucaju da to sve primijetimo najbolje je odmah krenuti sa Builder patternom, a ne prebacivati se s konstruktora na njega.


 */


public class PhoneBuilder {
    private final String operativniSistem;
    private String procesor;
    private Double displayVelicina;
    private Integer baterija;
    private Integer megapixeli;


    /**
     * U slucaju da zelimo da podesimo klasu na nacin da neki atributi moraju biti definirani, samo stavimo da su
     * final atributi, tj. konstantni i onda cemo ih morati inicijalizirati ili u konstruktoru ili na mjestu deklaracije
     */

    public PhoneBuilder(String operativniSistem) {
        this.operativniSistem = operativniSistem;
    }


    /**
     * Svaka od metoda ove klase vracat u stvari referencu na upravo samu sebe
     * Poslije dodavanja ovih "setter-a" mi cemo dodati getter koji ce nama vratiti inicijalizirani objekat tipa "Phone"
     * I ovim receno, mi ne moramo inicijalizirati sve podatke vezane za Phone objekat nego samo one koje hocemo
     * Da bi sve bilo konzistentno dodacemo jos defaultni konstruktor bez parametara
     */


    /**
     * build metoda vraća "Phone" objekat, a bukvalno smo napravili način kaskadne inicijalizacije svega sto je nama potrebno
     * To smo postigli vraćanjem "PhoneBuilder" objekta nakon svakog settovanja
     * @return
     */

    public Phone build() {
        return new Phone(operativniSistem, procesor, displayVelicina, baterija, megapixeli);
    }



    public PhoneBuilder setProcesor(String procesor) {
        this.procesor = procesor;
        return this;
    }

    public PhoneBuilder setDisplayVelicina(Double displayVelicina) {
        this.displayVelicina= displayVelicina;
        return this;
    }

    public PhoneBuilder setBaterija(Integer baterija) {
        this.baterija = baterija;
        return this;
    }

    public PhoneBuilder setMegapixeli(Integer megapixeli) {
        this.megapixeli = megapixeli;
        return this;
    }


}
