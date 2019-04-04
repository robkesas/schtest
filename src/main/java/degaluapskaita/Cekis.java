package degaluapskaita;

public class Cekis {

    private String data;
    private KuroRusis degalurusis;
    private double kainaVnt;
    private double kiekis;
    private int odometroparodymai;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public KuroRusis getDegalurusis() {
        return degalurusis;
    }

    public void setDegalurusis(KuroRusis degalurusis) {
        this.degalurusis = degalurusis;
    }

    public double getKainaVnt() {
        return kainaVnt;
    }

    public void setKainaVnt(double kainaVnt) {
        this.kainaVnt = kainaVnt;
    }

    public double getKiekis() {
        return kiekis;
    }

    public void setKiekis(double kiekis) {
        this.kiekis = kiekis;
    }

    public int getOdometroparodymai() {
        return odometroparodymai;
    }

    public void setOdometroparodymai(int odometroparodymai) {
        this.odometroparodymai = odometroparodymai;
    }
}
