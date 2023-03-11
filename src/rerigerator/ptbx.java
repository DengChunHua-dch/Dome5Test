package rerigerator;

public class ptbx extends rerigerator implements Tjwd {

    public ptbx(){}
    public ptbx(String pp,String xh){
        this.setPp(pp);
        this.setXh(xh);
    }
    @Override
    public void Info() {
        System.out.println("这是一款型号为"+getXh()+"的"+getPp()+"冰箱");
    }

    @Override
    public void lc(){
        System.out.println("普通冰箱冷藏温度设定为-2~8摄氏度！");
    }

    @Override
    public void ld(){
        System.out.println("普通冰箱冷冻温度设定为-25~15摄氏度！");
    }

    public void sdlc(){
        System.out.println("通过手动调整温度转盘将"+this.getPp()+this.getXh()+"冰箱冷藏温度设定为0摄氏度！");
    }

    public void sdld(){
        System.out.println("通过手动调整温度转盘将"+this.getPp()+this.getXh()+"冰箱冷冻温度设定为-25摄氏度！");
    }
}
