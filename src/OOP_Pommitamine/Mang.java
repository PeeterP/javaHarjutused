package OOP_Pommitamine;

/**
 * Mere ja laevastiku genereerimine
 * Kuni laevu on elus,
 *      küsi kasutajalt koordinaadid
 *      pommita merd
 *      anna tagasisidet
 * Mäng on läbi
 */
public class Mang {
    public Mang() {
        System.out.println("START MÄNG");
        Meri meri = new Meri(10);
        Mangija mangija = new Mangija();

        while (meri.kasOnLaevuElus()) {
            meri.kuvaSeis();
            int[] lask = mangija.kysiLasuKoordinaadid();
            boolean pihtas = meri.kasKeegiSaiPihta(lask);
            if (pihtas) {
                mangija.pihtas();
            } else {
                mangija.moodas();
            }
        }
        mangija.gameover();
    }
}
