package cn.myloveqian.dpush;

/**
 * Created by zhiwei on 17-8-17.
 */
public class MathTest {

    public static void main(String[] args) {
        int PING_PROTO = 1 << 8 | 220;
        int PONG_PROTO = 2 << 8 | 220;
        int SYST_PROTO = 3 << 8 | 220;
        int EROR_PROTO = 4 << 8 | 220;
        int AUTH_PROTO = 5 << 8 | 220;
        int MESS_PROTO = 6 << 8 | 220;
        System.out.println(Integer.toBinaryString(220));
        System.out.println(Integer.toBinaryString(1 << 8));
        System.out.println(1 << 8 | 220);
        System.out.println(Integer.toBinaryString(476));
    }
}
