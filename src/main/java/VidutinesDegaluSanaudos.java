import degaluapskaita.Apskaita;
import degaluapskaita.Cekis;
import degaluapskaita.DegaluRusis;

public class VidutinesDegaluSanaudos {

    public static void main(String[] args) {

        Apskaita degaluApskaita = new Apskaita();

        degaluApskaita.pridetiCeki(new Cekis(DegaluRusis.D, 1.25, 10, 0));
        degaluApskaita.pridetiCeki(new Cekis(DegaluRusis.D, 2.10, 50, 150));
        degaluApskaita.pridetiCeki(new Cekis(DegaluRusis.D, 1.60, 20, 600));
        degaluApskaita.pridetiCeki(new Cekis(DegaluRusis.D, 0.99, 20, 850));


        System.out.println(degaluApskaita.vidLitraiSimtui() + " l/100km vidurkis");
        System.out.println(degaluApskaita.vidKainaSimtui() + " Eur/100km vidutinė kaina");

    }

}


//nuvaziuotasAtstumas = atstumas po paskutinio uzpilimo
//(cekiai.size()-1) = cekiu kiekis - paskutinis
//vidLitroKaina = turiu 0, o reikia vidurkio visu cekiu nelieciant paskutinio (edit.gaunu bendra suma kainos)
//litraiViso = bendras degalu kiekis
//litraiSimtuiKm = degalu sanaudos /100
