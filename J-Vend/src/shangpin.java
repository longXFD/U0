import java.util.ArrayList;

public class shangpin {
    String shangpinhao;
    ArrayList<Number> money=new ArrayList();//单价
    ArrayList<String> name=new ArrayList();//商品
    ArrayList<Integer> few=new ArrayList();//数量
    public shangpin(String shangpinhao) {
        this.shangpinhao=shangpinhao;
        name.add("可口可乐");name.add("矿泉水   ");name.add("果粒橙   ");name.add("维c多   ");name.add("果缤纷   ");name.add("营养快线");
        money.add(3);money.add(2);money.add(3);money.add(5);money.add(4.5);money.add(5);
        few.add(10);few.add(10);few.add(10);few.add(10);few.add(10);few.add(10);
    }
    public double mai(int hao) {
        if(few.get(hao)>0) {
            int k=few.get(hao);
            few.set(hao, k-1);
            return 0;//购买成功
        }else {
            return -1;//无货
        }


    }
    public boolean zeng(String nama,double mone,int w) {//增加商品
        this.name.add(nama);
        this.money.add(mone);
        this.few.add(w);
        return true;

    }
    public boolean shan(String nam) {//删除商品名称 单价 数量
        int q=-1;
        for(int i=0;i<name.size();i++) {
            if(name.get(i).equals(nam)) {
                q=i;
                break;
            }
        }
        if(q>-1) {
            name.remove(q);
            money.remove(q);
            few.remove(q);
            return true;
        }else {
            return false;
        }

    }
    public boolean gainame(int bianhao,String ming) {//商品编号是字符型，输入编号修改名字
        if(bianhao>=0&&bianhao<name.size()) {
            name.set(bianhao-1,ming);
            return true;
        }else {return false;}
    }
    public boolean gaijiage(int bianhao,double jia) {
        if(bianhao>=0&&bianhao<name.size()) {
            money.set(bianhao-1, jia);return true;
        }else {return false;}
    }
    public boolean gaishuliang(int bianhao,int shu) {
        if(bianhao>=0&&bianhao<name.size()) {
            few.set(bianhao-1, shu);return true;
        }else {return false;}
    }
    public  void xianshi() {

        for (int i =0;i<name.size();i++) {
            System.out.print((i+1)+"：");
            System.out.print(name.get(i)+"  ");
            System.out.print("单价："+money.get(i)+"元  ");
            System.out.println("   数量："+"还有"+few.get(i)+"瓶");

        }
        System.out.println("请在"+1+"到"+name.size()+"中选择");
    }
    public void xianshia() {
        for (int i =0;i<name.size();i++) {
            System.out.print(name.get(i)+"  ");
        }
        System.out.println("请在以上商品中选择中选择（输入商品名称）");
    }
    public int pp() {
        int w=name.size()+1;
        return w;
    }


}

