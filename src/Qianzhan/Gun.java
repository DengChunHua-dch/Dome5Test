package Qianzhan;

public class Gun {
    private Clip clip;//弹夹

    public Clip getClip() {
        return clip;
    }

    public void setClip(Clip clip) {
        this.clip = clip;
    }

    //开枪
    public void shootEnemy(){
        clip.pushBullet();
        clip.popBullet();

    }

    //枪械信息
    public void showGun(){
        System.out.println(">>>弹夹状态："+clip.capacity+"/"+clip.surplus);
    }
}
