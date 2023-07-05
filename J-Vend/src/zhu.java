import java.util.Scanner;

public class zhu {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        shangpin kk=new shangpin ("1 ");//商品链接
        zhifu mm=new zhifu(" ");
        int er=kk.pp();
        try {
            while(true) {
                System.out.println("欢迎使用本系统");
                kk.xianshi();
                System.out.println("请输入");
                int a=input.nextInt();
                if(a>0&&a<er) {
                    double m=kk.mai(a-1);//m是饮料单价
                    if(m==-1) {
                        System.out.println("此饮料暂时无货，您可以购买以下饮料");
                        kk.xianshi();
                    }else if(m==0){
                        System.out.println("请输入账户ID");
                        String id=input.next();//放账户
                        System.out.println("请输入密码");
                        String mi=input.next();//存放密码
                        String guo=  mm.A(id, mi, m);
                        System.out.println(guo);
                    }else if(m==-2){
                        System.out.println("请按照提示输入正确数字");
                    }
                }else if(a==9527) {

                    System.out.println("密码正确");
                    System.out.println("增加商品请按1");System.out.println("删除商品请按2");System.out.println("修改商品请按3");
                    int q=input.nextInt();
                    if(q==1) {
                        System.out.println("请输入要增加的商品名称");String d=input.next();System.out.println("请输入该商品单价");double b=input.nextInt();System.out.println("请输入该商品数量");int c=input.nextInt();
                        if(b>0&&c>0) {
                            kk.zeng(d, b, c);
                            System.out.println("操作成功");}else {
                            System.out.println("数量或单价不能小于0");
                        }
                    }else if(q==2) {
                        System.out.println("请输入要删除的商品名称");String b=input.next();
                        kk.xianshia(); //显示商品名称（提示用户）
                        boolean w=  kk.shan(b);
                        if(w) {
                            System.out.println("操作成功");
                        }else {
                            System.out.println("操作失败，未找到此商品");
                        }
                    }else if (q==3) {
                        System.out.println("修改商品名称请按1");System.out.println("修改商品单价请按2");System.out.println("修改商品数量请按3");int c=input.nextInt();
                        if(c==1) {
                            kk.xianshi();
                            System.out.println("请输入商品编号");int d=input.nextInt();System.out.println("请输入改后的商品名称");String b=input.next();
                            boolean w=kk.gainame(d, b);
                            if(w) {
                                System.out.println("操作成功");
                            }else {
                                System.out.println("操作失败");
                            }
                        }else if(c==2) {
                            kk.xianshi();
                            System.out.println("请输入商品编号");int d=input.nextInt();
                            System.out.println("请输入修改后的商品价格");double b=input.nextDouble();
                            kk.gaijiage(d, b);
                        }else if(c==3) {
                            kk.xianshi();
                            System.out.println("请输入商品编号");int d=input.nextInt();System.out.println("请输入商品此时数量");int b=input.nextInt();
                            kk.gaishuliang(d, b);
                        }else {
                            System.out.println("请输入正确指令");
                        }
                    }
                }else if(a==122){
                    System.out.println("请输入要添加的账户");
                    String x=input.next();System.out.println("请输入初始金额");double y=input.nextDouble();System.out.println("请输入初始密码");String z=input.next();
                    boolean op= mm.addd(x, y, z);
                    if(op) {
                        System.out.println("添加账户成功");
                    }else if(op) {
                        System.out.println("初始金额不能是负值");
                    }
                }
            }}catch(java.util.InputMismatchException op) {
            System.out.println("请输入正确的字符");
        }
    }
}


