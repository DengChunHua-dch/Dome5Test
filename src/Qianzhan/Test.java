package Qianzhan;

import java.util.Scanner;

public class Test {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("欢迎来到特种部队！");
        System.out.println("*****战前准备*****");
        System.out.print("请输入名称：");
        Gun gun=new Gun();
        Clip clip=new Clip();
        gun.setClip(clip);
        Player wj=new Player(in.next(),gun);
        System.out.println("1.雨箫生2.醉清风3.如梦令 请选择对战玩家（1~3）：");
        int dz=in.nextInt();
        Player wj2=null;
        switch(dz){
            case 1:
               wj2=new Player("雨箫生",gun);
               break;
            case 2:
                wj2=new Player("醉清风",gun);
                break;
            case 3:
                wj2=new Player("如梦令",gun);
                break;
            default :
                System.out.println("没有这个玩家");
                break;
        }
        boolean y=true;
        int i=1;
        while(y){
            System.out.println("第"+i+"回合");
            wj.shootEnemy(wj2);
            System.out.println();
            wj.showPlayer(wj2);

            if(wj.getBlood()<=0 || wj2.getBlood()<=0){
                System.out.println("比赛结束");
                if(wj.getBlood()>wj2.getBlood()){
                    System.out.println(wj.getName()+"获胜");
                }else{
                    System.out.println(wj2.getName()+"获胜");
                }
                break;
            }
            System.out.println("是否继续对战（y继续,其他结束）");
            if(!in.next().equals("y")){
               y=false;
            }
            i++;
        }

    }
}
