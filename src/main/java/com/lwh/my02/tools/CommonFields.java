package com.lwh.my02.tools;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 李文浩
 * @create 2019-10-10 13:55
 * 常用字段，禁止使用魔法值
 */
public class CommonFields {
    //获取当前年度
    public final static String getNowYear() {
        return getDate(new Date(), "yyyy");
    }

    //判断object是否为空
    public final static boolean empty(final Object obj) {
        return (null == obj || "".equals(obj)) ? true : false;
    }

    //判断string是否为空
    public final static boolean emptyStr(final String str) {
        return (null == str || "".equals(str.replaceAll(" ", "")) || str.isEmpty()) ? true : false;
    }

    //生成一个随机ID
    public final static String getNewId() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    //获取当前时间(yyyy-MM-dd)
    public final static String getDate() {
        return getDate(new Date(), "yyyy-MM-dd");
    }

    //传入Date获取String类型的日期(yyyy-MM-dd)
    public final static String getDate(final Date date) {
        return getDate(date, "yyyy-MM-dd");
    }

    //传入Date时间与转换时间格式
    public final static String getDate(final Date date, final String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.format(date);
    }

    //传入yyyy-MM-dd日期转换为Date
    public final static Date getDate(final String date) throws ParseException {
        return getDate(date, "yyyy-MM-dd");
    }

    //传入date与时间格式，转换为Date
    public final static Date getDate(final String date, final String dateFormat) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        return sdf.parse(date);
    }

    //获取从起始年度开始的所有年度
    public static final List<String> getYears(Integer year) {
        Calendar cal = Calendar.getInstance();
        Integer endYear = cal.get(Calendar.YEAR) + 1;
        List<String> list = new ArrayList<>();
        for (Integer i = endYear; i >= year; i--) {
            list.add(i.toString());
        }
        return list;
    }

    //获取当前时间
    public static String getNowTime() {
        return new Timestamp(System.currentTimeMillis()).toString().replace(" ", "-").replace(":", "-");
    }
}