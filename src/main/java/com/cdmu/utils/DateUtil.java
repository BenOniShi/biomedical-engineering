package com.cdmu.utils;

import java.util.*;

/**
 * @author BenOniShi
 * @date 2020/2/18 3:38
 */
public final class DateUtil {

    /**
     * 根据传入得月份获取 每一天得列表
     *
     * @param yearParam
     * @param monthParam
     * @return
     */
    public static List<String> getDayByMonth(int yearParam, int monthParam) {
        List list = new ArrayList();
        Calendar aCalendar = Calendar.getInstance(Locale.CHINA);
        aCalendar.set(yearParam, monthParam, 0);
        //年份
        int year = aCalendar.get(Calendar.YEAR);
        //月份
        int month = aCalendar.get(Calendar.MONTH) + 1;
        int dayOfMonth = aCalendar.get(Calendar.DAY_OF_MONTH);
        for (int i = 1; i <= dayOfMonth; i++) {
            String aDate = null;
            if (month < 10 && i < 10) {
                aDate = String.valueOf(year) + "-0" + month + "-0" + i;
            }
            if (month < 10 && i >= 10) {
                aDate = String.valueOf(year) + "-0" + month + "-" + i;
            }
            if (month >= 10 && i < 10) {
                aDate = String.valueOf(year) + "-" + month + "-0" + i;
            }
            if (month >= 10 && i >= 10) {
                aDate = String.valueOf(year) + "-" + month + "-" + i;
            }
            list.add(aDate);
        }
        return list;
    }

    /**
     * 获取日期之间的所有时间
     *
     * @param begin
     * @param end
     * @return
     */
    public static List<Date> getBetweenDates(Date begin, Date end) {
        List<Date> result = new ArrayList<Date>();
        Calendar tempStart = Calendar.getInstance();
        tempStart.setTime(begin);
        while (begin.getTime() <= end.getTime()) {
            result.add(tempStart.getTime());
            tempStart.add(Calendar.DAY_OF_YEAR, 1);
            begin = tempStart.getTime();
        }
        return result;
    }

    /**
     * 获取日期之间的所有月份
     * @param begin
     * @param end
     * @return
     */
    public static List<Date> getBetweenMonth(Date begin, Date end) {
        List<Date> result = new ArrayList<>();
        Calendar tempStart = Calendar.getInstance();
        tempStart.setTime(begin);
        while (begin.getTime() <= end.getTime()) {
            result.add(tempStart.getTime());
            tempStart.add(Calendar.MONTH, 1);
            begin = tempStart.getTime();
        }
        return result;
    }
}

