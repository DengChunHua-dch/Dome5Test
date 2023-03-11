package Qianzhan;

public class Clip {

    public int capacity=30;//容量

    public int surplus=30;//盈余

    //装弹
    public void pushBullet(){
    }

    //卸弹
    public void popBullet(){
        this.capacity-=1;
    }

}
