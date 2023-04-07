package jy;

public class SungJukVO {

    private String name;
    private int kors;
    private int engs;
    private int mats;
    private int tots;
    private double avgs;
    private char grds;

    public SungJukVO() {
    }

    public SungJukVO(String name, int kors, int engs, int mats, int tots, double avgs, char grds) {
        this.name = name;
        this.kors = kors;
        this.engs = engs;
        this.mats = mats;
        this.tots = tots;
        this.avgs = avgs;
        this.grds = grds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKors() {
        return kors;
    }

    public void setKors(int kors) {
        this.kors = kors;
    }

    public int getEngs() {
        return engs;
    }

    public void setEngs(int engs) {
        this.engs = engs;
    }

    public int getMats() {
        return mats;
    }

    public void setMats(int mats) {
        this.mats = mats;
    }

    public int getTots() {
        return tots;
    }

    public void setTots(int tots) {
        this.tots = tots;
    }

    public double getAvgs() {
        return avgs;
    }

    public void setAvgs(double avgs) {
        this.avgs = avgs;
    }

    public char getGrds() {
        return grds;
    }

    public void setGrds(char grds) {
        this.grds = grds;
    }

    @Override
    public String toString() {
        return "SungJukVO{" +
                "name='" + name + '\'' +
                ", kors=" + kors +
                ", engs=" + engs +
                ", mats=" + mats +
                ", tots=" + tots +
                ", avgs=" + avgs +
                ", grds=" + grds +
                '}';
    }
}
