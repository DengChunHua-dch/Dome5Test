package Qianzhan;

import java.util.Random;

public class Player {
    public String getName() {
        return name;
    }

    private String name;//名称

    public int getBlood() {
        return blood;
    }

    private int blood;//血量
    private Gun gun;//机枪

    public Player(){}
    public Player(String name,Gun gun){
        this.name=name;
        this.blood=100;
        this.gun=gun;
    }

    //持枪
    public boolean holdGun(){
        return true;
    }

    //射击
    public void shootEnemy(Player player){
        System.out.println(player.name+"向"+this.name+"开了一枪");
        this.blood-=damage();
        gun.shootEnemy();
        gun.showGun();

        System.out.println(this.name+"向"+player.name+"开了一枪");
        player.blood-=damage();
        gun.showGun();
    }

    //装弹
    public void loadClip(){
        gun.shootEnemy();
    }

    //计算伤害值
    public int damage(){
        Random r=new Random();
        int a=r.nextInt(14)+1;
        return a;
    }

    //显示玩家信息
    public void showPlayer(Player player){
        System.out.println(">>>玩家信息：姓名="+player.name+"血量="+player.blood+"是否持枪"+holdGun());
        System.out.println(">>>玩家信息：姓名="+this.name+"血量="+this.blood+"是否持枪"+holdGun());
    }
}
