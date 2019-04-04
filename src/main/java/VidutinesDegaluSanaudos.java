import degaluapskaita.Apskaita;
import degaluapskaita.Cekis;
import degaluapskaita.DegaluRusis;

public class VidutinesDegaluSanaudos {

    public static void main(String[] args) {

        Apskaita degaluApskaita = new Apskaita();

        degaluApskaita.pridetiCeki(new Cekis(DegaluRusis.D, 1.28, 15, 0));
        degaluApskaita.pridetiCeki(new Cekis(DegaluRusis.D, 1.28, 6, 180));
        degaluApskaita.pridetiCeki(new Cekis(DegaluRusis.D, 1.28, 20, 230));
        degaluApskaita.pridetiCeki(new Cekis(DegaluRusis.D, 1.28, 13, 430));


        System.out.println(degaluApskaita.vidLitraiSimtui() + " l/100km");
//        System.out.println(degaluApskaita.vidKainaSimtui() + " Eur/100km");
    }

}
