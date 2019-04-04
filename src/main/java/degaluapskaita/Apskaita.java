package degaluapskaita;


import java.util.ArrayList;
import java.util.List;

public class Apskaita {

    List<Cekis> cekiai = new ArrayList<>();

    public void pridetiCeki(Cekis cekis) {
        cekiai.add(cekis);
    }


    public double vidLitraiSimtui() {

        Cekis pirmasCekis = cekiai.get(0);// pirmas cekis

        Cekis paskutinisCekis = cekiai.get(cekiai.size() - 1);// paskutinis cekis

        int nuvaziuotasAtstumas = paskutinisCekis.getOdometroparodymai() - pirmasCekis.getOdometroparodymai();


        double litraiViso = 0;
        for (int i = 0; i < cekiai.size() - 1; i++) {

            litraiViso = litraiViso + cekiai.get(i).getKiekis();

        }

        double litraiSimtuiKm = litraiViso / nuvaziuotasAtstumas;

        return litraiSimtuiKm * 100.0;

    }


//    public double vidKainaSimtui() {
//
//        Cekis pirmasCekis = cekiai.get(0);
//
//        Cekis paskutinisCekis = cekiai.get(cekiai.size() - 1);
//
//        double nuvaziuotasAtstumas = paskutinisCekis.getOdometroparodymai() - pirmasCekis.getOdometroparodymai();
//        double litroKaina = paskutinisCekis.getKainaVnt()  //turiu kazkokiu budu sudaugint visu cekiu kainavnt ir padalint is cekiu kiekio ir tada gauta kainavnt vidurki dauginti is turimu litrusumtuikm.
//
//        double litraiViso = 0;
//        for (int i = 0; i < cekiai.size() - 1; i++) {
//
//            litraiViso = litraiViso + cekiai.get(0).getKiekis();
//
//        }
//
//        double litraiSimtuiKm = litraiViso / nuvaziuotasAtstumas;
//
//
//        double tikraKaina = litraiSimtuiKm * cekiai.get(0).getKainaVnt();
//
//        return tikraKaina * 100.0;
//
//    }


}