package rerigerator;

public class zdbx extends rerigerator
        implements Tjwd,spgl,wlyfw {
    public zdbx(){}
    public zdbx(String pp,String xh){
        this.setPp(pp);
        this.setXh(xh);
    }

    @Override
    public void Info(){
        System.out.println("这是一款型号为"+getXh()+"的"+getPp()+"冰箱");
    }

    public void bxx(){
        System.out.println("智能冰箱冷藏室正在通过气味自动将不新鲜的食材调动到距离冰箱门近的地方。");
    }

    public void cs(){
        System.out.println("智能冰箱冷藏室正在自动智能除霜。");
    }

    @Override
    public void lc(){
        System.out.println(getPp()+getXh()+"冰箱通过电脑温控系统将冷藏温度设定为1摄氏度");
    }
    @Override
    public void ld(){
        System.out.println(getPp()+getXh()+"冰箱通过电脑温控系统将冷冻温度设定为-22摄氏度");
    }

    @Override
    public void bh(){
        System.out.println(getPp()+getXh()+"冰箱正在统计食材存量，并通知附近超市上门补货。");
    }

    @Override
    public void sp(){
        System.out.println(getPp()+getXh()+"冰箱正在统计食材种类，保质期，根据用户偏好推荐食谱显示在大屏幕。");
    }
}
