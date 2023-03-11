package rerigerator;

public class Test {
    public static void main(String[]args){
        System.out.println("*****普通冰箱*****");
        ptbx p=new ptbx("西门子","BCD-160W");
        p.Info();
        p.lc();
        p.ld();
        p.sdlc();
        p.sdld();
        System.out.println("\n");
        System.out.println("*****智能冰箱*****");
        zdbx z=new zdbx("海尔","BCD-330WD");
        z.Info();
        z.cs();
        z.cs();
        z.lc();
        z.ld();
        z.bh();
        z.sp();
    }
}
