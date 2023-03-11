package rerigerator;

public abstract class rerigerator {

    public String getPp() {
        return pp;
    }

    public void setPp(String pp) {
        this.pp = pp;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    private String pp;
    private String xh;

    public abstract void Info();
}
