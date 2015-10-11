package teema1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NB! Lahenda käesolev ülesanne konsoolis. Pole vaja JavaFXi siia segada.
 *
 * 1. Kirjuta lihtne laevade pommitamise mäng, kus arvuti genereerib 1x1
 *    laevad mööda 1 dimensioonilist lauda. See tähendab, et mängulaud
 *    ei ole mitte ruudustik, vaid üks rida.
 *
 * 2. Täienda mängu nii, et nüüd oleks laual ruudustik.
 *
 * 3. Kas oskad ka nii, et laevad ei ole 1x1 vaid 1x2 ja 1x3 ja orienteeruvad
 *    nii vertikaalselt kui ka horisontaalselt?
 */



public class Peamurdja3_laevad {

    public static void main(String[] args) {
        int[] laud = new int[8];
        int i;
        for (i = 0; i < (laud.length - 1); i++) {
            laud[i] = (int) (Math.random() * 2);
        }
        System.out.println(Arrays.toString(laud));
        Scanner kasutaja = new Scanner(System.in);
        for (i = 0; i < (laud.length - 1); i++) {
            if (laud[i] == 1) {
                System.out.println("Sisesta number ühest kaheksani");
                int sisestus = kasutaja.nextInt() - 1;
                if (laud[sisestus] == 1) {
                    System.out.println("Pihtas!");
                    laud[sisestus] = 0;
                }
                else {
                    System.out.println("Mööda!");
                }

            }

            /* int Math.random(laud[1]) * 2;
            System.out.println(laud [4]);
            public static int laev() {
            int tulemus = (int) (Math.random() * 2);
            return tulemus;
            int[] laud = {laev(), laud(), laud(), laud(), laud(), laud(), laud()}
            while (true) {}
            for (int i = 0; i < laud.Length; i++) {}
            sout(laud.Length)
            */

        }
        System.out.println("Mäng on läbi!");
    }
}

/**
 */
