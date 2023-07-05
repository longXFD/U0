import java.util.ArrayList;

public class zhifu {
    String zhifuid;
    ArrayList<String> id=new ArrayList();//存放id
    ArrayList<Double> yue=new ArrayList();//存放余额
    ArrayList<String> mima=new ArrayList();//存放密码
    public zhifu(String zhifuid) {
        this.zhifuid=zhifuid;
    }
    public String A(String idd,String mi,double qian) {//单价要从商品那转到主程序再转到支付
        id.add("A123");yue.add(50.0);mima.add("123321");//添加初始用户
        int k=-1;
        for(int i=0;i<id.size();i++) {
            String m;
            m=(String)id.get(i);
            if(idd.equals(m)) {
                k=i;
                break;
            }else {
                return "没有此id";
            }
        }

        double m=(double)yue.get(k);
        if(mi.equals(mima.get(k))) { //比对密码

            if(m>=qian) {

                yue.set(k, m-qian);
                return "购买成功";
            }else {
                return "购买失败，余额不足";
            }
        }else {
            return "密码错误";
        }


    }
    public boolean addd(String idd,double qian,String mimi) {
        if(qian>=0) {
            id.add(idd);yue.add(qian);mima.add(mimi);
            return true;
        }else {
            return false;
        }
    }
}
