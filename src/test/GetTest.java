package test;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project:sm
 * User: xiaohui
 * Date: 2016/6/27
 * Time: 16:52
 * email:a6551142@163.com
 */
public class GetTest {

    /**
     * time1:1462032000000time21464710400000
     2678400000
     2016-06-01
     */
    @Test
    public void test1(){
        String date1="2016-05-01";
        String date2="2016-06-01";

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d1 =  format.parse(date1);
            Date d2 = format.parse(date2);
            long time1 = d1.getTime();
            long time2 = d2.getTime();
            System.out.print("time1:"+time1);
            System.out.println("time2"+time2);
            System.out.println(time2-time1);
            long time3 = time2-time1;
            Date date = new Date(time2-time1);
            Date date3 = new Date(time3+time1);


            System.out.println(format.format(date3));
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }


    @Test
    public void test4(){
        String str = "";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

        Calendar lastDate = Calendar.getInstance();
        String date ="2016-06-01";
        try {
            lastDate.setTime(sdf.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        lastDate.add(Calendar.MONTH,1);//减一个月
        lastDate.set(Calendar.DATE, 1);//把日期设置为当月第一天
        str=sdf.format(lastDate.getTime());
        System.out.println(str);
    }


    public void test5(){

    }
}
